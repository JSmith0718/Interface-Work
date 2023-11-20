import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBird {
    @Test
    public void TestMakeSound(){
        Bird b = new Bird();
        assertEquals("Chirp", b.makeSound());
    }

    @Test
    public void TestMove(){
        Bird b = new Bird();
        assertEquals("I am flying", b.move());
    }
}
