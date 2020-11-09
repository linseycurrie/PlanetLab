import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlanet {

    Planet planet;

    @Before
    public void before(){
        planet = new Planet("Mars", 908973);
    }

    @Test
    public void hasName(){
        assertEquals("Mars", planet.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(908973, planet.getSize());
    }

    @Test
    public void willExplode(){
        assertEquals("Boom! Mars has exploded.", planet.explode());
    }

    @Test
    public void returnInfo(){
        assertEquals("Mars is 908973", planet.getInfo());
    }
}
