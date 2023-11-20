import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestDog {
    @Test
    public void testMakeSound(){
        Dog d = new Dog();
        assertEquals("Bark", d.makeSound());
    }

    @Test
    public void testMove() {
        Dog d = new Dog();
        assertEquals("I'm running", d.move());
    }

    @Test
    public void testMisbehave(){
        Dog d = new Dog();
        assertEquals("I chewed up your homework", d.misbehave("homework"));
    }
}
