import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

public class LockTest {


    @Test
    void constructorTest(){

        assertNotEquals((Integer) null,new Lock().getCode());
        assertNotEquals("word",new Lock().getCode());
        assertNotEquals(5.2,new Lock().getCode());
        assertNotEquals('c',new Lock().getCode());


    }

    @Test
    void codeMatchTest(){
        Lock l = new Lock();
        assertNotEquals(true,l.codeMatches(new Lock()));
        assertNotEquals(true,new Lock().codeMatches(l));
        assertEquals(true,l.codeMatches(l));

    }
}
