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
    
    public String DescricaoItem(Integer NumeroDoItem)
    {
        MostrarDescricao mostrardescricao = new MostrarDescricao(NumeroDoItem);
        return mostrardescricao.GetDescricao();
    }
    
     //Descrição Upgrade ---------------------------------------------------------
    private String Descricao = "";
    
    public void DescricaoLista(Integer IndiceLista)
    {
        MostrarDescricaoUpgrade descricaoupgrade = new MostrarDescricaoUpgrade();
        descricaoupgrade.DefinirLista(IndiceLista);
        Descricao = descricaoupgrade.getDescricao();
    }

    public String getDescricao() {
        return Descricao;
    }
    
}
