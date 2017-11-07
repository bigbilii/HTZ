package Util;
 
import javax.swing.*;
 
public class GUIUtil {
    private static String imageFolder = "e:/project/hutubill/img";
 
    /**
     * 
     * @param p
     * @param strechRate 拉伸比例1表示满屏幕
     */
    public static void showPanel(JPanel p,double strechRate) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(strechRate);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        cp.show(p);
    }
     
    public static void showPanel(JPanel p) {
        showPanel(p,0.85);
    }   
 
    public static boolean checkNumber(JTextField tf, String input) {
        if (!checkEmpty(tf, input))
            return false;
        String text = tf.getText().trim();
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, input + " 需要是整数");
            tf.grabFocus();
            return false;
        }
    }
 
    public static boolean checkZero(JTextField tf, String input) {
        if (!checkNumber(tf, input))
            return false;
        String text = tf.getText().trim();
 
        if (0 == Integer.parseInt(text)) {
            JOptionPane.showMessageDialog(null, input + " 不能为零");
            tf.grabFocus();
            return false;
        }
        return true;
    }
 
    public static boolean checkEmpty(JTextField tf, String input) {
        String text = tf.getText().trim();
        if (0 == text.length()) {
            JOptionPane.showMessageDialog(null, input + " 不能为空");
            tf.grabFocus();
            return false;
        }
        return true;
 
    }
 
    public static int getInt(JTextField tf) {
        return Integer.parseInt(tf.getText());
    }
}