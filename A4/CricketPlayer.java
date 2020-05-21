package ass4;

public class CricketPlayer {

	private String name;
	private int noOfInnings;
	private int noOfTimesNotOut;
	private int totalRuns;
	private double batAvg;

	public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
		super();
		this.name = name;
		this.noOfInnings = noOfInnings;
		this.noOfTimesNotOut = noOfTimesNotOut;
		this.totalRuns = totalRuns;
	}

	public double avg() {
		batAvg = totalRuns / noOfTimesNotOut;
		return batAvg;
	}

	public static void sortPlayer(CricketPlayer player[]) {
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (player[i].avg() > player[j].avg()) {
					CricketPlayer t = player[i];
					player[i] = player[j];
					player[j] = t;
				}
			}
		}	
	}

	@Override
	public String toString() {
		return "Player Name=" + name + ", No of Innings=" + noOfInnings + ", No of times not out=" + noOfTimesNotOut
				+ ", Total Runs=" + totalRuns + ", Batting Average=" + batAvg;
	}
}
