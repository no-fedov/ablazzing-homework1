package org.javaacademy.core.homework.homework3.phone;

import org.javaacademy.core.homework.homework3.phone.components.Camera;
import org.javaacademy.core.homework.homework3.phone.components.PhoneCase;
import org.javaacademy.core.homework.homework3.phone.components.Processor;

public abstract class Phone {
    protected final Camera camera;
    protected final PhoneCase phoneCase;
    protected final Processor[] processors;

    protected Phone(Camera camera, PhoneCase phoneCase, Processor[] processors) {
        this.camera = camera;
        this.phoneCase = phoneCase;
        this.processors = processors;
    }

    public void snap() {
        camera.snap();
    }
}
