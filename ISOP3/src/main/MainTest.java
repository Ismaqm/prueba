package main;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MainTest {
	Main main = new Main();
	
	ArrayList<RangosAdecuaccion> tabla = new ArrayList<RangosAdecuaccion>();
	ArrayList<RangosMantenibilidad> tablaMante = new ArrayList<RangosMantenibilidad>();
	ArrayList<tablaGlobal> tablaGlobal = new ArrayList<tablaGlobal>();
	/*
	@Test
	public void testCalidadGlobal() {
		
	}

	@Test
	public void testMantenibilidad() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testAdecuacionFinal1() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(2, main.adecuacionFinal(tabla, 55, 86, 19));
				
	}
	
	@Test
	public void testAdecuacionFinal2() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(0, main.adecuacionFinal(tabla, 7, 8, 5));
				
	}
	
	@Test
	public void testAdecuacionFinal3() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(0, main.adecuacionFinal(tabla, 7, 8, 5));
				
	}
	
	@Test
	public void testAdecuacionFinal4() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(01, main.adecuacionFinal(tabla, 10,10,10));
				
	}
	
	@Test
	public void testAdecuacionFinal5() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(01, main.adecuacionFinal(tabla, 35, 35, 35));
				
	}
	
	@Test
	public void testAdecuacionFinal6() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(2, main.adecuacionFinal(tabla, 50, 50, 50));
				
	}
	
	@Test
	public void testAdecuacionFinal7() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(3, main.adecuacionFinal(tabla, 70, 70, 70));
				
	}
	
	@Test
	public void testAdecuacionFinal8() {
		
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		
		assertEquals(4, main.adecuacionFinal(tabla, 90, 90, 90));
				
	}

	@Test
	public void testMantenibilidad1() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(0, main.mantenibilidad(tablaMante, 5, 8, 7, 1, 4));
	}
	@Test
	public void testMantenibilidad2() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(0, main.mantenibilidad(tablaMante, 77, 77, 77, 17, 0));
	}
	
	@Test
	public void testMantenibilidad3() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(4, main.mantenibilidad(tablaMante, 95, 90, 94, 96, 90));
	}
	
	@Test
	public void testMantenibilidad4() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(0, main.mantenibilidad(tablaMante,70,8,1,3,9));
	}
	
	@Test
	public void testMantenibilidad5() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(2, main.mantenibilidad(tablaMante,35,36,55,36,55));
	}
	
	@Test
	public void testMantenibilidad6() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(3, main.mantenibilidad(tablaMante,71,80,85,55,55));
	}
	
	@Test
	public void testCalidadGlobal1() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(1, main.calidadGlobal(tablaGlobal, 1, 4));
	}
	
	@Test
	public void testCalidadGlobal2() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(2, main.calidadGlobal(tablaGlobal, 2, 2));
	}
	@Test
	public void testCalidadGlobal3() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(3, main.calidadGlobal(tablaGlobal, 3, 3));
	}
	@Test
	public void testCalidadGlobal4() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(4, main.calidadGlobal(tablaGlobal, 4, 5));
	}
	public void testCalidadGlobal5() {
		main.rellenarTabla(tabla, tablaMante, tablaGlobal);
		assertEquals(5, main.calidadGlobal(tablaGlobal, 5, 5));
	}



}
