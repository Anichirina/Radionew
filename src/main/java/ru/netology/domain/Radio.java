package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxChannel = 10;
    private int minChannel = 0;
    private int currentVolume;
    private int currentChannel;


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
        return currentChannel++;

    }


        public int switchVolume(){
            if (currentVolume > maxVolume) {
                currentVolume = maxVolume;
                return maxVolume;
            }
            if (currentVolume < minVolume) {
                currentVolume = minVolume;
                return minVolume;
            }

            return currentVolume++;
    }
    public int prewChannel(){
        if(currentChannel==maxChannel);
       return currentChannel--;
                 }
    public int nextChannel(){
        if(currentChannel==minChannel);
        return currentChannel++;
    }
    public int prewVolume(){
    if(currentVolume==maxVolume);
    return currentVolume--;
}
    public int nextVolume(){
        if(currentVolume==minVolume);
        return currentVolume++;
    }
}



