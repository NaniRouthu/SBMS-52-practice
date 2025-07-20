package in.ashokit.beans;

public class UserService {

	private PasswdService passwdservice;

	public UserService() {

		System.out.println("UserSrevice : constcutor");
	}

	public void setPasswdservice(PasswdService passwdservice) {
		this.passwdservice = passwdservice;
	}

	public void saveUser(String uname, String pwd, Long phno) {
		String encodePwd = passwdservice.encodePwd(pwd);

		System.out.println("Encoded pwd :: " + encodePwd);

		// TODO:: insert into db
		System.out.println("Record inserted in DB...");

	}

}
