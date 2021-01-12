package ru.netology.domain;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxChannel = 10;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;
    private boolean nextChannel;
    private boolean nextVolume;

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

    public boolean isNextChannel() {
        return nextChannel;
    }

    public void setNextChannel(boolean nextChannel) {
        this.nextChannel = nextChannel;
    }

    public boolean isNextVolume() {
        return nextVolume;
    }

    public void setNextVolume(boolean nextVolume) {
        this.nextVolume = nextVolume;
    }
    public Radio(){

    }

    public Radio(int maxVolume, int minVolume, int maxChannel, int minChannel, int currentVolume, int currentChannel, boolean nextChannel, boolean nextVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentVolume = currentVolume;
        this.currentChannel = currentChannel;
        this.nextChannel = nextChannel;
        this.nextVolume = nextVolume;
    }

    public int switchChannel() {
        if (currentChannel > maxChannel) {
            currentChannel = minChannel;
            return minChannel;
        }
        if (currentChannel < minChannel) {
            currentChannel = maxChannel;
            return maxChannel;
        }
        if (currentChannel == maxChannel) {
            currentChannel = maxChannel;
            return maxChannel;
        }
        if (nextChannel == true) {
            return currentChannel++;
        }
         else {
             return currentChannel--;
        }
        }

        public int switchVolume() {
            if (currentVolume > maxVolume) {
                currentVolume = maxVolume;
                return maxVolume;
            }
            if (currentVolume < minVolume) {
                currentVolume = minVolume;
                return minVolume;
            }
            if (nextVolume == true) {
                return currentVolume++;
            }
                else {
                return  currentVolume--;
            }


        }

}



