public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int mile = 20;
        int miles = ticketPrice / mile;
        return miles;
    }

}
