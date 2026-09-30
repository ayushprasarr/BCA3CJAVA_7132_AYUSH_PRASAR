class Loopthread extends Thread{
	private int iterations;
	
	public LoopThread(int iterations) {
		this.iterations = iterations;
	}
	@Override
	public void run() {
		for (int i=0; i<iterations; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current Threads:" + Thread.currentThread().getName());
			} catch (InterruptedException ex) {
				System.out.println("Exception has been caught" + ex);
			}
		}
System.out.ptintln(i);
	}
}
}
public class ThreadLoopEx {
		public static void main (String[] args)
		{
			LoopThread t1 = new LoopThread(5);
			LoopThread t2 = new LoopThread(5);
			
			t1.start();
			
			try {
				System.out.println("Current Threads:" + Thread.currentThread().getName());
				t1.join();
			} catch (InterruptedException ex) {
				System.out.println("Exception has been caught" + ex);
			}
		}
}