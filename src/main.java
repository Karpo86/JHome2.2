public class main {
    public static void main(String[] args) {
        int start_act = 100;
        int top_up_sum = 1300;
        System.out.println ("BALANCE");
        if (top_up_sum > 1000) {
            System.out.println (start_act + top_up_sum / 100 + top_up_sum);
        } else {
            System.out.println (start_act+top_up_sum);}
    }
}