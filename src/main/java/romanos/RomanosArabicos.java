package romanos;

public class RomanosArabicos {

    public String converteRomArab(Integer numeroArab){
        String numeroRom = "";
        int algarismoDaVez;

        if(numeroArab < 1 || numeroArab > 4999){
            return numeroRom;
        }

        algarismoDaVez = numeroArab / 1000;
        for (int i = 0; i < algarismoDaVez; i++) {
            numeroRom += "M";
        }

        numeroArab -= algarismoDaVez * 1000;
        algarismoDaVez = numeroArab / 100;
        if(algarismoDaVez == 4){
            numeroRom += "CD";
        } else if (algarismoDaVez == 9){
            numeroRom += "CM";
        } else if (algarismoDaVez < 5){
            for(int i = 0; i < algarismoDaVez; i++){
                numeroRom += "C";
            }
        } else {
            numeroRom += "D";
            for(int i = 5; i < algarismoDaVez; i++){
                numeroRom += "C";
            }
        }

        numeroArab -= algarismoDaVez * 100;
        algarismoDaVez = numeroArab / 10;
        if(algarismoDaVez == 4){
            numeroRom += "XL";
        } else if (algarismoDaVez == 9){
            numeroRom += "XC";
        } else if (algarismoDaVez < 5){
            for(int i = 0; i < algarismoDaVez; i++){
                numeroRom += "X";
            }
        } else {
            numeroRom += "L";
            for(int i = 5; i < algarismoDaVez; i++){
                numeroRom += "X";
            }
        }

        algarismoDaVez = numeroArab - algarismoDaVez * 10;
        if(algarismoDaVez == 4){
            numeroRom += "IV";
        } else if (algarismoDaVez == 9){
            numeroRom += "IX";
        } else if (algarismoDaVez < 5){
            for(int i = 0; i < algarismoDaVez; i++){
                numeroRom += "I";
            }
        } else {
            numeroRom += "V";
            for(int i = 5; i < algarismoDaVez; i++){
                numeroRom += "I";
            }
        }

        return numeroRom;
    }
}
