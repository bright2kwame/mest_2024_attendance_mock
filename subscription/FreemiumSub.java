package subscription;

public class FreemiumSub extends BaseSub {
    private int allowedExtraDays;

    public FreemiumSub(SubEnum duration, int allowed) {
        super(duration);
        this.allowedExtraDays = allowed;
    }

}
