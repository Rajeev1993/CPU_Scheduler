/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu_schdueling;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rajee
 */
public class CPU_Schdueling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Process p1 = new Process(0, 0, 10, 0);
        Process p2 = new Process(1, 0, 15, 0);
        Process p3 = new Process(2, 0, 20, 0);
        Process p4 = new Process(3, 0, 25, 0);
        Process p5 = new Process(4, 0, 30, 0);

        List<Process> processes = new ArrayList<Process>();
        processes.add(p1);
        processes.add(p2);
        processes.add(p3);
        processes.add(p4);
        processes.add(p5);

        for (int i = 0; i < processes.size(); i++) {
            System.out.println(processes.get(i).id);
        }

        int temp = 0;
        for (int i = 0; i < processes.size(); i++) {
            temp = processes.get(i).timeLeft;
        }

        int timeQuantum = temp / processes.size();

        System.out.println("Time Quantum: " + timeQuantum);
        
        ReadyQue rq = new ReadyQue(timeQuantum);
        
        rq.addProcesses(processes);
        // rq.run();
    }
}
