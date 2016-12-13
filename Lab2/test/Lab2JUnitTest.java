/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab2.Laboratorio2;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JPanelFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Estudiante
 */
public class Lab2JUnitTest {

    private FrameFixture window;
    private JPanelFixture panel;

    public Lab2JUnitTest() {
    }

    @Before
    public void setUp() {
        Laboratorio2 frame = GuiActionRunner.execute(() -> new Laboratorio2());
        window = new FrameFixture(frame);
        window.show();
        panel = window.panel("Form");
    }

    @Test
    public void testVisibleComponents() {
        panel.label("lblUsername").requireVisible();
        panel.label("lblTelefono").requireVisible();
        panel.label("lblSexo").requireVisible();
        panel.label("lblInformacion").requireVisible();

        panel.button("guardar").requireVisible();
        panel.button("clear").requireVisible();
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }
}
