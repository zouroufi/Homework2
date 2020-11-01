
public class Product {

	private String pbar, pname, pcolor, pdesc;

	
	public Product() {
		super();
	}

	public Product(String pbar, String pname, String pcolor, String pdesc) {
		super();
		this.pbar = pbar;
		this.pname = pname;
		this.pcolor = pcolor;
		this.pdesc = pdesc;
	}

	public String getBarcode() {
		return pbar;
	}

	public void setBarcode(String pbar) {
		this.pbar = pbar;
	}

	public String getName() {
		return pname;
	}

	public void setName(String pname) {
		this.pname = pname;
	}

	public String getColor() {
		return pcolor;
	}

	public void setColor(String pcolor) {
		this.pcolor = pcolor;
	}

	public String getDescription() {
		return pdesc;
	}

	public void setDescription(String pdesc) {
		this.pdesc = pdesc;
	}
}