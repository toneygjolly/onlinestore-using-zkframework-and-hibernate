package onlinezk;

import java.awt.Button;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

public class home extends SelectorComposer<Window>{
	private static final long serialVersionUID=1L;
	@Wire
	private Button buttonid;
	@Listen("onClick#buttonid")
	public void buttonid1() {
		Executions.sendRedirect("searchid.zul");
	}

}
