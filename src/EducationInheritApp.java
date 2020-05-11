
public class EducationInheritApp{
    public static void main(String[] args){
  
    	//----------Educated-----------//
    	Educated educated = new Educated("Chloe Decker",  18, 8.90 , 12);
    	educated.printInfo();
    	System.out.println();
    	   	
    	//----------Pupil-----------//
    	Pupil pupil = new Pupil("John Carter", 7, 6.38, 1, "");  //ERROR: school name is empty
    	pupil.printInfo();
    	pupil.setSchool_name("St. Paul’s School");
    	System.out.println("Info after changes:");
    	pupil.printInfo();
    	System.out.println();
    	
    	//----------Student-----------//
    	Student student = new Student("Helen Smith", 24, 9.20, 6,"Oxford", "IT"); 
    	student.printInfo();
    	System.out.println();
    	
    	//----------Master-----------//
    	Master master = new Master("Helen Smith", 30, 9.20, 3,"Cambridge", " ");
    	master.printInfo();
    	System.out.println();
    }
}
