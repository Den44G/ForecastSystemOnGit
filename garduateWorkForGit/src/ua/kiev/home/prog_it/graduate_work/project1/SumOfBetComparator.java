package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.Comparator;

import com.google.common.base.Predicate;

public class SumOfBetComparator implements Comparator<Bet>,Predicate<Bet> {

	private double sumOfBet;
	public SumOfBetComparator() {
		// TODO Auto-generated constructor stub
	}
	
	SumOfBetComparator(double sum){
		this.sumOfBet=sum;
	}
	
	@Override
	public int compare(Bet bet1, Bet bet2) {
		return (int) (bet1.getSumOfBet() - bet2.getSumOfBet());
	}

	@Override
	public boolean apply(Bet bet) {
		// TODO Auto-generated method stub
		return bet.getSumOfBet()>sumOfBet;
	}

}
