package kontrolno.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Operation {
	private String expr;
	private int result;
	
	public String getExpr() {
		return expr;
	}
	public void setExpr(String expr) {
		this.expr = expr;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
}
