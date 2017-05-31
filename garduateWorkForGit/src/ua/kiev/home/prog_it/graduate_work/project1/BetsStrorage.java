package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.ArrayList;
import java.util.Collection;

public class BetsStrorage {
	
	private static BetsStrorage _instance=null;
	Collection<Bet> storageOfBets = new ArrayList<>();;

	private BetsStrorage() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized BetsStrorage getInstance(){
		if(_instance == null){
			_instance = new BetsStrorage();
					
		}
	return _instance;	
	}

	public void addBet(Bet bet){
		storageOfBets.add(bet);
	}

	public Collection<Bet> getStorageOfBets() {
		return storageOfBets;
	}
	public boolean notEmpty(){
		return !storageOfBets.isEmpty();
	}
}
