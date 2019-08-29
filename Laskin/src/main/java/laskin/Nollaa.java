/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author jpssilve
 */
public class Nollaa extends BinaryFunction {

    public Nollaa(UIHandler handler, TextField tuloskentta, TextField syotekentta, Button nollaa, Button undoIt, Sovelluslogiikka sovellus) {
        super(handler, tuloskentta, syotekentta, nollaa, undoIt, sovellus);
    }

    @Override
    public void suorita() {
        super.getApp().nollaa();
        super.suorita();
    }
}
