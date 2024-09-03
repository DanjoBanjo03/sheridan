public class Ass04_Question03 {
    public static void main(String[] args) {
        Animal[] list = new Animal[5];
        list[0] = new Chicken();
        list[0].setWeight(4.5);
        list[1] = new Tiger();
        list[1].setWeight(46.6);
        list[2] = new Chicken();
        list[2].setWeight(1.5);
        list[3] = (Animal)(list[0].clone());
        list[3].setWeight(7.5);
        list[4] = (Animal)(list[1].clone());

        java.util.Arrays.sort(list);

        for (Animal animal : list) {
            System.out.println("Weight: " + animal.getWeight());
            if (animal instanceof Edible) {
                ((Edible) animal).howToEat();
            } else {
                System.out.println(animal.sound());
            }
        }
    }
}

interface Edible {
    void howToEat();
}

abstract class Animal implements Comparable<Animal>, Cloneable {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Animal animal) {
        return Double.compare(this.weight, animal.weight);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "Cluck cluck";
    }

    @Override
    public void howToEat() {
        System.out.println("Fry it");
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Roar";
    }
}

abstract class Fruit implements Edible {
    public abstract void howToEat();
}

class Apple extends Fruit {
    @Override
    public void howToEat() {
        System.out.println("Wash and bite");
    }
}

class Orange extends Fruit {
    @Override
    public void howToEat() {
        System.out.println("Peel and eat");
    }
}
