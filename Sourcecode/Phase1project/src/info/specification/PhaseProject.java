package info.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhaseProject {
	static final String folderpath="D:\\MyPhase1 project\\Phaseproject Files";
	
    public static void main(String[] args) {
    	
    	 
    	  int task=1;
    	  do
    	  {
    		  int t;
    	
    	t=displaymenu();
    	System.out.println("Enter your choice:");
    	 switch(t)
    	 {
    	 case 1: getfiles();
    	          break;
    	 case 2:tocreatefile();
    	            break;
    	 case 3:todeletefile();
    	           break;
    	 case 4:tosearchfile();
    	           break;
    	 case 5:System.exit(0);
    	          break;
    	  default : System.out.println("Invalid choice");
    	          break;
    	 }
    	  }while(task>0);
    	
    }
           
         public static int displaymenu()
         {
        	    int t;
        	 Scanner sc=new Scanner(System.in);
        	 System.out.println("################################################");
         	System.out.println("\t\tLockedMe.com");
         	System.out.println("################################################");
         	System.out.println(" 1: Display all the files");
         	System.out.println(" 2: Add a new file");
         	System.out.println(" 3: Delete a file");
         	System.out.println(" 4: Search a file");
         	System.out.println(" 5: Exit");
         	System.out.println("################################################");
         	 t=Integer.parseInt(sc.nextLine());
         	 return t;
         	
         	
         }
         public void tosortfiles()
         {
        	  FileManager.tosortfiles(folderpath);
         }
	
    	public static void getfiles()
    	{
    		List<String> fileNames= FileManager.getfiles(folderpath);
    		   if(fileNames.size()==0)
    		   {
    			   System.out.println("No files exist");
    		   }
    		   else
    		   {
    			   System.out.println("File list is below \n");
    			   for(String f:fileNames)
    	    		{
    	    			System.out.println(f);
    	    		}
    		   }
    		
    	}
 
    	
    	public static void tocreatefile()
    	{
    		Scanner sc=new Scanner(System.in);
    		String fileName;
    		int countlines;
    		List<String> c=new ArrayList<String>();
               
    		    // Read file name from the user
    		System.out.println("Enter the file name :");
    		fileName=sc.nextLine();
    		
    		    // Read number of lines from the user
    		System.out.println("Enter the number of lines :");
    		countlines=Integer.parseInt(sc.nextLine());
    		
    		    //Read line from the user
    		  for(int i=1;i<=countlines;i++)
    		  {
    			  System.out.println("Enter lines "+i+":");
    			    c.add(sc.nextLine());
    		  }
    		  
    		   //Save the content into the file
               boolean isSaved =FileManager.tocreatefile(folderpath, fileName, c);
                   if(isSaved)
                   {
                	   System.out.println("File and content saved successfully");
                   }
                   else  	   
               {
                	   System.out.println("Error occured");
               }
                 System.out.println("Enter any character to proceed");
              
    	}
    	
    	public static void todeletefile()
    	{
    		String fileName;
     		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter the file name to be deleted");
     		fileName=sc.nextLine();
     		
     		boolean isExist=FileManager.todeletefile(folderpath, fileName);
     		
     		if(isExist)
     		{
     			System.out.println("File is deleted ");
     		}
     		else
     		{
     			System.out.println(" File not deleted some error occured");
     		}
    	}
    	
    	public static void tosearchfile()
    	{
    		String fileName;
     		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter the file name to be searched");
     		fileName=sc.nextLine();
     		
     		boolean isFound=FileManager.tosearchfile(folderpath, fileName);
     		
     		if(isFound)
     		{
     			System.out.println("File is present in the folder");
     		}
     		else
     		{
     			System.out.println(" File not present in the folder");
     		}
    	}
  
    	
    }
 	

