package thread;

public class ThreadDemo {

	
	public static void main(String[] args) {
		
		//Thread1 th1=new Thread1("thread-1");
		//Thread1 th2=new Thread1("thread-2");
		
		//th1.start();
		//th2.start();
		
		//th1.run();
		//th2.run();
		
		//second way
		/*Runable1 r1=new Runable1("thread-1");
		Runable1 r2=new Runable1("thread-2");
		Thread th=new Thread(r1);
		Thread th3 =new Thread(r2);
		th.start();
		th3.start();*/
		
		
		/*System.out.println("main - "+Thread.currentThread().getPriority());
		
		System.out.println("first line of main thread");
		Thread.currentThread().setPriority(3);
		
		Runable1 r1=new Runable1("thread-1");
		Thread th=new Thread(r1);
		
		//th.stop();
		System.out.println("new Thread - "+th.getPriority());
		
		System.out.println("main - "+Thread.currentThread().getPriority());	
		
		System.out.println("new Thread - "+th.getPriority());*/
		
		
		//th.start();
		
		/*try{
			th.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}*/
		
		//System.out.println("last line of main thread");
		
		//sleep
		/*Thread1 th4=new Thread1("thread 4 is running");
		th4.start();*/
		Bank bank=new Bank();
		
		Runable1 r1=new Runable1("th-1",bank,500f);
		Runable1 r2=new Runable1("th-2",bank,1000f);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}
}
