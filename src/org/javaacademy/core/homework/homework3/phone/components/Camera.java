package org.javaacademy.core.homework.homework3.phone.components;

public class Camera {
    private final int megapixelsCount;

    public Camera(int megapixelsCount) {
        this.megapixelsCount = megapixelsCount;
    }

    public void snap() {
        System.out.println("Сделано фото");
    }
}
