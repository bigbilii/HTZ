package gui.panel;

import Util.CenterPanel;
import Util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{
    public static MainPanel instance     = new MainPanel();

    private JToolBar bar = new JToolBar();
    private JButton bSpend = new JButton("消费一览");
    private JButton bRecord = new JButton("记一笔");
    private JButton bcategory = new JButton("消费分类");
    private JButton bReport = new JButton("日消费报表");
    private JButton bconfig = new JButton("设置");
    private JButton bBackup = new JButton("备份");
    private JButton bRecover = new JButton("恢复");

    CenterPanel workPanel = new CenterPanel(0.8);

    public MainPanel() {
        setLayout(new BorderLayout());
        bar.add(bSpend);
        bar.add(bRecord);
        bar.add(bcategory);
        bar.add(bReport);
        bar.add(bconfig);
        bar.add(bBackup);
        bar.add(bRecover);
        bar.setFloatable(false);

        add(bar,BorderLayout.NORTH);
        add(workPanel,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(new MainPanel());
    }

}
