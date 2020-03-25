/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Itens
{

    public Itens()
    {
    }
    
    
    public Itens(Integer NovoJogo_1ou0)
    {
        if(NovoJogo_1ou0 == 0)
        {
            quantidadeItem1 = new LerJson(1).getResultado();
            quantidadeItem2 = new LerJson(2).getResultado();
            quantidadeItem3 = new LerJson(3).getResultado();
            quantidadeItem4 = new LerJson(4).getResultado();
            quantidadeItem5 = new LerJson(5).getResultado();
            quantidadeItem6 = new LerJson(6).getResultado();
            quantidadeItem7 = new LerJson(7).getResultado();
            quantidadeItem8 = new LerJson(8).getResultado();
            quantidadeItem9 = new LerJson(9).getResultado();
            quantidadeItem10 = new LerJson(10).getResultado();
        }
        if (NovoJogo_1ou0 == 1)
        {
            new EscreverJson(1, 1.0);
            new EscreverJson(2, 0.0);
            new EscreverJson(3, 0.0);
            new EscreverJson(4, 0.0);
            new EscreverJson(5, 0.0);
            new EscreverJson(6, 0.0);
            new EscreverJson(7, 0.0);
            new EscreverJson(8, 0.0);
            new EscreverJson(9, 0.0);
            new EscreverJson(10, 0.0);
        }
        
        if(quantidadeItem1 != 0.0) velocidadeAtualItem1 = velocidadeInicialItem1/Math.round(quantidadeItem1);
        if(quantidadeItem2 != 0.0) velocidadeAtualItem2 = velocidadeInicialItem2/Math.round(quantidadeItem2);
        if(quantidadeItem3 != 0.0) velocidadeAtualItem3 = velocidadeInicialItem3/Math.round(quantidadeItem3);
        if(quantidadeItem4 != 0.0) velocidadeAtualItem4 = velocidadeInicialItem4/Math.round(quantidadeItem4);
        if(quantidadeItem5 != 0.0) velocidadeAtualItem5 = velocidadeInicialItem5/Math.round(quantidadeItem5);
        if(quantidadeItem6 != 0.0) velocidadeAtualItem6 = velocidadeInicialItem6/Math.round(quantidadeItem6);
        if(quantidadeItem7 != 0.0) velocidadeAtualItem7 = velocidadeInicialItem7/Math.round(quantidadeItem7);
        if(quantidadeItem8 != 0.0) velocidadeAtualItem8 = velocidadeInicialItem8/Math.round(quantidadeItem8);
        if(quantidadeItem9 != 0.0) velocidadeAtualItem9 = velocidadeInicialItem9/Math.round(quantidadeItem9);
        if(quantidadeItem10 != 0.0) velocidadeAtualItem10 = velocidadeInicialItem10/Math.round(quantidadeItem10);
    }
    
    
    
    //Item1 
    public String nomeItem1 = "Separar lixo em casa";
    public Double quantidadeItem1 = 1.0;
    public Double precoinicialItem1 = 5.0;
    public Double precoatualItem1 = precoinicialItem1*quantidadeItem1;
    public long velocidadeInicialItem1 = 60;
    public long velocidadeAtualItem1 = 0;

    //Item2
    public String nomeItem2 = "Plantar uma árvore";
    public Double quantidadeItem2 = 0.0;
    public Double precoinicialItem2 = 125.0;
    public Double precoatualItem2 = precoinicialItem2*quantidadeItem2;
    public long velocidadeInicialItem2 = 150;
    public long velocidadeAtualItem2 = 0;
    
    //Item3
    public String nomeItem3 = "Limpar o parque da cidade";
    public Double quantidadeItem3 = 0.0;
    public Double precoinicialItem3 = 1000.0;
    public Double precoatualItem3 = precoinicialItem3*quantidadeItem3;
    public long velocidadeInicialItem3 = 450;
    public long velocidadeAtualItem3 = 0;
    
    //Item4
    public String nomeItem4 = "Separar lixo em casa";
    public Double quantidadeItem4 = 0.0;
    public Double precoinicialItem4 = 5.0;
    public Double precoatualItem4 = precoinicialItem4*quantidadeItem4;
    public long velocidadeInicialItem4 = 60;
    public long velocidadeAtualItem4 = 0;
    
    //Item5
    public String nomeItem5 = "Separar lixo em casa";
    public Double quantidadeItem5 = 0.0;
    public Double precoinicialItem5 = 5.0;
    public Double precoatualItem5 = precoinicialItem5*quantidadeItem5;
    public long velocidadeInicialItem5 = 60;
    public long velocidadeAtualItem5 = 0;
    
    //Item6
    public String nomeItem6 = "Separar lixo em casa";
    public Double quantidadeItem6 = 0.0;
    public Double precoinicialItem6 = 5.0;
    public Double precoatualItem6 = precoinicialItem6*quantidadeItem6;
    public long velocidadeInicialItem6 = 60;
    public long velocidadeAtualItem6 = 0;
    
    //Item7
    public String nomeItem7 = "Separar lixo em casa";
    public Double quantidadeItem7 = 0.0;
    public Double precoinicialItem7 = 5.0;
    public Double precoatualItem7 = precoinicialItem7*quantidadeItem7;
    public long velocidadeInicialItem7 = 60;
    public long velocidadeAtualItem7 = 0;
    
    //Item8
    public String nomeItem8 = "Separar lixo em casa";
    public Double quantidadeItem8 = 0.0;
    public Double precoinicialItem8 = 5.0;
    public Double precoatualItem8 = precoinicialItem8*quantidadeItem8;
    public long velocidadeInicialItem8 = 60;
    public long velocidadeAtualItem8 = 0;
    
    //Item9
    public String nomeItem9 = "Separar lixo em casa";
    public Double quantidadeItem9 = 0.0;
    public Double precoinicialItem9 = 5.0;
    public Double precoatualItem9 = precoinicialItem9*quantidadeItem9;
    public long velocidadeInicialItem9 = 60;
    public long velocidadeAtualItem9 = 0;
    
    //Item10
    public String nomeItem10 = "Separar lixo em casa";
    public Double quantidadeItem10 = 0.0;
    public Double precoinicialItem10 = 5.0;
    public Double precoatualItem10 = precoinicialItem10*quantidadeItem10;
    public long velocidadeInicialItem10 = 60;
    public long velocidadeAtualItem10 = 0;    
    
    
    
}

