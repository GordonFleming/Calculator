/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author 24740
 */
public class Radio {

    int volume;
    double frequency;
    double preset;
    boolean on;

    public Radio() {

    }

    public void changeVolumeBy(int d) {
        volume = volume + d;
    }

    public void setVolume(int v) {
        volume = v;
    }

    public void tuneTo(double freq) {
        frequency = freq;
    }

    public void tuneToPreset() {
        preset = frequency;
    }

    public void savePreset() {
        frequency = preset;
    }

    public void togglePower() {
        if (on) {
            on = false;
        } else {
            on = true;
        }
    }

    @Override
    public String toString() {

        String power = "k";
        if(on){power="On";}
        else{power="Off";}
        power = "on";
        
    
    return "Radio [" + power + "] Volume [" + volume + "] Frequency [" + frequency + "] Preset [" + preset+"]" ;

}
    public static void main(String[] args) {
        Radio r = new Radio();
        r.setVolume(5);
        r.tuneTo(94.7);
        r.savePreset();
        r.tuneTo(102.7);
        r.tuneToPreset();
        r.togglePower();
        System.out.println(r);   
        
    }   
}
