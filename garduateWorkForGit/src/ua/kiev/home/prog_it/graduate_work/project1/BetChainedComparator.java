package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BetChainedComparator implements Comparator<Bet> {

	private List<Comparator<Bet>> listcomparators;

	public BetChainedComparator(Comparator<Bet>... comparators) {
		this.listcomparators = Arrays.asList(comparators);
	}

	@Override
	public int compare(Bet bet1, Bet bet2) {
		for (Comparator<Bet> comparator: listcomparators){
			int result=comparator.compare(bet1, bet2);
			if (result != 0){
				return result;
			}
		}
		return 0;
	}

}
