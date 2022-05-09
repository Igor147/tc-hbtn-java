package salario;

public class Empregado {
    double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if(departamento.alcancouMeta()){
            bonus = this.salarioFixo* 0.1;
        };

        return bonus;
    }
    public double calcularSalarioTotal(Departamento departamento){
        double bonus = calcularBonus(departamento);

        return this.salarioFixo + bonus;
    }
}
