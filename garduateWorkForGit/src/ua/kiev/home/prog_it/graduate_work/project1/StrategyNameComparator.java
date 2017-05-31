package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.Comparator;

import com.google.common.base.Predicate;

public class StrategyNameComparator implements Comparator<Bet>,Predicate<Bet>{

	private String strategyName;
	
	public StrategyNameComparator() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StrategyNameComparator(String str){
		this.strategyName=str;
	}
	
	public String getStrategyName() {
		return strategyName;
	}


	@Override
	public int compare(Bet bet1, Bet bet2) {

		return bet1.getStrategyName().compareTo(bet2.getStrategyName());
	}

	@Override
	public boolean apply(Bet bet) {
		
		return bet.getStrategyName().equals(this.strategyName);
	}

}
