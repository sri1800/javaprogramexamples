package Email_Application;


public class Email 
{
	private String firstname;
	private String lastname;
	private String department;
	private String comEmail;
	private String password;
	private String altEmail;
	private int mailcap;
	
	public void firstname(String x) {
		this.firstname=x;
	}
	public void lastname(String x) {
		this.lastname=x;
	}
	public String departments(int deptCode) {
		if(deptCode==1){ department="Sales";}
		else if(deptCode==2){ department="Development";}
		else if(deptCode==3){ department="Accounting";}
		else{ department="";}
		return department;
		}
	
	public String newemail() {
		String Empemail=(firstname+"."+lastname+"@"+department+"."+"SriItSolutions.com");
		this.comEmail=Empemail;
		return Empemail;
	}
	
	public String randpassword(int length) {
		String pwd="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*1234567890";
		char []password=new char[length];
		for(int i=0;i<length;i++) 
		{
			int rand=(int)(Math.random()*pwd.length());
			password[i]=pwd.charAt(rand);
		}
		return  new String(password);
	}
	
	public String altpwd(String userpwd) {
		this.password=userpwd;
		return password;
	}
	
	public String altEmail(String altemail) {
		this.altEmail=altemail;
		return altEmail;
	}
	
	public void mailcap(int mailcap) {
		this.mailcap=mailcap;
	}
	
	public int getmailcap(){return mailcap;}
	public String getcompanyemail(){return comEmail;}
	
}
 