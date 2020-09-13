package homework3;

public class Task1 {
    static class Phone {
        long number;
        int model, weight;

        public Phone(int number, int model, int weight) {
            this(number, model);
            this.weight = weight;
        }

        public Phone(int number, int model) {
            this.number = number;
            this.model = model;
        }

        public Phone() {
        }

        public long getNumber() {
            return number;
        }

        public static void receiveCall(String name) {
            System.out.println("Звонит " + name);
        }

        public static void receiveCall(String name, long number) {
            System.out.println("Звонит " + name + ". Номер: " + number);
        }

        public static void sendMessage (long...numbers) {
            System.out.print("Номера: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println("Phone1. number: " + phone1.number + " model: " + phone1.model + " weight: " + phone1.weight);
        System.out.println("Phone2. number: " + phone2.number + " model: " + phone2.model + " weight: " + phone2.weight);
        System.out.println("Phone3. number: " + phone3.number + " model: " + phone3.model + " weight: " + phone3.weight);
        phone1.receiveCall("Иван");
        phone1.getNumber();
        phone2.receiveCall("Виталий");
        phone2.getNumber();
        phone3.receiveCall("Глеб");
        phone3.getNumber();
    }
}
