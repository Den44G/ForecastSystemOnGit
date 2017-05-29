package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.HashMap;


public class ForecastMapStorage <K,V> {
	private HashMap<K,V> hMapStorage;
	
	public void hMapStorageAdd(K key, V value) {
		hMapStorage = new HashMap<>();
		hMapStorage.put(key, value);
	}

	public HashMap<K,V> HMapStorage() {
		return hMapStorage;

	}

	public boolean storageIsEmpty() {
		if (hMapStorage.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}


}
