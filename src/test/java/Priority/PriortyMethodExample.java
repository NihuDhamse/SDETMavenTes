package Priority;

import org.testng.annotations.Test;

public class PriortyMethodExample {

    @Test(priority = 1)
    public void testCaseN(){
        System.out.println("Wardha");
    }

    @Test(priority = 2)
    public void testCaseR(){
        System.out.println("Pune");
    }

    @Test(priority = 3)
    public void testCaseS(){
        System.out.println("Mumbai");
    }

    @Test(priority =4 )
    public void testCaseP(){
        System.out.println("Hyderabad");
    }

    @Test(priority =5 )
    public void testCaseC(){
        System.out.println("Banglore");
    }

    @Test(priority = 6)
    public void testCaseM(){
        System.out.println("Delhi");
    }

    @Test(priority =7 )
    public void testCaseV(){
        System.out.println("Gudgaon");
    }
}
