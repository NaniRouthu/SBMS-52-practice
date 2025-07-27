package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddrRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmployeeAddressService {
	
	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private AddrRepo addrRepo;
	
	public void saveEmpWithAddr() {
		Employee e = new Employee();
		e.setName("John");
		e.setSalary(1000.00);
		
		Address a1 = new Address();
		a1.setCity("Hyd");
		a1.setState("TG");
		a1.setType("Present");
		
		Address a2 = new Address();
		a2.setCity("Banglore");
		a2.setState("KA");
		a2.setType("Permanent");

		List<Address> addrList = Arrays.asList(a1,a2);
		e.setAddr(addrList);
		
		a1.setEmp(e);
		a2.setEmp(e);
//		
		empRepo.save(e);
		
		
	}
	
	public void getEmp() {
		Optional<Employee> byId = empRepo.findById(1);
		if(byId.isPresent()) {
			Employee employee = byId.get();
			//System.out.println(employee);
		}
	}
	
	public void getAddr() {
		List<Address> all = addrRepo.findAll();
		all.forEach(a ->{
			System.out.println(a);
		});
	}
	
	public void deleteEmp() {
		empRepo.deleteAll();
	}

}
