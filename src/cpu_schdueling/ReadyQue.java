/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu_schdueling;

import java.util.List;

/**
 *
 * @author rajee
 */
public class ReadyQue {

    CPU cpu;
    List<Process> processes;
    boolean running;
    int quantum;
    
    public ReadyQue(int quantum) {
        cpu = new CPU();
        running = true;
        this.quantum = quantum;
    }

    public void run() {
        while (running) {
            if (processes.size() <= 0) {
                System.out.println("No more processes left");
                System.out.println("CPU is idle...");
            } else {
                cpu.runProcess(processes.get(0), quantum);
            }
        }
    }
    
    public void addProcesses(List<Process> processes) {
        this.processes = processes;
    }
}
