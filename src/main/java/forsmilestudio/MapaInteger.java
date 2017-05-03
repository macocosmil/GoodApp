package forsmilestudio;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maciejwolodko on 02.05.17.
 */
public class MapaInteger {



    Integer number1=5;
    int number2;
    Map<String, Integer> mapaInteger;

    public MapaInteger(Integer number1, int number2, Map<String, Integer> mapaInteger) {
        this.number1 = number1;
        this.number2 = number2;
        this.mapaInteger = mapaInteger;
    }
    public MapaInteger() {
        System.out.println("Dupa Jasia bez konstruktora");
    }

    public MapaInteger(String string1, Integer number1){

        Map<String, Integer> mapaInteger = new HashMap<>();

        for (int i = 0; i < 15 ; i++) {
            mapaInteger.put(string1 +i, i);
        }
        System.out.println(mapaInteger.size());
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public Map<String, Integer> getMapaInteger() {
        return mapaInteger;
    }

    public void setMapaInteger(Map<String, Integer> mapaInteger) {
        this.mapaInteger = mapaInteger;
    }
}




