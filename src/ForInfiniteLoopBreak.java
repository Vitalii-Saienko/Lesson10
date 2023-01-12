public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println("OMG it seems I'm infinite");
            if (i == -10){
                break;
            }
        }
    }
}
