import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class testSelezionaAutore {
	private SelezionatoreAutoriGiovani autori;
	private Libro libro1;
	private Libro libro2;
	private List<Libro> listaVuota;
	
	@Before
	public void setUp() throws Exception {
		this.autori = new SelezionatoreAutoriGiovani();
		this.listaVuota = new LinkedList<Libro>();
		this.libro1 = new Libro("libro1");
		libro1.addAutore(new Autore("paolo",2002));
		libro1.addAutore(new Autore("luca",2003));
		//listaVuota.add(libro1);
	}

	@Test
	public void testSenzaLibri() {
		assertEquals(0,this.autori.eseguiSelezione(listaVuota).size());
	}

}
