/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.journaldev.com;

/**
 *
 * @author Brian
 */
public class AdapterPatternTest {

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();

    }

    private static void testClassAdapter() {
        SocketAdpater socketAdpater = new SocketClassAdapterImpl();

        Volt v3 = getVolt(socketAdpater, 3);
        Volt v12 = getVolt(socketAdpater, 12);
        Volt v120 = getVolt(socketAdpater, 120);
        System.out.println("v3 volts using Class Adapter =" + v3.getVolts());
        System.out.println("v12 volts using Class Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter = " + v120.getVolts());

    }

    public static Volt getVolt(SocketAdpater sockAdpater, int i) {
        switch (i) {
            case 3:
                return sockAdpater.get3Volt();
            case 12:
                return sockAdpater.get12Volt();
            case 120:
                return sockAdpater.get120Volt();
            default:
                return sockAdpater.get120Volt();
        }
    }

    private static void testObjectAdapter() {
        SocketAdpater sockAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 12);
        Volt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Class Adapter =" + v3.getVolts());
        System.out.println("v12 volts using Class Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter = " + v120.getVolts());

    }
}
