package Reduce;

public class Media {
	private double total;
	private int qt;
	
	public Media adicionar(double valor) {
		this.total += valor;
		qt++;
		
		return this;
	}
	
	public double getMedia() {
		return total/qt;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.qt = m1.qt + m2.qt;
		resultante.total = m1.total + m2.total;
		
		return resultante;
	}
}
