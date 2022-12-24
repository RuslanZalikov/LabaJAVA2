public class Point3d extends Point2d{
    private double z; //поля классa

    public Point3d(double x, double y, double z){
        super(x, y);
//        this.x = super.getX();
//        this.y = super.getY();
        this.z = z;
    } //конструкторы
    public Point3d(double x, double y){this(x, y, 0);}
    public Point3d(double x){this(x, 0, 0);}
    public Point3d(){this(0, 0, 0);}

    public static void main(String[] args){                    //мейн

    }
    public double getZ(){return this.z;}

    public void setZ(double value){this.z = value;}

    public boolean equals(Point3d other){return this.getX() == other.getX() && this.getY() == other.getY() && this.z == other.z;} // сравнение

    public double distanceTo(Point3d other){           // дистанция между двумя точками
        return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2) + Math.pow(this.z - other.z, 2));
    }

}
