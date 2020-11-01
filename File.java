
public class File implements FilesInGeneral  {
	
	//Details of file
	public String Name;
	public int Size;
	
	//Constructor of file
	public File(String name, int size){
		Name=name;
		Size=size;
	}
	
	//Method for printing the details of the file
    public void ShowDetails()  
    { 
    	System.out.println("Name: "+this.Name);
    	System.out.println("Size: "+this.Size);  
    }
    
}
