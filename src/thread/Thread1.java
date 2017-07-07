package thread;

public class Thread1 extends Thread{

	String name;
	public Thread1(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		char[] c= this.name.toCharArray();
		for(int i=0; i<c.length ;i++){
			try{
				Thread.sleep(600);
				System.out.print(c[i]);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
}
