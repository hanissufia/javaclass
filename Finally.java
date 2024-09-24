public class Finally {
    public static void main(String[] args) {
        try{
            int [] numbers = {1,2,3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){ //if the array number is not matching the 
            System.out.println("Caught bad " + e.getMessage());
        } finally {
            System.out.println("it will execute anyway");
        }
        
        System.out.println("Program is continuing");
    }
}
