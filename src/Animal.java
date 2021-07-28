public abstract class Animal implements Alive {
    protected String name;
    protected String animalType;
    protected float maxRunDist;
    protected float maxSwimDist;
    protected float maxJumpHeight;
    protected boolean onDistance;

    public abstract void voice();

//    public abstract void jump();

    public boolean isOnDistance() {
        return onDistance;
    }

    public String getName() {
        return name;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run(float runDist) {
        if (runDist < maxRunDist) {
            System.out.println(animalType + " " + name + " успешно пробежал дистанцию");
        } else {
            onDistance = false;
            System.out.println(animalType + " " + name + " не пробежал дистанцию");
        }
    }

    public void swim(float swimDist) {
        if (maxSwimDist == 0) {
            System.out.println(animalType + " " + name + " не умеет плавать");
            onDistance = false;
            return;
        }
        if (swimDist < maxSwimDist) {
            System.out.println(animalType + " " + name + " успешно проплыл дистанцию");
        } else {
            onDistance = false;
            System.out.println(animalType + " " + name + " не проплыл дистанцию");
        }
    }

    public void jump(float height) {
        if (height < maxJumpHeight) {
            System.out.println(animalType + " " + name + " успешно перепрыгнул препятствие");
        } else {
            onDistance = false;
            System.out.println(animalType + " " + name + " не перепрыгнул препятствие");
        }
    }

}
