

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testLibro {
	private Libro libro;

	@Before
	public void setUp() {
		this.libro = new Libro("i tre moscardini");
	}

	@Test
	public void duplicatiNonAmmessi() {
		this.libro.addAutore(new Autore("Paolo",11));
		this.libro.addAutore(new Autore("Paolo",11));
		assertEquals(1,this.libro.getAutori().size());
	}

}
