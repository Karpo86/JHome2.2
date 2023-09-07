public class Main {
    public static void main(String[] args) {
        int startAct = 100;
        int topUpSum = 1300;
        System.out.println("BALANCE");
        if (topUpSum > 1000) {
            System.out.println(startAct + topUpSum / 100 + topUpSum);
        } else {
            System.out.println(startAct + topUpSum);
        }
    }
}