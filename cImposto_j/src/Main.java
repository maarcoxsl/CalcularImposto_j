
// fazer a versaõ 1 desse projeto
// preciso mais para frente porque esta dando erro colocar o codigo com duas casas decimais
void main(){
    ReceitaFictia v1 = new ReceitaFictia();
    var entradaUsuario = new Scanner(System.in);

    // Dados de cadastro
    System.out.println("Insira o seu nome");
    v1.contribuinte = entradaUsuario.nextLine();

    System.out.println("Insira a sua região");
    System.out.println();
    System.out.println("1) Norte");
    System.out.println("2) Sul");
    System.out.println("3) Leste");
    System.out.println("4) Oeste");
    v1.regiaoContribuinte = entradaUsuario.nextInt();

     switch(v1.regiaoContribuinte){
         case 1:{
             System.out.println("Região norte");
             System.out.println("Insira o seu salário mensal");
             v1.GetSalarioM(entradaUsuario.nextDouble());
             var guardaSA = v1.SalarioAnual();

             System.out.println("Seu salário anual: " + guardaSA );

             System.out.println("Quantos dependentes você possui ?\nInsira de 1 a 5");
             v1.dependentes = entradaUsuario.nextInt();
         }
         case 2:{
             System.out.println("Regiao sul");
             System.out.println("Quantos dependentes você possui ?\nInsira de 1 a 5");
             v1.dependentes = entradaUsuario.nextInt();
         }
         case 3:{
             System.out.println("Regiao leste");
             System.out.println("Quantos dependentes você possui ?\nInsira de 1 a 5");
             v1.dependentes = entradaUsuario.nextInt();
      }
      case 4:{
           System.out.println("Regiao Oeste");
           System.out.println("Quantos dependentes você possui ?\nInsira de 1 a 5");
           v1.dependentes = entradaUsuario.nextInt();
      }
   }
}

/*
     USAR DEPOIS SERÁ UTIL
    System.out.println("Qual é o seu tipo de rendimento\nDigite um desses 3 numeros referente ao seu tipo de rendimento");
    System.out.println("1 - Salário");
    System.out.println("2 - Autônomo");
    System.out.println("3 - Pensão alimentícia");
    var tipoRendimento = entradaUsuario.nextInt();


    PARTE DOS CASOS

     if (salarioAnual >= 0 && salarioAnual <= 22000.57 ) {
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
    */