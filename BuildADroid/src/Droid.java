
public class Droid {
	int batteryLevel;
	String name;
	
	public Droid(String droidName) {
		this.name = droidName;
		this.batteryLevel = 100;
	}
	public String toString() {
		return "I’m the droid: " + name + ","  + " with battery level: "+ batteryLevel+".";
		
	}
	public void greeting(String  user) {
		System.out.println("Hey there, " + user+".");
	
	}
	
	public void performTask(String name, String task) {
		System.out.println(name+" is performing task: " + task);
	}
	public void batteryLevelAfter() {
		this.batteryLevel = batteryLevel - 10;
	}
	public void batteryAfter(int battery, String task) {
		System.out.println("Battery level: "+ battery+ ", after: " + task);
	}
	public void batteryCharging() {
		this.batteryLevel = batteryLevel + 10;
	}
	public void batteryAfterCharging(int battery) {
		System.out.println("Battery level after charging: " + battery);
	}
}
