public class TBejer1array {
    public static void main(String[] args) {
        int[] numeros = {3,6,8,0,4,9,9,2,5,6};

        //Bucles for
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]>numeros[i]){
                    int num = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = num;
                   
                }

                }
                    System.out.print(numeros[i]+" ");
                }
            }
        }
            
        
    //Ordena números de mayor a menor en un array.            