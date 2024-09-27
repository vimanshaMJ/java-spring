class Computer {
    public void playMusic() {
        System.out.println("Music playing...");
    }

    public String getPen(int cost) {
        if (cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

public class Demo {
    public static void main(String a[]) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getPen(8);
        System.out.println(str);
    }
}
