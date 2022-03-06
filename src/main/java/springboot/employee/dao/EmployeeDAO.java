package springboot.employee.dao;

import org.springframework.stereotype.Repository;
import springboot.employee.model.Employee;
import springboot.employee.model.Employees;

@Repository
public class EmployeeDAO {
    private static final Employees list = new Employees();

    static {
        list.getEmployeeList().add(new Employee(1, "Lucas", "Thollon", "lucas.thollon@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Zackaria", "Aouri", "pizzaMan@ukraine.ru"));
        list.getEmployeeList().add(new Employee(3, "Anass", "ElKassmi", "DonkeyMan@lookout.com"));
        list.getEmployeeList().add(new Employee(4, "Mohammed", "ElMadiouni", "Amazon@bezos.com"));
    }

    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}