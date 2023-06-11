package blackjack.entities;

public enum Suit {
    SPADE("Spades"), CLUB("Clubs"), DIAMOND("Diamonds"), HEART("Hearts");

    private final String niceName;

    Suit(String niceName) {
        this.niceName = niceName;
    }

    public String getNiceName() {
        return niceName;
    }

    @Override
    public String toString() {
        return niceName;
    }
}
