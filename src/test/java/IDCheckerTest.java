import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;

import junitparams.Parameters;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class IDCheckerTest {

    @Test
    @Parameters({"AAA111111,true","AVD441001,false","STR879543,true","STR873543,false"})
    public void CheckId(String Id, boolean result){
        IDChecker idChecker=new IDChecker(Id);
        assertEquals(result,idChecker.check());
    }
}