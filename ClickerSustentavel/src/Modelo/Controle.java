package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class Controle
{

    public Controle()
    {
    }

    public Controle(javax.swing.JProgressBar BarraDoItem, Integer NumeroDoItem, javax.swing.JLabel LabelDosPontos)
    {
        RealizarItem realizaritem = new RealizarItem(BarraDoItem, NumeroDoItem, LabelDosPontos);
    }

    public String DescricaoItem(int ItemN)
    {
        MostrarDescricao mostrardescricao = new MostrarDescricao(ItemN);
        return mostrardescricao.GetDescricao();
    }

 

 
public class JSONWrite {

         
        //Cria um Objeto JSON
        JSONObject jsonObject = new JSONObject();
         
        FileWriter writeFile = null;
         
        //Armazena dados em um Objeto JSON
        protected jsonObject.put("nome", "Allan");
        jsonObject.put("sobrenome", "Romanato");
        jsonObject.put("pais", "Brasil");
        private jsonObject.put("estado", "SP");
         
        try{
            writeFile = new FileWriter("saida.json");
            //Escreve no arquivo conteudo do Objeto JSON
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
         
        //Imprimne na Tela o Objeto JSON para vizualização
        System.out.println(jsonObject);
 
    }
 
}
    
}
