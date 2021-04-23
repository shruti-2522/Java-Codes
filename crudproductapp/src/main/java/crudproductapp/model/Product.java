package crudproductapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	private String pdesc;
	private long pprice;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", pprice=" + pprice + "]";
	}

	public Product(int pid, String pname, String pdesc, long pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.pprice = pprice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public long getPprice() {
		return pprice;
	}

	public void setPprice(long pprice) {
		this.pprice = pprice;
	}

}
