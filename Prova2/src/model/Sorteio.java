/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Biel
 */
public class Sorteio {
    
    int numeroJogo;
    int dezena1;
    int dezena2;
    int dezena3;
    int dezena4;
    int dezena5;
    int dezena6;
    
    public Sorteio()
    {
        
    }
    
    public int getDezena(int qualDezena)
    {      
        
        if (qualDezena == 1)
        {
            return getDezena1();
        }
        
        if (qualDezena == 2)
        {
            return getDezena2();
        }
        
        if (qualDezena == 3)
        {
            return getDezena3();
        }
        
        if (qualDezena == 4)
        {
            return getDezena4();
        }
        
        if (qualDezena == 5)
        {
            return getDezena5();
        }
        
        if (qualDezena == 6)
        {
            return getDezena6();
        }
        
        else
        {
            return 0;
        }
    }
    
    public int getNumeroJogo()
    {
        return this.numeroJogo;
    }
    
    public int getDezena1()
    {
        return this.dezena1;
    }
    
    public int getDezena2()
    {
        return this.dezena2;
    }
    
    public int getDezena3()
    {
        return this.dezena3;
    }
    
    public int getDezena4()
    {
        return this.dezena4;
    }
    
    public int getDezena5()
    {
        return this.dezena5;
    }
    
    public int getDezena6()
    {
        return this.dezena6;
    }
    
     public void setNumeroJogo(int numeroJogo)
    {
        this.numeroJogo = numeroJogo;
    }
    
    public void setDezena1(int dezena1)
    {
        this.dezena1 = dezena1;
    }
    
    public void setDezena2(int dezena2)
    {
        this.dezena2 = dezena2;
    }
    
    public void setDezena3(int dezena3)
    {
        this.dezena3 = dezena3;
    }
    
    public void setDezena4(int dezena4)
    {
        this.dezena4 = dezena4;
    }
    
    public void setDezena5(int dezena5)
    {
        this.dezena5 = dezena5;
    }
    
    public void setDezena6(int dezena6)
    {
        this.dezena6 = dezena6;
    }
}
