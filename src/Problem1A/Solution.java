package Problem1A;

import java.io.InputStream;

//import java.io.InputStream;

public class Solution {
	// Implement the solve method to return the answer to the problem posed by the inputstream.
	/*public String solve(InputStream in) {
		Graph g = new GraphImpl(in);
	}
	  
	  
	// You can leave the following method unchanged.
	public static String run(InputStream in) {
		return new Solution().solve(in);
	}
	
	private static String convertStreamToString(java.io.InputStream is) {
	    @SuppressWarnings("resource")
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
	    return s.hasNext() ? s.next() : "";
	}*/
	
	// Implement the solve method to return the answer to the problem posed by the inputstream.
	public String solve(InputStream in) {
		Graph g = new GraphImpl(in);
		boolean possible = false;
	    GraphIterator iter = new GraphIterator(g, g.getStart());
	    while (iter.hasNext()) {
	    	Vertex vertex = iter.next();
	    	if (vertex==g.getExit()) return "yes";
	    }
	    return "no";
	}
	  
	  
	// You can leave the following method unchanged.
	public static String run(InputStream in) {
		return new Solution().solve(in);
	}
	
}
