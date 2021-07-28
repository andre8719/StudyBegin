public class Cat extends Animal implements Breathing{

    public Cat(String name) {
        super(name);
        this.animalType = "Кот";
        this.maxRunDist = 500;
        this.maxSwimDist = 0;
        this.maxJumpHeight = 1.0f;
        this.onDistance = true;
    }

    @Override
    public void voice() {

    }



    public Cat() {
    }

    @Override
    public void breath() {
        System.out.println("Кот дышит");
    }
}

