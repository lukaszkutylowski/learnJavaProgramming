import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarTest {

    @Test
    public void shouldCreateInstanceOfCar() {
        //given
        Wheel testWheel1 = new Wheel();
        //when
        Car testCar = new Car(testWheel1, testWheel1);
        //then
        assertEquals(testCar.getWheel1().hashCode(),testCar.getWheel2().hashCode());
    }

    @Test
    public void shouldCheckDriveRevolutions() {
        //given
        int testDistance = 200;
        int testRevolutions = 400;

        Wheel wheel = mock(Wheel.class);
        when(wheel.roll(testRevolutions)).thenReturn(testRevolutions);

        Car testCar = new Car(wheel, wheel);

        //when
        testCar.drive(testDistance);
        int actualRevolutions = testCar.getWheelRollCount();
        //then
        assertEquals(testRevolutions, actualRevolutions);
    }


}