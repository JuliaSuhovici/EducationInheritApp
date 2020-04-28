
class Educated{
    private String fullname;     
    private byte  age;          
    private float average_grade; 
    private byte level;          
   
    Educated(){}
    Educated(String fullname, double average_grade) {
		setFullname(fullname);
		setAverage_grade(average_grade);	
	}
	Educated(String fullname, int age, double average_grade, int level) {
		setFullname(fullname);
		setAge(age);
		setAverage_grade(average_grade);
		setLevel(level);	
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		if(fullname.trim().length() != 0) {
			this.fullname = fullname;
		}
		else {
			System.err.println("NAME CAN'T BE EMPTY!");
		}
	}
	public byte getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 6) {
			this.age = (byte)age;
			}
			else {
				System.err.println("WRONG VALUE OF AGE!");
			}
	}
	
	public float getAverage_grade() {
		return average_grade;
	}
	
	public void setAverage_grade(double average_grade) {
		if(average_grade >=1 && average_grade <=10) {
			this.average_grade = (float)average_grade;
		}
		else {
			System.err.println("WRONG VALUE OF AVERAGE GRADE!");
		}
	}
	
	public byte getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		if(level > 0 ) {
			this.level = (byte)level;
		}
		else {
			System.err.println("WRONG VALUE OF LEVEL!");
		}	
	}
   
	public void printInfo() {
		System.out.println("> fullname: " + fullname + "(" + age +"years)");
		System.out.println("> class: " + level);
		System.out.println("> grade: " + average_grade);
	}
}