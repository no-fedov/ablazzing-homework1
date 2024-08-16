package org.javaacademy.core.homework.homework3.phone.factory;

import org.javaacademy.core.homework.homework3.phone.Samsung;
import org.javaacademy.core.homework.homework3.phone.components.Camera;
import org.javaacademy.core.homework.homework3.phone.components.PhoneCase;
import org.javaacademy.core.homework.homework3.phone.components.Processor;

public class SamsungFactory {
    private static final int MEGAPIXEL = 16;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 200;
    private static final int LENGTH = 15;
    private static final int MHZ = 1500;

    public static Samsung getSamsung() {
        return new Samsung(new Camera(MEGAPIXEL),
                new PhoneCase(WIDTH, HEIGHT, LENGTH),
                new Processor[]{new Processor(MHZ)});
    }
}