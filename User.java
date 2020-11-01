
public class User {
	
	//The grand repository that contains all files and other repositories
	static Repository GrandRepo = new Repository("generalRepo",0);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating some files
		File fl1 = new File("file1",100); 
		File fl2 = new File("file2",100); 
		File fl3 = new File("file3",100); 
		
		//Creating some repositories
		Repository repo1 = new Repository("repo1",200);
		Repository repo2 = new Repository("repo2",200);
		Repository repo3 = new Repository("repo3",200);
		
		//adding all created files and created repositories to the grand repository
		GrandRepo.AddFile(fl1); 
		GrandRepo.AddFile(fl2);
		GrandRepo.AddFile(fl3);
		GrandRepo.AddRepository(repo1); 
		GrandRepo.AddRepository(repo2);
		GrandRepo.AddRepository(repo3);
        
		//adding some files and repositories to the first repository (just for testing) 
        repo1.AddFile(fl1);
        repo1.AddFile(fl2);
        repo1.AddRepository(repo2);
        repo1.AddRepository(repo3);
        
        //Calculation the size of the grand repository
        GrandRepo.GetSize();
        
        //Print the size of the grand repository (sum of all files and repositories)
        System.out.println(GrandRepo.Size); 
        
        System.out.println(" "); 
        System.out.println(" "); 
        
        //Print the details (Name and Size) of each file and each repository
        GrandRepo.ShowDetails();

	}

}
