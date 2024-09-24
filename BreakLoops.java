public class BreakLoops {
    public static void main(String[] args) {
        System.out.println("using Break");   
        for (int i = 1; i<=5; i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
     }
}
