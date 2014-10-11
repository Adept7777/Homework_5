package homework5;

public class Student
{
	private String firstName;
	private String lastName;
	private int id;
	private String email;
	
	public Student(String NewFirstName, String NewLastName, int NewId, String NewEmail)
	{
		this.firstName = NewFirstName;
		this.lastName = NewLastName;
		this.id = NewId;
		this.email = NewEmail;
	}
	
	public String getFirstName(){ return this.firstName; }
	public void setFirstName(String NewFirstName){ this.firstName = NewFirstName; }

	public String getLastName(){ return this.lastName; }
	public void setLastName(String NewLastName){ this.lastName = NewLastName; }

	public int getId(){ return this.id; }
	public void setId(int NewId){ this.id = NewId; }

	public String getEmail(){ return this.email; }
	public void setEmail(String NewEmail){ this.email = NewEmail; }

	public String toString()
	{
		return this.firstName + " " + this.lastName;
	}
}