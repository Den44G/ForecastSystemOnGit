package ua.kiev.home.prog_it.graduate_work.project1;

class Account {

	private double sumOnAccount;

	public Account() {

	}

	public Account(double sum) {
		this.sumOnAccount = sum;
	}

	double getSumOnAccount() {
		return sumOnAccount;
	}

	void addToAccount(double sum) {
		this.sumOnAccount += sum;
	}

	void decreaseAccount(double sum) {
		this.sumOnAccount -= sum;
	}
}
