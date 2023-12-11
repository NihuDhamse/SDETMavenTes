package Priority;

import org.testng.annotations.Test;

public class DependOnMethodExample {

    @Test(groups ="smoke")
    public void addition(){
        System.out.println(5+10);
    }
    @Test
    public void divide(){
        System.out.println(5/0);
    }
    @Test(dependsOnMethods = {"divide"})
    public void multiple(){
        System.out.println(5*10);
    }
    @Test(groups ="smoke")
    public void substraction(){
        System.out.println(5-10);
    }
}
