public class Hero {
    String name;
    int hp;
    Sword sword;
    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    public void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }

    public void sit(int sec) {
        String name = "これはテストメッセージです";
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    public void slip() {
        System.out.println(this.name + "は、転んだ!");
        System.out.println("5のダメージ！");
    }

    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
