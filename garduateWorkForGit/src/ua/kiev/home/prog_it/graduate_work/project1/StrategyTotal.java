package ua.kiev.home.prog_it.graduate_work.project1;

public class StrategyTotal implements Strategy {
	private double price;
	private String strategyName;

	public StrategyTotal(StrategyTypes strategy) {
		this.strategyName= strategy.name();
	}
	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String forecast() {
		// TODO Auto-generated method stub
		return null;
	}

}
