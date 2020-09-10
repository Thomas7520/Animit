package com.thomas7520.animit.windowmain;

import com.thomas7520.animit.windowmain.button.ButtonAddAnime;
import com.thomas7520.animit.windowmain.button.ButtonSearchAnime;

import javax.swing.*;
import java.awt.*;

public class PanelAnime extends JLabel {


    public PanelAnime() {
        this.add(new ButtonAddAnime());
        this.add(new ButtonSearchAnime(this));


    }




    @Override
    protected void paintComponent(Graphics g) {
//        try {
//            g.drawImage(read(getClass().getResourceAsStream("/anime.jpg")), 0,0, this);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        g.drawLine(800,900, 800,0);
        g.drawLine(0,40, 1100,40);


        Font mainFont = new Font("Animit", Font.PLAIN, 45);
        g.setFont(mainFont);
        g.setColor(Color.RED.darker());
        g.drawString("\uD835\uDC68\uD835\uDC8F\uD835\uDC8A\uD835\uDC8E\uD835\uDC8A\uD835\uDC95"
                , 330, 90);

        Font lastViewFont = new Font("LastView", Font.PLAIN, 30);

        g.setFont(lastViewFont);
        g.setColor(Color.RED.brighter());
        g.drawString("\uD835\uDCD3\uD835\uDC86\uD835\uDCFB\uD835\uDCF7\uD835\uDCF2\uD835\uDC86\uD835\uDCFB \uD835\uDCEA\uD835\uDCF3\uD835\uDCF8\uD835\uDCFE\uD835\uDCFD\uD835\uDC86́",
                50, 200);


        Font bestAnime = new Font("BestAnime", Font.PLAIN, 30 );


        g.setFont(bestAnime);
        g.setColor(Color.RED.brighter());
        g.drawString("\uD835\uDCD2\uD835\uDCF8\uD835\uDCFE\uD835\uDCF9 \uD835\uDCED\uD835\uDC86 \uD835\uDCECœ\uD835\uDCFE\uD835\uDCFB \uD83D\uDC98", 500, 200);
        super.paintComponent(g);


    }




}
