/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.Thread.sleep;


public class RealizarItem
{
    public RealizarItem(javax.swing.JProgressBar BarraItemN, Integer ItemN)
    {
        this.ItemN = ItemN.toString();
        Realizar(BarraItemN,this.ItemN);
    }
    
    private String ItemN = "";
    
    
    private void Realizar(javax.swing.JProgressBar BarraItemN,String ItemN)
    {
        Itens itens = new Itens();
        
        new Thread(ItemN)
        {
            public void run()
            {
                try
                {
                    int progresso = 0;
                    BarraItemN.setValue(progresso);
                    while(BarraItemN.getValue() < 100)
                    {
                        Thread.sleep(itens.getVelocidade());
                        progresso += 1;
                        BarraItemN.setValue(progresso);
                    }
                    BarraItemN.setValue(0);

                }
                catch (InterruptedException x)
                {
                }
            }

        }.start(); 
    }
            
}
