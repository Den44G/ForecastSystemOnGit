package ua.kiev.home.prog_it.graduate_work.project1;

public class StrategyUnit {

	private final double PRICE = 23.00;
	private String strategyName;

	public StrategyUnit(StrategyTypes strategy) {
		this.strategyName = strategy.name();
	}

	public String forecast() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return this.PRICE;
	}

	public String getStrategyName() {
		// TODO Auto-generated method stub
		return this.strategyName;
	}

}
