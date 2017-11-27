package test;
import P4.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class HistoricoContenedoresTest {

	@Test
	public void testSumarContenedor()  throws Exception {
		HistoricoContenedores h = new HistoricoContenedores();
		Contenedor2 c1 = new Contenedor2(10,20);
		for(int i = 0;i<100;i++) h.sumarContenedor(c1);
		
		/*
		 * el test no falla, se puede anadir los sin problemas
		 * try {
			h.sumarContenedor(c1);
			fail("Se puede anadir mas que 100 contenedores");
		}catch(Exception e) {
			
		}*/
		
		//// Ahora no se puede crear mas que 100 contenedores en el historico
		try {
			h.sumarContenedor(c1);
			fail("Se puede anadir mas que 100 contenedores");
		}catch(Exception e) {
			
		}
		
		//fail("Not yet implemented");
	}

	@Test
	public void testSumarPaquete() {
		HistoricoContenedores h = new HistoricoContenedores();
		Contenedor2 c1 = new Contenedor2(10,20);
		Paquete p1 = new Paquete(10,20);
		try{
			h.sumarPaquete(p1);
			fail("Posible anadir paquete sin contenedor");
		}catch(Exception e){
			
		}
		try {
			h.sumarContenedor(c1);
		} catch (Exception e) {
			
		}
		//fail("Not yet implemented");
	}

	@Test
	public void testContenedorMasGrande() {
		HistoricoContenedores h = new HistoricoContenedores();
		try{
			h.contenedorMasGrande();
			fail("Devolvera la posición 0 tambien si no hay contenedores!");
		}catch(Exception e){
			
		}
		//fail("Not yet implemented");
	}

}
