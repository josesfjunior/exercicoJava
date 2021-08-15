import java.util.Scanner;

public class Grupo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qunatidade = 0;
        int idade =0;
        int maiorIdade=0;
        int menorIdade=0;
        double media = 0;
        int todasAsIdades= 0;
        System.out.println("Quantas pessoas tem no grupo?");
        qunatidade = input.nextInt();

        for(int i = 1; i<=qunatidade; i++ ){
            System.out.println("Digite a idade da " + i + "ª pessoa do grupo");
            idade = input.nextInt();
            if(idade >= maiorIdade){
                maiorIdade = idade;
            };
            if(idade <= menorIdade){
                menorIdade = idade;
            }
            todasAsIdades += idade;
        };
        media = todasAsIdades/qunatidade;
        System.out.println("A maior Idade foi : " + maiorIdade );
        System.out.println("A menor Idade foi : " + menorIdade);
        System.out.println("A média das Idades forãm :" + media);
    }
}
