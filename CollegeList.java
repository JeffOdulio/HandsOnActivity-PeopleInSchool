package collegelist;
import java.util.Scanner;
public class CollegeList extends Person{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String Choice1 = sc.nextLine();
        
        switch(Choice1.toUpperCase()){
        
            case "E":
                Employee emp = new Employee();
                
                System.out.print("Insert name: ");
                String name1 = sc.nextLine();
                emp.setName(name1);
                
                System.out.print("Insert contact number: ");
                String cN = sc.nextLine();
                emp.setContactNum(cN);    
               
                System.out.print("Insert monthly salary: ");
                double mS = sc.nextDouble();
                emp.setSalary(mS);
                
                System.out.print("Insert department you are in: ");
                String dP = sc.next();
                emp.setDepartment(dP);
                
                System.out.println("--------------------------------");
                
                System.out.println("Name: "+emp.getName());
                System.out.println("Contact Number: "+emp.getContactNum());
                System.out.println("Salary: "+emp.getSalary());
                System.out.println("Department: "+emp.getDepartment());
                
                break;
                
            case "F":
                
                System.out.print("Are you regular/tenured? Insert Y if yes and N if not: ");
                String yN = sc.nextLine();  
                if (yN.equalsIgnoreCase("Y")){ 
                    Faculty fac = new Faculty();
                    fac.setRegular(true);
                    
                    System.out.print("Insert name: ");
                    String name2 = sc.nextLine();
                    fac.setName(name2);
                
                    System.out.print("Insert contact number: ");
                    String cN1 = sc.nextLine();
                    fac.setContactNum(cN1);
                
                    System.out.print("Insert monthly salary: ");
                    double mS1 = sc.nextDouble();
                    fac.setSalary(mS1);
                
                    System.out.print("Insert department you are in: ");
                    String dP1 = sc.next();
                    fac.setDepartment(dP1);
                    
                    System.out.println("--------------------------------");
                    
                    System.out.println("Name: "+fac.getName());
                    System.out.println("Contact Number: "+fac.getContactNum());
                    System.out.println("Salary: "+fac.getSalary());
                    System.out.println("Department: "+fac.getDepartment());
                    System.out.println("Status if regular/tenured or not: "+fac.isRegular());
                }
                else if (yN.equalsIgnoreCase("N")){
                    Faculty fac = new Faculty();
                    fac.setRegular(false);
                    
                    System.out.print("Insert name: ");
                    String name2 = sc.nextLine();
                    fac.setName(name2);
                
                    System.out.print("Insert contact number: ");
                    String cN1 = sc.nextLine();
                    fac.setContactNum(cN1);
                
                    System.out.print("Insert monthly salary: ");
                    double mS1 = sc.nextDouble();
                    fac.setSalary(mS1);
                
                    System.out.print("Insert department you are in: ");
                    String dP1 = sc.next();
                    fac.setDepartment(dP1);
                    
                    System.out.println("--------------------------------");
                    
                    System.out.println("Name: "+fac.getName());
                    System.out.println("Contact Number: "+fac.getContactNum());
                    System.out.println("Salary: "+fac.getSalary());
                    System.out.println("Department: "+fac.getDepartment());
                    System.out.println("Status if regular/tenured or not: "+fac.isRegular());
                }
                else{
                    System.out.println("Invalid option.");
                }
                
                break;
                
            case "S":
                Student stu = new Student();
                
                System.out.print("Insert name: ");
                String name2 = sc.nextLine();
                stu.setName(name2);
                
                System.out.print("Insert contact number: ");
                String cN1 = sc.nextLine();
                stu.setContactNum(cN1);
                
                System.out.print("Enrolled program: ");
                String eP = sc.nextLine();
                stu.setProgram(eP);
                
                System.out.print("Year level (1 to 4): ");
                int yL = sc.nextInt();
                stu.setYearLevel(yL);
                    if (yL == 1 || yL == 2 || yL == 3 || yL == 4){
                        System.out.println("--------------------------------");
                    
                        System.out.println("Name: "+stu.getName());
                        System.out.println("Contact Number: "+stu.getContactNum());
                        System.out.println("Program: "+stu.getProgram());
                        System.out.println("Year level: "+stu.getYearLevel());
                    }
                    else{
                    System.out.println("Invalid, please follow instructions.");
                    }
                break;
            }
    sc.close();
    }
}

