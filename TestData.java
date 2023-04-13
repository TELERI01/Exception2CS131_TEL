import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
	

	public class TestData
	{
	   //-----------------------------------------------------------------
	   //  Creates a file of test data that consists of ten lines each
	   //  containing ten integer values in the range 10 to 99.
	   //-----------------------------------------------------------------
	   public static void main(String[] args) throws IOException
	   {
	      final int MAX = 10;

	      int value = 0;
	      String file = "test.dat";

	      Random rand = new Random();
	      
	      FileWriter fw = new FileWriter(file);
	      BufferedWriter bw = new BufferedWriter(fw);
	      PrintWriter outFile = new PrintWriter(bw);
	      
	      
	      
	      for (int line=1; line <= MAX; line++)
	      {
	         for (int num=1; num <= MAX; num++)
	         {
	            value = rand.nextInt(90) + 10;
	            outFile.print(value + "   ");
	         }
	         outFile.println();
	      }
	      outFile.close();
	      System.out.println("Output file has been created: " + file);
	      System.out.println("Contents: ");
	      
	     
	      /*
	       * Catches an File not found exception 
	       */
	      try 
	      {
	    	  Scanner scan = new Scanner(new File("test1.dat")); //This will return error! test.dat does not.
	    	  //Scanner scan = new Scanner (new File("test.dat"));
	    	  while (scan.hasNextLine()) 
	    	  {
		    	  System.out.println(scan.nextLine());
		      }// Prints the .dat file from scanner
	      }
	      catch (Exception e)
	      {
	    	  System.out.println("File not found!");  //Text returned when exception is met
	      }
	      
	      //_____________________________________________________________________
	      
	      /*
	       * Throws an IO exception
	       */
	      try 
	      {
	    	  Scanner scan = new Scanner(new File("test1.dat")); //Returns Error
	    	  //Scanner scan = new Scanner (new File("test.dat"));
	    	  while (scan.hasNextLine()) {	  
		    	  System.out.println("\n" + scan.nextLine());
		    	  }
	      }
	      catch (Exception e)
	      {
	    	  throw new FileNotFoundException();  //Thrown FileNoteFoundException
	      }
	   
	   }  

}
