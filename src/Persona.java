public class Persona implements Comparable<Persona>{

	private String nom, cognom1, cognom2, dni;


	public Persona(String nom, String cognom1, String cognom2, String dni){
		this.nom=nom;
		this.cognom1=cognom1;
		this.cognom2=cognom2;
		this.dni=dni;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom1() {
		return cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public int compareTo(Persona persona) {
		return this.nom.compareTo(persona.nom);
	}



}