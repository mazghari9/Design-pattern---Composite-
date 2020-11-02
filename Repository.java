import java.util.ArrayList; 
import java.util.List;

public class Repository implements FilesInGeneral  {
	
	//Details of repository
	private String Name;
	public int Size=0;
	
	//Lists of files/repositories
	private List<File> filesList = new ArrayList<File>();
	private List<Repository> repositoriesList = new ArrayList<Repository>();
	
	//Constructor of repository
	public Repository(String name, int size){
		Name=name;
		Size=size;
	}
	
	//Method for adding a file to the repositories
	public void AddFile(File F)  
    { 
		filesList.add(F);
    }
	
	//Method for adding a repository to the repositories
	public void AddRepository(Repository R)  
    { 
		repositoriesList.add(R);
    }
	
	//Method for calculating the sum of sizes of files and repositories contained in this repository
	public void GetSize()  
    { 
        for(File F:filesList){
        	this.Size+=F.Size;
        }
        
        for(Repository R:repositoriesList){
        	R.GetSize();
        	this.Size+=R.Size;
        }
    }
	
	//Method for printing the details of files and repositories contained in this repository 
    public void ShowDetails()  
    { 
    	System.out.println("--------Repositories--------");
    	System.out.println(" ");
    	for(Repository R:repositoriesList){
    		System.out.println("Name: "+R.Name);
    		System.out.println("Size: "+R.Size);
    		System.out.println("+ + + +");
        }
    	System.out.println(" ");
    	System.out.println(" ");
    	System.out.println("-----------Files-----------");
    	System.out.println(" ");
    	for(File F:filesList){
    		F.ShowDetails();
    		System.out.println("+ + + +");
        }
    }
	
    //Method for generating repository shortcuts 
    public Repository Raccourci(){
    	Repository raccourci=new Repository(this.Name,2);
    	return raccourci;
    }
    
}
