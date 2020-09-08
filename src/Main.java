import com.zuitt.app.Pencil;

public class Main {
    public static void main(String[] args) {
        Pencil pencil = new Pencil();

        pencil.write("The quick brown fox");
        pencil.getRemainingWritable();
        pencil.erase("Grumpy old wizards");
        pencil.getRemainingErasable();
    }
}
