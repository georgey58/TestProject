package uk.co.georgey.trial;


public class ThePits {
	
	
	public   int solution(int[] A) {
		int maxDepth = -1 ; 
		  
	    int depth1= 0; 
	    int depth2= 0; 
	     for (int i=0; i<A.length; i++){
	
	     	
	 	    if (i < A.length-1 && A[i]>A[i+1]){
	 	    	if (depth2==0){
	 	    	depth1 = depth1 +(A[i]-A[i+1]);
	 	    	//System.out.println("d1 "+depth1); 
	 	    	}else{
	 	    		maxDepth = getMaxDepth(depth1, depth2, maxDepth); 
	 	    		depth1=A[i]-A[i+1];
	 	    		depth2=0;
	 	    	}
	 	   
	 	    }else if (depth1 !=0 && i < A.length-1 && A[i]<A[i+1]){
	 	    	depth2= depth2 +(A[i+1]-A[i]); 
	 	    	//System.out.println("d2 "+depth2); 
	 	    }else if (depth1!=0 && depth2!=0 && i==A.length-1){
	 	    	maxDepth = getMaxDepth(depth1, depth2, maxDepth); 
	 	    }
	    	 
	     }
	     	      
	     return maxDepth; 
	    }
		

	  private int getMaxDepth(int depth1, int depth2, int maxDepth ){
		  int depth = Math.min(depth1,  depth2); 
   		if (depth>maxDepth){
   			maxDepth = depth;
   			//System.out.println("max "+maxDepth); 
   		}
		  return maxDepth; 
	  }
	
	

	
	//////////////////////////////////////////////////////////////////////
		

	public static void main(String[] args) {
		 //int [] array = {7,6,5,4,3,3,3,2,1,3,4,5,12,25,1,1,2};
		ThePits s = new ThePits(); 
		int [] array = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};
		int result = s.solution (array);
		System.out.println("The answer is "+result); 

	}
}