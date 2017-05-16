package ua.kiev.home.prog_it.graduate_work.project1;

public class Helper {

	public static void main(String[] args) {

		StrategyCards str = new StrategyCards(StrategyTypes.TotalGoalScored);
		System.out.println(str.getStrategyName());
	}

}
