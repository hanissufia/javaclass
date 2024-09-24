class Animal{
    public void sound(){
        System.out.println("Hop Hop");
    }
}

class Dog extends Animal {
    @Override                                         //@Override is replacing the output of superclass
    public void sound(){
        System.out.println("Barking");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}
