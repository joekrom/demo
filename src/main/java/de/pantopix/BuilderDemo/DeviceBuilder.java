package de.pantopix.BuilderDemo;

import java.time.LocalDateTime;
import java.util.UUID;

public class DeviceBuilder {
    private UUID deviceId;
    private String name;
    private boolean status;
    private LocalDateTime startDateTime;
    private double generatedPower;

    public DeviceBuilder setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public DeviceBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DeviceBuilder setStatus(boolean status) {
        this.status = status;
        return this;
    }

    public DeviceBuilder setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public DeviceBuilder setGeneratedPower(double generatedPower) {
        this.generatedPower = generatedPower;
        return this;
    }

    /*public Device createDevice() {
        return new Device(deviceId, name, status, startDateTime, generatedPower);
    }*/

    public Device build() {
        return new Device(deviceId, name, status, startDateTime, generatedPower);
    }
}