package newemployee;

public class Employee_Present_or_Absent {

	public static void main(String[] args) {
		int FULL_TIME = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == FULL_TIME)
			System.out.println("Emp is present");
		else 
			System.out.println("Emp is absent");
	}
}
