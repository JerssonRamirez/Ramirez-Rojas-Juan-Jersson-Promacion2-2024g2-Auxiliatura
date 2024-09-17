package entrada_en_cadena;

import java.util.HashMap;
import java.util.Map;

public class FormatoFecha {
    public static void main(String[] args) {
        String entrada = "4 de junio, 2004";
        System.out.println(convertirFecha(entrada));
    }

    public static String convertirFecha(String entrada) {
        Map<String, String> meses = new HashMap<>();
        meses.put("enero", "01");
        meses.put("febrero", "02");
        meses.put("marzo", "03");
        meses.put("abril", "04");
        meses.put("mayo", "05");
        meses.put("junio", "06");
        meses.put("julio", "07");
        meses.put("agosto", "08");
        meses.put("septiembre", "09");
        meses.put("octubre", "10");
        meses.put("noviembre", "11");
        meses.put("diciembre", "12");

        String[] partes = entrada.split(" de |, ");
        String dia = partes[0];
        String mes = meses.get(partes[1].toLowerCase());
        String año = partes[2];

        return dia + "/" + mes + "/" + año;
    }
}
