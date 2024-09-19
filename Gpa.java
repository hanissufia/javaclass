public class Gpa {
    private String name;
    private double pointer;
    private int years;


    public Gpa (String name, double pointer, int years){
        this.name = name;
        this.pointer = pointer;
        this.years = years;
    }

    public void displayDetails (){
        System.out.println(name + "'s GPA is" + pointer + " in " + years + " years of study");
    }

    public static void main (String[] args){
        Gpa gpa =  new Gpa("Hanis", 3.7, 3);
        gpa.displayDetails();
    }
}