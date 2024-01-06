package onlinezk;

import java.awt.Button;
import java.util.List;
import java.sql.SQLException;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import pojo.login_pojo;

public class login extends SelectorComposer<Window>
{
	private static final long serialVersionUID=1L;
	@Wire
	private Textbox name;
	@Wire
	private Textbox password;
	@Wire
	private Label l;
	@Wire
	private Button Buttonsubmit;
	@Wire
	private Button resetButton;
	@Wire
	private Button signupButton;
	@Listen("onClick=#Buttonsubmit")
	public void onsubmit() {
//		//boolean found=false;
//		mainjava mj=new mainjava();
//		String name1=name.getValue();
//		String pass1=password.getValue();
//		List<login_pojo>login=mj.logincheck(name1, pass1);
//		if(mj.found) {
//		Executions.sendRedirect("home.zul");
//		}
//	}
		mainjava mj = new mainjava();
	    String name1 = name.getValue();
	    String pass1 = password.getValue();
	    List<login_pojo> login = mj.logincheck(name1, pass1);
	    if (!login.isEmpty()) {
	        Executions.sendRedirect("home.zul");
	    } else {
	        // Handle incorrect login
	        l.setValue("Incorrect username or password");
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void onsubmit() throws SQLException
//	{
//		
//			String username=name.getValue();
//			String userpassword=password.getValue();
//			Usercheck u=new Usercheck();
//			
//			boolean found=
//					u.user(username,userpassword);
//			
////			String uname="a";
////			String upassword="b";
//			if(found==true) {
//		//if(username.equals(name) && userpassword.equals(password)) {
//			l.setValue("logied");
//			Executions.sendRedirect("home.zul");
//			}
//			//}
//			else {
//		l.setValue("invalid username");
//			}
//	}
//	@Listen("onClick=#resetButton")
//	public void esetButton()
//	{
//		name.setValue(""); 
//        password.setValue("");
//	}
//	@Listen("onClick=#signupButton")
//	public void signButton()
//	{
//		Executions.sendRedirect("formpage.zul");
//	}
}
