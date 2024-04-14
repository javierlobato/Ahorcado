import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);            
        }

        while (!palabraAdivinada && intentos < intentosMax) {

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.print("Introduce una letra: ");
            char letra = Character.toLowerCase(sc.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }
                
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("letra incorrecta " + (intentosMax - intentos + " intentos."));
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades has adividando la palabra secreta: " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("GAME OVER ... NO ADIVINASTE LA PALABRA SECRETA");
        }

        sc.close();
    }
}
