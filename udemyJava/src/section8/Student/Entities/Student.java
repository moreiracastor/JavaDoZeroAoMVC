package section8.Student.Entities;

public class Student {
    public String name;
    public float n1, n2, n3;

    public String exame(){
        float media = (n1 + n2 + n3) / 3;
        return (media >= 60) ? "FINAL GRADE = "
                                + media
                                + "\nPASSED`": "FINAL GRADE = "
                                + media
                                + String.format("\nMISSING %.2f POINTS", 60 - media) ;
    }
}
