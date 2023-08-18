package PRIMEIRO_SEMESTRE.C06;

import java.util.Scanner;
public class C06EX13_GiovannaPenido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira as horas que o jogo começou (sem os minutos): ");
        int horaInicio = teclado.nextInt();
        System.out.print("Insira quais eram os minutos quando o jogo começou (sem as horas): ");
        int minutosInicio = teclado.nextInt();
        System.out.print("Insira as que horas que o jogo terminou (sem os minutos): ");
        int horaFim = teclado.nextInt();
        System.out.print("Insira quais eram os minutos quando o jogo terminou (sem as horas): ");
        int minutosFim = teclado.nextInt();
        int subH = horaFim - horaInicio;
        int subM = minutosFim - minutosInicio;
        if(subH == 1 && subM == 0) {
            System.out.println("O jogo durou uma hora.");
        } else {
            if(subH > 1 && subM == 0) {
                System.out.println("O jogo durou "+subH+" horas.");
            } else {
                if(subH > 1 && subM > 1) {
                    System.out.println("O jogo durou "+subH+" horas e "+subM+" minutos.");
                } else {
                    if(subH > 1 && subM == 1) {
                        System.out.println("O jogo durou "+subH+" horas e 1 minuto.");
                    } else {
                        if(subH == 0 && subM > 1) {
                            System.out.println("O jogo durou "+subM+" minutos.");
                        } else {
                            if (subH == 0 && subM == 1) {
                                System.out.println("O jogo durou um minuto.");
                            } else {
                                if(subH == 0 && subM == 0) {
                                    System.out.println("Reinicie o programa e insira os horários corretos.");
                                } else {
                                    if( subM < 0 ) {
                                        subH = (horaFim - horaInicio) - 1;
                                        subM = (minutosFim + 60) - minutosInicio;
                                        System.out.println("O jogo durou "+subH+" horas e "+subM+" minutos.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
