package Demo2;

import java.io.IOException;

public class exceptionsPrac {

	void m() throws IOException {
		throw new java.io.IOException();
	}

	void n() throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		exceptionsPrac wx = new exceptionsPrac();
		wx.p();
		System.out.println("process finish");
	}

}

