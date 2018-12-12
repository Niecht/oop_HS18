package oop04;
/**
 * This interface describes the function of a simple on/off switch.
 */
public interface Switchable {
/**
 * Sets the switch to on.
 */
    void switchOn();
/**
 * Sets the switch to off.
 */
    void switchOff();
/**
 * Returns true if switched on.
 * @return boolean
 */
    boolean isSwitchedOn();
/**
 * Returns true if switched off.
 * @return boolean
 */
    boolean isSwitchedOff();
}
