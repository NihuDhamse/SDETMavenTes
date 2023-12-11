package Priority;

import org.testng.annotations.Test;

public class DisableEnableTestCaseExample {
    @Test(groups ="smoke")
    public void addition(){
        System.out.println(5+10);
    }
    @Test(enabled = false)
    public void divide(){
        System.out.println(5/0);
    }
    @Test(groups ="smoke")
    public void multiple(){
        System.out.println(5*10);
    }
    @Test
    public void substraction(){
        System.out.println(5-10);
    }
}
