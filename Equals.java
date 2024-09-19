public class Equals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); //true because str1 is the same as str2
        System.out.println(str1 == str3); //false because str3 is a different object
        System.out.println(str1.equals(str2)); //the same as the first output statement just a different way
        System.out.println(str1.equals(str3)); //it is not the same as the second statement as it allows java to check 
    }
}
