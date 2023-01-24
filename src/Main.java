public class Main {
    public static void main(String[] args) {
        int mile = 20;
        int ticketPrice = 500;

        int miles;

        if (ticketPrice < 0) {
            System.out.println("Impossible");
        } else {
            miles = ticketPrice / mile;
            System.out.println("Количество миль:" + miles);
        }
    }
}
