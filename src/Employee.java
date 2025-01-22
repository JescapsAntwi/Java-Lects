class Employee {
    String employeeName;
    int[] dailyHoursWorked = new int[5];//Storing Mon-Fri hours
    int totalWeeklyHours;


    public Employee(String employeeName, int[] dailyHoursWorked) {
        this.dailyHoursWorked = dailyHoursWorked;
        this.totalWeeklyHours = calculateWeeklyHours();
        this.employeeName = employeeName;
    }
    //method to compute employees' total weekly hours worked
    public int calculateWeeklyHours() {
        int total = 0;
        for(int hours: dailyHoursWorked){
            total += hours;
        }
        return total;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public int getTotalWeeklyHours(){
        return this.totalWeeklyHours;
    }

    public int[] getDailyHoursWorked() {
        return dailyHoursWorked;
    }
}


//Develop a Java program that takes the names of employees and their daily work hours (Mon-Fri),
//calculates the total weekly hours for each employee, and displays the employees in increasing
//order of their total weekly hours worked. You can use any fictitious names for employees and
//there will be a minimum of 8 employees.