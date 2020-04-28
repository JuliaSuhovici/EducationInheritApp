
class Pupil extends Educated{
	private byte level; 
	private byte age;
	private String school_name;
   
	Pupil(){}
	Pupil(String fullname, double average_grade){
		super(fullname, average_grade);
	}
	Pupil(String fullname, int age, double average_grade, int level, String school_name){
		super(fullname, average_grade);
		setSchool_name(school_name);
		setLevel(level);
		setAge(age);
	}
	
	public byte getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		if(level >=1 && level<=12) {
			super.setLevel((int)level);
		}
		else {
			System.err.println("WRONG VALUE OF LEVEL!");
		}	
	}
	
	public byte getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 6 && age <=20) {
			super.setAge((int)age);
			}
			else {
				System.err.println("WRONG VALUE OF AGE!");
			}
	}
	
	public String getSchool_name() {
		return school_name;
	}
	
	public void setSchool_name(String school_name) {
		if(school_name.trim().length() != 0) {
			this.school_name = school_name;
		}
		else {
			System.err.println("SCHOOL NAME CAN'T BE EMPTY!");
		}
	}

	 public void printInfo() {
		 System.out.println("> fullname: " + getFullname() + "(" + age +"years)");
		 System.out.println("> class: " + level);
		 System.out.println("> grade: " + getAverage_grade());
		 System.out.println("> school: " + school_name);
	 }
}