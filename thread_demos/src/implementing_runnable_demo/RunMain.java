package implementing_runnable_demo;

public class RunMain {

	public static void main(String[] args) {
		
		RuunableThread r1=new RuunableThread();
		RuunableThread r2=new RuunableThread();
		RuunableThread r3=new RuunableThread();
		RuunableThread r4=new RuunableThread();
		
		Thread t1=new Thread(r1, "run-1");
		Thread t2=new Thread(r2, "run-2");
		Thread t3=new Thread(r3, "run-3");
		Thread t4=new Thread(r4, "run-4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=0;i<4;i++) {
			System.out.println("Printing from thread - "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("MAIN ENDS HERE");
	}

}
