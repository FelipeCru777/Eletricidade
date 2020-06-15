package eletricidade;

import javax.swing.JOptionPane;

public class Eletricidade {

    public static void main(String[] args) {
       
        OperacoesEletrecidade elet = new OperacoesEletrecidade();
        elet.setLeitura1(Double.parseDouble(JOptionPane.showInputDialog("Leitura anterior:")));
        elet.setLeitura2(Double.parseDouble(JOptionPane.showInputDialog("Leitura atual:")));        
        elet.gasto(elet.getLeitura1(),elet.getLeitura2());
        elet.taxate(elet.getDiferenca());
        elet.taxatusd(elet.getDiferenca());
        elet.somataxas(elet.getTe(),elet.getTusd());
        elet.icms(elet.getTotalSemBandeira());
        elet.bandeira(elet.getDiferenca());
        elet.acrecimo(elet.getBandeira(),elet.getIcms());
        elet.taxaPagar(elet.getIcms());
        elet.recibo(elet.getLeitura1(),elet.getLeitura2(),elet.getDiferenca(),elet.getTotalSemBandeira(),elet.getBandeira(),elet.getTotalBandeira());
        
    }
    
}
