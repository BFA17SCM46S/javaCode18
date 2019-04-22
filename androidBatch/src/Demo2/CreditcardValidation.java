package Demo2;

public class CreditcardValidation {
	
	private static void validateCreditCardNumber(String str) {
		
		int[] numb = new int[str.length()];
		
		for (int i = 0; i < numb.length; i++) {
			
			numb[i] = Integer.parseInt(str.substring(i, i+1));
			numb[i] = numb[i]*2;
		}
		
//		for (int i = 0; i < numb.length; i++) {
//			int j = numb[i];
//			j = j*2;
//			numb[i] = j;
//	
//		}
		
		
		int sum = 0;
		for (int i = 0; i < numb.length; i++) {
			sum+=numb[i];
		}
		if (sum % 10 == numb[str.length()-1]) {
			System.out.println(str + " is a valid credit card number");
			
		}else {
			System.out.println(str + " is a invalid credit card number");
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		String imei = "012850003580200123409";
		validateCreditCardNumber(imei);
		
	}

}
