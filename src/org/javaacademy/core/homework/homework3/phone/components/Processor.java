package org.javaacademy.core.homework.homework3.phone.components;

public class Processor {
    private final int mhz;

    public Processor(int mhz) {
        this.mhz = mhz;
    }

    public int getMhz() {
        return mhz;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "mhz=" + mhz +
                '}';
    }
}
