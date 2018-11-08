/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bissexto;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rafae
 */
public class TesteBissexto {

    Bissexto bissexto = new Bissexto();

    @Test
    public void testeBissexto(){
        // negativo
        Assert.assertTrue(bissexto.isBissexto(-420));

        // positivo
        Assert.assertTrue(bissexto.isBissexto(848));

        // zero
        Assert.assertTrue(bissexto.isBissexto(0));

    }
    
    @Test
    public void testeNaoBissexto(){
        // negativo
        Assert.assertFalse(bissexto.isBissexto(-359));

        // positivo
        Assert.assertFalse(bissexto.isBissexto(870));

    }
}
