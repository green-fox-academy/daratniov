public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsInADay = 60*60*24;
        int passedSeconds = currentHours*60*60 + currentMinutes*60 + currentSeconds;
        System.out.println("Remaining seconds today: " + (secondsInADay-passedSeconds));
    }
}