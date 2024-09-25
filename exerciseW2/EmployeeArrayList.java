
import java.util.ArrayList;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EmployeeArrayList{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
   
    public EmployeeArrayList(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

        public String getName(){
            return name;
        }
        
        public double getBaseSalary(){
            return baseSalary;
        }
        
        public void assignSalary(){
            Predicate<Double> isGreaterThanThen = (baseSalary) -> baseSalary >1000;
            if (isGreaterThanThen.test(baseSalary)){
                System.out.println("Yay congrats gurl");
            }else{
                System.out.println("Get a new job");
            }
        }


    public static void main(String[] args) {

        LocalDateTime nowDT = LocalDateTime.now();
        LocalDate nowD = LocalDate.now();
        LocalTime nowT = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDT = formatter.format(nowDT);

        System.out.println(formattedDT);

        ArrayList<EmployeeArrayList>employeeList = new ArrayList<>();
        
        employeeList.add(new EmployeeArrayList("Hanis",  4000));
        employeeList.add(new EmployeeArrayList("Iky",  8000));
        employeeList.add(new EmployeeArrayList("Zati",  5000));
        employeeList.add(new EmployeeArrayList("Elly",  3000));
        employeeList.add(new EmployeeArrayList("Auni",  900));

        for ( EmployeeArrayList employee : employeeList){
            System.out.println("Employee's name: "+ employee.getName());
            System.out.println("Employee's Salary: "+ employee.getBaseSalary());
            employee.assignSalary();
            System.out.println(" ");
        }

    }
}