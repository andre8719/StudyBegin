public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.animalType = "Пёс";
        this.maxRunDist = 800;
        this.maxSwimDist = 500;
        this.maxJumpHeight = 0.5f;
        this.onDistance = true;
    }
}
