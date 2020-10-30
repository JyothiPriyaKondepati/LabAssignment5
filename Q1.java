import java.io.*;
import java.util.*;
class MultiThreadedProgram implements Runnable 
{
	@Override
	public void run() 
	{

		for (int j = 0; j <= 100; j++) 
		{
			System.out.println(" Thread name is: " + Thread.currentThread().getName() + " " + j);
		}
	}

}

public class Q1 
{
	public static void main(String[] args)
	{
		MultiThreadedProgram mt = new MultiThreadedProgram();
		Thread t1 = new Thread(mt, "Thread1");
		Thread t2 = new Thread(mt, "Thread2");
		Thread t3 = new Thread(mt, "Thread3");
		t1.start();
		t2.start();
		t3.start();

}

}
