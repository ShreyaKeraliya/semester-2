 interface Transport {
    public void deliver();
}

 abstract class Animal {
    public abstract void move();
}

 class Tiger extends Animal {
    public void move() {
        System.out.println("Tiger is moving towards zoo...");
    }
}

 class Camel extends Animal implements Transport {
    public void move() {
        System.out.println("Camel is moving toward zoo...");
    }

    public void deliver() {
        System.out.println("Camel is delivered in the zoo...");
    }
}

class Deer extends Animal {
    public void move() {
        System.out.println("Deer is moving towards zoo...");
    }
}
 class Donkey extends Animal implements Transport {
    public void move() {
        System.out.println("Donkey is moving towards zoo...");
    }

    public void deliver() {
        System.out.println("Donkey is delivered in the zoo...");
    }
}

public class TransportA {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                Transport transport = (Transport) animal;
                transport.deliver();
            } else {
                animal.move();
            }
        }
    }
}