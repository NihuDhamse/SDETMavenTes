package Annotation;

import org.testng.annotations.*;

public class AnnotationMethodExample {

    @BeforeClass
    public void beforeClassExample(){

        int a=10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a+a+b);
    }

    @BeforeMethod
    public void beforeMethodExample(){
        int a=10;
        int b= 5;
        System.out.println(a-b);
    }

    @Test(groups ="smoke")
    public void testCase1(){
        int a=10;
        int b=5;
        System.out.println(a*b);
    }

    @Test
    public void testCase2(){
        int a=10;
        int b=5;
        System.out.println(a/b);
    }
    @Test
    public void testCase3(){
        int c=20;
        int d=25;
        System.out.printf(String.valueOf(c+d));
    }

    @AfterMethod
    public void afterMethodExample(){
        int a=2;
        System.out.println(a*a*a);
    }
    @AfterClass
    public void afterClassExample(){
        System.out.println("This is a After class method");
    }

}
