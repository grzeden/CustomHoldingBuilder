package edu.grzegorzewski.customholdingslistbuilder;

import java.util.ArrayList;

/**
 * TODO Class description.
 *
 * @author Dennis Grzegorzewski.
 * @version 1.0, 11/20/2016
 */
class Zone {

    /*
     * Declare class variables.
     */
    private ArrayList<String> states;

    /*
     * Constructors.
     */

    /**
     * No-arg constructor
     */
    public Zone() {
        this.states = (new ArrayList<String>());
    } //end constructor

    /**
     * Full-arg constructor
     */
    public Zone(ArrayList<String> states) {
        this.states = states;
    } //end constructor

    /*
     * Methods.
     */

    /**
     * TODO Method description.
     *
     * @param state
     * @return - true if this list changed as a result of the call
     * @see #states
     * @see #deleteState(String)
     * @see #setStates(ArrayList)
     * @see #getStates()
     * @since 1.0
     */
    public boolean addState(String state) {
        return this.states.add(state);
    } // end method addState

    /**
     * TODO Method description.
     *
     * @param state
     * @return - true if this list contained the specified element
     * @see #states
     * @see #addState(String)
     * @see #setStates(ArrayList)
     * @see #getStates()
     * @since 1.0
     */
    public boolean deleteState(String state) {
        return this.states.remove(state);
    } // end method deleteState

    /**
     * TODO Method description.
     *
     * @param states ArrayList of Strings to initialize this
     * @see #states
     * @see #addState(String)
     * @see #deleteState(String)
     * @see #getStates()
     * @since 1.0
     */
    public void setStates(ArrayList<String> states) {
        this.states = states;
    } // end method setStates

    /**
     * TODO Method description.
     *
     * @return - ArrayList of Strings in this
     * @see #states
     * @see #addState(String)
     * @see #deleteState(String)
     * @see #setStates(ArrayList)
     * @since 1.0
     */
    public ArrayList<String> getStates() {
        return states;
    } // end method getStates

    /**
     * TODO Method description.
     *
     * @return
     * @see #states
     * @see #addState(String)
     * @see #deleteState(String)
     * @see #getStates()
     * @see #setStates(ArrayList)
     * @since 1.0
     */
    @Override
    public String toString() {
        return "Zone{" +
                "states=" + states +
                '}';
    } // end method toString

} // end class Zone
