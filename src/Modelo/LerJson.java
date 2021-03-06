/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Yury
 */
public class LerJson
{

    public LerJson(Integer NumeroDoItem)
    {
        DefinirItem(NumeroDoItem);
        LerSave();
    }
    
    
    
    private String item = "";
    private Double resultado = 0.0;
    
    private void DefinirItem(Integer NumeroDoItem)
    {
        if(NumeroDoItem == 1) item = "1";
        if(NumeroDoItem == 2) item = "2";
        if(NumeroDoItem == 3) item = "3";
        if(NumeroDoItem == 4) item = "4";
        if(NumeroDoItem == 5) item = "5";
        if(NumeroDoItem == 6) item = "6";
        if(NumeroDoItem == 7) item = "7";
        if(NumeroDoItem == 8) item = "8";
        if(NumeroDoItem == 9) item = "9";
        if(NumeroDoItem == 10) item = "10";
    }
    
    private void LerSave()
    {
        JSONObject jsonObject;
        //Cria o parse de tratamento
        JSONParser parser = new JSONParser();
        //Variaveis que irao armazenar os dados do arquivo JSON
        String nome;
 
        
        
        try {
            //Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject) parser.parse(new FileReader(
                    "Save.json"));
             
            //Salva nas variaveis os dados retirados do arquivo
            resultado = Double.parseDouble((String) jsonObject.get("quantidadeItem"+item));
        } 
        //Trata as exceptions que podem ser lançadas no decorrer do processo
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        catch (ParseException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    public Double getResultado()
    {
        return resultado;
    }
    
    
    
}
