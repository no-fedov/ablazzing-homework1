package org.javaacademy.core.homework.homework3.phone.factory;

import org.javaacademy.core.homework.homework3.phone.Iphone;
import org.javaacademy.core.homework.homework3.phone.components.Camera;
import org.javaacademy.core.homework.homework3.phone.components.PhoneCase;
import org.javaacademy.core.homework.homework3.phone.components.Processor;

public class IphoneFactory {
    public static Iphone getIphone() {
        return new Iphone(new Camera(8),
                new PhoneCase(60, 200, 10),
                new Processor[]{new Processor(1000), new Processor(1000)});
    }
}