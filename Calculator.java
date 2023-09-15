public class Calculator {
	private int n1,n2;
	private String sname;
	@Override
	public String toString() {
		return "Calculator [n1=" + n1 + ", n2=" + n2 + ", sname=" + sname + "]";
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int getadd() {
		return (n1+n2);
	}
	public int getsub() {
		return (n1-n2);
	}
	public int getmul() {
		return (n1*n2);
	}
	public int getdiv() {
		return (n1/n2);
	}
}
