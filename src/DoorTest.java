import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

public class DoorTest {

    @Test
    void constructorTest(){
        Lock l = new Lock();
        Lock l1= l;
        Door d = new Door(new Lock());
        d.setLock(l1);
        assertNotEquals(new Lock(),new Door(new Lock()).getLock());
        assertEquals(d.getLock(),l);
        assertNotEquals(d.getLock(), null);
    }

    @Test
    void lockTest(){
        Lock l = new Lock();
        Key k = new Key(l);
        Key k1 = new Key(l);
        Door d= new Door(null);
        assertEquals(false,d.lock(k));
        assertNotEquals(false,new Door(l).lock(k1) );
        assertEquals(false,new Door(null).lock(null));
    }

    @Test
    void unlockTest(){
        Lock l = new Lock();
        Key k = new Key(l);
        Key k1 = new Key(l);
        Door d= new Door(null);
        assertEquals(false,d.unlock(k));
        assertNotEquals(false,new Door(l).unlock(k1) );
        assertEquals(false,new Door(null).unlock(null));
    }

    @Test
    void isLockedTest(){
        Lock l = new Lock();
        Door d = new Door(l);
        d.unlock(new Key(l));
        assertEquals(false,d.isLocked());
        //line 48 failed. To fix it I added "&& key!=null" to Door class at line 18 and line 28.
        d.lock(null);
        assertEquals(false,d.isLocked());
    }
}
