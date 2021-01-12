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
    private boolean nextChannel;
    private boolean nextVolume;


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



