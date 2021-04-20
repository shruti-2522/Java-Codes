package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String txtemail;
	private String txtname;
	private String txtpass;

	public String getTxtemail() {
		return txtemail;
	}

	public void setTxtemail(String txtemail) {
		this.txtemail = txtemail;
	}

	public String getTxtname() {
		return txtname;
	}

	public void setTxtname(String txtname) {
		this.txtname = txtname;
	}

	public String getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(String txtpass) {
		this.txtpass = txtpass;
	}

	@Override
	public String toString() {
		return "User [txtemail=" + txtemail + ", txtname=" + txtname + ", txtpass=" + txtpass + "]";
	}

	public User(String txtemail, String txtname, String txtpass) {
		super();
		this.txtemail = txtemail;
		this.txtname = txtname;
		this.txtpass = txtpass;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
