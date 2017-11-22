/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu_schdueling;

/**
 *
 * @author rajee
 */
public class Process {
    
    public Process(int id, int arrivalTime, int timeLeft, int runtime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.timeLeft = timeLeft;
        this.runtime = runtime;
    }
    
    public int id;
    public int arrivalTime;
    int burstTime;
    int timeLeft;
    int runtime; 
}
