package Task8;

public class Job implements Comparable<Job> {
	private int startTime;
	private int duration;
	
	public Job(int startTime, int duration) {
		this.startTime = startTime;
		this.duration = duration;
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public int getDuration() {
		return duration;
	}

	@Override
	public int compareTo(Job other) {
		if (startTime < other.getStartTime()) return -1;
		if (startTime > other.getStartTime()) return 1;
		return 0;
	}
}
