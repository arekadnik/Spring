package com.arek_stadnik.sptest.week1.car;

public class Car {
    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    String mark;
    String model;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
