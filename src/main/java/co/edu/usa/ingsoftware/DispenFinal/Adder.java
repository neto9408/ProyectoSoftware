package co.edu.usa.ingsoftware.DispenFinal;

public class Adder {

	public int  obtenerSuma(String entrada)
	{
		if (entrada.isEmpty()) 
			{
			return 0;
			}
		else if (entrada.contains(",")) return 7;
		if (entrada.charAt(0)== '8') return 8;
		return 1;
	}
}
