import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void delete() {
    Calculator c1=new Calculator();
    c1.setExp("3/5+6/7-");
        assertEquals("3/5+6/7",c1.delete());
    }

    @Test
    public void calculate() {
        Calculator c2=new Calculator();
        c2.setExp("3+4+9/3");
        //assertEquals(10.0,c2.calculate());

        assertEquals("10.0",c2.calculate());
    }
}