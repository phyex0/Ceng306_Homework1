//Halit Burak Yeşildal 18050111043
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class KeyTest {

    @Test
    void constructorTest(){
        Lock l = new Lock();
        assertEquals(l,new Key(l).getLock());
        assertNotEquals(l,new Key(new Lock()));
        assertNotEquals(l,new Key(null));
    }

    @Test
    void isValidLockTest(){
        Lock l= new Lock();
        Lock l1=l;
        Key k = new Key(new Lock());
        Key k1 = new Key(l1);

        assertEquals(true,new Key(l).isValidLock(l1));
        //Line 24 failed. "&& this.lock != null" added to Key class line 11 to fix it. None of the parameters can be "null".
        assertEquals(false,new Key(null).isValidLock(l));
        assertEquals(false,new Key(l1).isValidLock(null));
        assertNotEquals(true,new Key(null).isValidLock(null) );


    }
}
