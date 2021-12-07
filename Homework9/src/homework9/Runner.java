package homework9;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRepeat customThreadPoolExecutor = new MyRepeat(10);
		customThreadPoolExecutor.execute(new MyRunnable());
	}

}
