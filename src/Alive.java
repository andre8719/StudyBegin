public interface Alive {
    // С 8 Java можно определять методы в интерфейсах
    default boolean alive(boolean isDead) {
        return !isDead;
    }
}
