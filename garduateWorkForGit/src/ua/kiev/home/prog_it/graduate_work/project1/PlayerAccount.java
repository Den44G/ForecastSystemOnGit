package ua.kiev.home.prog_it.graduate_work.project1;

import java.time.LocalDateTime;

public class PlayerAccount {
	private final String name;
	private final long id;
	private double totalSum;
	private int betCounter;
	private Account cashAccount = new Account();
	private ShoppingCart shoppingCart;
	private Bet bet;
	private ForecastDataSelection dataSelection;

	public PlayerAccount(String name, long id) {
		this.name = name;
		this.id = id;
	} 

	public void wantToPlay(StrategyTypes type, long gameId) {
		shoppingCart = new ShoppingCart();
		shoppingCart.addToCart(type,gameId);
	}

	public void noWantToPlay() {
		shoppingCart = null;

	}

	public void replenishAccount(double sum) {
		cashAccount.addToAccount(sum);
	}

	public void withdrowlFromAccount(double sum) {
		cashAccount.decreaseAccount(sum);
	}

	public void placeABet(double sum) {
	BetsStrorage betStorage = BetsStrorage.getInstance();
		if (checkSum(sum)) {
			bet = new Bet.Builder(shoppingCart.getGameId(), id).timeStamp(LocalDateTime.now())
					.strategyname(shoppingCart.getStrategyName()).sumOfBet(totalSum).betPlayed(false).build();
			betStorage.addBet(bet);
			betCounter++;
		} else {
			throw new IllegalArgumentException("Check the bet amount and balance on the account");
		}
	}

	// Если сделано 10 или больше ставок то цена стратегии уменьшается.
	private void calcTotalSum(double sum) {
		if (betCounter >= 10) {
			totalSum = sum + (shoppingCart.getSumOfStartegy() * 0.8);
		} else {
			totalSum = sum + shoppingCart.getSumOfStartegy();
		}
	}

	// проверяется достаточно ли суммы на счету для ставки
	private boolean checkSum(double sum) {
		calcTotalSum(sum);
		if (sum <= 0 || sum > cashAccount.getSumOnAccount() || totalSum > cashAccount.getSumOnAccount()) {
			return false;
		} else {
			return true;
		}
	}

}
