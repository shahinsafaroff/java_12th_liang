public class TV {
    int channel = 1; //Default channel is 1
    int volumeLevel = 1; //Default volume is 1
    boolean on = false; //By default, TV is off

    public TV(){ //CONSTRUCTOR
    }
    public void turnOn(){ //METHOD which TURNS ON TV
        on = true;
    }
    public void turnOff(){ //METHOD which TURNS OFF TV
        on = false;
    }
    public void setChannel(int newChannel){ //METHOD which SETS CHANNEL
        if (on && newChannel >= 1 && newChannel <=  120)
            channel = newChannel;
    }
    public void setVolume(int newVolumeLevel) { //METHOD which SETS VOLUME
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }
    public void channelUp(){
        if (on && channel < 120)
            channel++;
    }
    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }
    public void volumeUp(){
        if ( on && volumeLevel < 7)
            volumeLevel++;
    }
    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }

}
