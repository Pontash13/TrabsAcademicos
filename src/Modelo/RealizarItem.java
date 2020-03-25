/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.Thread.sleep;


public class RealizarItem
{
    public RealizarItem(javax.swing.JProgressBar BarraDoItem, Integer NumeroDoItem,javax.swing.JLabel LabelDosPontos)
    {
        if (BarraDoItem.getValue() == 0)
        {
            Realizar(BarraDoItem,NumeroDoItem,LabelDosPontos);
        }
    }
    
    private long velocidade = 0;
    
    
    
    private void Realizar(javax.swing.JProgressBar BarraDoItem, Integer NumeroDoItem, javax.swing.JLabel LabelDosPontos)
    {
        Itens itens = new Itens(0);
        
        if(NumeroDoItem == 1)this.velocidade = itens.velocidadeAtualItem1;
        if(NumeroDoItem == 2)this.velocidade = itens.velocidadeAtualItem2;
        if(NumeroDoItem == 3)this.velocidade = itens.velocidadeAtualItem3;
        if(NumeroDoItem == 4)this.velocidade = itens.velocidadeAtualItem4;
        if(NumeroDoItem == 5)this.velocidade = itens.velocidadeAtualItem5;
        if(NumeroDoItem == 6)this.velocidade = itens.velocidadeAtualItem6;
        if(NumeroDoItem == 7)this.velocidade = itens.velocidadeAtualItem7;
        if(NumeroDoItem == 8)this.velocidade = itens.velocidadeAtualItem8;
        if(NumeroDoItem == 9)this.velocidade = itens.velocidadeAtualItem9;
        if(NumeroDoItem == 10)this.velocidade = itens.velocidadeAtualItem10;
        
        
        
        new Thread()
        {
            public void run()
            {
                if (velocidade != 0)
                {
                    try
                    {
                        int progresso = 0;
                        BarraDoItem.setValue(progresso);
                        while(BarraDoItem.getValue() < 100)
                        {
                            sleep(velocidade);
                            progresso += 1;
                            BarraDoItem.setValue(progresso);
                        }
                        PontosSustentabilidade pontos = new PontosSustentabilidade();
                        pontos.setPontos(1.0);
                        BarraDoItem.setValue(0);
                        LabelDosPontos.setText(pontos.getPontos().toString());
                    }
                    catch (InterruptedException x)
                    {
                    }
                }
                
            }

        }.start(); 
    }
            
}
