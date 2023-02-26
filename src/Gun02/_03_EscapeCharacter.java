package Gun02;

public class _03_EscapeCharacter {
    public static void main(String[] args) {
        // Escape Character
        // \n -> yeni satır açıyor
        // \t -> tab tuşuna basılmış etkisi yapıyor
        // \b -> BackSpace basılmış gibi etki yapar, yani 1 karakter geri siler
        // \" -> çift tırnak yazar
        // \\ -> \ işretini koyar
        // \r -> satır başına kadar olan karakterlerin hepsini siler

        System.out.println("Hello World");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \tWorld");
        System.out.println("Hello\bWorld\b");
        System.out.println("Hello\"World");
        System.out.println("Hello\\World");
        System.out.println("Hello\rWorld");
    }
}
