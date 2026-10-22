import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Diga uma quantidade de minutos: ");
        Scanner mn = new Scanner(System.in);
        Integer minutos = mn.nextInt();

        Integer horas = minutos / 60;
        Integer segundos = minutos % 60;

        System.out.format("%d Minutos são %d horas e %d segundos", minutos, horas, segundos);
    }
}