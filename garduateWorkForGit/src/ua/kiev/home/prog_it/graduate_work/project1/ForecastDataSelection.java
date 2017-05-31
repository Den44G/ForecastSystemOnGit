package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.Comparator;
import java.util.Set;



public class ForecastDataSelection {
	
	public Comparator strategyNameofBetCompare(){
		return new StrategyNameComparator();
	}

	public Comparator sunmOfBetCompare(){
		return new StrategyNameComparator();
	}
	public Comparator timeStampOfBetCompare(){
		return new StrategyNameComparator();
	}
}
