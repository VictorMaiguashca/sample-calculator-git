package ec.edu.epn.git.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator c;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }
    @Before
    public void setUp() {
        System.out.println("setUp()");
        c= new Calculator();
    }

    @Test
    public void given_two_integers_when_addition_then_ok()
    {
        System.out.println("Test1");
        assertEquals(6,c.addition(3,3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok()
    {
        System.out.println("Test2");
        assertEquals(2,c.subtraction(4,2));
    }

    @Test (expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception()
    {
        System.out.println("Test3");
        assertEquals(3, c.division(3,0));
    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout()
    {
        System.out.println("Test4");
        assertEquals(6, c.multiplication(3,2));
    }

    @After
    public void tearDown()
    {
        System.out.println("tearDown()");
        c.setAns(0);
    }
}