package operationgsystemshw;

import java.util.Random;

public class Main {
	
	// Starting 5000 cylinders
	static int cylinders = 5000;
	// 1000 requests
	static int requests = 1000;
	//int headStart = 0;
	static int[] disk = new int[requests];
	
	public static int FCFS(int[] arr, int headStart) {
		int i = 0, headMove = 0;
		
		int start = disk[headStart];
		
		for (i = headStart; i < requests; i++) {
			headMove += Math.abs(disk[i] - start);
		}
		
		for (i = 0; i < headStart; i++) {
			headMove += Math.abs(start - arr[i]);
		}
		
		return headMove;
	}
	
	public static void main(String[] args) {
		Random rn = new Random();
		
		// Generating 1000 random requests
		for (int i = 0; i < requests; i++) {
			disk[i] = rn.nextInt(1000 - 1) + 1;
		}
		
		System.out.println("Total head-movement: "+FCFS(disk, 1));
	}
}
