
public class Table {

	private float money;
	
	synchronized void setMoney(String name,float m){
		this.money=m;
		System.out.println(name+" : "+ this.money);
	}
}
