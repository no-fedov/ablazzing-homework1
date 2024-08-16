package org.javaacademy.core.homework.homework3.phone.factory;

import org.javaacademy.core.homework.homework3.phone.Iphone;
import org.javaacademy.core.homework.homework3.phone.components.Camera;
import org.javaacademy.core.homework.homework3.phone.components.PhoneCase;
import org.javaacademy.core.homework.homework3.phone.components.Processor;

public class IphoneFactory {
    private static final int MEGAPIXEL = 8;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 200;
    private static final int LENGTH = 10;
    private static final int MHZ = 1000;

    public static Iphone getIphone() {
        return new Iphone(new Camera(MEGAPIXEL),
                new PhoneCase(WIDTH, HEIGHT, LENGTH),
                new Processor[]{new Processor(MHZ), new Processor(MHZ)});
    }
}