import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {

    // a>0; b>0;
    @Test
    public  void positiveSumTest(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2,3), 5,"test comment");

    }

    //a=0; b=0;
    @Test
    public  void positiveSumTest1(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(0,0), 0,"test comment");

    }

    //a<0; b>0;
    @Test
    public  void positiveSumTest2(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-1,3), 2,"test comment");

    }

    // a<0; b<0;
    @Test
    public  void positiveSumTest3(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-1,-1), -2,"test comment");

    }
    @Test
    public void positiveDivTest(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.div(4,2), 2,"test comment");

    }
   @Test
    public void negativeDivTest(){
        Calculator calc = new Calculator();
        //Assert.assertEquals(calc.div(1,0), 0,"test comment");
        Assert.assertThrows(java.lang.ArithmeticException.class, ()-> calc.div(1,0));

    }
}
