package in.ashokit;

public class Test {

	public static void main(String[] args) {
		
		  DateUtils instance = DateUtils.getInstance();
		  
		  System.out.println(instance.hashCode());
		  
		  DateUtils instance2 = DateUtils.getInstance();
		  System.out.println(instance2.hashCode());

	}

}
