import java.util.Scanner;
import java.lang.Math;

public class StoppingDistance1 {

	public static void main(String[] args) {
		
		System.out.println("Enter vehicle speed in km/hr>");
		Scanner input = new Scanner (System.in);
		double speedKmH = input.nextDouble();
		
		System.out.println("Enter reaction time in seconds>");
		double reactionTime = input.nextDouble();
		
		input.close();
		
		double speedMeterPerSecond = speedKmH * 1000 / 3600;
		double reactionDistance = speedMeterPerSecond * reactionTime;
		double brakingDistance = (Math.pow(speedMeterPerSecond, 2.0) 
				/ 20.0);
		
		double stoppingDistance = reactionDistance + brakingDistance;
		
		System.out.printf("At a speed of %.1fkm/hr "
				+ "and with a reaction time of %.1fs, "
				+ "the stopping distance would be %.1fm",
				speedKmH, reactionTime, stoppingDistance);

	}

}
