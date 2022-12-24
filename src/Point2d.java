public class Point2d {
    private double x, y; //поля класса

    public Point2d(double x, double y){this.x = x; this.y = y;} //конструкторы
    public Point2d(double x){this(x, 0);}
    public Point2d(){this(0, 0);}

    public static void main(String[] args){                    //мейн

    }

    public double getX(){return this.x;}            // Геттеры
    public double getY(){return this.y;}
    public void setX(double value){this.x = value;}    // Сеттеры
    public void setY(double value){this.y = value;}

    public boolean equals(Point2d other){return this.x == other.x && this.y == other.y;} // сравнение

    public double distanceTo2d(Point2d other){           // дистанция между двумя точками
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
