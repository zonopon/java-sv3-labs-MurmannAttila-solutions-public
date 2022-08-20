package training_solutions.week04.controliteration.exit;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ExitPro {

    public static void main(String[] argv) throws Exception {

        System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű megnyomásával");
        JTextField textField = new JTextField();

        textField.addKeyListener(new MKeyListener());

        JFrame jframe = new JFrame();

        jframe.add(textField);

        jframe.setSize(0, 0);       // csak a 0 értékek miatt nem látszik a szükséges grafikus ablak
//        jframe.setSize(200, 200);             // ha ezt a sort használod, akkor a grafikus ablakot is láthatod

        jframe.setVisible(true);
    }
}
