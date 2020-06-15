package eletricidade;

import javax.swing.JOptionPane;

public class OperacoesEletrecidade {

    public double getLeitura1() {
        return leitura1;
    }

    public void setLeitura1(double leitura1) {
        this.leitura1 = leitura1;
    }

    public double getLeitura2() {
        return leitura2;
    }

    public void setLeitura2(double leitura2) {
        this.leitura2 = leitura2;
    }

    public double getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(double diferenca) {
        this.diferenca = diferenca;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getTotalSemBandeira() {
        return totalSemBandeira;
    }

    public void setTotalSemBandeira(double totalSemBandeira) {
        this.totalSemBandeira = totalSemBandeira;
    }

    public double getTotalBandeira() {
        return totalComBandeira;
    }

    public void setTotalBandeira(double totalBandeira) {
        this.totalComBandeira = totalBandeira;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
   
    private double leitura1;
    private double leitura2;
    private double diferenca;
    private double tusd;
    private double te;
    private double totalSemBandeira;
    private double totalComBandeira;
    private double acrescimo;
    private double icms;
    private String bandeira;
    
    public double gasto(double leitura1, double leitura2){    
        this.diferenca = this.leitura2 - this.leitura1;
        return this.diferenca;        
    }
    public double taxate(double diferenca){
        this.te = this.diferenca * 0.29;
        return this.te;
    }    
    public double taxatusd(double diferenca){
        this.tusd = this.diferenca * 0.30;
        return this.tusd;
    }
    public double somataxas(double tusd, double te){
        this.totalSemBandeira = this.tusd + this.te;
        return this.totalSemBandeira;
    }
    public double icms(double totalSemBandeira){
        this.icms = this.totalSemBandeira *0.25;
        this.icms = this.icms + this.totalSemBandeira;
        return icms;
    }
    public String bandeira(double diferenca){
        if (this.diferenca <100) {
            this.bandeira = "verde";
        }else if (this.diferenca >101 && this.diferenca <150) {
            this.bandeira = "amarelo";
        }else if (this.diferenca>150 && this.diferenca<200) {
            this.bandeira = "vermelho patamar 1";
        }else{
            this.bandeira = "vermelho patamar 2";
        }
        return this.bandeira;
    }
    public double acrecimo(String bandeira, double icms){
        if ("verde".equals(this.bandeira)) {
            this.acrescimo = 1;
        }
        if ("amarelo".equals(this.bandeira)) {
            this.acrescimo = 0.04169;
        }
        if ("vermelho patamar 1".equals(this.bandeira)) {
            this.acrescimo = 0.04169;
        }
        if ("vermelho patamar 2".equals(this.bandeira)) {
            this.acrescimo = 0.06243;
        }
        return this.acrescimo;
    }
    public double taxaPagar(double icms){
        this.totalComBandeira = this.icms * this.acrescimo;
        this.totalComBandeira = this.totalComBandeira+this.icms;
        return this.totalComBandeira;
    }

    void recibo(double leitura1, double leitura2, double diferenca, double totalSemBandeira, String bandeira, double totalBandeira) {
        JOptionPane.showMessageDialog(null,"Leitura antiga: "
                + this.leitura1
                + "\nLeitura atual: "
                + this.leitura2
                + "\nTotal gasto: "
                + this.diferenca
                + "\nTotal sem bandeira: "
                + this.totalSemBandeira
                + "\nBandeira: "
                + this.bandeira
                + "\nTotal com bandeira "
                + this.totalComBandeira);
    }
    
    
    
    
    
    
}
