package com.chervonnaya;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
