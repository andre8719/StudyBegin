public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Васька"), new Dog("Бобик"), new Horse("Кляча")
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(600);
            if (!animals[i].isOnDistance()) continue;
            animals[i].swim(400);
            if (!animals[i].isOnDistance()) continue;
            animals[i].jump(0.8f);
            if (!animals[i].isOnDistance()) continue;
            animals[i].run(1000);
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].isOnDistance()) {
                System.out.println(animals[i].name + " победил в марафоне");
            }
        }
    }

}
