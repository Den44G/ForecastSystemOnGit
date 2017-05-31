package ua.kiev.home.prog_it.graduate_work.project1;

public class Helper {

	
	
	
	
	public static void main(String[] args) {

	
		
		StrategyUnit str = new StrategyUnit(StrategyTypes.TotalGoalScored);
		System.out.println(str.getStrategyName());
		StrategyUnit str1 = new StrategyUnit(StrategyTypes.WinnerOFTheGame);
		System.out.println(str1.getStrategyName());
	}

}
