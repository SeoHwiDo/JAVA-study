package week10_10_lec02;

public class Account {
	String number;
	int balance;
	Account(){
		this("",0);
		System.out.println("defalt");
	}
	
	Account(String number, int balance) {
		this.number = number;
		this.balance = balance;
	}

	void deposit(int money) {
		balance += money;

	}

	boolean pay(int money) {
		boolean flag = false;
		if (money < balance) {
			balance -= money;
			flag = true;
		}
		return flag;
	}
	public String toString() {
		return "Account[°èÁÂ¹øÈ£="+number+",ÀÜ¾×="+balance+"]";
	}
}
