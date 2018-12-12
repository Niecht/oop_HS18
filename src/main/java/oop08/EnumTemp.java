package oop08;

import oop02.Element;

public enum EnumTemp {
    GAS("gasförmig"), LIQUID("flüssig"), SOLID("fest");

    private String state;

    EnumTemp(final String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
