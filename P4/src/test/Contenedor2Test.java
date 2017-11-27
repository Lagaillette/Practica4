package test;
import P4.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class Contenedor2Test {

	@Test
	public void testSumarPaquete() {
		Contenedor2 c = new Contenedor2();
		c.setAncho(10);
		c.setAlto(20);
		Paquete p1 = new Paquete(1,2);
		Paquete p2 = new Paquete(100,200);
		c.sumarPaquete(p1);
		assertTrue(c.vecPaquetes.size() == 1);
		assertEquals(c.vecPaquetes.get(0),p1);
		c.sumarPaquete(p2);
		assertTrue(c.vecPaquetes.size() == 2);
		//el methodo tiene que añadir un paquete al vector, es lo que hace.
		//fail("Not yet implemented");
	}

	@Test
	public void testContarPaquetes() {
		Contenedor2 c = new Contenedor2();
		c.setAncho(10);
		c.setAlto(20);
		Paquete p1 = new Paquete(1,2);
		Paquete p2 = new Paquete(100,200);
		assertTrue(c.contarPaquetes() == 0);
		c.sumarPaquete(p1);
		assertTrue(c.contarPaquetes() == 1);
		assertTrue(c.contarPaquetes() == 1);
		c.sumarPaquete(p2);
		assertTrue(c.contarPaquetes() == 2);
		assertTrue(c.contarPaquetes() == 2);
		//fail("Not yet implemented");
	}

	@Test
	public void testCalculaAreaPaquete() {
		Contenedor2 c = new Contenedor2();
		c.setAncho(10);
		c.setAlto(20);
		Paquete p1 = new Paquete(10,20);
		assertEquals(c.calculaAreaPaquete(p1),200);
		//aqui calcula la area del paquete, funciona bien
		//fail("Not yet implemented");
	}

	@Test
	public void testAreaTotalPaquetes() {
		Contenedor2 c = new Contenedor2();
		c.setAncho(10);
		c.setAlto(20);
		Paquete p1 = new Paquete(1,2);
		Paquete p2 = new Paquete(10,20);
		
		assertTrue(c.areaTotalPaquetes() == 0);
		c.sumarPaquete(p1);
		assertTrue(c.areaTotalPaquetes() == 2);
		c.sumarPaquete(p2);
		assertTrue(c.areaTotalPaquetes() == 202);
		//fail("Not yet implemented");
	}

	@Test
	public void testEspacioSobrante() {
		Contenedor2 c = new Contenedor2();
		c.setAncho(10);
		c.setAlto(20);
		Paquete p1 = new Paquete(1,2);
		Paquete p2 = new Paquete(10,20);
		
		assertTrue(c.espacioSobrante() == 200);
		c.sumarPaquete(p1);
		assertTrue(c.espacioSobrante() == 198);
		c.sumarPaquete(p2);
		//este no funciona bien, porque no es posible poner un paquete mas grande.
		//Tiene que devolver 198 porque no puede añadir porque es mas grande o
		//0 porque ya no hay espacio.
		assertTrue(c.espacioSobrante() == 198);
		//fail("Not yet implemented");
	}

}
