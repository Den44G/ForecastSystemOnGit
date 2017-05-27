package ua.kiev.home.prog_it.graduate_work.project1;

class Account {

	private double sumOnAccount;

	private long accountId;
	
	public Account(long acc) {
		this.accountId=acc;
		// TODO Auto-generated constructor stub
	}

	 long getAccountId() {
		return accountId;
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
