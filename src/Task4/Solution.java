package Task4;

import java.io.InputStream;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	public Solution(){ }   
	
	private static String solve(InputStream in) {
		int time = 0;
		int endTime = 0;
		
		Scanner sc = new Scanner(in);
		sc.nextInt();
		PriorityQueue<Job> jobs = new PriorityQueue<Job>();
		while(sc.hasNext()) {
			Job job = new Job(sc.nextInt(), sc.nextInt());
			jobs.add(job);
		}
		System.out.println(jobs);
		while(!jobs.isEmpty()) {
			Job job = jobs.poll();
			time += job.getPreprocessingTime();
			if (time + job.getParallelTime() > endTime) {
				endTime = time + job.getParallelTime();
			}
		}
		sc.close();
		return Integer.toString(endTime);
	}
	  
	public static String run(InputStream in) {
		return solve(in);
	}
}
