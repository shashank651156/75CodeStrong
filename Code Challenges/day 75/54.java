class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> al = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int top = 0;
        int right = m-1;
        int bottom = n-1;

        //left-->right;  top-->bottom ; right-->left ; bottom-->top
        while(left<=right && top<=bottom)
        {
            //left --> right
            for(int i=left;i<=right;i++)
                al.add(matrix[top][i]);
            top++;

            // top-->bottom
            for(int i=top;i<=bottom;i++)
                al.add(matrix[i][right]);
            right --;


            //right-->left
            if(top<=bottom)
            {
            for(int i=right;i>=left;i--)
                al.add(matrix[bottom][i]);
            bottom --;
            }
            //bottom-->top
            if(left<=right)
            {
            for(int i=bottom; i>=top;i--)
                al.add(matrix[i][left]);
            left ++;
            }
        }
    return al;
        
    }
}