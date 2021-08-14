package info.specification;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileManager {
	    /**
	     *  This Method will return filename from the folder
	     * @param folderpath
	     * @return List<String>
	     */
	
	public static List<String> getfiles(String folderpath)
	{
		 //Creating file object
		File folder = new File(folderpath);
		
		//Getting all files into file array
		File[] listOfFiles = folder.listFiles();
		
		// Declare a list to store filenames
		List<String> fileNames=new ArrayList<String>();
		  for(File f:listOfFiles)
			  fileNames.add(f.getName());
			  
			  //return the list
			  return fileNames;
	}
	    /**
	     *  This method will sort the files in ascending order
	     * @param folderpath
	     */
	  public static void tosortfiles(String folderpath)
	  {
		  File folder = new File(folderpath);
			System.out.println(folderpath);
			List<String> listfile=Arrays.asList(folder.list());
			Collections.sort(listfile);
			
			System.out.println("..........................................");
			System.out.println("Sorting in the ascending order");
			
			for(String r:listfile)
			{
				System.out.println(r);
			}
				   
				  
	  }
	    
	/**
	 *  This method will create and append into the file specified
	 * @param folderpath
	 * @param fileName
	 * @param c
	 * @return boolean
	 */
	
	public static boolean tocreatefile(String folderpath,String fileName, List<String> c)
	{
		try
		{
			//Adding folderpath and fileName to create a file  and creating object
			  
			File folder = new File(folderpath,fileName);
			FileWriter fs=new FileWriter(folder);
			  for(String s:c)
			  {
				  fs.write(s+"\n");
			  }
			 fs.close();
			 return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}
	    /**
	     *  This method will delete a specific file
	     * @param folderpath
	     * @param fileName
	     * @return boolean
	     */
	public static boolean todeletefile(String folderpath,String fileName)
	{
		     //Adding folderpath with fileName and creating object
		 File file = new File(folderpath +"\\" +fileName);
		 try
		 {
			 if(file.delete())
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
		 }
		 catch(Exception E)
		 {
			 return false;
		 }
	}
	     /**
	      * This Method will search a file in a folder 
	      * @param folderpath
	      * @param fileName
	      * @return boolean
	      */
	
	public static boolean tosearchfile(String folderpath,String fileName)
	{
		     //Adding folderpath with fileName and creating object
		 File file = new File(folderpath +"\\" +fileName);
			 if(file.exists())
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
		 }
		
	}
	



