import java.util.Scanner;

class DayOfTheWeekGetNumberFromUser {
    public static void main(String[] args) {

    }
    public static int getUserNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int userNumber = scanner.nextInt();
        return userNumber;
    }
    public static String defineDay(int userNumber){
        String weekDay = new String();
        switch (userNumber){
            case 1: weekDay = "Sunday";
                break;
            case 2: weekDay = "Monday";
                break;
            case 3: weekDay = "Tuesday";
                break;
            case 4: weekDay = "Wednesday";
                break;
            case 5: weekDay = "Thursday";
                break;
            case 6: weekDay = "Friday";
                break;
            case 7: weekDay = "Saturday";
                break;
            default: weekDay = "Error - number is incorrect.";
        }
        return weekDay;
    }
}

