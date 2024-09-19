public class Person {

    private String name;
    private int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age; 
    }
    
    public void displayDetails(){
        System.out.println("Name is "+ name);
        System.out.println("The age is "+ age);
    }

    public static void main (String[] args){
        Person person =  new Person("Atok", 70);
        person.displayDetails();
    }
}