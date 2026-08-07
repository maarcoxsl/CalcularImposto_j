
// fazer a versaõ 1 desse projeto
void main(){
    var entradaUsuario = new Scanner(System.in);

    System.out.println("Olá!! insira o seu nome");
    var nomeUsuario = entradaUsuario.nextLine();

    System.out.println(nomeUsuario + " " + "Insita quanto é o seu salario mensal");
    var salarioMensal = entradaUsuario.nextDouble();
    var salarioAnual = salarioMensal * 12;

    System.out.println("Quantos dependentes você possui ?\nInsira de 1 a 5");
    var dependentes = entradaUsuario.nextInt();
    var comDependente = salarioAnual - (dependentes * 1500);


    if (salarioAnual >= 0 && salarioAnual <= 22000.57){
        System.out.println("Numero de dependentes :" + dependentes);
        System.out.println(nomeUsuario + "," + " " + "você está insento de pagar imposto de renda");
        System.out.println("Imposto de renda devido: " + " " + comDependente);
    } else if (salarioAnual >= 33919.30 && salarioAnual <= 45012.60){
        var totalPagar = salarioAnual * 0.75;
        System.out.println("Numero de dependentes :" + dependentes);
        System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
        System.out.println("Imposto de renda devido: " + totalPagar);

    } else if (salarioAnual >= 45012.60 && salarioAnual <= 55976.16){
        var totalPagar1 = salarioAnual * 2.25;
        System.out.println("Numero de dependentes :" + dependentes);
        System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
        System.out.println("Imposto de renda devido: " + " " + totalPagar1);

    } else if (salarioAnual > 55976.16){
        var totalPagar2 = salarioAnual * 2.75;
        System.out.println("Numero de dependentes :" + dependentes);
        System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
        System.out.println("Imposto de renda devido: " + " " + totalPagar2);
    } else {
        System.out.println("Codigo invalido !!!");
    }



}