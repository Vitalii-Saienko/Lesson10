public class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            if (i % 2 != 0 || i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i == 17){
                break;
            }
            }
        }
    }