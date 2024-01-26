
public class Employee implements Cloneable{
	
	private int empId;
	private String name;
	private Address address;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public Employee(int empId, String name, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		
		Address address = new Address(getAddress().getCity());
		
		employee.setAddress(address);
		return employee;
	}
	
	

}
