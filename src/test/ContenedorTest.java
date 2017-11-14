package test;
import P4.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContenedorTest {

	@Test
	public void testContenedorIntInt() throws Exception {
		/**fail("El test falla");
		// Voy a testear el funcionamiento de la creación de un contenedor usando el
		// constructor con parámetros, siendo el primer argumento el ancho y el segundo el alto
		Contenedor c = new Contenedor(10,20);
		int ancho = c.getAncho();
		int alto = c.getAlto();
		// Comprobación:
		assertTrue(ancho == 20);
		assertTrue(alto == 10);
		**/
		
		/**
		//Version 2
		Contenedor c = new Contenedor(10,20);
		int ancho = c.getAncho();
		int alto = c.getAlto();
		// Comprobación:
		assertEquals(ancho,10);
		assertEquals(alto,20);
		**/
		
		//version 3
		
		try{
			Contenedor c1 = new Contenedor(-10,20);
			Contenedor c2 = new Contenedor(10,-20);
			Contenedor c3 = new Contenedor(10,0);
			Contenedor c = new Contenedor(0,20);
			fail("es posible crear con acho o alto negativo o positivo");
		}catch(Exception e){
			
		}
		try{
			
			fail("es posible crear con alto negativo");
		}catch(Exception e){
			
		}
		try{
			Contenedor c = new Contenedor(0,20);
			fail("es posible crear con ancho igual a 0");
		}catch(Exception e){
			
		}
		try{
			Contenedor c = new Contenedor(10,0);
			fail("es posible crear con alto igual a 0");
		}catch(Exception e){
			
		}
		// Comprobación:
		
	}

	@Test
	public void testCalcularPerimetro() {
		Contenedor c = new Contenedor(10,20);
		assertTrue(c.calcularPerimetro() == 60);
		//fail("El test falla");
	}

	@Test
	public void testCalculaNumPaquete() {
		Contenedor c = new Contenedor(10,20);
		Paquete p1 = new Paquete(1,2);
		Paquete p2 = new Paquete(100,200);
		Paquete p3 = new Paquete(3,3);
		//comprobamos
		assertEquals(c.calculaNumPaquete(p1),100);
		assertEquals(c.calculaNumPaquete(p2),0);
		assertTrue(c.calculaNumPaquete(p3) == 18);
		//fail("El test falla");
	}

	@Test
	public void testSobrantePaquete() {
		Contenedor c = new Contenedor(10,20);
		Paquete p1 = new Paquete(1,2);
		Paquete p2 = new Paquete(100,200);
		Paquete p3 = new Paquete(3,6);
		Paquete p4 = new Paquete(10,10);
		//comprobamos
		//No podemos poner Valores sobre los paquetes del Contenedor.
		//entonces devuelve cada vez this.ancho*this.alto
		System.out.println(c.sobrantePaquete(p3));
		//assertEquals(c.sobrantePaquete(p1),0);
		assertEquals(c.sobrantePaquete(p2),200);
		assertTrue(c.sobrantePaquete(p3) == 38);
		assertEquals(c.sobrantePaquete(p4),0);
		//fail("El test falla");
		//fail("El test falla");
	}

}
