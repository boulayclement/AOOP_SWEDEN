package Lab1.ColorChanger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger {
    private static class CircleIcon implements Icon {
        private Color color;
        private int width;
        private int height;

        public CircleIcon(Color color, int width, int height) {
            this.color = color;
            this.width = width;
            this.height = height;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.setColor(color);
            g.fillOval(x, y, width, height);
        }

        @Override
        public int getIconWidth() {
            return width;
        }

        @Override
        public int getIconHeight() {
            return height;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CircleIcon circleIcon = new CircleIcon(Color.RED, 100, 100);

        JLabel label = new JLabel(circleIcon);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleIcon.color = Color.RED;
                label.repaint();
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleIcon.color = Color.GREEN;
                label.repaint();
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circleIcon.color = Color.BLUE;
                label.repaint();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        frame.add(label, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}