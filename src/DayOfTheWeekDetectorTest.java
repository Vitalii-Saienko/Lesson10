import java.util.Objects;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        testDayOfTheWeek();
    }
    public static void testDayOfTheWeek(){
        String expectedResult1 = new String("Monday");
        String expectedResult2 = new String("Friday");
        String expectedResult3 = new String("Error - number is incorrect.");
        if (Objects.equals(DayOfTheWeekGetNumberFromUser.defineDay(2), expectedResult1)){
            System.out.println("Test1 - Ok.");
        }
        else {
            System.out.println("ERROR in test1 - the day expected to be - Monday");
        }
        if (Objects.equals(DayOfTheWeekGetNumberFromUser.defineDay(6), expectedResult2)){
            System.out.println("Test2 - Ok.");
        }
        else {
            System.out.println("ERROR in test2 - the day expected to be - Friday");
        }
        if (Objects.equals(DayOfTheWeekGetNumberFromUser.defineDay(100), expectedResult3)){
            System.out.println("Test3 - Ok.");
        }
        else {
            System.out.println("ERROR in test3 - program should show the error, not the day");
        }
    }
}
