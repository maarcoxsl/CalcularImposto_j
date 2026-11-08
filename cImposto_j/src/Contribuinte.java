public class Contribuinte extends  ReceitaFictia {
    public String nomeC;
    public int idadeC;
    public int regiaoC;
    public boolean dependentesC;
    //  public double salarioM;
    //  public double salarioA (consequencia do salario mensal)



    public String ValidaNome(String nomeCorreto){
        nomeC = nomeCorreto;
        if(nomeC.length() < 3){
            throw new IllegalArgumentException("Tentativa de nome invalido !!!");
        }
        return nomeC;
    }

    public int ValidarIdade(int idade){
        idadeC = idade;
        if(idadeC < 18 || idadeC > 99) {
            throw new IllegalArgumentException("Idade Invalida. Tente novamente");
        }
        return idadeC;
    }

    public boolean Dependentes(boolean dependentes){
        dependentesC = dependentes;

        if(dependentes == 0 ) return false;
        return  true;
    }

   void InfoUsuario(){
       System.out.println("===== Informações do contribuinte =====");
       System.out.println("Nome: "+  nomeC);
       System.out.println("Idade: "+ idadeC);
       System.out.println("Regiao: "+ regiaoC);
       System.out.println("DescricaoContribuite: ");
      // System.out.println("Salario mensal: " +  salarioMensal );
       //System.out.println("Salario anual: " +  salarioAnual );
   }


}
