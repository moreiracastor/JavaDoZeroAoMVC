package section8.Retangulo.Entities;

public class Retangulo {
    public double height, width;

    public double area(){
        return height * width;
    }

    public double perimeter(){
        return 2*height + 2*width;
    }

    public double diagonal(){
        double add = Math.pow(width, 2) + Math.pow(height, 2);

        return Math.sqrt(add);
    }

    public String toString(){
        return "Perimeter: " + perimeter() +"\n" + "Area: " + area() + "\n" + "Diagonal: " + String.format("%.2f", diagonal());
    }
}
