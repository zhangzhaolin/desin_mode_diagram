import game.Gamer;
import game.Memento;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        File file = new File(Main.class.getResource("/out.txt").toURI());
        PrintWriter writer = new PrintWriter(file);

        for (int i = 0; i < 100; i++) {
            gamer.bet();
            writer.write("所持金额为：" + gamer.getMoney() + " 元。\n");

            // 如何处理Memento
            if (gamer.getMoney() > memento.getMoney()) {
                writer.write("保存游戏当前状态。\n");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                writer.write("恢复以前的状态。\n");
                gamer.restoreMemento(memento);
            }
        }

        writer.close();
        System.out.println("结束。");

    }
}
