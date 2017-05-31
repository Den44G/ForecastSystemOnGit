package ua.kiev.home.prog_it.graduate_work.project1;

import java.time.LocalDateTime;
import java.util.List;

class Bet {

	private LocalDateTime timeStamp;
	private String strategyName;
	private double sumOfBet;
	private long playerAccountId;
	private boolean betPlayed = false;
	private long matchID;

	public static class Builder {
		private LocalDateTime timeStamp;
		private String strategyName;
		private double sumOfBet;
		private long playerAccountId;
		private boolean betPlayed = false;
		private long matchID;

		public Builder(long matchID, long playerAccountId) {
			this.matchID = matchID;
			this.playerAccountId = playerAccountId;
		}

		public Builder timeStamp(LocalDateTime timeStamp) {
			this.timeStamp = timeStamp;
			return this;
		}

		public Builder strategyname(String strategyName) {
			this.strategyName = strategyName;
			return this;
		}

		public Builder sumOfBet(double sum) {
			this.sumOfBet = sum;
			return this;
		}

		public Builder betPlayed(boolean status) {
			this.betPlayed = status;
			return this;
		}

		public Bet build() {
			return new Bet(this);

		}
	}

	public Bet(Builder builder) {
		this.matchID = builder.matchID;
		this.playerAccountId = builder.playerAccountId;
		this.timeStamp = builder.timeStamp;
		this.strategyName = builder.strategyName;
		this.sumOfBet = builder.sumOfBet;
		this.betPlayed = builder.betPlayed;
	}

	public void setBetPlayed(boolean betPlayed) {
		this.betPlayed = betPlayed;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public String getStrategyName() {
		return strategyName;
	}

	public double getSumOfBet() {
		return sumOfBet;
	}

	public long getPlayerAccountId() {
		return playerAccountId;
	}

	public boolean isBetPlayed() {
		return betPlayed;
	}

	public long getMatchID() {
		return matchID;
	}

	@Override
	public String toString() {
		return "Bet [timeStamp=" + timeStamp + ", strategyName=" + strategyName + ", sumOfBet=" + sumOfBet
				+ ", playerAccountId=" + playerAccountId + ", betPlayed=" + betPlayed + ", matchID=" + matchID + "]";
	}
}
