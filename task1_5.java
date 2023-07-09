//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class task1_5 {
    public static void main(String[] args) {
            TelephonBook telephonBook = new TelephonBook();
            telephonBook.addNote("Иванов", "+7(951)8390486");
            telephonBook.addNote("Васильев", "+7(911)4943934");
            telephonBook.addNote("Петрова", "+7(988)5944677");
            telephonBook.addNote("Иванов", "+7(950)5467899");
            telephonBook.addNote("Петрова", "+7(980)9467899");
            telephonBook.addNote("Петрова", "+7(959)5960899");
            telephonBook.addNote("Иванов", "+7(970)1467819");
            telephonBook.addNote("Иванов", "+7(999)5487819");


            System.out.println(telephonBook.findByName("Петрова"));
        }
    }
