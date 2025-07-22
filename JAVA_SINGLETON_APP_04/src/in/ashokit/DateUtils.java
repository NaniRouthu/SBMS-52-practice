package in.ashokit;

public class DateUtils {
	
//	lazy loading
//	private static DateUtils instance = null;
//
	private DateUtils() {
		
	}
//	
//	public static DateUtils getInstance() {
//		
//		if(instance == null)
//			instance = new DateUtils();
//		
//		return instance;
//		
//	}
	
//	eager loading
	
//	private static final DateUtils instance = new DateUtils();
//	
//	public static DateUtils getInstance() {
//		return instance;
//	}
	
	// billplugh
	
	private static class Holder{
		private static final DateUtils instance = new DateUtils();
	}
	
	public static DateUtils getInstance() {
		return Holder.instance;
	}
	
	
	
	

}
