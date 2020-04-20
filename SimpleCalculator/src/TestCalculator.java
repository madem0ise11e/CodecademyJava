
/*
This is an Simple Calculator that is used to slide beads around and do math.
It was created by Tania in 2020.
*/
public class TestCalculator {
	public static void main(String[] args){
		   Calculator myCalculator = new Calculator();
		   
		   int addition = myCalculator.add(5, 7);
		   System.out.println(addition);
		// System.out.println(myCalculator.add(5, 7));
		 
		  int subtraction = myCalculator.subtract(45, 11);
		   System.out.println(subtraction);
		// System.out.println(myCalculator.subtract(45, 11));
		 }
}
