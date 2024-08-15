package org.javaacademy.core.homework.homework3.shop;

/**
 * Магазин
 */
public class Shop {
    private boolean floorIsClear;
    private boolean workersHaveBadges;
    private int workersCount;

    public Shop(boolean floorIsClear, boolean workersHaveBadges, int workersCount) {
        this.floorIsClear = floorIsClear;
        this.workersHaveBadges = workersHaveBadges;
        this.workersCount = workersCount;
    }

    public boolean isFloorClear() {
        return floorIsClear;
    }

    public boolean shouldWorkersBadges() {
        return workersHaveBadges;
    }

    public int getWorkersCount() {
        return workersCount;
    }
}