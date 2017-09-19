import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button Exitbtn=new Button("Exit");
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setLocation(100,120);
        this.setSize(400,300);
        this.setLayout(null);
        this.add(Exitbtn);
        Exitbtn.setBounds(260,210,80,30);
        Exitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
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
