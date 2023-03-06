
public class Employee_wage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation!!");

        int ifpresent = (int)(Math.random()*2);
        if (ifpresent ==1){
        System.out.println("Employee is present");
    }else {
            System.out.println("Employee is absent");
        }

        int wagePerHr = 20;
        int fulDay = 8;
        int dailyWage = wagePerHr * fulDay;
        System.out.println(dailyWage);
    }
}

