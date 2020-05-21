package sy;

public class SYMarks {

	int computerTotal;
	int mathsTotal;
	int electronicsTotal;

	public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
		super();
		this.computerTotal = computerTotal;
		this.mathsTotal = mathsTotal;
		this.electronicsTotal = electronicsTotal;
	}

	public int getComputerTotal() {
		return computerTotal;
	}

	public int getMathsTotal() {
		return mathsTotal;
	}

	public int getElectronicsTotal() {
		return electronicsTotal;
	}
}
