import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FCFS fc = new FCFS();
		SSTF st = new SSTF();
		SCAN sc = new SCAN();
		
		//done by Tarik
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i =0; i < 1000; i++){
		    int num = (int)(Math.random()*4999);
		    arr.add(num);
		}
		sc.findSum(2150,arr);
		

	}

}
