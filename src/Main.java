import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> tabela =
                new Hashtable<String, ArrayList<String>>();

        ArrayList<String> AliceVizinhos
                = new ArrayList<String>();
        AliceVizinhos.add("Peggy");

        ArrayList<String> BobVizinhos
                = new ArrayList<String>();
        BobVizinhos.add("Anuj");
        BobVizinhos.add("Peggy");

        ArrayList<String> ClaireVizinhos
                = new ArrayList<String>();
        ClaireVizinhos.add("Jonny");
        ClaireVizinhos.add("Thom");

        ArrayList<String> GabrielVizinhos
                = new ArrayList<String>();
        GabrielVizinhos.add("Alice");
        GabrielVizinhos.add("Bob");
        GabrielVizinhos.add("Claire");

        tabela.put("Alice", AliceVizinhos);
        tabela.put("Bob", BobVizinhos);
        tabela.put("Claire", ClaireVizinhos);
        tabela.put("Gabriel", GabrielVizinhos);

        for (Map.Entry<String, ArrayList<String>> entry : tabela.entrySet()){
            String chave = entry.getKey();
            ArrayList<String> dados = entry.getValue();

            System.out.println("Chave: " + chave + " Dados: " + dados);
        }
    }
}