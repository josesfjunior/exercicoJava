import java.util.Scanner;

public class Emrpesa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade = 30;
        double salario;
        double maiorSalrio=0;
        double menorSalario=0;
        double totalDeSalarios=0;
        double media =0;
        for(int i = 1; i<=quantidade; i++ ){
            System.out.println("Digite o salario do " + i +"º funcionario");
           salario = input.nextDouble();
           if(salario >= maiorSalrio){
               maiorSalrio = salario;
           };
           if(salario <= menorSalario){
               menorSalario = salario;
           };
           totalDeSalarios += salario;
    };
    media = totalDeSalarios/quantidade;
    System.out.println("O maior salario foi : " + maiorSalrio);
    System.out.println("O menor salario foi : " + menorSalario);
    System.out.println("A média de salarios é de : " + media);

}

}
