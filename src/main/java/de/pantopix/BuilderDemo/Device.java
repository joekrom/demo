package de.pantopix.BuilderDemo;

import java.time.LocalDateTime;
import java.util.UUID;

public class Device {
    private UUID deviceId;
    private String name;
    private boolean status;
    private LocalDateTime startDateTime;
    private double generatedPower;

    Device(UUID deviceId, String name, boolean status, LocalDateTime startDateTime, double generatedPower) {
        this.deviceId = deviceId;
        this.name = name;
        this.status = status;
        this.startDateTime = startDateTime;
        this.generatedPower = generatedPower;
    }


    @Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", startDateTime=" + startDateTime +
                ", generatedPower=" + generatedPower +
                '}';
    }
}
