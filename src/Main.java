public class Main {
    public static void main(String[] args) {
        Author terryPratchett = new Author("Терри", "Пратчетт");
        Author joanneRowling = new Author("Джоан", "Роулинг");

        Book harryPotterPart1 = new Book("Гарри Поттер и филосовский камень", 1997, joanneRowling);
        Book theWitchersAbroad = new Book("Ведьмы за границей", 1991, terryPratchett);

        System.out.println(theWitchersAbroad.toString() + "\n" + harryPotterPart1.toString());
        System.out.println(theWitchersAbroad.hashCode());

    }
}