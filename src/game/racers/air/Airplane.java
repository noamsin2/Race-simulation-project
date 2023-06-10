/**
 * @author Noam Karasso
 * @id 209406867
 */

package game.racers.air;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import game.racers.Wheeled;

/**
 * Represents an airplane racer that can race in the air
 * Inherits from Racer and implements AerialRacer
 */
public class Airplane extends Racer implements AerialRacer {
	static final String CLASS_NAME = "Airplane";
	static final int DEFAULT_WHEELS = 3;
	static final double DEFAULT_MAX_SPEED = 885;
	static final double DEFAULT_ACCELERATION = 100;
	static final Color DEFAULT_color = Color.BLACK;
	Wheeled wheeled;
	
	 /**
     * Constructs an airplane racer with the given parameters
     * @param name the name of the airplane racer
     * @param maxSpeed the maximum speed of the airplane racer
     * @param acceleration the acceleration of the airplane racer
     * @param color the color of the airplane racer
     * @param numOfWheels the number of wheels the airplane racer has
     */
	public Airplane(String name, double maxSpeed, double acceleration, Color color, int numOfWheels){
		super(name,maxSpeed,acceleration,color);
		wheeled = new Wheeled(numOfWheels);
	}

	 /**
     * Constructs a default airplane racer with default values
     * Uses the constants defined in the class for default values
     */
	public Airplane(){
		super(CLASS_NAME + " #" + getSerial(), DEFAULT_MAX_SPEED, DEFAULT_ACCELERATION, DEFAULT_color);
		wheeled = new Wheeled(DEFAULT_WHEELS);
	}
	
	public Airplane(Airplane other) {
		super(other);
		wheeled = new Wheeled(other.wheeled.getNumOfWheels());
	}
	
	public Airplane clone() {
		return new Airplane(this);
	}
	
	 /**
     * Returns a description of the airplane racer's specific features
     * @return a String that describes the airplane racer's specific features
     */
	@Override
	public String describeSpecific() {
		return super.describeSpecific() + ", " +wheeled.describeSpecific();
	}

	 /**
     * Returns the name of the class
     * @return a String that represents the name of the class
     */
	@Override
	public String className() {
		return CLASS_NAME;
	}

}
