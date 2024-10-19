/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SlotMachines;

/**
 *
 * @author Johel M
 */
public class SlotMachine implements ISlotMachine{
    int[] numbers = new int[3];
    
    @Override
    public int[] spin() {
        numbers[0] = (int) (Math.random()*8);
        numbers[1] = (int) (Math.random()*8);
        numbers[2] = (int) (Math.random()*8);
        return numbers;
    }
    
}
