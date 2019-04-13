package Demo2;

public class demoprac01 {
	
	static int currentLocation =8 ;
	static int matrxSize = 4;
	static int noCells = matrxSize*matrxSize;
	
	static String[] command = {"right"};
	
	
	static void moveup() {
		int firstRowBegin = 1;
		int firstRowEnd = matrxSize;
		if (currentLocation <firstRowBegin && currentLocation >matrxSize) {
			
		}
		else currentLocation-=matrxSize;
	}
	
	static void movedown() {
		int lastrowBegin = (matrxSize * (matrxSize-1)+1);
		int lastRowEnd = (matrxSize*matrxSize)-1;
		if (currentLocation>lastrowBegin&&currentLocation<=lastrowBegin) {
			
		}else currentLocation+=matrxSize;
	}
	
	
	
	static void moveleft() {
		
		for (int i = 0; i < matrxSize; i++) {
			int leftbegin = (i * matrxSize)+1;
			if (currentLocation == leftbegin) {
				
			}
			else currentLocation--;
			
		}
		currentLocation--;
	}
	
	static void moveright() {
		for (int i = 0; i < matrxSize; i++) {
			int rightend = i * matrxSize;
			if (currentLocation == rightend) {
				
			}else currentLocation++;
			
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		for (String commands  : command) {
			switch (commands) {
			case "right":
				moveright();
				break;
				
			case "down":
				movedown();
				break;
			case "up":
				moveup();
				break;

			case "left":
				moveleft();
				break;
			default:
				break;
			}
			
  }
		
		
		
		System.out.println("Location--" + currentLocation);
		
		
		int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);	
			}	
		}
	}

}
