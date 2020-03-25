package Modelo;

public class MostrarDescricao
{

    public MostrarDescricao(int ItemN)
    {
        this.itemN = ItemN;
        DefinirDescricao();
    }
    
    private int itemN = 0;
    private String descricao = "";
    
    private void DefinirDescricao()
    {
        descricao = "";
        Itens itens = new Itens();
        if (this.itemN == 1)
        {
            this.descricao = "Separar Lixo em casa\n\n"
                    + "A preservação do meio ambiente começa em casa, separar o lixo\n"
                    + "corretamente permitirá com que materiais sejam economizados e\n"
                    + "tãnãnã...\n\n"
                    + "Valor para adicionar +1  Pessoa: "+ itens.precoatualItem1 + "\n"
                    + "Valor para adicionar +10 Pessoa: "+ itens.precoatualItem1;
        }
        if (this.itemN == 2)
        {
            this.descricao = "teste item2";
        }
        if (this.itemN == 3)
        {
            this.descricao = "teste item3";
        }
        if (this.itemN == 4)
        {
            this.descricao = "teste item4";
        }
        if (this.itemN == 5)
        {
            this.descricao = "teste item5";
        }
        if (this.itemN == 6)
        {
            this.descricao = "teste item6";
        }
        if (this.itemN == 7)
        {
            this.descricao = "teste\n item7";
        }
        if (this.itemN == 8)
        {
            this.descricao = "teste item8";
        }
        if (this.itemN == 9)
        {
            this.descricao = "teste item9";
        }
        if (this.itemN == 10)
        {
            this.descricao = "teste item10";
        }
    }
    
    public String GetDescricao()
    {
        
        return descricao;
    }
    
}
