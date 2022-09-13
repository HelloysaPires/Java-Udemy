import java.util.Calendar;

public class Calenário {

	public static void main(String[] args) {

		Calendar c1 = Calendar.getInstance();	
		
		System.out.println(c1.getTime());
		
		c1.add(Calendar.DATE, -2);
		System.out.println(c1.getTime());
		
		c1.add(Calendar.MONTH, 2);
		System.out.println(c1.getTime());
		
		c1.add(Calendar.YEAR, 4);
		System.out.println(c1.getTime());
		
		
	}

}
