// Car.java

public class Car extends Vehicle {
	private int doors;
	private int passengers;
	
	
	public Car(String aMake, String aModel, String aPlate, int numDoors, int numPass){
		super(aMake,aModel,aPlate);
		this.doors = numDoors;
		this.passengers = numPass;
	}
	
	public int getNumDoors(){
		return this.doors;
	}
	
	public int getNumPassengers(){
		return this.passengers;
	}
	
	@Override
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.", this.doors, this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
	
		Car otherCar = (Car) other;
	
		if (this.doors == otherCar.doors && this.passengers == otherCar.passengers){
			return super.equals(otherCar);
		}
		return false;
	}
	
	public Car copy(){
		Car copy = new Car(this.getMake(), this.getModel(), this.getPlate(), this.doors, this.passengers);
		return copy;
	}
	
	
}