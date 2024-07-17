package Assignment;

public class UserAbstractMain {
	
    public static void main(String[] args) {
    	
        Customer customer = new Customer("qwe", 101, "Trainee Engineer");
        Employee employee = new Employee("rty", 102, "IT");
        Admin admin = new Admin("asd", 103, "Manager");

        customer.getDetails();
        employee.getDetails();
        admin.getDetails();

        customer.setDetails("hello vbn", 201);
        employee.setDetails("Hello sdf", 202);
        admin.setDetails("Hello jkl", 203);

        customer.getDetails();
        employee.getDetails();
        admin.getDetails();
    }
}