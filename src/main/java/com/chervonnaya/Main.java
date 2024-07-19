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

        if(CompareUtil.compareFiguresByPerimeter(circle, triangle) > 0) {
            System.out.println("Периметр первой фигуры больше периметра второй фигуры");
        } else {
            System.out.println("Периметр второй фигуры больше периметра первой фигуры");
        }

        if(CompareUtil.compareFiguresByArea(triangle, rectangle) > 0) {
            System.out.println("Площадь первой фигуры больше площади второй фигуры");
        } else {
            System.out.println("Площадь второй фигуры больше площади первой фигуры");
        }

    }
}
