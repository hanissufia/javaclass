public class CGPA {
    private double gpa1;
    private double gpa2;
    private double gpa3;
    private double cgpa;

    public CGPA (double gpa1, double gpa2, double gpa3, double cgpa){
        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;
        this.cgpa = cgpa;
    }


    public static void main (String[] args){
        double gpa1 = 3.5;
        double gpa2 = 3.7;
        double gpa3 = 3.6;
        double cgpa = (gpa1 + gpa2 + gpa3)/3;
        System.out.println(cgpa);
    }
}

