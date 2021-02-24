public class Telephone {
    private String type;
    private int number;
    private String mark;
    private boolean bateryOn;

    public Telephone() {
    }

    public Telephone(String type, int number, String mark, boolean bateryOn) {
        this.type = type;
        this.number = number;
        this.mark = mark;
        this.bateryOn = bateryOn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public boolean isBateryOn() {
        return bateryOn;
    }

    public void setBateryOn(boolean bateryOn) {
        this.bateryOn = bateryOn;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "type='" + type + '\'' +
                ", number=" + number +
                ", mark='" + mark + '\'' +
                ", bateryOn=" + bateryOn +
                '}';
    }
}
