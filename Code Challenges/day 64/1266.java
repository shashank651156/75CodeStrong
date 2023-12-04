class Solution {

    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            int xDiff = Math.abs(points[i - 1][0] - points[i][0]);
            int yDiff = Math.abs(points[i - 1][1] - points[i][1]);

            // Diagonal movement time
            int diagonalTime = Math.min(xDiff, yDiff);

            // Horizontal or vertical movement time
            int straightTime = Math.abs(xDiff - yDiff);

            // Total time for this move
            time += diagonalTime + straightTime;
        }

        return time;
    }
}
