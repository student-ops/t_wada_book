package money;

public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public void printAmount() { // 返り値をvoidに変更
        System.out.println(amount);
    }
}
