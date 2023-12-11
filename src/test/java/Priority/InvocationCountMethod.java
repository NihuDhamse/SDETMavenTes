package Priority;

import org.testng.annotations.Test;

public class InvocationCountMethod {
    @Test(invocationCount = 50, invocationTimeOut = 1)
    public void helloWord(){
        System.out.println(5+10);
    }
}
