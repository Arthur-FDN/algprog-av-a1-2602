import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
        String Acucar = "Acucar", Cacau = "Cacau", Cafe = "Cafe", Algodão = "Algodão", Validaçao;
        Double Cotaçao,Cotaçao_Projetada;
        int Perda;
        Scanner escreve = new Scanner(System.in);
        System.out.print("Digite o nome da commodity (Acucar, Cacau, Cafe ou Algodao): ");
        Validaçao=escreve.next();

        if(Validaçao.equals(Acucar)){
        System.out.print("Digite a cotação atual do contrato (valor positivo): ");
        Cotaçao= escreve.nextDouble();
        if(Cotaçao<0){
             System.out.println("     [ERRO] ");
            System.out.println("Valor menor que 0. ");
            System.out.print("Digite a cotação atual do contrato (valor positivo): ");
            Cotaçao= escreve.nextDouble();
        }
        System.out.print("Digite a perda estimada de safra (em pontos percentuais inteiros) devido ao clima (valor entre 0 e 100): ");
        Perda=escreve.nextInt();
        Cotaçao_Projetada=Cotaçao+(Perda*0.10);
        System.out.println("==============================");
        System.out.print("Nome da commodity: "+ Acucar);
        System.out.println("");
         if(Perda<0 || Perda>100){
            System.out.println("                [ERRO] ");
            System.out.println("Percentual de perda de safra invalido. ");
        }
        else{
            System.out.println("A cotação projetada calculada e: "+ Cotaçao_Projetada);
        }
        if(Cotaçao>50.00 && Perda>15){
            System.out.println("[ALERTA DE ALTA VOLATILIDADE]");
        }
        }
        if(Validaçao.equals(Cacau)){
        System.out.print("Digite a cotação atual do contrato (valor positivo): ");
        Cotaçao= escreve.nextDouble();
        if(Cotaçao<0){
             System.out.println("     [ERRO] ");
            System.out.println("Valor menor que 0. ");
            System.out.print("Digite a cotação atual do contrato (valor positivo): ");
            Cotaçao= escreve.nextDouble();
        }
        System.out.print("Digite a perda estimada de safra (em pontos percentuais inteiros) devido ao clima (valor entre 0 e 100): ");
        Perda=escreve.nextInt();
        Cotaçao_Projetada=Cotaçao+(Perda*0.10);
        System.out.println("==============================");
        System.out.print("Nome da commodity: "+ Cacau);
        System.out.println("");
         if(Perda<0 || Perda>100){
            System.out.println("                [ERRO] ");
            System.out.println("Percentual de perda de safra invalido. ");
        }
        else{
            System.out.println("A cotação projetada calculada e: "+ Cotaçao_Projetada);
        }
        if(Cotaçao>50.00 && Perda>15){
            System.out.println("[ALERTA DE ALTA VOLATILIDADE]");
        }
        }
        if(Validaçao.equals(Cafe)){
            System.out.print("Digite a cotação atual do contrato (valor positivo): ");
        Cotaçao= escreve.nextDouble();
        if(Cotaçao<0){
             System.out.println("     [ERRO] ");
            System.out.println("Valor menor que 0. ");
            System.out.print("Digite a cotação atual do contrato (valor positivo): ");
            Cotaçao= escreve.nextDouble();
        }
        System.out.print("Digite a perda estimada de safra (em pontos percentuais inteiros) devido ao clima (valor entre 0 e 100): ");
        Perda=escreve.nextInt();
        Cotaçao_Projetada=Cotaçao+(Perda*0.10);
        System.out.println("==============================");
        System.out.print("Nome da commodity: "+ Cafe);
        System.out.println("");
         if(Perda<0 || Perda>100){
            System.out.println("                [ERRO] ");
            System.out.println("Percentual de perda de safra invalido. ");
        }
        else{
            System.out.println("A cotação projetada calculada e: "+ Cotaçao_Projetada);
        }
        if(Cotaçao>50.00 && Perda>15){
            System.out.println("[ALERTA DE ALTA VOLATILIDADE]");
        }
        }
        if(Validaçao.equals(Algodão)){
            System.out.print("Digite a cotação atual do contrato (valor positivo): ");
        Cotaçao= escreve.nextDouble();
        if(Cotaçao<0){
             System.out.println("     [ERRO] ");
            System.out.println("Valor menor que 0. ");
            System.out.print("Digite a cotação atual do contrato (valor positivo): ");
            Cotaçao= escreve.nextDouble();
        }
        System.out.print("Digite a perda estimada de safra (em pontos percentuais inteiros) devido ao clima (valor entre 0 e 100): ");
        Perda=escreve.nextInt();
        Cotaçao_Projetada=Cotaçao+(Perda*0.10);
        System.out.println("==============================");
        System.out.print("Nome da commodity: "+ Algodão);
        System.out.println("");
         if(Perda<0 || Perda>100){
            System.out.println("                [ERRO] ");
            System.out.println("Percentual de perda de safra invalido. ");
        }
        else{
            System.out.println("A cotação projetada calculada e: "+ Cotaçao_Projetada);
        }
        if(Cotaçao>50.00 && Perda>15){
            System.out.println("[ALERTA DE ALTA VOLATILIDADE]");
        }
        }
        escreve.close();



    }
}
