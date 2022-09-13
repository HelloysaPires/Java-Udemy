import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) {

		Date d1 = new Date(1578954564563247L);
		Date d2 = new Date(1245554566874555l);
		Date d2Clone = new Date(1245554566874555l);
		
		System.out.println(d1.toInstant());
		System.out.println(d2.toInstant());

		
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d1));
		System.out.println(d2.compareTo(d2Clone));
		
		System.out.println(d1.equals(d2));
		System.out.println(d2.equals(d1));
		System.out.println(d2.equals(d2Clone));
		
		System.out.println(d1.getTime());
		System.out.println("\n");
		
		String data = DateFormat.getInstance().format(d1);
		System.out.println(data);
		
		data = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(d1);
		System.out.println(data);
		
		data = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(d1);
		System.out.println(data);
		
		SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yy");
		String dataFormatada = formatada.format(d1);
		
		System.out.println(dataFormatada);
	}

}
