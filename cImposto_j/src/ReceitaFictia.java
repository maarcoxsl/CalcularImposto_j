class ReceitaFictia {
        public String nomeContribuite;
        public int    dependentes;
        public int regiaoContribuinte;
        public String contribuinte;
        private double salarioMensal;
        private double salarioAnual;
        public double totalPagar;

        public double GetSalarioM(double salarioM) {
               this.salarioMensal = salarioM;
               return salarioMensal;
        }

        public double SetSalarioM() {
               return salarioMensal;
        }
        public double SalarioAnual() {
            salarioAnual = salarioMensal * 12;
            return salarioAnual;
        }

        public static void main(String[] args) {}

}
// Contribuinte faz parte da instituição receita ??
// Oque não faz é pessoa !!
// Metodo de get set Correto