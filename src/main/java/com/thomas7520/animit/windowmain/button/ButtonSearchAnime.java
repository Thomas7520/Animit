package com.thomas7520.animit.windowmain.button;

import com.thomas7520.animit.utils.Anime;
import com.thomas7520.animit.utils.TextPrompt;
import com.thomas7520.animit.windowmain.PanelAnime;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.thomas7520.animit.Animit.ANIME_UTILS;

public class ButtonSearchAnime extends JTextField{

    private JComboBox<String> animesBox;



    public ButtonSearchAnime(PanelAnime panel) {
        new TextPrompt("Rechercher un animé...", this);
        setAutoscrolls(true);
        setBackground(new Color(255, 222, 173));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                setText(null);
            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 38) {
                    int x = animesBox.getSelectedIndex();
                    if (x > 0) {
                        animesBox.setSelectedIndex(x - 1);
                    }
                    panel.add(animesBox);
                    animesBox.showPopup();
                } else if (e.getKeyCode() == 40) {
                    int x = animesBox.getSelectedIndex();
                    int y = animesBox.getItemCount();
                    if (x + 1 < y)
                        animesBox.setSelectedIndex(x + 1);
                    panel.add(animesBox);
                    animesBox.showPopup();
                }
            }
        });
        addActionListener(actionEvent -> {
            try {
                setText(animesBox.getSelectedItem().toString());
                animesBox.removeAllItems();
                animesBox.hidePopup();
                panel.remove(animesBox);
            } catch (Exception ignored) {
            }
        });
        addCaretListener(new TextFieldCaretListener(panel));
        setBounds(800, 0, 400, 40);


        this.animesBox = new JComboBox<>();
        this.animesBox.setRenderer(new CustomComboBox());
        this.animesBox.setBounds(800, 0, 295, 40);
        this.animesBox.setFocusCycleRoot(true);
        this.animesBox.setFocusTraversalPolicyProvider(true);
        this.animesBox.setAutoscrolls(true);
        this.animesBox.setBorder(null);
        this.animesBox.setOpaque(false);

    }

    private class TextFieldCaretListener implements CaretListener {

        private final PanelAnime panel;

        public TextFieldCaretListener(PanelAnime panel) {
            this.panel = panel;
        }
        public void caretUpdate(CaretEvent e) {

            try {
                animesBox.removeAllItems();
                animesBox.hidePopup();
                panel.remove(animesBox);
                if (e.getMark() > 0) {
                    for (String animeName : ANIME_UTILS.getAnimes()
                            .stream()
                            .map(Anime::getName)
                            .toArray(String[]::new)) {
                        if (animeName.toLowerCase().startsWith(getText().toLowerCase())) {
                            panel.add(animesBox);
                            animesBox.addItem(animeName);
                            animesBox.showPopup();
                        }
                    }
                }
            } catch (Exception ignored) {
            }
            if (e.getMark() < 2) {
                panel.remove(animesBox);
            }
        }
    }

    class CustomComboBox extends JLabel implements ListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                                                      int index, boolean isSelected, boolean cellHasFocus) {

            JLabel label = new JLabel() {
                public Dimension getPreferredSize() {
                    return new Dimension(200, 100);
                }
            };
            label.setText(String.valueOf(value));

            return label;
        }
    }
}
