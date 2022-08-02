
public class Autore {
	private int annoNascita;
	private String nome;
	public Autore(String nome, int annoNascita) {
		this.nome = nome;
		this.annoNascita = annoNascita;
	}
	public String getNome() {
		return this.nome;
	}
	public int getAnnoNascita() {
		return this.annoNascita;
	}

	public boolean equals(Object obj) {
		if(obj == null || this.getClass() != obj.getClass() ) {
			return false;
		}
		Autore that = (Autore)obj;
		return this.getNome().equals(that.getNome()) && this.getAnnoNascita() == that.getAnnoNascita();
	}
	
	public int hashCode() {
		return this.getAnnoNascita() + this.getNome().hashCode();
	}
}
