import java.util.Arrays;

public class User {
    private int id ;
    private Telephone telephone;
    private Document document;
    private Wallet wallet;


    public User(){}


    public User(int id, Telephone telephone, Document document, Wallet wallet) {
        this.id = id;
        this.telephone = telephone;
        this.document = document;
        this.wallet = wallet;
    }

    public User(int id, Document document) {
        this.id = id;
        this.document = document;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", telephone=" + telephone +
                ", document=" + document +
                ", wallet=" + wallet +
                '}';
    }
}
