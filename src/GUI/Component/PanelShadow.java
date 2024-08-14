/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Component;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Admin
 */
public class PanelShadow extends JPanel {
    
    int shadowSize = 3;
    float shadowOpacity = 0.3f;
    private Color shadowColor = Color.BLACK;
    JPanel iconBackground;
    JLabel lblIcon, lblTitle, lblContent;
    Color HowerBackgroundColor = new Color(187, 222, 251);

    Color MainColor = new Color(255, 255, 255);
    Color FontColor = new Color(0, 151, 178);
    Color BackgroundColor = new Color(240, 247, 250);
    Color HowerFontColor = new Color(225, 230, 232);

    public PanelShadow() {
        setOpaque(false);
    }

    public PanelShadow(String linkIcon, String title, String content) {
        this.setPreferredSize(new Dimension(300, 450));
        this.setBackground(Color.WHITE);
        this.putClientProperty( FlatClientProperties.STYLE, "arc: 30" );
        this.setLayout(new FlowLayout(1, 0, 10));
        this.setBorder(new EmptyBorder(10,0,0,0));

        iconBackground = new JPanel();
        iconBackground.setPreferredSize(new Dimension(250, 150));
        iconBackground.setBackground(BackgroundColor);
        iconBackground.putClientProperty( FlatClientProperties.STYLE, "arc: 30" );
        iconBackground.setLayout(new FlowLayout(1,20,10));

        lblIcon = new JLabel();
        lblIcon.setIcon(new FlatSVGIcon("./icon/" + linkIcon));
        iconBackground.add(lblIcon);

        this.add(iconBackground);

        lblTitle = new JLabel(title.toUpperCase());
        lblTitle.setForeground(FontColor);
        lblTitle.putClientProperty("FlatLaf.style", "font: 190% $h4.font");
        this.add(lblTitle);

        lblContent = new JLabel(content);
        lblContent.setForeground(Color.gray);
        lblContent.putClientProperty("FlatLaf.style", "font: 135% $medium.font");
        this.add(lblContent);
        
    }
}
