class MyThread extends Thread
{
	
}
class DaemonThreadDemo1
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().isDaemon());
		MyThread t=new MyThread();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}