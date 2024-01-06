package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product details")
public class product_pojo {
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAvailableQ() {
		return availableQ;
	}
	public void setAvailableQ(double availableQ) {
		this.availableQ = availableQ;
	}
	@Id
	@Column(name="productid")
	private int productid;
	@Column
	private String productname;
	@Column
	private double price;
	@Column
	private double availableQ;
    @Column
    private String category;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
