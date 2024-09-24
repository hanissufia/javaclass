//import something from outside 

//superclass
class Animal{
    public void eat(){
        System.out.println("The animal is eating");
    }
}

//subclass
class Dog extends Animal{
    public void bark() {
        System.out.println("The dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}