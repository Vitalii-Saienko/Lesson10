public class WhileInfiniteLoopBreak {
    public static void main(String[] args) {
        boolean bool = true;
        int counter = 0;
        while (bool == true) {
            System.out.println("OMG I'm infinite, please stop me");
            counter += 1;
            if (counter == 10){
                bool = false;
            }
        }
    }
}
