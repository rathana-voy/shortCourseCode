package thread;
public class Runable1 implements Runnable{

	String name;
	Bank bank;
	float amount;
	public Runable1(String name ,Bank bank, float am){
		this.name=name;
		this.bank=bank;
		this.amount=am;
	}
	
	@Override
	public void run() {
		this.bank.setAmount(this.name,amount);
	}
}
