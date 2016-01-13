import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class TabFile {


	    	static int rows = 10;
	    	static int columns = 10;
			static char maze [][] = new char [rows][columns];
	 
	 
	 
	    public static void main(String[] args)throws IOException {
	 
	 
		String filename;
	    	boolean valid = false;
	    	boolean approved = false;
	    	boolean opened = false;
	    	String OK;
	    	String ok;
	    	char choice;
	 
	    	Scanner input = new Scanner(System.in);
	 
	 
	    //prompt user for name of file to be loaded
	 
	 
		    
	 
		    do{
		    System.out.println("\nPlease enter name of file containing the maze: ");
		    filename = input.nextLine();
	 
	    	try
	    	{
	    		BufferedReader in = new BufferedReader(new FileReader(filename));
	 
	    		for (int a=0; a<maze.length; a++)
	    		{
	    			for (int b=0; b<maze[0].length; b++)
	    			{
	    				maze[a][b] = (char)in.read();
	    				System.out.print(maze[a][b]);
		    		}
	    		}
	 
	    		System.out.println();		
	    		opened = true;
	    		in.close();
	    	}
	    	catch (FileNotFoundException e){System.out.println("File Not Found !");}
	    	catch (IOException e){System.out.println("I/O Exception !");}
		    }while(!opened);
	    }
}
		    
	    