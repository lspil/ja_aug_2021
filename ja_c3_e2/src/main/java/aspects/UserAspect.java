package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {

  @Around("execution(* controllers.UserController.getN(..))")
  public Object aspect(ProceedingJoinPoint p) throws Throwable {
    return p.proceed();
  }
}
