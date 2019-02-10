public class CowsAndBulls {
    int[] randomNumbers = new int[4];
    boolean playing = false;
    boolean finished = false;
    int countGuess = 0;
    int cows = 0;
    int bulls = 0;

    public CowsAndBulls() {
        playing = true;
        finished = false;
        randomNum();
    }

    public int[] randomNum() {
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = ((int) (Math.random() * 10));
        }
        return randomNumbers;
    }

    public void guess(int first, int second, int third, int fourth) {
        int[] guessedNumbers = new int[4];
        guessedNumbers[0] = first;
        guessedNumbers[1] = second;
        guessedNumbers[2] = third;
        guessedNumbers[3] = fourth;

        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers.length; j++) {
                if (guessedNumbers[i] == randomNumbers[i]) {
                    bulls += 1;
                    break;
                }
                else if (guessedNumbers[i] == randomNumbers[j]) {
                    cows += 1;
                }
            }
        }
        countGuess += 1;
        System.out.println("Round: " + countGuess + "\nBulls: " + bulls + "\nCows: " + cows);

        if (bulls == 4) {
            playing = false;
            finished = true;
            System.out.println("Congratulation, you guessed it!");
        }
        bulls = 0;
        cows = 0;

    }


}
