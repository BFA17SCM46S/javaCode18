package Demo2;

import java.util.ArrayList;
import java.util.List;


public class Coupons {
	static List<Coupon> coupons;
	static List<String> preferedCategories;
	
	public static void filterCategories() {
		//if he coupons categot is not in the preferedCategories list remove
		for (Coupon c : coupons) {
			for (String s : preferedCategories) {
				if(c.category.equals(s)){
					
				}else {
					coupons.remove(c);
				}
				
			}
				
		}
			
	}
	
	public static void dipalycoupon() {
		for (Coupon c : coupons) {
			System.out.println("categty" + c.category);
		}
		
	}
		

	
	public static void main(String[] args) {
		createDummyData();
		filterCategories();
		
		
	}
	public static void createDummyData() {
		preferedCategories = new ArrayList<>();
		preferedCategories.add("baby");
		preferedCategories.add("gift cards");
	
		preferedCategories.add("sport good");
		preferedCategories.add("photo shop");
		preferedCategories.add("deli");
		preferedCategories.add("Banking goods");
		
		Coupon  c1 = new Coupon("304816683327672908,39385271820845634478,Gift Cards,17.72,6.61");
		Coupon  c2 = new Coupon("6683414238680399,96520119728644480082,Appliances,17.34,3.13");
		
		
		
		coupons = new ArrayList<Coupon>();
		coupons.add(c1);
		coupons.add(c2);
		
		
	}

}
