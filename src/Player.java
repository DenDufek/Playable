// Файл: Player.java

// Клас, який реалізує інтерфейси Playable та Recodable
public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Відтворення...");
    }

    @Override
    public void pause() {
        System.out.println("Пауза...");
    }

    @Override
    public void stop() {
        System.out.println("Зупинка...");
    }

    @Override
    public void record() {
        System.out.println("Запис...");
    }
}
