public class Main {
        public static void main(String[] args) {
            // 1.勇者を生成
            Hero h = new Hero("ミナト");
            // 2.フィールドに初期値をセット
            h.name = "ミナト";
            h.hp = 100;
            System.out.println("勇者" + h.name + "を生み出しました！");
            // 3.勇者のメソッドを呼び出してゆく
            h.sit(5);
            h.slip();
            h.sit(25);
            h.run();
            int yusha_hp = 100;
            int Matango1_hp = 50;
            int Matango2_hp = 48;
            String yusha_name = "ミナト";
            int matango1_level = 10;
            int matango2_level = 10;
            System.out.println(yusha_name + "は5秒座った！");
            yusha_hp += 5;
            System.out.println("HPが5ポイントは回復した！");

            Matango m1 = new Matango();
            m1.hp = 50;
            m1.suffix = 'A';

            Matango m2 = new Matango();
            m2.hp = 48;
            m2.suffix = 'B';

            h.slip();
            m1.run();
            m2.run();
            h.run();;
        }
}
