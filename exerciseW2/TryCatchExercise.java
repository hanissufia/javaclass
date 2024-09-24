
public class TryCatchExercise {
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;
    
    public TryCatchExercise(String name, double baseSalary, double healthAllowance, double transportAllowance){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = healthAllowance;
        this.transportAllowance = transportAllowance;
        this.bonus = 0;
        this.totalSalary = totalSalary();
    }

    public String getName(){
        return name;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    public double getHealthAllowance(){
        return healthAllowance;
    }

    public void setHealthAllowance(double healthAllowance){
        this.healthAllowance = healthAllowance;
    }
    
    public double getTransportAllowance(){
        return transportAllowance;
    }

    public void setTransportAllowance(double transportAllowance){
        this.transportAllowance = transportAllowance;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    
    public double assignBonus(){
        if (baseSalary>5000){
            bonus = baseSalary*0.1;
        }

        else if (baseSalary>=3000 && baseSalary<=5000){
            bonus = baseSalary*0.05;
        }

        else if (baseSalary<3000) {
            bonus = 0;
        }
        return bonus;
    }
    
    //based on bonus 
    public double totalSalary(){
        totalSalary = baseSalary + healthAllowance + transportAllowance + bonus;
        return totalSalary;
    }
    
    public static void main(String[] args) {
        TryCatchExercise [] employees = new TryCatchExercise[5];

        try{
        employees[0] = new TryCatchExercise("Faree",  4000, 100, 150);
        employees[1] = new TryCatchExercise("Mai",  5000, 100, 150);
        employees[2] = new TryCatchExercise("Sab",  3500, 130, 140);
        employees[3] = new TryCatchExercise("Rara",  6000, 100,140);
        employees[4] = new TryCatchExercise("Khai",  2500, 140, 150);
        
        System.out.println(employees[7]);
        }

       catch (ArrayIndexOutOfBoundsException e){ //if the array number is not matching the 
           System.out.println("Caught bad " + e.getMessage());
       } finally {
           System.out.println("it will execute anyway");
       }
    
    }
        
}

