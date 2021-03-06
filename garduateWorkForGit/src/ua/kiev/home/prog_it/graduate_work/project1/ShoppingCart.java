package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class ShoppingCart {

	/*
	 * � ������� ����� ������ � �������� ������������ - ���� ��������� ,��������
	 * ������ ���������. ID ����� ��������� � ������� �������� ���.
	 * 
	 * 
	 * 
	 */

	private String strategyName;
	private double sumOfStartegy;
	private Long gameId;
	private String gameName;
	StrategyUnit strategy;
	ForecastIO fio = ForecastIO.getInstance();
	
	
	void checkTheGame(Long gameId) {
			for (Map.Entry<Long, String> entry : fio.getDailyGames().HMapStorage().entrySet()) {
				if (entry.getKey() == gameId) {
					this.gameId = entry.getKey();
					this.gameName = entry.getValue();
				}
			}

		
	}

	void addToCart(StrategyTypes type,Long gameId) {
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