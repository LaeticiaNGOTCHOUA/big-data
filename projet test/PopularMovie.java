import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.io.File;
import java.io.FileReader;

public class PopularMovie {

	/*String chaine="";
	String fichier ="fichiertexte.txt";

	//lecture du fichier texte	
	try{
		InputStream ips=new FileInputStream(fichier); 
		InputStreamReader ipsr=new InputStreamReader(ips);
		BufferedReader br=new BufferedReader(ipsr);
		String ligne;
		while ((ligne=br.readLine())!=null){
			if (ligne.contains("nom :"))
			{
				String[] st = ligne.split(ligne, ':');
				System.out.println("Nom = "+st[1]);
			}
			chaine+=ligne+"\n";
		}
		br.close(); 
	}		
	catch (Exception e){
		System.out.println(e.toString());
	}*/
	
	
    public static void readFile(String pathToFile){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(pathToFile)));
            String ligne;
            while((ligne = reader.readLine()) != null){
               
                    System.out.println(ligne);
                }
            
        } catch (Exception ex){
            System.err.println("Error. "+ex.getMessage());
        }
    }
    public static void main(String[] args) {
        readFile("fichiers/u.item");
    }
 
    
    
    

}
