
public class Employee_wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation!!");
        int ifpresent = (int)(Math.random()*2);  //uc1
        if (ifpresent ==1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }

        int wagePerHr = 20;         //uc2
        int fulDay = 8;
        int dailyWage = wagePerHr * fulDay;
        System.out.println(dailyWage);


        int ifWagePerHr = 8;   //uc3
        int fullDayHr = 8;
        int partTimeHr = 8;
        int totalHour = 0;
        int dailyWageIs = 0;
        boolean partTime = true; // assuming the employee worked part-time

        if (partTime) {
            totalHour = partTimeHr;
        } else {
            totalHour = fullDayHr;
        }

        dailyWageIs = ifWagePerHr * totalHour;

        System.out.println("The daily wage of the part-time employee is " + dailyWage);  //uc5
        System.out.println("Welcome to Employee Wage Computation!!");
        int totalWrkDay = 20;
        int perHour = 20;
        int perday = 8;

        int wagePerMonth = totalWrkDay * perHour * perday;
        System.out.println(wagePerMonth);


    }
}

