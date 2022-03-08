import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testReturnInput(){
        Employee mystate = new Employee();
        Assert.assertEquals(0, mystate.returnInput(0, true, true, true));



    /*@Test

        public void testReturnFalseInput(){
            mystate = new Employee();
            Assert.assertEquals(0,mystate.returnInput(0, false, false, false));*/
        }
    }

