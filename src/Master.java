
class Master extends Student{
	private byte age;
	private byte level;
   
	Master(String fullname, int age, double average_grade, int level, String university_name, String speciality){
		super(fullname, average_grade,university_name,speciality);
		setAge(age);
		setLevel(level);
	}
	public byte getAge() {
		return age;
	}
 
	public void setAge(int age) {
		if(age >= 22 && age <=33) {
			this.age = (byte)age;
			}
			else {
				System.err.println("WRONG VALUE OF AGE!");
			}
	}
	public byte getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level >=1 && level<=3) {
			this.level = (byte)level;
		}
		else {
			System.err.println("WRONG VALUE OF LEVEL!");
		}
	}

	 public void printInfo() {
		 System.out.println("> fullname: " + getFullname() + "(" + age +"years)");
		 System.out.println("> year: " + level);
		 System.out.println("> grade: " + getAverage_grade());
		 System.out.println("> university: " + getUniversity_name());
		 System.out.println("> speciality: " + getSpeciality());
	 }
}