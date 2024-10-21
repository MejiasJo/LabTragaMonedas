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
    int[] numbers = new int[5];
    
    @Override
    public int[] spin() {
        numbers[0] = (int) (Math.random()*3);
        numbers[1] = (int) (Math.random()*3);
        numbers[2] = (int) (Math.random()*3);
        numbers[3] = (int) (Math.random()*3);
        numbers[4] = (int) (Math.random()*3);
        return numbers;
    }
    
}
