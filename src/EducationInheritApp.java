
public class EducationInheritApp{
    public static void main(String[] args){
  
    	//----------Educated-----------//
    	Educated educated = new Educated("Chloe Decker",  18, 8.90 , 12);
    	educated.printInfo();
    	educated.setAge(-80);   //ERROR
    	educated.setAverage_grade(-2);   //ERROR
    	System.out.println("Info after changes:");
    	educated.printInfo();
    	System.out.println();
    	
    	//Check getters
    	System.out.println("Get fullname: " + educated.getFullname());
    	System.out.println("Get age: " + educated.getAge());
    	System.out.println("Get level: " + educated.getLevel());

    	
    	//----------Pupil-----------//
//    	Pupil pupil = new Pupil("John Carter", 7, 6.38, 1, "");  //ERROR: school name is empty
//    	pupil.printInfo();
//    	pupil.setAge(27);
//    	pupil.setSchool_name("St. Paul’s School");
//    	System.out.println("Info after changes:");
//    	pupil.printInfo();
//    	System.out.println();
//    	//Check getters
//    	System.out.println(pupil.getAge());
//    	System.out.println(pupil.getLevel());
//    	System.out.println(pupil.getFullname());
    	
    	//----------Student-----------//
//    	Student student = new Student("Helen Smith", 24, 9.20, 6,"Oxford", " "); //ERROR: specialty is empty
//    	student.printInfo();
//    	student.setAge(35);   //ERROR
//    	student.setLevel(8);  //ERROR
//    	student.setSpeciality("IT");
//    	System.out.println("Info after changes:");
//    	student.printInfo();
//  	System.out.println();
//    	//Check getters
//    	System.out.println("Get age: " + student.getAge());
//    	System.out.println("Get level: " + student.getLevel());
//    	System.out.println("Get fullname: " + student.getFullname());
//    	System.out.println("Get speciality: " + student.getSpeciality());
//    	System.out.println("Get university name: " + student.getUniversity_name());
    	
    	//----------Master-----------//
//    	Master master = new Master("Helen Smith", 20, 9.20, 6,"Cambridge", " ");
//    	master.printInfo();
//    	master.setAge(23);
//    	master.setLevel(2);
//    	master.setSpeciality(" ");
//    	System.out.println("Info after changes:");
//    	master.printInfo();
//    	System.out.println();
//    	//Check getters
//    	System.out.println("Get age: " + master.getAge());
//    	System.out.println("Get level: " + master.getLevel());
//    	System.out.println("Get fullname: " + master.getFullname());
//    	System.out.println("Get speciality: " + master.getSpeciality());
//    	System.out.println("Get university name: " + master.getUniversity_name());
    }
}