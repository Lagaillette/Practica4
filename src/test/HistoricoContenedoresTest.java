package test;
import P4.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class HistoricoContenedoresTest {

	@Test
	public void testSumarContenedor() {
		HistoricoContenedores h = new HistoricoContenedores();
		Contenedor2 c1 = new Contenedor2(10,20);
		
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
		h.sumarContenedor(c1);
		//fail("Not yet implemented");
	}

	@Test
	public void testContenedorMasGrande() {
		//fail("Not yet implemented");
	}

}
