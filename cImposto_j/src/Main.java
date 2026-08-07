
// fazer a versaõ 1 desse projeto
void main(){
    var entradaUsuario = new Scanner(System.in);

    System.out.println("Insira a sua idade");
    var idadeUsuario = entradaUsuario.nextInt();

    System.out.println("Insira quanto é o seu salario mensal");
    var salarioMensal = entradaUsuario.nextDouble();
    var salarioAnual = salarioMensal * 12;

    System.out.println("Quantos dependentes você possui ?\nInsira de 1 a 5");
    var dependentes = entradaUsuario.nextInt();
    var comDependente = salarioAnual - (dependentes * 1500);

    System.out.println("Qual é o seu tipo de rendimento\nDigite um desses 3 numeros referente ao seu tipo de rendimento");
    System.out.println("1 - Salário");
    System.out.println("2 - Autônomo");
    System.out.println("3 - Pensão alimentícia");
    var tipoRendimento = entradaUsuario.nextInt();

switch(tipoRendimento) {
    case 1: {
        if (salarioAnual >= 0 && salarioAnual <= 22000.57 && idadeUsuario >= 0  && idadeUsuario < 18) {
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("você está insento de pagar imposto de renda");
            System.out.println("Imposto de renda devido: " + " " + comDependente);
            System.out.println("Seguindo as regras normais");
        } else if (salarioAnual >= 33919.30 && salarioAnual <= 45012.60) {
            var totalPagar = salarioAnual * 0.75;
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
            System.out.println("Imposto de renda devido: " + totalPagar);
            System.out.println("Seguindo as regras normais");

        } else if (salarioAnual >= 45012.60 && salarioAnual <= 55976.16) {
            var totalPagar1 = salarioAnual * 2.25;
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
            System.out.println("Imposto de renda devido: " + " " + totalPagar1);
            System.out.println("Seguindo as regras normais");

        } else if (salarioAnual > 55976.16) {
            var totalPagar2 = salarioAnual * 2.75;
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
            System.out.println("Imposto de renda devido: " + " " + totalPagar2);
            System.out.println("Seguindo as regras normais");
        } else {
            System.out.println("Codigo invalido !!!");
        }
    }
    case 2: {
        if (salarioAnual >= 0 && salarioAnual <= 22000.57) {
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("você está insento de pagar imposto de renda");
            System.out.println("Imposto de renda devido: " + " " + comDependente);
        } else if (salarioAnual >= 33919.30 && salarioAnual <= 45012.60) {
            var totalPagar = salarioAnual * 0.75;
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
            System.out.println("Imposto de renda devido: " + totalPagar);

        } else if (salarioAnual >= 45012.60 && salarioAnual <= 55976.16) {
            var totalPagar1 = salarioAnual * 2.25;
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
            System.out.println("Imposto de renda devido: " + " " + totalPagar1);

        } else if (salarioAnual > 55976.16) {
            var totalPagar2 = salarioAnual * 2.75;
            System.out.println("Numero de dependentes :" + dependentes);
            System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
            System.out.println("Imposto de renda devido: " + " " + totalPagar2);
        } else {
            System.out.println("Codigo invalido !!!");
        }

    }
   case 3: {
       if (salarioAnual >= 0 && salarioAnual <= 22000.57) {
           System.out.println("Numero de dependentes :" + dependentes);
           System.out.println("você está insento de pagar imposto de renda");
           System.out.println("Imposto de renda devido: " + " " + comDependente);
       } else if (salarioAnual >= 33919.30 && salarioAnual <= 45012.60) {
           var totalPagar = salarioAnual * 0.75;
           System.out.println("Numero de dependentes :" + dependentes);
           System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
           System.out.println("Imposto de renda devido: " + totalPagar);

       } else if (salarioAnual >= 45012.60 && salarioAnual <= 55976.16) {
           var totalPagar1 = salarioAnual * 2.25;
           System.out.println("Numero de dependentes :" + dependentes);
           System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
           System.out.println("Imposto de renda devido: " + " " + totalPagar1);

       } else if (salarioAnual > 55976.16) {
           var totalPagar2 = salarioAnual * 2.75;
           System.out.println("Numero de dependentes :" + dependentes);
           System.out.println("Imposto de renda devido com dependentes: " + " " + comDependente);
           System.out.println("Imposto de renda devido: " + " " + totalPagar2);
       } else {
           System.out.println("Codigo invalido !!!");
       }
   }
}


}