import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Bem vindo ao programa de média, informe suas 4 notas bimestrais!");

        //Ação do usuario: informar 4 notas do bimestre
        Scanner teclado = new Scanner(System.in);
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();
        nota4 = teclado.nextDouble();
        teclado.close();

        //Tarefa do programa: Calcular a media.

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Resposta do programa

        System.out.println("A média é ");
        System.out.println(media);

        



    }
    
}
