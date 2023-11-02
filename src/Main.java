// Файл: Main.java

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Для інтерфейсу Playable:");
        player.play();
        player.pause();
        player.stop();

        System.out.println("\nДля інтерфейсу Recodable:");
        player.record();
        player.pause();
        player.stop();
    }
}
