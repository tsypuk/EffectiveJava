package joshua.chapter6.enums;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlanetTest {

    @Test
    public void testSurfaceWeight() throws Exception {
        double earthWeight = 85;
        double mass = earthWeight/Planet.VENUS.getSurfaceGravity();
        for (Planet planet : Planet.values()) {
            System.out.println(planet.surfaceWeight(mass));
        }
    }
}