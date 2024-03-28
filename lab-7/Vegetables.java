 abstract class Vegetable {
    protected String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public abstract String getName();

    public String toString() {
        return getName() + " with color " + color;
    }
}

 class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    public String getName() {
        return "Potato";
    }
}

 class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }


    public String getName() {
        return "Brinjal";
    }
}

 class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    public String getName() {
        return "Tomato";
    }
}

public class Vegetables {
    public static void main(String[] args) {
        Vegetable[] vegetables = new Vegetable[3];
        vegetables[0] = new Potato("White");
        vegetables[1] = new Brinjal("Green");
        vegetables[2] = new Tomato("Red");

        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}