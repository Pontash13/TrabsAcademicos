/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yury
 */
public class PontosSustentabilidade
{
    private Double pontos = 0.0;
    public String pontosstring = pontos.toString();

    public void setPontos(Double pontos)
    {
        this.pontos += pontos;
    }

    public Double getPontos()
    {
        return pontos;
    }
    
    
    
    
    
}
