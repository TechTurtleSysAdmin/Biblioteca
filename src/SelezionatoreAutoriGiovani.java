import java.util.LinkedList;
import java.util.List;

public class SelezionatoreAutoriGiovani implements Selezionatore{
	
	@Override
	public List<Autore> eseguiSelezione(List<Libro> libriInBiblioteca){
		List<Autore> autoriGiovani= new LinkedList<Autore>();
		for(Libro iteraLibro: libriInBiblioteca) {
			for(Autore iteraAutori: iteraLibro.getAutori()) {
				if(iteraAutori.getAnnoNascita() > 2000) {
					autoriGiovani.add(iteraAutori);
				}
			}
		}
		return autoriGiovani;
	}
}
