package Modelo;

public class Controle
{
    public Controle ()
    {
    }
    
    public Controle (javax.swing.JProgressBar BarraDoItem,Integer NumeroDoItem,javax.swing.JLabel LabelDosPontos)
    {
        RealizarItem realizaritem = new RealizarItem(BarraDoItem,NumeroDoItem,LabelDosPontos);
    }
    
    public String DescricaoItem(int ItemN)
    {
        MostrarDescricao mostrardescricao = new MostrarDescricao(ItemN);
        return mostrardescricao.GetDescricao();
    }
    
}
