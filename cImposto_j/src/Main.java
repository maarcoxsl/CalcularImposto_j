
// fazer a versaõ 1 desse projeto
void main(){
    var entradaUsuario = new Scanner(System.in);

    System.out.println("Olá!! insira o seu nome");
    var nomeUsuario = entradaUsuario.nextLine();

    System.out.println(nomeUsuario + " " + "Insita quanto é o seu salario mensal");
    var salarioMensal = entradaUsuario.nextDouble();
    var salarioAnual = salarioMensal * 12;

    if (salarioAnual >= 0 && salarioAnual <= 22000.57){
        System.out.println(nomeUsuario + "," + " " + "você está insento de pagar imposto de renda");
    } else if (salarioAnual >= 33919.30 && salarioAnual <= 45012.60){
        var totalPagar = salarioAnual * 0.75;
        System.out.println("Total a pagar de imposto de renda: " + totalPagar);
    } else if (salarioAnual >= 45012.60 && salarioAnual <= 55976.16){
        var totalPagar1 = salarioAnual * 2.25;
        System.out.println(nomeUsuario + "," + "Total a pagar de imposto de renda: " + totalPagar1);

    } else if (salarioAnual > 55976.16){
        var totalPagar2 = salarioAnual * 2.75;
        System.out.println( nomeUsuario+","+"Total a pagar de imposto de renda: " + totalPagar2);
    } else {
        System.out.println("Codigo invalido !!!");
    }



}