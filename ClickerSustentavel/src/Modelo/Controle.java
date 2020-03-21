package Modelo;

public class Controle
{
    public Controle ()
    {
        
    }
    
    public Controle (javax.swing.JProgressBar BarraItemN,Integer ItemN)
    {
        RealizarItem realizaritem = new RealizarItem(BarraItemN,ItemN);
    }
    
    public String DescricaoItem(String ItemN)
    {
        MostrarDescricao mostrardescricao = new MostrarDescricao(ItemN);
        return mostrardescricao.GetDescricao();
    }
    
    public void teste()
    {
        while(true)
        {
            
        }
    }
}
