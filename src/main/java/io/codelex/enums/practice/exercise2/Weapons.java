package io.codelex.enums.practice.exercise2;

public enum Weapons {
    S("SCISSOR"),
    P("PAPER"),
    T("STONE");

    private final String weapon;

    Weapons(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

}
