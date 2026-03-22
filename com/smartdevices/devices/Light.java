package com.smartdevices.devices;

import com.smartdevices.interfaces.SmartDevice;

    public class Light implements SmartDevice {

        public void turnOn() {
            System.out.println("Light is ON");
        }

        public void turnOff() {
            System.out.println("Light is OFF");
        }
    }

