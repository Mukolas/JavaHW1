public class Wallet {
    private String type;
    private int sum;
    private String valute;
    private boolean worked;

    public Wallet(){}

    public Wallet(String type, int sum, String valute, boolean worked) {
        this.type = type;
        this.sum = sum;
        this.valute = valute;
        this.worked = worked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getValute() {
        return valute;
    }

    public void setValute(String valute) {
        this.valute = valute;
    }

    public boolean isWorked() {
        return worked;
    }

    public void setWorked(boolean worked) {
        this.worked = worked;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "type='" + type + '\'' +
                ", sum=" + sum +
                ", valute='" + valute + '\'' +
                ", worked=" + worked +
                '}';
    }
}
