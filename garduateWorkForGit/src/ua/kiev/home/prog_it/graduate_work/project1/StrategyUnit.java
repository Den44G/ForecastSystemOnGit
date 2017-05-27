package ua.kiev.home.prog_it.graduate_work.project1;

public class StrategyUnit implements Strategy{

		private final double price = 23.00;
		private String strategyName;
		
		
		public StrategyUnit(StrategyTypes strategy) {
			this.strategyName= strategy.name();
		}
		
		@Override
		public String forecast() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public double getPrice() {
			// TODO Auto-generated method stub
			return this.price;
		}

		@Override
		public String getStrategyName() {
			// TODO Auto-generated method stub
			return this.strategyName;
		}

	}


