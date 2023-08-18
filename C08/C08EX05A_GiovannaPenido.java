package PRIMEIRO_SEMESTRE.C08;

import java.util.Scanner;
public class C08EX05A_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0, cont11 = 0, cont12 = 0, cont13 = 0, cont14 = 0, cont15 = 0, cont16 = 0, cont17 = 0, soma, soma1, soma2, soma3;
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Insira a codificação do seu candidato: ");
            int codCandidato = teclado.nextInt();
            if (codCandidato == 1) {
                cont1++;
            } else if (codCandidato == 2) {
                cont2++;
            } else if (codCandidato == 3) {
                cont3++;
            } else {
                cont4++;
            }
        }
        System.out.println("Fulano = " + cont1 + " votos" + "\nCiclano = " + cont2 + " votos" + "\nBeltrano = " + cont3 + " votos" +  "\nVotos Nulos = " + cont4 + " votos");
        soma = cont1 + cont2 + cont3;
        if (cont4 >= soma) {
            System.out.println("Devido ao fato dos votos nulos serem superiores aos votos válidos, ambas as eleições, incluindo a de segundo turno, estão anuladas!");
        } else if (cont1 > cont2 && cont1 > cont3 && cont1 > cont4) {
            System.out.println("Fulano venceu a eleição!");
        } else if (cont2 > cont3 && cont2 > cont1 && cont2 > cont4) {
            System.out.println("Ciclano venceu a eleição!");
        } else if (cont3 > cont2 && cont3 > cont1 && cont3 > cont4) {
            System.out.println("Beltrano venceu a eleição!");

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        } else if (cont1 == cont2 && cont1 == cont3) {
            System.out.println("Fulano = " + cont1 + " votos" + "\nCiclano = " + cont2 + " votos" + "\nBeltrano = " + cont3 + " votos" + "\nVotos Nulos = " + cont4 + " votos");
            System.out.println("Empate triplo, há necessidade de uma nova votação!");
            teclado.nextLine();
            for (int aux2 = 1; aux2 <= 10; aux2++) {
                System.out.print("Insira novamente a codificação do seu candidato: ");
                int codCandidatoET = teclado.nextInt();
                if (codCandidatoET == 1) {
                    cont5++;
                } else if (codCandidatoET == 2) {
                    cont6++;
                } else if (codCandidatoET == 3) {
                    cont7++;
                } else {
                    cont8++;
                }
                teclado.nextLine();
            }
            int somaST = cont5 + cont6 + cont7;
            if (cont5 > cont6 && cont5 > cont7 && cont5 > cont8) {
                System.out.println("Fulano venceu a eleição!");
            } else if (cont6 > cont5 && cont6 > cont7 && cont6 > cont8) {
                System.out.println("Ciclano venceu a eleição!");
            } else if (cont7 > cont5 && cont7 > cont6 && cont7 > cont8) {
                System.out.println("Beltrano venceu a eleição!");
            } else if (cont8 >= somaST) {
                System.out.println("Devido ao fato dos votos nulos serem superiores ou iguais aos votos válidos, a eleição está anulada!");
            }
            System.out.println("Fulano = " + cont5 + " votos" + "\nCiclano = " + cont6 + " votos" + "\nBeltrano = " + cont7 + " votos" +  "\nVotos Nulos = " + cont8 + " votos");

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        } else if (cont1 == cont2) {
            System.out.println("Devido ao empate entre os candidatos Fulano e Ciclano, há necessidade de uma nova votação!");
            System.out.println("Fulano = " + cont1 + " votos" + "\nCiclano = " + cont2 + " votos" + "\nBeltrano = " + cont3 +  " votos" + "\nVotos Nulos = " + cont4 + " votos");
            teclado.nextLine();
            for (int aux3 = 1; aux3 <= 10; aux3++) {
                System.out.print("Insira novamente a codificação do seu candidato: ");
                int codCandidatoE1 = teclado.nextInt();
                if (codCandidatoE1 == 1) {
                    cont9++;
                } else if (codCandidatoE1 == 2) {
                    cont10++;
                } else
                    cont11++;
                teclado.nextLine();
            }
            soma1 = cont9 + cont10;
            if (cont9 > cont10) {
                System.out.println("Fulano venceu a eleição!");

            } else if (cont10 > cont9) {
                System.out.println("Beltrano venceu a eleição!");
            } else if (cont11 > soma1) {
                System.out.println("Devido ao fato dos votos nulos serem superiores ou iguais aos votos válidos, a eleição está anulada!");
            }
            System.out.println("Fulano = " + cont9 + " votos" + "\nCiclano = " + cont10 + " votos" + "\nVotos Nulos = " + cont11 + " votos");

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        } else if (cont1 == cont3) {
            System.out.println("Devido ao empate entre os candidatos Fulano e Beltrano, há necessidade de uma nova votação!");
            System.out.println("Fulano = " + cont1 + " votos" + "\nCiclano = " + cont2 + " votos" + "\nBeltrano = " + cont3 + " votos" +  "\nVotos Nulos = " + cont4 + " votos");
            teclado.nextLine();
            for (int aux4 = 1; aux4 <= 10; aux4++) {
                System.out.print("Insira novamente a codificação do seu candidato: ");
                int codCandidatoE2 = teclado.nextInt();
                if (codCandidatoE2 == 1) {
                    cont12++;
                } else if (codCandidatoE2 == 3) {
                    cont13++;
                } else
                    cont14++;
                teclado.nextLine();
            }
            soma2 = cont12 + cont13;
            if (cont12 > cont13) {
                System.out.println("Fulano venceu a eleição!");
            } else if (cont13 > cont12) {
                System.out.println("Beltrano venceu a eleição!");
            } else if (cont14 > soma2) {
                System.out.println("Devido ao fato dos votos nulos serem superiores ou iguais aos votos válidos, a eleição está anulada!");
            }
            System.out.println("Fulano = " + cont12 + " votos" + "\nBeltrano = " + cont13 +  " votos" + "\nVotos Nulos = " + cont14 + " votos");

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        } else if (cont2 == cont3) {
            System.out.println("Devido ao empate entre os candidatos Ciclano e Beltrano, há necessidade de uma nova votação!");
            System.out.println("Fulano = " + cont1 + " votos" + "\nCiclano = " + cont2 + " votos" + "\nBeltrano = " + cont3 +  " votos" + "\nVotos Nulos = " + cont4 + " votos");
            teclado.nextLine();
            for (int aux5 = 1; aux5 <= 10; aux5++) {
                System.out.print("Insira novamente a codificação do seu candidato: ");
                int codCandidatoE3 = teclado.nextInt();
                if (codCandidatoE3 == 2) {
                    cont15++;
                } else if (codCandidatoE3 == 3) {
                    cont16++;
                } else
                    cont17++;
                teclado.nextLine();
            }
            soma3 = cont15 + cont16;
            if (cont15 > cont16) {
                System.out.println("Ciclano venceu a eleição!");
            } else if (cont16 > cont15) {
                System.out.println("Beltrano venceu a eleição!");
            } else if (cont17 > soma3) {
                System.out.println("Devido ao fato dos votos nulos serem superiores ou iguais aos votos válidos, a eleição está anulada!");
            }
            System.out.println("Ciclano = " + cont15 + " votos" + "\nBeltrano = " + cont16 + " votos" + "\nVotos Nulos = " + cont17 + " votos");
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        teclado.close();
    }
}





