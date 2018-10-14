package edu.jacob.designpattern.state.postpkg;


public class Package {

    private PackageState state = new OrderedState();

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printState() {
        state.printStatus();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Package{" +
                "state=" + state +
                '}';
    }
}
