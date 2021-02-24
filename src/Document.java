public class Document {
    private String name;
    private String surname;
    private int yearborn;
    private boolean visa;

    public Document() {
    }

    public Document(String name, String surname, int yearborn, boolean visa) {
        this.name = name;
        this.surname = surname;
        this.yearborn = yearborn;
        this.visa = visa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearborn() {
        return yearborn;
    }

    public void setYearborn(int yearborn) {
        this.yearborn = yearborn;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearborn=" + yearborn +
                ", visa=" + visa +
                '}';
    }
}
