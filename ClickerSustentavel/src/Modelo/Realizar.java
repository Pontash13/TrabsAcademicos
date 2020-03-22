package Modelo;

import java.util.concurrent.TimeUnit;


public class Realizar
{

    public final long velocidade = 50;
    public int barra = 0;
    new Realizar(intera);
    
    public void itera(javax.swing.JProgressBar x)
    {
        //seta a barra pra zero, layout e que tera a porcentagem
        x.setValue(0);
        x.setLayout(null);
        x.setStringPainted(true);
      
        while (barra != 100)
        {
            barra += 1;
            //o sleep funciona apenas dentro do loop
            try
            {
                //dorme o codigo por tantos milisengundo
                TimeUnit.MILLISECONDS.sleep(velocidade);
                //só pra mostrar no terminal o valor
                System.out.println(barra);

            }
            catch (InterruptedException e)
            {
            }
            //set o valor para a porcentagem atual
            x.setValue(barra);
            x.setEnabled(true);
            x.setVisible(true);
            //seta o valor da porcentagem
            x.setString(Integer.toString(barra));

        }
        //zera o valor da barra e tira a % dela 
        x.setValue(0);
        x.setStringPainted(false);

    }

}
