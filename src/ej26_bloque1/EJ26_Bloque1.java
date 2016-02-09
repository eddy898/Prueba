/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej26_bloque1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class EJ26_Bloque1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        float estatura = 0, estaturaH = 0, estaturaM = 0;
        String sexo = "";
        int nMujeres = 0, nHombres = 0;
        float mMujeres, mHombre;
        
        System.out.print("Introduce Sexo: ");
        sexo = teclado.readLine();

        while (!(sexo.equalsIgnoreCase("*"))) {
            System.out.print("Introduce Estatura: ");
            estatura = Float.parseFloat(teclado.readLine());
            if (sexo.equalsIgnoreCase("hombre")) {
                nHombres++;
                estaturaH = estatura + estaturaH;
            } else {
                if (sexo.equalsIgnoreCase("mujer")) {
                    nMujeres++;
                    estaturaM = estatura + estaturaM;
                } else {
                    while (!(sexo.equalsIgnoreCase("hombre") || sexo.equalsIgnoreCase("mujer"))) {
                        System.out.println("ERROR Introduce: HOMBRE O MUJER");
                        System.out.print("Introduce Sexo: ");
                        sexo = teclado.readLine();
                    }

                }
            }
            System.out.print("Introduce Sexo: ");
            sexo = teclado.readLine();
            

        }
        mHombre = (float)estaturaH / nHombres;
        mMujeres = (float)estaturaM / nMujeres;
        
        System.out.println("\t\t\t INFORME ESTATURAS \t\t\t ");
        System.out.println("MEDIA HOMBREs: " + mHombre);
    }

}
