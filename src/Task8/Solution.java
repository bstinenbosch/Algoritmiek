package Task8;

import java.io.InputStream;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	public Solution(){ }   
	// Implement the run method to return the answer to the problem posed by the inputstream.
	  
	public String solve(InputStream in) {
		int time;
		int unlocksSaved = 0;
		
		Scanner sc = new Scanner(in);
		int size = sc.nextInt();
		int lockTime = sc.nextInt();
		PriorityQueue<Job> jobs = new PriorityQueue<Job>(size);
		PriorityQueue<Integer> workstations = new PriorityQueue<Integer>();
		while(sc.hasNext()) {
			Job job = new Job(sc.nextInt(), sc.nextInt());
			jobs.add(job);
		}
		sc.close();
				
		while(!jobs.isEmpty()) {
			Job job = jobs.poll();
			time = job.getStartTime();
			
			// iterate over Workstations to see which need to be locked
			if (!workstations.isEmpty()) // Delete all locked workstations from queue.
				while (workstations.peek() + lockTime < time ) workstations.poll();
			if (!workstations.isEmpty() && workstations.peek() <= time) { // if first free workstation is available
				workstations.poll(); // take workstation
				workstations.add(time + job.getDuration()); // and assign new worker to workstation 
				unlocksSaved++; // Saved one lock
			} else {
				workstations.add(time + job.getDuration()); // no free unlocked workstations available, unlock workstation
			}
		}
		return Integer.toString(unlocksSaved);
	}
 
	public static String run(InputStream in) {
		return new Solution().solve(in);
	}
}
