package bissexto;

public class Bissexto {
    public boolean isBissexto(int num){
        if ((num % 4) != 0) {
            return false;
        }
        return true;
    }
}
