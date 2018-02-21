import java.util.Scanner;

public class Comprobaciones {
	Scanner scan = new Scanner(System.in);

	
    public Boolean comprobarString(String cadena) {
    	Boolean res = true;
    	try {
	    	for(int i=0; i<cadena.length(); i++) {
	    		char x = cadena.charAt(i);
	    		if (Character.isDigit(x)) {
	    			res = false;
	    			throw new Exception("Incluye numeros");
	    		}
	    	}
    	}catch(Exception e){
    		System.out.println(e.getMessage());		
    	}
    	return res;	
    }

    public Boolean comprobarDNI(String dni) {
    	String numDni="";
    	//Array de las letras del DNI
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  
        		'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };  
        //Compruebo que tenga 9 caracteres
        if (dni.length() != 9){  
        	return  false;
        }  
        //Compruebo que sea una letra la ultima posicion 
    	if (!Character.isLetter(dni.charAt(8))) {
    		return false;
        }
    	//Compruebo que  sean digitos 
        for (int i=0; i<8; i++) {   
            if(!Character.isDigit(dni.charAt(i))){
            	return false;    
            }
            //Guardo los numeros en un string separado de la letra
            numDni += dni.charAt(i);     
        }
        //Paso el string a int 
        int intDni = Integer.parseInt(numDni); 
        
        //Compruebo que el modulo corresponda con la letra
        int l = intDni % 23;
        if ((Character.toUpperCase(dni.charAt(8))) != letra[l]){
            return  false;
        }
        return true;
    	
    }
    
    public Boolean Salario(double  salari) {
		if (salari<645.30) {
			return  false;
		}
		return true;
    }
    public String Telefono() {
		Boolean ok=true;
		String tel="";
		do{
			try {
				System.out.println("Numero telefono: ");
				tel = scan.nextLine();
				//Compruebo que tenga 9 numeros
				if (tel.length() != 9) {
					throw new Exception("Numero no valido");
				}
				ok=false;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			return tel;
		}while(ok);


    }
}
