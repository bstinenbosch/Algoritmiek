package Task4;

public class Job implements Comparable<Job> {

	private int preprocessingTime;
	private int parallelTime;
	
	public Job(int preprocessingTime, int parallelTime) {
		this.preprocessingTime = preprocessingTime;
		this.parallelTime = parallelTime;
	}
	
	public int getPreprocessingTime() {
		return preprocessingTime;
	}
	
	public int getParallelTime() {
		return parallelTime;
	}
	
	public String toString() {
		return "(" + preprocessingTime + ", " + parallelTime + ")";
	}

	@Override
	public int compareTo(Job other) {
		if(parallelTime > other.getPreprocessingTime() + other.getParallelTime()) {return -1;}
		if(other.getParallelTime()> preprocessingTime + parallelTime) {return 1;}
		if(preprocessingTime > other.getPreprocessingTime()) {return 1;}
		if(preprocessingTime < other.getPreprocessingTime()) {return -1;}
		return 0;
	}
}
