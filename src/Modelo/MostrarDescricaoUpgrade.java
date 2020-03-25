package Modelo;


public class MostrarDescricaoUpgrade 
{
    private String Descricao = "";
  
  public void DefinirLista(Integer IndiceLista)
  {
      if(IndiceLista == 0)Descricao = "Indice1";
      if(IndiceLista == 1)Descricao = "Indice2";
      if(IndiceLista == 2)Descricao = "Indice3";
      if(IndiceLista == 3)Descricao = "Indice4";
      if(IndiceLista == 4)Descricao = "Indice5";
      if(IndiceLista == 5)Descricao = "Indice6";
      if(IndiceLista == 6)Descricao = "Indice7";
      if(IndiceLista == 7)Descricao = "Indice8";
      if(IndiceLista == 8)Descricao = "Indice9";
      if(IndiceLista == 9)Descricao = "Indice10";
  } 

    public String getDescricao() {
        return Descricao;
    }
    
}
