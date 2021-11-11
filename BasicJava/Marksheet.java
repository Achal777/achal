package BasicJava;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	private String Fname;
	private String Lname;
	private int Physics;
	private int Biology;
	private int Maths;
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getPhysics() {
		return Physics;
	}
	public void setPhysics(int physics) {
		Physics = physics;
	}
	public int getBiology() {
		return Biology;
	}
	public void setBiology(int biology) {
		Biology = biology;
	}
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	@Override
	public int compareTo(Marksheet o) {

		return this.rollNo.compareTo(rollNo);
	}
	
}
