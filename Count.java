import com.sun.org.apache.bcel.internal.generic.ATHROW;

public class count {
	 public void run(){

		    System.out.println("In thread C");

		 }


		   public static void main(String args[]){

		    AThread A = new ATHROW();
		    Thread tA = new Thread(A);


		    BThread B = new BThread();
		    Thread tB = new Thread(B);

		    CThread C = new CThread();
		    Thread tC = new Thread(C);

		    tA.setPriority(Thread.MAX_PRIORITY);
		    tC.setPriority(Thread.MIN_PRIORITY);
		    tB.setPriority(tA.getPriority() -1);


		    System.out.println("A started");
		    tA.start();

		    System.out.println("B started");
		    tB.start();

		    System.out.println("C started");
		    tC.start();

		}       
}
