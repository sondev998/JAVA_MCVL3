package com.nokia.mid.ui;

/**
 * Compile-time compatibility shim for Nokia's proprietary Java ME API.
 * Device backlight control is intentionally a no-op on non-Nokia emulators.
 */
public final class DeviceControl {
    private DeviceControl() { }

    public static void setLights(int light, int level) { }
}
