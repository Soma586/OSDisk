import java.util.ArrayList;
import java.util.Collections;

public class SCAN {
	    
	    
	    public void findSum(int head, ArrayList<Integer> arr) {
	        int prev = (int)(Math.random()*4999);
	       
	        
	        
	        arr.add(head);
	        arr.add(0);
	        
	        arr.add(4999);
	        Collections.sort(arr);
	        int index = 0;
	        
	        
	        
	        for(int i = 0; i < arr.size(); i++) {
	            if(head == arr.get(i)) {
	                index = i;
	                break;
	            }
	        }
	        
	        int sum = 0;
	        
	        System.out.println("random number is : " + prev);
	        if(head <= prev) {
	        
	        int upper = index +1;
	        
	        for(int i = index; i >= 1; i--) {
	            sum += arr.get(i) - arr.get(i-1);
	        }
	        
	        sum += arr.get(upper);
	        
	        for(int i = upper; i < arr.size() -2; i++) {
	            sum += arr.get(i + 1) - arr.get(i); 
	        }
	        System.out.println("it went down first");
	        System.out.println("the distance is " +  sum);
	        }
	        
	        
	        else {
	            int lower = index -1;
	            for(int i = index; i < arr.size()-1; i++) {
	                sum +=arr.get(i +1) - arr.get(i);
	                
	            }
	            sum += 4999 - arr.get(lower);
	            
	            for(int i = lower; i >=2; i--) {
	                sum += arr.get(i)-arr.get(i-1);
	            }
	            
	            System.out.println("it went up first");
	            System.out.println("the distance is " +  sum);
	            
	       
	            
	        }
	        
	    }
	        
	        
	    

	}

