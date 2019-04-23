package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
	private int ocupied;
	private int floor;
	private List spot = new ArrayList<>();
	
	
	private static final int ROW = 10;


	public int getFloor() {
		return floor;
	}


	private void isfull() {
		if(spot.size()-ocupied>0) {
			this.ocupied++;
		}else {
			throw new CarParkingException("parkin is full");
		}
		
		

	}
	
	
	

}


