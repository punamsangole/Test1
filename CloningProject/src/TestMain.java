
public class TestMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		/*Employee e1 = new Employee(101, "Ajit");
		Employee e2 =(Employee) e1.clone();//casting
		
		System.out.println("Employee 1>>"+e1);
		System.out.println("Employee 2>>"+e2);*////shallow cloning/
		Address address = new Address("Pune");
		Employee e1 = new Employee(101,"Ajit", address);
		
		Object o=e1.clone();
		Employee e2 = (Employee) o;
		
		e2.setName("Shyam");
		e2.getAddress().setCity("Mumbai");
		
		System.out.println("Employee 1>>"+e1);
		System.out.println("Employee 2>>"+e2);
		
		
	}

}
