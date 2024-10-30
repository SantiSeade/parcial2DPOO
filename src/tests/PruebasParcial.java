package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class PruebasParcial {
	
	private Parcial parcial;
	
	private List<Double> listaRespuestasUnaSolucion = Arrays.asList(0.0);
	private List<Double> listaRespuestaDosSoluciones = Arrays.asList(-1.0, 0.0);
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void unaSolucionTest() {
		List<Double> listaSol = parcial.encontrarRaicesEcuacionSegundoOrden(1, 0, 0);
		
		System.out.println(listaSol.get(0));
		System.out.println(this.listaRespuestasUnaSolucion.get(0));
		
		assertTrue(listaSol.get(0) == this.listaRespuestasUnaSolucion.get(0));
	}
	
	@Test 
	public void sinSolucionTest() {
		assertTrue(this.parcial.encontrarRaicesEcuacionSegundoOrden(1, 1, 1).size() == 0);
	}
	
	@Test
	public void dosSolucionesTest() {
		List<Double> listaSol = parcial.encontrarRaicesEcuacionSegundoOrden(1, 1, 0);
		
		System.out.println(listaSol.get(0));
		System.out.println(listaSol.get(1));
		
		assertTrue(listaSol.get(0) == this.listaRespuestaDosSoluciones.get(0));
		
	}
}
