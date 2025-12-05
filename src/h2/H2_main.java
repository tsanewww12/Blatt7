	package h2;

	import java.util.Arrays;

	public class H2_main {

	    public static int[] change(int[] a, int[] b, int start, int end) {

	        
	        if (end <= start) {
	            return new int[0];
	        }

	        
	        int cmp = Arrays.compare(a, b); 

	        
	        if (cmp > 0 && cmp != 0) {
	            return Arrays.copyOf(a, a.length);
	        }
                 if (cmp == 0 && end > start) {

	            int[] sorted = Arrays.copyOf(a, a.length);
	            Arrays.sort(sorted); 
                 return Arrays.copyOfRange(sorted, start, end);
	        }

	        
	        return new int[0];
	    }

	    public static void main(String[] args) {

	        System.out.println(Arrays.toString(
	                change(new int[]{2, 7, 1, 9}, new int[]{5, 6, 7}, 2, 4)
	        )); 

	        System.out.println(Arrays.toString(
	                change(new int[]{2, 7, 1, 9}, new int[]{2, 1, 9}, 2, 3)
	        )); 

	        System.out.println(Arrays.toString(
	                change(new int[]{2,7,1,9}, new int[]{2,7,1,9}, 3, 2)
	        )); 
	    }
	}



