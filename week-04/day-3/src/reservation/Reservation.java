package reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy{
    List<String> dow;

    public Reservation(){
        this.dow = new ArrayList<>();
        dow.add("MON");
        dow.add("TUE");
        dow.add("WED");
        dow.add("THU");
        dow.add("FRI");
        dow.add("SAT");
        dow.add("SUN");
    }

    @Override
    public String getDowBooking() {
        int randomNum = (int) (Math.random() * 7);
        return dow.get(randomNum);
    }

    @Override
    public String getCodeBooking() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < 8; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Booking# " + getCodeBooking() + "\033[31m for \033[0m" + getDowBooking();
    }
}
