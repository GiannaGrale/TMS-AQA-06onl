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

     //HOMETASK

    @Test
    public void fractionPositiveTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.fraction(3.2,5.4),0.5925925925925926);
    }

    @Test
    public void fractionNegativeTest2() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.fraction(4.3,0), Double.POSITIVE_INFINITY);
    }

    @Test
    public void fractionPositiveTest3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.fraction(-3.66,-9.3),  0.39354838709677419354838709677419, "cast to double");
    }

    @Test
    public void fractionPositiveTest4(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.fraction(88.66,-4.3),  -20.618604651162790697674418604651, "cast to double");
    }

    @Test
    public void squarePositiveTest(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.square(16),4);
    }

    @Test
    public void squarePositiveTest1(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.square(16.8),4.0987803063838393532884154722084, "cast to double");
    }

    @Test
    public void squarePositiveTest2(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.square(13),3.6055512754639892931192212674705, "cast to double");
    }

    @Test
    public void squarePositiveTest3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.square(0),0);
    }

    @Test
    public void squareNegativeTest4(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.square(-16), Double.NaN); //1st variant
    }

    @Test
    public void squareNegativeTest5(){
        Calculator calculator = new Calculator();
        Assert.assertTrue(Double.isNaN(calculator.square(-16))); //2nd variant
    }
}
