package docrob;

public class FloatDemo {
    public static void main(String[] args) {
        double money = 0f;

        for (int i = 0; i < 50; i++) {
            money += 0.10f;
            System.out.println(money);
        }

        System.out.println(money);
    }
}
