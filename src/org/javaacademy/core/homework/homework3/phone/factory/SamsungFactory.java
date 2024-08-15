package org.javaacademy.core.homework.homework3.phone.factory;

import org.javaacademy.core.homework.homework3.phone.Samsung;
import org.javaacademy.core.homework.homework3.phone.components.Camera;
import org.javaacademy.core.homework.homework3.phone.components.PhoneCase;
import org.javaacademy.core.homework.homework3.phone.components.Processor;

public class SamsungFactory {
    public static Samsung getSamsung() {
        return new Samsung(new Camera(16),
                new PhoneCase(60, 200, 15),
                new Processor[]{new Processor(1500)});
    }
}