public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMintues = 34;
        int currentSeconds = 42;
        int secondsPerDay = 24 * 60 * 60;

        currentHours = currentHours * 60 * 60;
        System.out.println(currentHours);
        currentMintues = currentMintues * 60;
        System.out.println(currentMintues);
        System.out.println(secondsPerDay);

        System.out.println(secondsPerDay - (currentHours + currentMintues + currentSeconds));

    }
}
