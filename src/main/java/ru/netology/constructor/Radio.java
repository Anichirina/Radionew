package ru.netology.constructor;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxChannel = 10;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;

    public Radio(int maxVolume, int minVolume, int maxChannel, int minChannel, int currentVolume, int currentChannel) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }
}
