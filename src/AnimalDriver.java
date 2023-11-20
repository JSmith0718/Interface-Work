public class AnimalDriver {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog sound: " + dog.makeSound());
        System.out.println("Dog movement: " + dog.move());

        System.out.println("Bird Sound: " + bird.makeSound());
        System.out.println("Bird Movement: " + bird.move());

        Dog specificDog = new Dog();
        String homework = specificDog.misbehave("homework");
        System.out.println("Misbehavior: " + homework);

    }
}
