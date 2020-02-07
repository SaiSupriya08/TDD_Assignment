import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CodeTest {
    @Mock
    Input file;
    Code c;
    Code c1;

    @Spy
    Input file1;

    @Before
    public <Application> void setUp() {
        System.out.println("Running");
    }
    @Before
    public void setup(){
        file=mock(Input.class);
        c=new Code();
        c1=new Code();
        c.setFileObject(file);
        file1=spy(new Input());
        c1.setFileObject(file1);
    }

    @Test
    public void verifyCode() throws IOException{
        when(file.readFile(anyString())).thenReturn("t");
        boolean result=c.vowelOrConsonant();
        //assertTrue(result);
        verify(file).readFile(anyString());
    }
    //        @Test
//        public void vowel() throws Exception {
//            Code validator = new Code();
//            boolean result;
//            if (validator.vowelOrConsonant("a")) result = true;
//            else result = false;
//            assertTrue("vowel", result);
//        }
//
//        @Test
//        public void consonant() throws Exception{
//            Code validator = new Code();
//            boolean result;
//            if (validator.vowelOrConsonant("c")) {
//                result = true;
//            } else {result = false;}
//            assertFalse("consonant",result);
//        }
    @Test
    public void InputTrue() throws IOException{
        //doReturn("s").when(file1).readFile(anyString());
        when(file.readFile(anyString())).thenReturn("i");
        boolean result=c.vowelOrConsonant();
        assertTrue(result);
        //verify(file).readFile(anyString());
    }
    @Test
    public void InputFalse() throws IOException{
        doReturn("f").when(file1).readFile(anyString());
        boolean result=c1.vowelOrConsonant();
        assertFalse(result);
    }
    @After
    public <Application1> void setUp1() {
        System.out.println("Executed");
    }
}
