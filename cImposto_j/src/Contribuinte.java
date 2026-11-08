public class Contribuinte extends  ReceitaFictia {
   final double salarioAnual = GetSalarioM() ;
   final double salarioMensal = GetSalarioAnual();



   void InfoUsuario(){
       System.out.println("===== Informações do contribuinte =====");
       System.out.println("Nome: "+  nomeC);
       System.out.println("Idade: "+ idadeC);
       System.out.println("Regiao: "+ regiaoC);
       System.out.println("DescricaoContribuite: ");
       System.out.println("Salario mensal: " +  salarioMensal );
       System.out.println("Salario anual: " +  salarioAnual );
   }


}
