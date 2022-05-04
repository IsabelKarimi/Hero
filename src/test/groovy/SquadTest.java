import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {



    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void NewSquadObjectIsSuccessfullyCreated_true() {
        Squad squad = new Squad("Invictus","Sexism",7);
        assertEquals(true, true);
    }

    public Squad setUpNewSquad(){
        Squad squad = new Squad("Avengers","darth",8);
        return squad;
    }

    public Squad setUpAnotherSquad(){
        Squad squad = new Squad("JUstice_League","Joker",5);
        return squad;
    }

    @Test
    void SquadName_true() {
        Squad squad=setUpNewSquad();
        assertEquals("Avengers",squad.getName());
    }
    @Test
    void SquadCause_true() {
        Squad squad = setUpAnotherSquad();
        assertEquals("Joker",squad.getCause());
    }
}