public class TBejer2array {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8};
        int[] array2 = {3, 4, 1, 0};
        int[] array3 = {9, 9, 4, 6};

        //Suma los arrays
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] + array2[i] + array3[i];
        }

        //Imprime los resultados.
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
            }       
           
            }
        }

        
    // Array que hace sumas posición por posición.