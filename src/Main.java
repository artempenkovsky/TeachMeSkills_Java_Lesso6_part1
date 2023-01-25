/**
 *  Написать иерархию классов «Фигуры».
 *  Фигура(абстрактный класс) -> Треугольник, Прямоугольник, Круг.
 *  Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
 *  Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.
 */
public class Main {

    public static void main(String[] args) {
        Figure[] figure = {new Rectangle(8, 12),
                           new Triangle(5, 8, 5),
                           new Circle(10),
                           new Rectangle(14,15),
                           new Circle(20)};

        FigureList list = new FigureList();
        for (Figure fig : figure) {
            list.add(fig);
        }
        double perimeter = 0;
        for (Figure figure1:figure){
            perimeter = perimeter + figure1.getPerimeter();
        }

        list.showAllList();
        System.out.println("Perimeter of all figures: " + perimeter);
    }
}