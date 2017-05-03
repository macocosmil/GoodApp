package forsmilestudio;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Object cos = new String("Co niby to wszystko ma znaczyć?");

        System.out.println(cos);

        Map<String, Integer> mapaKontener = new HashMap<>();
        mapaKontener.put("dupa", 3);
        mapaKontener.put("japa", 43);
        mapaKontener.put("japadupa", 343);

        String nic = mapaKontener.toString();
        String nic1 = "dupa Strupa trupa dupa coś tam dupa";
        nic1.replace("SruPA", "dupa");
        System.out.println(nic1);
        /*MapaInteger cos2 = new MapaInteger();
        cos2.mapaInteger("jasiek", 2);*/
   /*     List<String> list = new ArrayList<>();
        for (int i = 0; i <23 ; i++) {

            list.add("dupa jasia"+i);
        }
        String listawstringu = list.toString();
        listawstringu.substring(2,39);
        System.out.println(listawstringu);*/


        ///   System.out.println( "Hello World!" );
        List<String> list = new ArrayList<>();
        list.add("asds");
        list.add("assfsdfsdfds");
        list.add("asdsfsdfsdfsfssdfs");
        list.add("asdsdfsdad sfsaf sfsfsfdss");
        list.add("asas sfsadsfs dsfs dds");

        System.out.println(("size:" + list.size()));
        System.out.println("empty:" + list.isEmpty());
        List<String> dupaList = new ArrayList<>();
        dupaList.addAll(list);
        for (int i = 0; i <dupaList.size(); i++) {
            System.out.println(dupaList.get(i));
        }
        MapaInteger dupaJasia = new MapaInteger();

        System.getProperty("MapaInteger.number1");

        System.out.println(dupaJasia.number1);
        int dupnaLiczba = 34;
        int fukinChillin = 54543;
        double sumaDupnychLiczb = dupnaLiczba * fukinChillin;
        System.out.println(sumaDupnychLiczb);
        List<List> listaList = new ArrayList<>();
        Date dataNowa = new Date();
        long iloscMilisekundOdtegoMiejsca = dataNowa.getTime();
//        dataNowa.setTime(8640000000);
        long oneday =86400000 ;
        long iledni = iloscMilisekundOdtegoMiejsca / oneday;
        System.out.println(dataNowa.getTime());
        System.out.println(iledni);
        System.out.println("taka zmiana");
        System.out.println("nowe schematy");
        DupaJasia dupaJasiaWartosc = new DupaJasia();
        System.out.println(dupaJasiaWartosc.getDupaJasiaBec());
    }
}
