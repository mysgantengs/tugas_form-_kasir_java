import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class form_kasir_system
{
    public static void main(String[]args){
        final JFrame frame = new JFrame();
        //jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000,900);
        frame.setTitle("Ayok Travel"); 
        //jf.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        JLabel nama_travel = new JLabel("Ayok Travel");
        nama_travel.setBounds(250,10,160,160);
        frame.add(nama_travel);
        
        JLabel nama_pemesan = new JLabel("Nama Pemesan  : ");
        nama_pemesan.setBounds(120,110,100,100);
        frame.add(nama_pemesan);
        
        final JTextField nama = new JTextField();
        nama.setBounds(240,150,200,20);
        frame.add(nama);
        
        JLabel awal_keberangkatan = new JLabel("Tempat Pergi : ");
        awal_keberangkatan.setBounds(120,115,100,200);
        frame.add(awal_keberangkatan);
        
        final JTextField awal_berangkat = new JTextField();
        awal_berangkat.setBounds(240,205,200,20);
        frame.add(awal_berangkat);
        
        JLabel tujuan_keberangkatan = new JLabel("Tujuan Akhir : ");
        tujuan_keberangkatan.setBounds(120,165,100,200);
        frame.add(tujuan_keberangkatan);
       
        final JTextField tujuan_berangkat = new JTextField();
        tujuan_berangkat.setBounds(240,252,200,20);
        frame.add(tujuan_berangkat);
        
        JLabel jumlah_tiket_yang_dipesan = new JLabel("Jumlah Tiket : ");
        jumlah_tiket_yang_dipesan.setBounds(120,170,100,300);
        frame.add(jumlah_tiket_yang_dipesan);
        
        final JTextField jumlah_tiket = new JTextField();
        jumlah_tiket.setBounds(240,308,200,20);
        frame.add(jumlah_tiket);
        
        JLabel harga_perorangan = new JLabel("Harga Perorang : ");
        harga_perorangan .setBounds(120,220,100,300);
        frame.add(harga_perorangan);
        
        final JTextField harga_perorang = new JTextField();
        harga_perorang.setBounds(240,360,200,20);
        frame.add(harga_perorang);
        
        JButton tombol = new JButton("OK");
        tombol.setBounds(120,400,70,40);
        frame.add(tombol);
        
        final String[] colom = {"Nama Pemesan","Tempat Pergi","Tujuan","Jumlah Tiket", "Harga Perorang","Total"};
    
        final DefaultTableModel table_model = new DefaultTableModel(colom,0); 
        
        final JTable table = new JTable(table_model);
        table.setBounds(540,180,700,300);
        table.getTableHeader().setBounds(540,150,700,30);
        frame.add(table.getTableHeader());
        frame.add(table);
        
        
        tombol.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e){                                                                                                                                                                                                    
            String[] datas = {nama.getText(), awal_berangkat.getText(), tujuan_berangkat.getText(), jumlah_tiket.getText(), harga_perorang.getText(), (jumlah_tiket.getText() + harga_perorang.getText())};
            table_model.addRow(datas);
            
            nama.setText(" ");
            awal_berangkat.setText(" ");
            tujuan_berangkat.setText(" ");
            jumlah_tiket.setText(" ");
            harga_perorang.setText(" ");
            
            
            
        
            
        
        }
        
        
        
        
        });
        
        
        
        frame.setVisible(true);
       
        
 
    
    }
}

