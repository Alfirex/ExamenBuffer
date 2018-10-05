package dir;
import java.io.File;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom1="carpeta1";
		String nom2="carpeta2";
		
		File carpeta1 = new File(nom1).getAbsoluteFile();
		File carpeta2 = new File(nom2).getAbsoluteFile();
		
		if(carpeta1.isDirectory() && carpeta2.isDirectory()) {
			System.out.println("Si es un directorio");
			comparar(carpeta1,carpeta2);
		}else {
			System.out.println("Uno de las carpetas que has puesto no existe");
		}

	}
	
	

	
	public static void comparar(File carp1, File carp2){
		
		int carpetas1 = carp1.listFiles().length;
		int carpetas2 = carp2.listFiles().length;
		//System.out.println(carpetas1);
		//System.out.println(carpetas2);
		if(carpetas1 == carpetas2) {
			System.out.println("Las 2 carpetas son iguales, tienen la cantidad: "+ carpetas1);
		}else {
			System.out.println("Las 2 carpetas son diferentes, La carpeta 1 tiene: "+ carpetas1+" Y la otra carpeta 2 tiene: "+ carpetas2 );
		}
		
	}

}
