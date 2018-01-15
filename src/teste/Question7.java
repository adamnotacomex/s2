/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author adam
 */
public class Question7 {

    public Integer execute(Integer a, Integer b) {
        String sa = a.toString();
        String sb = b.toString();
        int quant = sa.length();

        if (quant < sb.length()) {
            quant = sb.length();
        }

        String sc = "";
        for (int i = 0; i < quant; i++) {
            String caracter = sa.length() >= (i + 1) ? sa.substring(i, i + 1) : "";
            caracter = sb.length() >= (i + 1) ? (caracter + sb.substring(i, i + 1)) : caracter;
            sc += caracter;
        }

        Integer result = Integer.parseInt(sc);
        result = (result > 1000000) ? -1 : result;

        return result;
    }
}
