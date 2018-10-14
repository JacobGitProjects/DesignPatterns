package edu.jacob.designpattern.state;

import edu.jacob.designpattern.state.postpkg.DeliveredState;
import edu.jacob.designpattern.state.postpkg.OrderedState;
import edu.jacob.designpattern.state.postpkg.Package;
import edu.jacob.designpattern.state.postpkg.ReceivedState;

public class StatePattenDemo {

    public static void main(String[] args) {

        Package pkg = new Package();

        pkg.setState(new OrderedState());
        pkg.printState();

        pkg.setState(new DeliveredState());
        pkg.printState();


        pkg.setState(new ReceivedState());
        pkg.printState();

    }
}
