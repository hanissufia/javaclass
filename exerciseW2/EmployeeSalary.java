
import java.util.Scanner;

public class EmployeeSalary {
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;
    
    public EmployeeSalary(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = 0;
        this.transportAllowance = 0;
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
        EmployeeSalary [] employees = new EmployeeSalary[5];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<employees.length; i++){
            System.out.println("Enter Employee " + (i + 1) + " Details:");

            System.out.print("Employee's name: ");
            String name = scanner.nextLine();

            System.out.print("Base Salary: RM");
            double baseSalary = scanner.nextDouble();
            employees[i] = new EmployeeSalary(name, baseSalary); //pass to the get

            System.out.print("Health Allowance: ");
            double healthAllowance = scanner.nextDouble();
            employees[i].setHealthAllowance(healthAllowance);

            System.out.print("Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();
            employees[i].setTransportAllowance(transportAllowance);

            scanner.nextLine();
            System.out.println();
           
        }
        scanner.close();

        System.out.println("\nEmployee's Total Salary:" + "\n");
        for (EmployeeSalary employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Total Salary: RM" + employee.totalSalary());
            System.out.println();
        }
        }
        
    }


