import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DataLocal {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();	 
		System.out.println(hoje);
		
		LocalDate ontem = hoje.minusDays(1);
		System.out.println(ontem);
		
		LocalDate amanha = hoje.plusDays(1);
		System.out.println(amanha);
		
		LocalTime agora = LocalTime.now();
		System.out.println(agora);
		
		System.out.println(agora.plusHours(1));
		System.out.println(agora.minusMinutes(20));
		
		LocalDateTime hojeAgora = LocalDateTime.now();
		System.out.println(hojeAgora);
		
		System.out.println(hojeAgora.plusYears(2).plusDays(2).plusHours(5).plusMinutes(7).plusSeconds(10));
	}

}
