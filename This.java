//superclass

class Animal{                                             //when you declare a variable here, 
                                                         //the variable will stay the same the entire code
    String name;                                          //it can't be changed

    public Animal(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println(name + " makes a sound");
    }
}

//subclass
class Dog extends Animal{
    public Dog (String name){
        super(name);
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println(name + " barks");
    }
}

public class This {
    public static void main(String[] args) {
        Dog dog = new Dog("Anjing");      //
        dog.sound();
    }
}
