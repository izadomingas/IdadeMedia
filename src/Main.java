public class Main {
    public static void main(String[] args) {
          public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        double mediaIdade = (idade1 + idade2 + idade3) / 3;

        if (mediaIdade <= 25) {
            System.out.println("Jovem!");
        } else if (mediaIdade <= 60) {
            System.out.println("Adulta!");
        } else   {
            System.out.println("Idosa!");
    }
}}
