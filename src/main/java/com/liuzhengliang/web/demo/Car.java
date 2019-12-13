package com.liuzhengliang.web.demo;

import java.util.Objects;

public class Car
{
    int age;
    public Car(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
