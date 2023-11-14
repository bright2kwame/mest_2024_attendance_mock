package subscription;

public enum SubEnum {
    THREE_DAYS(3),
    SEVEN_DAYS(7),
    FIFTEEN_DAYS(15),
    TWENTY_EIGHT_DAYS(28);

    private final int value;

    SubEnum(int days) {
        this.value = days;
    }
}