
public class DipositThread extends Thread{

	private Table t;
	private float m;
	private String name;
	public DipositThread( String name,Table t, float m) {
		this.m=m;
		this.name=name;
		if(t!=null) this.t=t;
	}
	
	@Override
	public void run() {
		t.setMoney(this.name, m);
	}
}
