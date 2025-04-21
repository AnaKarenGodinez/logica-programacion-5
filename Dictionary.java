import java.util.*;

public class Dictionary {
    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<>();

        dictionary.put("método", "method");
        dictionary.put("tal vez","perhaps");
        dictionary.put("objeto", "object");
        dictionary.put("interfaz", "interface");
        dictionary.put("excepción", "exception");
        dictionary.put("cadena de texto", "string");
        dictionary.put("algoritmo","algorithm");
        dictionary.put("compilador","compiler");
        dictionary.put("depuración", "debugging");
        dictionary.put("función", "function");
        dictionary.put("variable", "variable");
        dictionary.put("bucle", "loop");
        dictionary.put("base de datos", "database");
        dictionary.put("herencia", "inheritance");

        // Lista de claves
        List<String> claves = new ArrayList<>(dictionary.keySet());

        // Mezclar claves
        Collections.shuffle(claves);

        // Contadores
        int correctas = 0;
        int incorrectas = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            String clave = claves.get(i);
            System.out.println(clave + " -> ");
            String valor = scanner.nextLine();

            if (valor.equals(dictionary.get(clave))){
                correctas++;
            } else {
                incorrectas++;
            }

        }

        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);




    }// main
}//class
