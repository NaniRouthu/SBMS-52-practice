package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswdService {

	public PasswdService() {
		
		System.out.println("passwdservice : constructor");
	}
	
	public String encodePwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		String encodedPwd = encoder.encodeToString(pwd.getBytes());
		
		return encodedPwd;
	}

}
