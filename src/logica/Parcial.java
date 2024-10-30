package logica;

import java.util.List;
import java.util.LinkedList;

public class Parcial {
	
	public Parcial() {
	}
	
	public List<Double> encontrarRaicesEcuacionSegundoOrden(int a, int b, int c){
		
		List<Double> listaRespuesta = new LinkedList<Double>();
		
		double discriminante = ((Math.pow(b, 2))-(4*a*c));
		
		if(discriminante == 0) {
			listaRespuesta.add((double)(-1*b)/(2*a));
			return listaRespuesta;
		} else if (discriminante < 0) {
			return listaRespuesta;
		} else {
			
			double r1 = ((-1*b)+Math.sqrt(discriminante))/(2*a);
			double r2 = ((-1*b)-Math.sqrt(discriminante))/(2*a);
			
			listaRespuesta.add(r1);
			listaRespuesta.add(r2);
			
			return listaRespuesta;
			
		}
	}
	
}
