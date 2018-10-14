package edu.jacob.designpattern.state.postpkg;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("Package is already received by clinet");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {

    }
}
