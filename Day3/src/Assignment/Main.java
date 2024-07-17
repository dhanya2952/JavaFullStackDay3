package Assignment;

public class Main {
    public static void main(String[] args) {
    	EmployeeSalaryCalc[] employees = {
            new EmployeeSalaryCalc("varma", 1, 85),
            new EmployeeSalaryCalc("ravi", 2, 165),
            new EmployeeSalaryCalc("sam", 3, 45),
        };

    	EmployeeSalaryCalc maxNetSalaryEmployee = employees[0];

        for (EmployeeSalaryCalc emp : employees) {
            System.out.println("Name: " + emp.getName() + ", ID: " + emp.getId() +
                               ", Salary: " + emp.getSalary() + ", Gross Salary: " + emp.getGrossSalary() +
                               ", Net Salary: " + emp.getNetSalary());

            if (emp.getNetSalary() > maxNetSalaryEmployee.getNetSalary()) {
                maxNetSalaryEmployee = emp;
            }
        }

        System.out.println("\nEmployee with Maximum Net Salary:");
        System.out.println("Name: " + maxNetSalaryEmployee.getName() + ", ID: " + maxNetSalaryEmployee.getId() +
                           ", Net Salary: " + maxNetSalaryEmployee.getNetSalary());
    }
}
