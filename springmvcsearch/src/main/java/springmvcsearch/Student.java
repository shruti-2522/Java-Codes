package springmvcsearch;

import java.util.Date;
import java.util.List;

public class Student {
	private String txtname;
	private long txtid;
	private Date txtdate;
	private List<String> txtcourse;
	private String txtradio;
	private String txttype;

	private Address addr;

	public String getTxtname() {
		return txtname;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public void setTxtname(String txtname) {
		this.txtname = txtname;
	}

	public long getTxtid() {
		return txtid;
	}

	public void setTxtid(long txtid) {
		this.txtid = txtid;
	}

	public Date getTxtdate() {
		return txtdate;
	}

	public void setTxtdate(Date txtdate) {
		this.txtdate = txtdate;
	}

	public List<String> getTxtcourse() {
		return txtcourse;
	}

	public void setTxtcourse(List<String> txtcourse) {
		this.txtcourse = txtcourse;
	}

	public String getTxtradio() {
		return txtradio;
	}

	public void setTxtradio(String txtradio) {
		this.txtradio = txtradio;
	}

	public String getTxttype() {
		return txttype;
	}

	public void setTxttype(String txttype) {
		this.txttype = txttype;
	}

	@Override
	public String toString() {
		return "Student [txtname=" + txtname + ", txtid=" + txtid + ", txtdate=" + txtdate + ", txtcourse=" + txtcourse
				+ ", txtradio=" + txtradio + ", txttype=" + txttype + ", addr=" + addr + "]";
	}

}
