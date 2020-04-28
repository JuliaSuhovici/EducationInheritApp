
class Student extends Pupil{
	private byte age;
	private byte level;
	private String university_name;
	private String speciality;
    
	Student(){}
	Student(String fullname, double average_grade, String university_name, String speciality){
		super(fullname, average_grade);
		setUniversity_name(university_name);
		setSpeciality(speciality);
	}
	Student(String fullname, int age, double average_grade, int level, String university_name, String speciality){
		super(fullname, average_grade);
			setAge(age);
			setLevel(level);
			setUniversity_name(university_name);
			setSpeciality(speciality);
	}
	
	public byte getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		if(level >=1 && level<=7) {
			this.level = (byte)level;
		}
		else {
			System.err.println("WRONG VALUE OF LEVEL!");
		}	
	}
	
	public byte getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 19 && age <=30) {
			this.age = (byte)age;
			}
			else {
				System.err.println("WRONG VALUE OF AGE!");
			}
	}
	public String getUniversity_name() {
		return university_name;
	}
	
	public void setUniversity_name(String university_name) {
		if(university_name.trim().length() != 0) {
			this.university_name = university_name;
		}
		else {
			System.err.println("NAME CAN'T BE EMPTY!");
		}
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		if(university_name.trim().length() != 0) {
			this.speciality = speciality;
		}
		else {
			System.err.println("NAME CAN'T BE EMPTY!");
		}	
	}
	
	 public void printInfo() {
		 System.out.println("> fullname: " + getFullname() + "(" + age +"years)");
		 System.out.println("> course: " + level);
		 System.out.println("> grade: " + getAverage_grade());
		 System.out.println("> university: " + university_name);
		 System.out.println("> speciality: " + speciality);
	 }  
}