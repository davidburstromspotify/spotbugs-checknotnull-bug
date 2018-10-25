import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

@TypeQualifierNickname
@javax.annotation.Nonnull(when = When.MAYBE)
@Retention(RetentionPolicy.CLASS)
public @interface MyNullable {
}

