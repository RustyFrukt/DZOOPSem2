public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Ржавый", 10), new Cat("Васька", 8), new Cat("Пушистик", 7)};
        Plate plate = new Plate( -20);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}