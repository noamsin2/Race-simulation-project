package factory;

import game.racers.Racer;
import utilities.EnumContainer.Color;

public class vehicleWorkshop {

	public Racer cloneVehicle(Racer vehicle, Color color) {
		Racer racer = vehicle.clone();
		paintVehicle(racer, color);
		return racer;
	}
	
	public void paintVehicle(Racer vehicle, Color color) {		
		vehicle.setColor(color);
		vehicle.setIcon();
	}
	
}
