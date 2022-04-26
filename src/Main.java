public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int income = 1100;

        int border = 1000;
        int bonus;

        if (income > border) {
            bonus = income / 100;
        } else {
            bonus = 0;
        }

        balance = balance + income + bonus;
        System.out.println("Итоговый счёт: " + balance + " рублей. Бонусных рублей: " + bonus);
    }
}
