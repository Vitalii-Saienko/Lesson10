class NumberUtilsTest {
    public static void main(String[] args) {
    testIsEven();
    }
    static void testIsEven(){
        NumberUtils numberUtils = new NumberUtils();
        boolean expectedResult = true;
        boolean expectedResult2 = false;
        if (expectedResult== numberUtils.isEven(2)){
            System.out.println("Test number is even - ok.");
        }
        else {
            System.out.println("Error - test1, number is even.");
        }
        if (expectedResult2== numberUtils.isEven(1)){
            System.out.println("Test2 number is not even - ok.");
        }
        else {
            System.out.println("Error - test2, number is not even.");
        }

    }
}
