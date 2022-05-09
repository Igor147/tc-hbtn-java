package salario;

public class Departamento {
    double valorMeta, valorAtingidoMeta = 0;

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }
    public boolean alcancouMeta(){
        if (valorAtingidoMeta >= valorMeta){
            return true;
        }
        return false;
    }
}
