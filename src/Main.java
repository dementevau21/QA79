//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int ticketPrice = 5000; //стоимость билета

        int rubles = 20; //кол-во рублей для одной бонусной мили

        int bonus = ticketPrice / rubles;
        System.out.println("Итоговый бонус:" + bonus);


    }
}