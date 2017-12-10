package viewrmd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class RetrieveInformation extends JFrame implements ActionListener {

    private class Delivery {

        String id;
        String name;
        String type;

        public Delivery(String id, String name, String type) {
            this.id = id;
            this.name = name;
            this.type = type;
        }
    }

    private ArrayList<Delivery> deliveryList;
    private JTable deliverytable;

    public static void main(String[] args) {
        new RetrieveInformation().setVisible(true);
    }

    public RetrieveInformation() {
        super("Delivery Information");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        deliverytable = new JTable();
        JButton button = new JButton("Display Delivery Information");
        button.setBackground(Color.green);
        button.addActionListener(this);

        setLayout(new BorderLayout());
        add(new JScrollPane(deliverytable), BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        deliveryList = new ArrayList<Delivery>();
        deliveryList.add(new Delivery("DM001", "Yap Wei Keat", "Delivering"));
        deliveryList.add(new Delivery("DM002", "Ting Sze Yan", "Pending"));
        deliveryList.add(new Delivery("DM003", "Yong Wei Sheong", "Pending"));
        deliveryList.add(new Delivery("DM004", "Yong Zhi Qian", "Delivering"));
        deliveryList.add(new Delivery("DM005", "Liew Cheng Khai", "Delivering"));
        deliveryList.add(new Delivery("DM006", "Yap Poh Ming", "Delivering"));
        deliveryList.add(new Delivery("DM007", "You Yang Du", "Pending"));
        deliveryList.add(new Delivery("DM008", "Wong Jia Wei", "Delivering"));
        deliveryList.add(new Delivery("DM009", "Yee Zhi Khai", "Pending"));
        deliveryList.add(new Delivery("DM010", "Goh Wei Qian", "Delivering"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Delivery Man ID", "Name", "Status"});
        model.setRowCount(deliveryList.size());
        int row = 0;
        for (Delivery data : deliveryList) {
            model.setValueAt(data.id, row, 0);
            model.setValueAt(data.name, row, 1);
            model.setValueAt(data.type, row, 2);
            row++;
        }
        deliverytable.setModel(model);
    }

}
