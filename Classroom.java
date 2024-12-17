public class Classroom {
    public static void main(String[]args){

        Wilder luc = new Wilder("Luc",true);
        System.out.println(luc.whoAmI());

        Wilder marieBlanche = new Wilder("Marie-Blanche",false);
        System.out.println(marieBlanche.whoAmI());

        Wilder rose = new Wilder("Rose",true);
        System.out.println(rose.whoAmI());

    //j'ai pas assumée de mettre les noms de notre promo XD
    }
}
