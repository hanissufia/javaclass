public class Statement {
    public static void main(String[] args) {
        int num = 5;

        if(num>0){
            System.out.println("Number is positive");
        }

        if(num<7){
            System.out.println("Number is less than seven");
        }

        if(num % 2 == 0){ //% 2 is even number
            System.out.println("Number is even");
        }

        else{
            System.out.println("Number is odd");
        }
    }
}
