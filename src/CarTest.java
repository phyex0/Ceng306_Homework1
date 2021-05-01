import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

public class CarTest {

    @Test
    void constructorTest(){

    }

    @Test
    void isOpenTest(){

        assertEquals(false,new Car(null,null).isOpen());
        //line 17 failed. To fix this I've added "d==null ||" to 16th line of Car.java
        assertEquals(false,new Car(new Door[1],null).isOpen());

    }
}
