package org.javaacademy.core.homework.homework3.phone;

import org.javaacademy.core.homework.homework3.phone.components.Camera;
import org.javaacademy.core.homework.homework3.phone.components.PhoneCase;
import org.javaacademy.core.homework.homework3.phone.components.Processor;

import java.util.Arrays;

public class Iphone extends Phone {
    public Iphone(Camera camera, PhoneCase phoneCase, Processor[] processors) {
        super(camera, phoneCase, processors);
    }

    public void getProcessorsInfo() {
        System.out.println(Arrays.toString(processors));
    }
}