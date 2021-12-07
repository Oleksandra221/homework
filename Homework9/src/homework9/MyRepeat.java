package homework9;

import java.lang.annotation.Annotation;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@MyRepeatAnnotation(10)
public class MyRepeat extends ThreadPoolExecutor {
	
	
	public MyRepeat(int corePoolSize) {
        super(corePoolSize, Integer.MAX_VALUE, 0, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
    }
		
	
	@Override 
	public void execute(Runnable command) {
		
		Class myRepeat = MyRepeat.class;

		if (myRepeat.isAnnotationPresent(MyRepeatAnnotation.class)) {
			MyRepeatAnnotation annotation = (MyRepeatAnnotation) myRepeat.getAnnotation(MyRepeatAnnotation.class);
			for (int i = 0; i < annotation.value() ; i++ ) {
				command.run();
			}
		} else{
			System.err.println("There is no annotation.");

		}
	}


}
