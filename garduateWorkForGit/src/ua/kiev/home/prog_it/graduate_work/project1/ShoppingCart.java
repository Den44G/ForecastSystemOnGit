package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class ShoppingCart {

	/*
	 * В корзине после выбора в аккаунте пользователя - вида стратегии ,создаетя
	 * обьект стратегии. ID матча сверяется с матчами текущего дня.
	 * 
	 * 
	 * 
	 */

	private String strategyName;
	private double sumOfStartegy;
	private Long gameId;
	private String gameName;
	StrategyUnit strategy;

	void addToCart(Long gameId) {
		ForecastIO fio = new ForecastIO();
			for (Map.Entry<Long, String> entry : fio.dailyGamesImport().HMapStorage().entrySet()) {
				if (entry.getKey() == gameId) {
					this.gameId = entry.getKey();
					this.gameName = entry.getValue();
				}
			}

		
	}

	void addToCart(StrategyTypes type) {
		strategy = new StrategyUnit(type);
		this.strategyName = strategy.getStrategyName();
		this.sumOfStartegy = strategy.getPrice();
	}

	public String getStrategyName() {
		return strategyName;
	}

	public double getSumOfStartegy() {
		return sumOfStartegy;
	}

	public Long getGameId() {
		return gameId;
	}

	public String getGameName() {
		return gameName;
	}

}