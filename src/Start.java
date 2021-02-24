import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Wallet wallet= new Wallet("lethert",10000,"$",true);
        Document document = new Document("Antonino","Festto",1879,true);
        Telephone telephone = new Telephone("Smartfone",228339,"Samsung",false);
        User userOne = new User(1,telephone,document,wallet);
        User userTwo = new User(2,document);
        System.out.println(userOne);
        System.out.println(userOne.getId()+" "+userOne.getDocument().getName()+" "+userOne.getDocument().getSurname());
        System.out.println("number: "+userOne.getTelephone().getNumber());
        System.out.println(" ");
        System.out.println(userTwo);
    }
}
