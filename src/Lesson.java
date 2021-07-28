public class Lesson {
    public static void main(String[] args) {
        // Анонимный класс
        Animal cow = new Animal() {
            @Override
            public void voice() {
                System.out.println("Mouu");
            }
        };
    }

    static void info(Animal animal) {
        String name = new String();
        String animalType = new String();
        String color = new String();
        int age = 0;
        System.out.println(animalType + " " + name + " ,возраст животного: " + age + " ,цвет животного: " + color);
    }
}
