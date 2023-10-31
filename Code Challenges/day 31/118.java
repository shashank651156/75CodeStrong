import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        return pascal(numRows, arr);
    }

    public List<List<Integer>> pascal(int numRows, List<List<Integer>> arr) {
        if (numRows == 0) return arr;
        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            arr.add(firstRow);
            return arr;
        }
        arr = pascal(numRows - 1, arr);
        List<Integer> newRow = new ArrayList<>();
        List<Integer> prevRow = arr.get(arr.size() - 1);

        newRow.add(1);
        for (int i = 1; i < prevRow.size(); i++) {
            newRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        newRow.add(1);
        arr.add(newRow);

        return arr;
    }
}

