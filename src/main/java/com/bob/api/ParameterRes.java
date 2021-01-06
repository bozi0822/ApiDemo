package com.bob.api;

public class ParameterRes {
    private String temperature;

    private String pressure;

    private String Current;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCurrent() {
        return Current;
    }

    public void setCurrent(String current) {
        Current = current;
    }

    @Override
    public String toString() {
        return "ParameterRes{" +
                "temperature='" + temperature + '\'' +
                ", pressure='" + pressure + '\'' +
                ", Current='" + Current + '\'' +
                '}';
    }
}
