package java17.newSwitch;

enum Status { OPEN, WIP, REVIEW,FIX, CLOSE; }
public class SwitchJava17 {

    public int numberOfLetters;
    public void printNumberOfLetters() {
        Status status = Status.CLOSE;
        switch (status) {
            case WIP:
            case FIX:
                numberOfLetters = 3;
                break;
            case OPEN:
                numberOfLetters = 4;
                break;
            case CLOSE:
                numberOfLetters = 5;
                break;
            case REVIEW:
                numberOfLetters = 6;
                break;
            default:
                throw new IllegalStateException("Invalid status: " + status);
        }
        System.out.println(numberOfLetters);
    }

    // same in Java17
    public void printNumberOfLettersSwitchPattern() {
        Status status = Status.CLOSE;
        System.out.println(
                switch (status) {
                    //case null -> System.out.println("Encountered null!");
                    case WIP,FIX -> 3;
                    case OPEN -> 4;
                    case CLOSE -> 5;
                    default ->throw new IllegalStateException("Invalid status: " + status);
                }
        );
    }

}
