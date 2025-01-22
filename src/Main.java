import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        //get employees' names
        Scanner input = new Scanner(System.in);
        int numberOfEmployees = 8;
        int daysOfWeek = 5;

        //creating an array to store employee data
        Employee[] employees = new Employee[numberOfEmployees];

        //getting employee information
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter employee details " + (i + 1));
            System.out.println("Enter employee name: ");
            String name = input.nextLine();


            //creating an array to store daily hours for current employee
            int[] dailyHours = new int[daysOfWeek];

            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
            for (int j = 0; j < dailyHours.length; j++) {
                System.out.println("Enter hours worked on " + days[j] + ": ");
                dailyHours[j] = Integer.parseInt((input.nextLine()));

            }
            //creating new employee object and storing in an array
            employees[i] = new Employee(name, dailyHours);

        }
        //sorting employees based on total weekly hours
        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.getTotalWeeklyHours(), e2.getTotalWeeklyHours()));

        System.out.println("\nEmployees sorted by their total hours worked:");
        System.out.println("-----------------------------------");
        for(Employee emp: employees) {
            System.out.println("Employee " + emp.getEmployeeName() + " worked for: " + emp.getTotalWeeklyHours() + " hours");
        }

        input.close();
    }
}













//String name = input.nextLine();
//        System.out.println("Enter employee's name: " + name);
//
//        System.out.println("--------------------");
////get employees' daily hours worked
//int hours = input.nextInt();
//        System.out.println("Employee hours: " + hours);




//System.out.println("Hello world!");



// Develop a Java program that takes the names of employees and their daily work hours (Mon-Fri),
//calculates the total weekly hours for each employee, and displays the employees in increasing
//order of their total weekly hours worked. You can use any fictitious names for employees and
//there will be a minimum of 8 employees.

//Plan


//import java.util.Scanner;
//
//public class Exception1 {
//
//
//    public static void main(String[] args){
//        //declaring variables
//
//        int num, deno;
//
//        Scanner user_input = new Scanner(System.in);
//
//        try{
//            System.out.print("Please enter the numerator: ");
//            num = user_input.nextInt();
//
//            System.out.print("Please enter the denominator: ");
//            deno = user_input.nextInt();
//
//            System.out.print("The answer is: " + num/deno);
//        }
//        catch (Exception e){
//            System.out.print(e.getMessage());
//
//        }
//
//        finally {
//            System.out.println("---End of Error Handling Example---");
//        }
//    }
//}
