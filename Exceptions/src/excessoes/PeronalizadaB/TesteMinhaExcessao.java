package excessoes.PeronalizadaB;

public class TesteMinhaExcessao {

		public static void main(String[] args) {

			int[] num = {4, 8, 5, 16, 32, 21, 64, 128};
			int[] den = {2, 0 , 4, 8 , 0 ,2 , 4};
			
			for(int i = 0; i<num.length; i++) {
				try {
					if(num[i] %2 !=0) throw new DivisaoNaoExata(num[i], den[i]);
					System.out.println(num[i] + "/" + den[i] + " = " + (num[i]/den[i]) );
				}catch(DivisaoNaoExata | ArithmeticException e) {
					System.out.println("Erro: ");	
					//e.printStackTrace();
					}
				catch(Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}
		   }
			
			System.out.println("Fim");

	}
}
