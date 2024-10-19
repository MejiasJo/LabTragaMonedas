/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import FrmViews.IView;
import SlotMachines.ISlotMachine;
import java.io.File;
import javax.sound.sampled.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Johel M
 */
public class ControllerSlotMachine extends Thread {

    ISlotMachine machine;
    IView frm;
    Clip sound;

    public ISlotMachine getMachine() {
        return machine;
    }

    public IView getFrm() {
        return frm;
    }

    public ControllerSlotMachine(ISlotMachine machine, IView frm) {
        this.machine = machine;
        this.frm = frm;
    }

    @Override
    public void run() {
        refress();
    }

    public void refress() {
        int[] numbers;
        int i = 0;
        sound("src/Sound/mixkit-slot-machine-random-wheel-1930.wav");
        do {
            i++;
            numbers = machine.spin();
            frm.display(numbers[0], numbers[1], numbers[2]);
            stopScreen(70);
        } while (i < 40);
        sound("src/Sound/mixkit-magical-coin-win-1936.wav");
    }

    public void stopScreen(int time) {
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sound(String url) {
        try{
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(url));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        }catch(Exception e){ 
            e.printStackTrace();
        }
    }
}
