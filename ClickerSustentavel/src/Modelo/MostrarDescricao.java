package Modelo;

public class MostrarDescricao
{

    public MostrarDescricao(String ItemN)
    {
        this.itemN = ItemN;
        DefinirDescricao();
    }
    
    private String itemN = "";
    private String descricao = "";
    
    private void DefinirDescricao()
    {
        descricao = "";
        
        if (this.itemN.equals("1"))
        {
            this.descricao = "Separar Lixo em casa\n\n"
                    + "A preservação do meio ambiente começa em casa, separar o lixo\n"
                    + "corretamente permitirá com que materiais sejam economizados e\n"
                    + "tãnãnã...\n\n"
                    + "Valor para adicionar +1  Pessoa: 10\n"
                    + "Valor para adicionar +10 Pessoa: 100\n";
        }
        if (this.itemN.equals("2"))
        {
            this.descricao = "teste item2";
        }
        if (this.itemN.equals("3"))
        {
            this.descricao = "teste item3";
        }
        if (this.itemN.equals("4"))
        {
            this.descricao = "teste item4";
        }
        if (this.itemN.equals("5"))
        {
            this.descricao = "teste item5";
        }
        if (this.itemN.equals("6"))
        {
            this.descricao = "teste item6";
        }
        if (this.itemN.equals("7"))
        {
            this.descricao = "teste\n item7";
        }
        if (this.itemN.equals("8"))
        {
            this.descricao = "teste item8";
        }
        if (this.itemN.equals("9"))
        {
            this.descricao = "teste item9";
        }
        if (this.itemN.equals("10"))
        {
            this.descricao = "teste item10";
        }
    }
    
    public String GetDescricao()
    {
        return descricao;
    }
    
}
