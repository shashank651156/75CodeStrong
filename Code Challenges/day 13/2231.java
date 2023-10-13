class Solution {
    public int largestInteger(int num) {
        // String[] strArray = Integer.toString(num).split("");
        // int[] intArray = new int[strArray.length];
        // for (int i = 0; i < strArray.length; i++) {
        //     intArray[i] = Integer.parseInt(strArray[i]);
        // }
        char[] numbers = String.valueOf(num).toCharArray();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                if(numbers[j]>numbers[i] && (numbers[j]-numbers[i])%2==0){
                    char t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
        return Integer.parseInt(new String(numbers));
    }
}