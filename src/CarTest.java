//Halit Burak Yeşildal 18050111043
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

public class CarTest {

    @Test
    void constructorTest() throws Exception {

        Lock l = new Lock();

        Key k = new Key(new Lock());
        Key k1 = new Key(l);

        Door d= new Door(k.getLock());
        Door d1= new Door(l);
        Door d2= new Door(l);

        Door[] dArr ={d,d1,d2};

        dArr[0].unlock(k);
        dArr[1].unlock(k1);
        dArr[2].unlock(k1);

        assertEquals(null,new Car(null,null).getControlPanel());
        ControlPanel cp= new ControlPanel(50);
        //Line 29 failed. To solve it throw Exception is added to methods of Control panel class. if your control panel is null you cannot use any methods of it.
        Assertions.assertThrows(Exception.class ,()->{new Car(null,cp).getControlPanel().isRunning();});
        assertNotEquals(null,new Car(dArr,cp));
    }

    @Test
    void isOpenTest(){
        Lock l = new Lock();

        Key k = new Key(new Lock());
        Key k1 = new Key(l);

        Door d= new Door(k.getLock());
        Door d1= new Door(l);
        Door d2= new Door(l);

        Door[] dArr ={d,d1,d2};



        assertEquals(false,new Car(null,null).isOpen());
        //line 17 failed. To fix this I've added "d==null ||" to 16th line of Car.java
        assertEquals(false,new Car(new Door[1],null).isOpen());
        //line 19 failed. To fix this I've added "|| doors.length==0" to 13th line of Car.java
        assertEquals(false,new Car(new Door[0],null).isOpen());
        assertEquals(false,new Car(new Door[3],null).isOpen());
        assertEquals(false,new Car(dArr,null).isOpen());

        dArr[0].unlock(k);
        dArr[1].unlock(k1);
        dArr[2].unlock(k1);

        assertEquals(true,new Car(dArr,null).isOpen());

    }
}
