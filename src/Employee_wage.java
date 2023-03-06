
public class Employee_wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation!!");
        int wagePerHr = 8;
        int fullDayHr = 8;
        int partTimeHr = 8;
        int totalHour = 0;
        int dailyWage = 0;
        boolean partTime = true; // assuming the employee worked part-time

        if (partTime) {
            totalHour = partTimeHr;
        } else {
            totalHour = fullDayHr;
        }

        dailyWage = wagePerHr * totalHour;

        System.out.println("The daily wage of the part-time employee is " + dailyWage);

    }
}

