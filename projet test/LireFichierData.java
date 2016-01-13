import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


public class LireFichierData {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties p = new Properties(System.getProperties());
		
		String workDir = System.getProperty("user.dir")+"\\fichiers";
		
		String fichier = "\\u.data";
		
		File monFichier = new File(workDir + fichier);
		
		
		String userPath =  monFichier.getPath();
		
		String chaine="";
		
		
		
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream( monFichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			
			String ligne;
			
			//lecture ligne par ligne
			
			while ((ligne=br.readLine())!=null){
				
				// indication du séparateur de champs 
				
				String str[] =ligne.split("	");
				
				// chaque valeur du tableau str est une valeur de ta ligne
				
				System.out.println(ligne);
				System.out.println(str[0]);
				
				//chaine+=ligne+"\n";
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
	}

}

