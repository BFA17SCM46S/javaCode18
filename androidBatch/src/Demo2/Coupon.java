package Demo2;

public class Coupon {
	String upc;
	String code;
	String category;
	float inteprice;
	float couonAmout;
	public Coupon(String upc, String code, String category, float inteprice, float couonAmout) {
		super();
		this.upc = upc;
		this.code = code;
		this.category = category;
		this.inteprice = inteprice;
		this.couonAmout = couonAmout;
	}
	
	public Coupon(String string){
		String[] arry = string.split(",");
		this.upc = arry[0];
		this.code = arry[1];
		this.category = arry[2];
		this.inteprice = Float.parseFloat(arry[3]);
		this.couonAmout = Float.parseFloat(arry[4]);
		
	}
	
	
	

}
