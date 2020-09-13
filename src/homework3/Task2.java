package homework3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Task2 {
    static class Animal {
        String food, location;

        public void makeNoise() {
            System.out.println("Животное шумит");
        }

        public void eat() {
            System.out.println("Животное ест " + food);
        }

        public void sleep() {
            System.out.println("Животное спит");
        }


    }

    static class Dog extends Animal {
        public Dog() {
            food = "Кость";
            location = "Будка";
        }


        @Override
        public void eat() {
            System.out.println("Собака ест " + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("Гав-Гав");

        }
    }

    static class Cat extends Animal {
        public Cat() {
            food = "Вискас";
            location = "Диван";
        }

        @Override
        public void eat() {
            System.out.println("Кошка ест " + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("Мяу-Мяу");

        }
    }

    static class Horse extends Animal {
        public Horse() {
            food = "Овес";
            location = "Стойло";
        }

        @Override
        public void eat() {
            System.out.println("Лошадь ест " + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("И-го-го");

        }
    }

    public static class Veterinar {
        public void treatAnimal(Animal animal) {
            System.out.println("Еда : " + animal.food);
            System.out.println("Среда обитания : " + animal.location);

        }
    }

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Horse()};
        Veterinar veterinar = new Veterinar();
        for (int i = 0; i < animals.length; i++) {
            veterinar.treatAnimal(animals[i]);
            animals[i].eat();
            animals[i].makeNoise();
        }

    }
}
