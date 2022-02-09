package java_basics.aula20;

public class Matrizes3Dimensões {
    public static void main(String[] args) {

        int[][][] matrizTridimensional = new int[3][3][3];

        // Atribuir a soma dos indices para o indice
        for(int i=0; i<matrizTridimensional.length; i++){
            for (int j=0; j<matrizTridimensional[i].length; j++){
                for( int k=0; k<matrizTridimensional[i].length; k++){
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for(int i=0; i<matrizTridimensional.length; i++){
            for (int j=0; j<matrizTridimensional[i].length; j++){
                for( int k=0; k<matrizTridimensional[i].length; k++){
                    soma += matrizTridimensional[i][j][k] = i + j + k;

                    if ( matrizTridimensional[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimensional[i][j][k];
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }

                    }

                }
            }

            System.out.println("Soma total = " + soma);
        System.out.println("Soma pares = " + somaPares);
        System.out.println("Soma Impares = " + somaImpares);

        }
}
