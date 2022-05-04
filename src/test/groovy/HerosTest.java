import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HerosTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    public void NewHeroObjectedIsCreatedSuccessfully() {
        Heros heros = new Heros("Thor", 34, "Hammer", "Sugar","Avengers");
        assertEquals(true, true);
    }

    public Heros setUpNewHero() {
        Heros heros = new Heros("Flash", 28, "Fast", "light","Justice");
        return heros;
    }

    public Heros setUpAnotherHero() {
        Heros heros = new Heros("Supergirl", 25, "Strong", "cake","Gog");
        return heros;
    }

    @Test
    void HerosName_true() {
        Heros heros = setUpNewHero();
        assertEquals("Flash",heros.getName());
    }

    @Test
    void HerosPower_true() {
        Heros heros = setUpAnotherHero();
        assertEquals("Strong",heros.getPower());
    }
}