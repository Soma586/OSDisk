import java.util.Random;

class node { 
      
    int distance = 0;  
      
    boolean accessed = false;  
}
public class SSTF { 
    public static void CalcDiff(int List[], int Pointer, node Dif[]) 
                                          
    { 
        for (int i = 0; i < Dif.length; i++) 
            Dif[i].distance = Math.abs(List[i] - Pointer); 
    } 
   
    public static int detectMin(node diff[]) 
    { 
        int index = -1, Min = Integer.MAX_VALUE; 
  
        for (int i = 0; i < diff.length; i++) { 
            if (!diff[i].accessed && Min > diff[i].distance) { 
                  
                Min = diff[i].distance; 
                index = i; 
            } 
        } 
        return index; 
    } 
  
    public static void shortestTimeFirst(int request[], int head) 
                                                       
    { 
        if (request.length == 0) 
            return; 
              
        node Dif[] = new node[request.length];  
          
        for (int i = 0; i < Dif.length; i++)  
          
            Dif[i] = new node(); 
          
        int seek_count = 0;  
          
        int[] seek_sequence = new int[request.length + 1];  
          
        for (int i = 0; i < request.length; i++) { 
              
            seek_sequence[i] = head; 
            CalcDiff(request, head, Dif); 
              
            int index = detectMin(Dif); 
              
            Dif[index].accessed = true; 
              
            seek_count += Dif[index].distance;  
              
            head = request[index];  
        } 
          
        seek_sequence[seek_sequence.length - 1] = head;  
          
        System.out.println("Total number of seek operations = " 
                                                     + seek_count); 
                                                       
        System.out.println("Seek Sequence is"); 
          
        for (int i = 0; i < seek_sequence.length; i++)  
            System.out.println(seek_sequence[i]); 
    } 
  
    public static void main(String[] args) 
    { 
    	int j = 0;
    	int [] arr = new int[1000];
    	
    	
    	Random rand = new Random();
    	while(j<1000) {
    	arr[j] = rand.nextInt(4999);
    		j++;
    	}
    	
        shortestTimeFirst(arr, 50); 
    } 
}
