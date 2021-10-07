public class Main {
    public static void main(String[] args) {
        int startSum = 100;
        int refill = 300;
        int bonusRub = 100;
        int bonus;
        int total;
        if (refill > 1000) {

            bonus = refill / bonusRub;
            total = startSum + refill + bonus;
            System.out.println("Баланс счета" + total + "руб.");
            System.out.println("Начислено бонусов" + bonus);
        } else {
            total = startSum + refill;
            System.out.println("Баланс счета" + total + "руб.");
            System.out.println("Бонусы для начисления отсутствуют");

        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
