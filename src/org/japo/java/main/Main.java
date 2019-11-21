/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        int num;
        boolean par = false;

        //Bucles
        do {
            try {
                //Pedir datos
                System.out.print("Número entero par ...: ");
                num = SCN.nextInt();

                //Comprobar si es par
                if (num % 2 == 0) {
                    par = true;
                } else {
                    System.out.println("No es par");
                }

            } catch (Exception e) {

                //Mensaje de error
                System.out.println("Este número no es entero");

            } finally {

                SCN.nextLine();
            }
        } while (!par);

    }//main

}//class
