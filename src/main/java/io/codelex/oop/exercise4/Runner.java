package io.codelex.oop.exercise4;

public enum Runner {
    ADVANCED(1, 30),
    INTERMEDIATE(31, 60),
    BEGINNER(61, 90),
    LAZY(0, 0);

    private int minMinutes;
    private int maxMinutes;

    Runner(int minMinutes, int maxMintues) {
        this.maxMinutes = maxMintues;
        this.minMinutes = minMinutes;
    }

    public int getMinMinutes() {
        return this.minMinutes;
    }

    public int getMaxMinutes() {
        return this.maxMinutes;
    }

    static Runner getFitnesLevel(int minutes) {
        Runner level = Runner.LAZY;
        for (Runner r : Runner.values()) {
            if (minutes >= r.getMinMinutes() && minutes <= r.getMaxMinutes()) {
                level = r;
            }
        }
        return level;
    }

}
