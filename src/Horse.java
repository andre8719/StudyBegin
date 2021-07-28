public class Horse extends Animal {

    public Horse(String name) {
        super(name);
        this.animalType = "Конь";
        this.maxRunDist = 1200;
        this.maxSwimDist = 800;
        this.maxJumpHeight = 1.5f;
        this.onDistance = true;
    }
}
