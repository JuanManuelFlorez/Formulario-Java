class Empleat extends Persona{

	private int codi_empleat, jornada;
	private double salari;
	private String carrec, estudis, telefon;


	public Empleat(String nom, String cognom1, String cognom2, String dni, int codi_empleat, String carrec, int jornada,
		String estudis, double salari, String telefon){
		super(nom, cognom1, cognom2, dni);

		this.codi_empleat= codi_empleat;
		this.carrec= carrec;
		this.jornada=jornada;
		this.estudis=estudis;
		this.salari=salari;
		this.telefon=telefon;
	}

	public int getCodi_empleat() {
		return codi_empleat;
	}

	public String getTelefon() {
		return telefon;
	}

	public double getSalari() {
		return salari;
	}

	public int getJornada() {
		return jornada;
	}

	public String getCarrec() {
		return carrec;
	}

	public String getEstudis() {
		return estudis;
	}


}