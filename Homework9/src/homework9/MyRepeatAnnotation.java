package homework9;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatAnnotation{
	int value();
}
