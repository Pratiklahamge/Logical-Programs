package Com.Briglabz;
import java.util.Scanner;
public class SimulateStopwatch {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Type ' r ' to Start :");
			long start = System.currentTimeMillis();
			sc.nextLine();
			System.out.print("Type ' s ' to Stop :");
			sc.nextLine();
			long stop = System.currentTimeMillis();
			long Elapsedtime = (stop - start) / 1000;
			System.out.print("Elapsed Time was: "+Elapsedtime+" Seconds");
		}

	}

}
