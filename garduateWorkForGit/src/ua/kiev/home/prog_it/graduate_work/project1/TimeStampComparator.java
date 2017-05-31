package ua.kiev.home.prog_it.graduate_work.project1;

import java.time.LocalDateTime;
import java.util.Comparator;

import com.google.common.base.Predicate;

public class TimeStampComparator implements Comparator<Bet>, Predicate<Bet> {

	private LocalDateTime date1;
	private LocalDateTime date2;

	public TimeStampComparator() {
		// TODO Auto-generated constructor stub
	}

	public TimeStampComparator(LocalDateTime date1, LocalDateTime date2) {
		this.date1 = date1;
		this.date2 = date2;
	}

	@Override
	public int compare(Bet bet1, Bet bet2) {
		return bet1.getTimeStamp().compareTo(bet2.getTimeStamp());
	}

	@Override
	public boolean apply(Bet bet) {
		// TODO Auto-generated method stub
		return true ;
	}

}
