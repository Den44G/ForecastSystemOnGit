package ua.kiev.home.prog_it.graduate_work.project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ForecastIO {
	
	private static ForecastIO _instance=null;
	ForecastMapStorage<Long, String> dailyGames;
	private String dailyGamesImportPath = "GamesOfTheDay.csv";

	private ForecastIO(){}
	
	public static synchronized ForecastIO getInstance(){
		if(_instance == null){
			_instance = new ForecastIO();
					
		}
	return _instance;	
	}
	
	public ForecastMapStorage<Long, String> getDailyGames() {
		return dailyGames;
	}

	public  void dailyGamesImport() {

		dailyGames = new ForecastMapStorage<>();
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(dailyGamesImportPath))) {
			// br = new BufferedReader(new FileReader(dailyGamesImportPath));
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(";");
				dailyGames.hMapStorageAdd((Long.parseLong(fields[0])), (fields[1] + "-" + fields[2]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		/*if (dailyGames.storageIsEmpty() == false) {
			return dailyGames;
		} else {
			throw new IllegalArgumentException("No data about games of the day.");
		}

	}
*/
}
