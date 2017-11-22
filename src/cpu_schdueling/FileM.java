/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu_schdueling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author rajee
 */
public class FileM {
    public void readProcessFromText(String path) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(new File(path)));
            String line = "";
            if (br.readLine() != null) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            
        }
    }
}
