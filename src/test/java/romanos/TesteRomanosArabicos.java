package romanos;

import org.junit.Assert;
import org.junit.Test;

public class TesteRomanosArabicos {

    RomanosArabicos romanosArabicos = new RomanosArabicos();

    @Test
    public void testeValidos(){
        // sem necessidade de algarismos romanos diferentes para o mesmo algarismo arábico
        Assert.assertEquals("CXXIII", romanosArabicos.converteRomArab(123));

        // com necessidade de algarismos romanos diferentes para o mesmo algarismo arábico
        Assert.assertEquals("XLIV", romanosArabicos.converteRomArab(44));

        // com uso de mais de três algarismos romanos iguais
        Assert.assertEquals("XXXIX", romanosArabicos.converteRomArab(39));

        // margens do intervalo de entrada
        Assert.assertEquals("I", romanosArabicos.converteRomArab(1));
        Assert.assertEquals("MMMMCMXCIX", romanosArabicos.converteRomArab(4999));

    }

    @Test
    public void testeInvalidos(){
        // zero
        Assert.assertEquals("", romanosArabicos.converteRomArab(0));

        // negativo
        Assert.assertEquals("", romanosArabicos.converteRomArab(-123));

        // fora das margens do intervalo de entrada
        Assert.assertEquals("", romanosArabicos.converteRomArab(5000));
    }

}
