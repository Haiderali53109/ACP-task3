package com.studentdb;

import com.studentdb.ui.MainFrame;
import javax.swing.SwingUtilities;

public class AppMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            // initActions() is already called inside MainFrame's constructor,
            // so we do NOT call it again here.
            frame.setVisible(true);
        });
    }
}
