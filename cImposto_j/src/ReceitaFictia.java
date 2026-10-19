public class ReceitaFictia {
        public String nomeContribuite;
        private double salarioMensal;
        private double salarioAnual;
        public double totalPagar;

        public double SetSalarioM(double salarioM) {
               this.salarioMensal = salarioM;
               return salarioMensal;
        }

        public double GetSalarioM() {
            return salarioMensal;
        }

        public double SalarioAnual() {
               salarioAnual = salarioMensal * 12;
               return salarioAnual;
        }

        public void DescontoNorte() {
               // 20% de desconto
               if(salarioAnual > 0 && salarioAnual < 20000.00) {
                   System.out.println("Insento");
               } else if(salarioAnual > 20000.00 && salarioAnual <= 50000.00) {
                   totalPagar = salarioAnual - (salarioAnual * 0.2);
                   var formatar = String.format("%.2f", totalPagar);

                   System.out.println(formatar);
               } else if(salarioAnual > 50000.00 && salarioAnual <= 100000.00) {
                   totalPagar = salarioAnual - (salarioAnual * 0.255);
                   var formatar = String.format("%.2f", totalPagar);

                   System.out.println(formatar);
               } else if(salarioAnual > 100000.00){
                   totalPagar = salarioAnual - (salarioAnual * 0.27);
                   var formatar = String.format("%.2f", totalPagar);

                   System.out.println(formatar);
               } else{
                   System.out.println("Valor inserido invalido tente novamente reniciando o progama");
               }

           }
           public void DescontoSul() {
                if(salarioAnual > 0  && salarioAnual <= 22000.00) {
                    totalPagar = salarioAnual - (salarioAnual * 0.3);
                    var formatar = String.format("%.2f", totalPagar);
                    System.out.println(formatar);

                } else if (salarioAnual > 22000.00 && salarioAnual <= 50000.00) {
                    var totalPagar = salarioAnual - (salarioAnual * 0.10);
                    var formatar = String.format("%.2f", totalPagar);
                    System.out.println(formatar);

                } else if (salarioAnual > 50000.00 && salarioAnual <= 100000.00) {
                    var totalPagar = salarioAnual - (salarioAnual * 0.26);
                    var formatar = String.format("%.2f", totalPagar);
                    System.out.println(formatar);

                } else if(salarioAnual > 100000.00 && salarioAnual <= 144000.00) {
                    totalPagar = salarioAnual - (salarioAnual * 0.50);
                    var formatar = String.format("%.2f", totalPagar);
                    System.out.println(formatar);
                }
           }

           public void DescontoLeste(){
               if(salarioAnual > 0  && salarioAnual <= 22000.00) {
                   totalPagar = salarioAnual - (salarioAnual * 0.4);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);

               } else if (salarioAnual > 22000.00 && salarioAnual <= 50000.00) {
                   var totalPagar = salarioAnual - (salarioAnual * 0.23);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);

               } else if (salarioAnual > 50000.00 && salarioAnual <= 100000.00) {
                   var totalPagar = salarioAnual - (salarioAnual * 0.30);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);

               } else if(salarioAnual > 100000.00 && salarioAnual <= 144000.00) {
                   totalPagar = salarioAnual - (salarioAnual * 0.40);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);
               }
           }
           public void DescontoOeste(){
               if(salarioAnual > 0  && salarioAnual <= 22000.00) {
                   System.out.println("Insento");

               } else if (salarioAnual > 22000.00 && salarioAnual <= 50000.00) {
                   var totalPagar = salarioAnual - (salarioAnual * 0.3);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);

               } else if (salarioAnual > 50000.00 && salarioAnual <= 100000.00) {
                   var totalPagar = salarioAnual - (salarioAnual * 0.30);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);

               } else if(salarioAnual > 100000.00 && salarioAnual <= 144000.00) {
                   totalPagar = salarioAnual - (salarioAnual * 0.50);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);
               }
           }

        }








/*

  public void DescontoSul() {
               // 23.3% de desconto
               if (salarioAnual > 0) {
                   System.out.println("Insento");
               } else if(salarioAnual > 20000.00 && salarioAnual <= 50000.00) {
                 var totalPagar = salarioAnual - (salarioAnual * 2.33);
                 var formatar = String.format("%.2f", totalPagar);
                 System.out.println(formatar);
               } else if(salarioAnual > 50000.00 && salarioAnual <= 100000.00) {
                   var totalPagar = salarioAnual - (salarioAnual * 2.33);
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);
               } else if(salarioAnual > 100000.00){
                   var formatar = String.format("%.2f", totalPagar);
                   System.out.println(formatar);
        }

*/