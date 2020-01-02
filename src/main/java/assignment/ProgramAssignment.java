package assignment;

public class ProgramAssignment {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Ciocolata Milka", "12002", 100.0, 15.0);
        Wine wine = new Wine("Vin alb Jidvei", "55200s1", 1.0, 50.0);
        

        System.out.println(chocolate + ", Price: " + chocolate.sellPrice());

        System.out.println(wine + ", Price: " + wine.sellPrice());

    }
}
