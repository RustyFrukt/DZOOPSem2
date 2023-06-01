import static java.lang.System.*;
public class Cat {
    private String name;
    private int gluttony;
    private boolean hungry;

    Cat(String name, int gluttony) {
        this.name = name;
        this.gluttony = gluttony;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден, добавь корма!";
        out.println(name + ": " + isHungry);
    }

    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(gluttony))
            hungry = false;
    }
}