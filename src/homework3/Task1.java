package homework3;

public class Task1 {
    public static class Phone {
        int number, weight;
        String model;

        public Phone(int number, String model, int weight) {
            this(number, model);
            this.weight = weight;
        }

        public Phone(int number, String model) {
            this.number = number;
            this.model = model;
        }

        public Phone() {
        }

        public int getNumber() {
            return number;
        }

        public static void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        public static void receiveCall(String name, int number) {
            System.out.println("Звонит " + name + ". Номер: " + number);
        }

        public static void sendMessage(int... numbers) {
            System.out.print("Номера: ");
            for (int value : numbers) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(123, "222sdf", 777);
        Phone phone2 = new Phone(22, "33sdfsdf");
        Phone phone3 = new Phone();
        System.out.println("Phone1. number: " + phone1.number + " model: " + phone1.model + " weight: " + phone1.weight);
        System.out.println("Phone2. number: " + phone2.number + " model: " + phone2.model + " weight: " + phone2.weight);
        System.out.println("Phone3. number: " + phone3.number + " model: " + phone3.model + " weight: " + phone3.weight);

        phone1.receiveCall("Иван");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Виталий");
        phone2.getNumber();
        phone3.receiveCall("Глеб");
        phone3.getNumber();
        phone1.receiveCall("Кифир", 55555);
        phone1.sendMessage(123, 123123, 123412515);

    }
}
