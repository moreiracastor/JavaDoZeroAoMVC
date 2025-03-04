package section8.Dolar.Util;

public class Convert {

    private static final float iof = 6F;

    public static float convert(float dollar, int quantity){
        return dollar * quantity + (dollar * quantity * 6/100);
    }
}
