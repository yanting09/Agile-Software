package sprint3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ViewReport extends JFrame implements ActionListener {

    private class Delivery {

        String id;
        String name;
        String date;
        String ordernum;
        String sales;

        public Delivery(String id, String name, String date, String ordernum, String sales) {
            this.id = id;
            this.name = name;
            this.date = date;
            this.ordernum = ordernum;
            this.sales = sales;
        }
    }

    private ArrayList<Delivery> deliveryList;
    private JTable deliverytable;

    public static void main(String[] args) {
        new ViewReport().setVisible(true);
    }

    public ViewReport() {
        super("View Report");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        deliverytable = new JTable();

        String text = "Fastest Delivery Man" + "<br>"
                + "Tel: 03-98745612" + "<br>"
                + "Fax: 03-98745621" + "<br>"
                + "Address: 12, Lorong Titiwangsa 12, Titiwangsa, 53200 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur";

        JPanel p = new JPanel(new GridLayout(0, 1));
        p.add(new JLabel("<html><div style='text-align: center;'>" + text + "</div></html>"));
        String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        p.add(new JLabel(date));

        p.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Daily Sales Report", TitledBorder.CENTER,
                TitledBorder.TOP));

        JButton button = new JButton("Generate Report");
        button.setForeground(Color.green);
        button.addActionListener(this);

        JButton button1 = new JButton("Print Report");
        button1.addActionListener(new MyAction());

        setLayout(new BorderLayout());
        add(new JScrollPane(deliverytable), BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        add(button1, BorderLayout.WEST);
        add(p, BorderLayout.NORTH);

        deliveryList = new ArrayList<Delivery>();
        deliveryList.add(new Delivery("DM001", "Yap Wei Keat", "11-12-2017", "7", "RM 56.50"));
        deliveryList.add(new Delivery("DM002", "Ting Sze Yan", "11-12-2017", "12", "RM 175.00"));
        deliveryList.add(new Delivery("DM003", "Yong Wei Sheong", "11-12-2017", "5", "RM 30.50"));
        deliveryList.add(new Delivery("DM004", "Yong Zhi Qian", "11-12-2017", "9", "RM 85.90"));
        deliveryList.add(new Delivery("DM005", "Liew Cheng Khai", "11-12-2017", "3", "RM 15.50"));
        deliveryList.add(new Delivery("DM006", "Wong Jia Wei", "11-12-2017", "10", "RM 102.30"));
        deliveryList.add(new Delivery("DM007", "Yee Zhi Khai", "11-12-2017", "11", "RM 135.29"));
        deliveryList.add(new Delivery("DM008", "You Yang Du", "11-12-2017", "16", "RM 256.80"));
        deliveryList.add(new Delivery("DM009", "Ben Affleck", "11-12-2017", "7", "RM 56.50"));
        deliveryList.add(new Delivery("DM010", "Henry Cavill", "11-12-2017", "12", "RM 175.00"));
        deliveryList.add(new Delivery("DM011", "Gal Gadot", "11-12-2017", "5", "RM 30.50"));
        deliveryList.add(new Delivery("DM012", "Barry Allen", "11-12-2017", "9", "RM 85.90"));
        deliveryList.add(new Delivery("DM013", "Clark Kent", "11-12-2017", "3", "RM 15.50"));
        deliveryList.add(new Delivery("DM014", "Amy Adams", "11-12-2017", "10", "RM 102.30"));
        deliveryList.add(new Delivery("DM015", "Lois Lane", "11-12-2017", "11", "RM 135.29"));
        deliveryList.add(new Delivery("DM016", "Bruce Wayne", "11-12-2017", "16", "RM 256.80"));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Delivery Man ID", "Name", "Delivery Date", "Orders Taken", "Total Sales(RM)"});
        model.setRowCount(deliveryList.size());
        int row = 0;
        for (Delivery data : deliveryList) {
            model.setValueAt(data.id, row, 0);
            model.setValueAt(data.name, row, 1);
            model.setValueAt(data.date, row, 2);
            model.setValueAt(data.ordernum, row, 3);
            model.setValueAt(data.sales, row, 4);
            row++;
        }
        deliverytable.setModel(model);
    }

    public class MyAction implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Daily Sales Report is printing.....");
        }
    }

}
