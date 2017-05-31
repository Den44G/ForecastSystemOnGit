package ua.kiev.home.prog_it.graduate_work.project1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;




public class SortBetRunner {
	
	static Comparator strategyName(){
		return new StrategyNameComparator();
	}
	
	static Collection<Bet> filter(Collection<Bet> col,Predicate predicate){
		Collection<Bet> sorted = Collections2.filter(col, predicate);
		return sorted;
		
	}
	
	static Predicate<String> predicateOr(Predicate predicate1,Predicate<Bet>predicate2){
		Predicate<String> predicate = Predicates.or(predicate1, predicate2);
		return predicate;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("SORTING BY MULTIPLE FIELDS");
		
		List<Bet> list = new ArrayList<>();
	list.add(new Bet.Builder(1111111, 3252428).betPlayed(true).strategyname("CardsQuantity").sumOfBet(10.00).timeStamp(LocalDateTime.now()).build());
	list.add(new Bet.Builder(1111112, 3252421).betPlayed(true).strategyname("CardsQuantity").sumOfBet(50.00).timeStamp(LocalDateTime.now()).build());
	list.add(new Bet.Builder(1111112, 3252428).betPlayed(false).strategyname("Winner").sumOfBet(10.00).timeStamp(LocalDateTime.now()).build());
	list.add(new Bet.Builder(1111114, 3252421).betPlayed(true).strategyname("Totals").sumOfBet(20.00).timeStamp(LocalDateTime.now()).build());
	list.add(new Bet.Builder(1111117, 3252423).betPlayed(false).strategyname("CardsQuantity").sumOfBet(10.00).timeStamp(LocalDateTime.now()).build());
	list.add(new Bet.Builder(1111114, 3252421).betPlayed(true).strategyname("Winner").sumOfBet(40.00).timeStamp(LocalDateTime.now()).build());
	list.add(new Bet.Builder(1111117, 3252423).betPlayed(false).strategyname("Totals").sumOfBet(20.00).timeStamp(LocalDateTime.now()).build());
	

	 System.out.println("BEFORE SORTING"); 
	for (Bet bet : list) {
		System.out.println(bet);
	}	
Collections.sort(list, new BetChainedComparator(
	//new TimeStampComparator(),
	strategyName(),
	new SumOfBetComparator())
	//new StrategyNameComparator())
		);
	System.out.println("/n *** after Sorting");
	for (Bet bet : list) {
		System.out.println(bet);
	}
	
	System.out.println("/n ***FILTERING");
	System.out.println(filter(list, new StrategyNameComparator("Winner")));
	
	System.out.println("/n ***TWOPREDICATES");
	System.out.println(filter(list ,predicateOr(new StrategyNameComparator("Totals") , new StrategyNameComparator("CardsQuantity"))));
}
}