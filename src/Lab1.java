public class Lab1 {
    public static void main(String[] args){
        Point3d first = new Point3d(0, 3, 8);
        Point3d second = new Point3d(3, 7, -5);
        Point3d third = new Point3d(3, 10, -5);
        Lab1 S = new Lab1();
        if (!first.equals(second) && !second.equals(third) && !third.equals(first)) {
            System.out.println(S.computeArea(first, second, third));
        }
        else {
            System.out.println("Треугольник не создан, так как точки совпадают");
        }
    }
    public double computeArea(Point3d first_point, Point3d second_point, Point3d third_point){
        double first_line = first_point.distanceTo(second_point);
        double second_line = second_point.distanceTo(third_point);       // считаем длинны сторон
        double third_line = third_point.distanceTo(first_point);

        double p = (first_line + second_line + third_line)/2;            //считаем полупериметр

        double s = Math.sqrt(p*(p - first_line)*(p - second_line)*(p - third_line)); //считаем площадь по Герону
        s *= 100; s = (int)s; s /= 100;
        return s;
    }
}
