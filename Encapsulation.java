public class Encapsulation {
    private String name;
    private int age;
    
    //input can be received from API/front-end/user and will be sent to setters and getters to be stored in the database
    //getter (a getter method returns its value)
    public String getName(){
        return name;
    }
    
    //setter (a setter method sets or updates its value) // save the data
    public void setName(String name){  //uses void because it does not return any value
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Atok");
        person.setAge(70);

        System.out.println(person.getName() + " is " + person.getAge() + " years old");
    }
}
