
public class TestDroid {

	public static void main(String[] args) {
		Droid codey = new Droid("Codey");
		codey.greeting("Tania");
		System.out.println(codey.toString());
		//System.out.println(codey.name);
		//System.out.println(codey.batteryLevel);
		codey.performTask(codey.name,"dancing");
		codey.batteryLevelAfter();
		codey.batteryAfter(codey.batteryLevel,"dancing");
		codey.performTask(codey.name,"levitating");
		codey.batteryLevelAfter();
		codey.batteryAfter(codey.batteryLevel,"levitating");
		codey.batteryCharging();
		codey.batteryAfterCharging(codey.batteryLevel);
	}

}
