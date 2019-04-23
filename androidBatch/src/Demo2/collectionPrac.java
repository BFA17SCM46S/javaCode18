package Demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class collectionPrac {
	public static void main(String[] args) {
		ArrayList<String> listt = new ArrayList<String>();
		listt.add("good");
		listt.add("ok");
		listt.add("gret");
	 	listt.add("best");
	    
	 	Iterator it = listt.iterator();
	 	while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
	
	
}
