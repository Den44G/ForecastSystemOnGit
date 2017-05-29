package ua.kiev.home.prog_it.graduate_work.project1;

import java.util.TreeSet;

public class ForecastStorage <T> {
	
	private TreeSet<T> treeStorage;
		
	public void treeStorageAdd(T value) {
		treeStorage = new TreeSet<>();
		treeStorage.add(value);
	}

	public TreeSet<T> treeStorage() {
		return treeStorage;

	}

	public boolean storageIsEmpty() {
		if (treeStorage.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
