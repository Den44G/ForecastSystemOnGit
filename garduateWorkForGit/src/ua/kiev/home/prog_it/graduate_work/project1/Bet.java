package ua.kiev.home.prog_it.graduate_work.project1;

import java.time.LocalDateTime;
import java.util.List;

final class Bet {
	
	private LocalDateTime timeStamp;
	private String strategyName;
	private double sumOfBet;
	private long accountId;
	private long playerAccountId;
    //private String homeCommanName;
    //private String guestCommanName;
	 LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	 void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	 String getStrategyName() {
		return strategyName;
	}
	 void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}
	 double getSumOfBet() {
		return sumOfBet;
	}
	 void setSumOfBet(double sumOfBet) {
		this.sumOfBet = sumOfBet;
	}
	long getAccountId() {
		return accountId;
	}
	 void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getPlayerAccountId() {
		return playerAccountId;
	}
	 void setPlayerAccountId(long playerAccountId) {
		this.playerAccountId = playerAccountId;
	}
 }
