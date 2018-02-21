import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class formulario {
	public static void main(String[] args) {
		
		Comprobaciones c = new Comprobaciones();
		TreeSet<Empleat> empleados = new TreeSet();
		
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> codis = new ArrayList<Integer>();
		Boolean ok = true;
		//Comprobacion nombre
		
		String nom="";
		while(ok) {
			System.out.println("Nombre: ");
			nom = scan.nextLine();
			if(c.comprobarString(nom)) {
				ok=false;
			}
		}
		//Comprobacion apellido
		ok=true;
		String cog1 = "";
		while(ok) {
			System.out.println("Primer apellido: ");
			cog1 = scan.nextLine();
			if(c.comprobarString(cog1)) {
				ok=false;
			}
		}

		//Comprobacion apellido
		ok=true;
		String cog2 = "";
		while(ok) {
			System.out.println("Segundo apellido: ");
			cog2 = scan.nextLine();
			if(c.comprobarString(cog2)) {
				ok=false;
			}
		}		
		//Comprobacion DNI
		ok=true;
		String dni = "";
		do{
			try {
			System.out.println("DNI: ");
			dni = scan.nextLine();
			if(c.comprobarDNI(dni)) {
				ok=false;
			}
			}catch(Exception e){
				scan.next();
			}
		}while(ok) ;
		
		
		//Comprobacion cargo
		ok=true;
		String cargo="";
		while(ok) {
			System.out.println("Cargo: ");
			cargo = scan.nextLine();
			if(c.comprobarString(cargo)) {
				ok=false;
			}
		}
		
		//Comprobacion estudios
		ok=true;
		String estudis ="";
		while(ok) {
			System.out.println("Estudios: ");
			estudis = scan.nextLine();
			if(c.comprobarString(estudis)) {
				ok=false;
			}
		}	

		//Comprobacion nº empleado	
		ok=true;
		int num=0;
		while(ok){
			try {
				System.out.println("Codigo empleado: ");
				num = scan.nextInt();
				for(int i=0; i<codis.size(); i++) {
					if(num==codis.get(i)) {
						throw new Exception("Codi existente");
					}
				}
				codis.add(num);
				ok=false;
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
		//Comprobacion jornada laboral
		
		ok=true;
		int horas =0;
		do {
			try {
				System.out.println("Horas: ");
				horas = scan.nextInt();
				if (horas>40) {
					throw new Exception("Maximo 40h");
				}
				ok=false;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}while(ok);
		
		
		//Comprobacion salario
		ok=true;
		double s = 0;
		do {
			try {
				System.out.println("Salario: ");
				s = scan.nextFloat();
				if(c.Salario(s)==false) {
					throw new Exception ("Salario por debajo del minimo");
				}
				ok= false;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}while(ok);
		
		//Comprobacion telefono
		String tel = c.Telefono();
	
		
		empleados.add(new Empleat(nom, cog1, cog2 , dni, num, cargo, horas, estudis, s, tel));
		
		System.out.println("---------------------------");
		System.out.println("Empleado agregado con exito");
		System.out.println("---------------------------");
	}
}

