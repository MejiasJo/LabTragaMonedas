/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import FrmViews.FrmSlotMachine;
import SlotMachines.SlotMachine;

/**
 *
 * @author Johel M
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SlotMachine machine = new SlotMachine();
        FrmSlotMachine frm = new FrmSlotMachine();
        ControllerSlotMachine controller = new ControllerSlotMachine(machine,frm);
        frm.setController(controller);
        frm.show();
    }
    
}
