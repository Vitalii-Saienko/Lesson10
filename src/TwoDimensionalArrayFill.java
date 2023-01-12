class TwoDimensionalArrayFill {
    public static void fillArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = (int) (Math.random()*(100-1+1)+1);
            }
        }
    }
    public static int sumArray(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }
}
