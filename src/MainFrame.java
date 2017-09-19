import com.sun.org.apache.xpath.internal.operations.Plus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button Exitbtn=new Button("Exit");
    private Button plus=new Button("Plus");
    private Label label=new Label("0");
    private int n= 0;
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setLocation(100,120);
        this.setSize(400,300);
        this.setLayout(null);
        this.add(Exitbtn);
        this.add(plus);
        this.add(label);
        Exitbtn.setBounds(260,210,80,30);
        Exitbtn.setBackground(new Color(40, 223, 255));
        plus.setBounds(100,40,80,30);
        label.setBounds(30,40,80,30);
        Exitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            n++;
                label.setText(Integer.toString(n));
                       }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });

    }
}
