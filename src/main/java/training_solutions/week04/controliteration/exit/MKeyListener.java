package training_solutions.week04.controliteration.exit;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class MKeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent event) {

        char ch = event.getKeyChar();
//        System.out.println(ch);

        if (ch == 'x') {

            System.exit(0);

        } else {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
        }
    }
}