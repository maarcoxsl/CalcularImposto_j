
// fazer a versaõ 1 desse projeto
// preciso mais para frente porque esta dando erro colocar o codigo com duas casas decimais
void main(){
    ReceitaFictia v1 = new ReceitaFictia();
    var entradaUsuario = new Scanner(System.in);

    // Dados de cadastro
    System.out.println("Insira o seu nome");
    v1.nomeContribuite= entradaUsuario.nextLine();

    System.out.println("Insira a sua região");
    System.out.println();
    System.out.println("1) Norte");
    System.out.println("2) Sul");
    System.out.println("3) Leste");
    System.out.println("4) Oeste");
    var escolhaUser = entradaUsuario.nextInt();

     switch(escolhaUser){
         case 1:{
             System.out.println("Região norte");
             System.out.println("Insira o seu salário mensal");
             v1.SetSalarioM(entradaUsuario.nextDouble());
             var guardaSA = v1.SalarioAnual();

             System.out.println("Total de impostos a pagar");
             v1.DescontoNorte();
             System.out.println("Seu salário anual: " + guardaSA );
             v1.DescontoNorte();
             break;
         }
         case 2:{
             System.out.println("Regiao sul");
             System.out.println("Insira o seu salário mensal");
             v1.SetSalarioM(entradaUsuario.nextDouble());
             var guardaSA = v1.SalarioAnual();

             System.out.println("Total de impostos a pagar");
             v1.DescontoSul();
             System.out.println("Salario Anual: " + guardaSA);
             break;

         }
         case 3:{
             System.out.println("Regiao leste");

             System.out.println("Insira o seu salário mensal");
             v1.SetSalarioM(entradaUsuario.nextDouble());
             var guardaSA = v1.SalarioAnual();

             System.out.println("Total de impostos a pagar");
             v1.DescontoLeste();
             System.out.println("Salario Anual: " + guardaSA);
             break;
      }
         case 4:{
            System.out.println("Regiao Oeste");

             System.out.println("Insira o seu salário mensal");
             v1.SetSalarioM(entradaUsuario.nextDouble());
             var guardaSA = v1.SalarioAnual();

             System.out.println("Total de impostos a pagar");
             v1.DescontoOeste();
             System.out.println("Salario Anual: " + guardaSA);
             break;

      }
   }
}

