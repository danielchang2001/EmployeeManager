package daniel.employeemanager.service;

import daniel.employeemanager.model.Employee;
import daniel.employeemanager.repo.EmployeeRepo;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  private final EmployeeRepo employeeRepo;

  @Autowired
  public EmployeeService(EmployeeRepo employeeRepo) {
    this.employeeRepo = employeeRepo;
  }

  public Employee addEmployee(Employee employee) {
    employee.setEmployeeCode(UUID.randomUUID().toString());
    return employeeRepo.save(employee);
  }
}
