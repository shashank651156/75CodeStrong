class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<Integer>[] graph = new List[n+1];
        // if there's no guarantee that there is a solution to finish all the courses, we need another variable for visited.
        // minTime has two functions: 1. record outputed. 2. record the minimum time required to finish each course.
        int[] minTime = new int[n+1];

        for (int i = 1; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] relation : relations) {
            graph[relation[1]].add(relation[0]);
        }

        for (int i = 1; i <= n; i++) {
            if (minTime[i] > 0) {
                continue;
            }
            dfs(i, graph, time, minTime);
        }
        int max = 0;
        for (int i = 1; i <=n; i++) {
            if (minTime[i] > max) {
                max = minTime[i];
            }
        }
        return max;
    }

    // calculate the minimum time to finish the course - start.
    private void dfs(int start, List<Integer>[] graph, int[] time, int[] minTime) {
        int max = 0;
        for (int i = 0; i < graph[start].size(); i++) {
            if (minTime[graph[start].get(i)] == 0) {
               dfs(graph[start].get(i), graph, time, minTime);      
            }
            max = Math.max(max, minTime[graph[start].get(i)]);
        }
        minTime[start] = max + time[start-1];
    }
}