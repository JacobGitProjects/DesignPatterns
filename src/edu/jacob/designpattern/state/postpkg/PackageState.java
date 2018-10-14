package edu.jacob.designpattern.state.postpkg;

public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}
