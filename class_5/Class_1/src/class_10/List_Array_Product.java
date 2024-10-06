package class_10;

public class List_Array_Product {
	
    private String name;
    private String brand;
    private int qty;
    private int price;
    private double amount;
    public List_Array_Product(String name,String brand,int qty,int price,double amount) {
    	this.name=name;
    	this.brand=brand;
    	this.qty=qty;
    	this.price=price;
    	this.amount=amount;
    	
    	
    }
    
  
	

	//**************Get method*****************
    public String getName() {
    	return name;
    	
    }
    public String getBrand() {
		return brand;
		
	}
    
    public int getQty() {
		return qty;
    	
    }
    public int getPrice() {
		return price;
    	
    }
    
    public double getAmount() {
		return amount;
    	
    }

    
    //***********Set Method****************
    void setName(String name) {
    	this.name=name;
    	
    }
    void setBrand(String brand) {
    	this.brand=brand;
    	
    }
    void setQty(int qty) {
    	this.qty=qty;
    }
    void setPrice(int price) {
    	this.price=price;
    
    }
    
    void setAmount(double amount) {
    	this.amount=amount;
    }
    
    public void display() {
    	System.out.println("name: "+name+"  "+"Brand : "+brand+"  "+ "Quantity :"+qty+"  "+"Price : "+price+"  "+"Amount : "+amount);
    }
}
