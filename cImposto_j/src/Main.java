// Implementações a fazer
// area de login
// Melhora de calcular o imposto
// Possivel mudança no que faz a classe receita ficticia
// Mudança de como faz para se aplicar a regiao
// area reservada somente ao usuario
// banco de dados com Arquivos
// Possivel inserção do jbdc
// Regras de negocio
void main(){
    ReceitaFictia v1 = new ReceitaFictia();
    Contribuinte cont1 = new Contribuinte();
    var entradaUsuario = new Scanner(System.in);

    // Dados de cadastro
    try {
        System.out.println("Insira o seu nome: ");
        v1.nomeC = v1.ValidaNome(entradaUsuario.next());
    }catch(Exception e) {
        System.out.println("Insira o seu Idade");
    }
    try {
        //v1.idadeC = entradaUsuario.nextInt();
        v1.idadeC = v1.ValidarIdade(entradaUsuario.nextInt());
    } catch (Exception e) {
        System.out.println("Erro ao tentar validar o seu nome");
    }

    // em minha opnião para eu adicionar uma regra de negocio aqui a implementação para regiões tem que mudar
    System.out.println("Insira a sua região");
    System.out.println();
    System.out.println("1) Norte");
    System.out.println("2) Sul");
    System.out.println("3) Leste");
    System.out.println("4) Oeste");
    v1.regiaoC = entradaUsuario.nextInt();


     // mudanças podem acontecer aqui ...
     switch(cont1.regiaoC){
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

