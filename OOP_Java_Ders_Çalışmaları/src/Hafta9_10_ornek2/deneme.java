package Hafta9_10_ornek2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class deneme {
	
	public static void main(String[] args) {
		JFrame f=new JFrame();
		
		JLabel l1,l2;
		JTextField t1;
		JPasswordField p;
		JButton b;
		String adi="Ali";
		String sifre="12345";
		
		l1=new JLabel("Kullanıcı adı");
		l1.setBounds(150,50,200,50);
		
		t1=new JTextField();
		t1.setBounds(150,100,200,50);
		l2=new JLabel("Password");
		p=new JPasswordField();
		p.setBounds(150,250,200,50);
		b=new JButton("Giriş");
		b.setBounds(150,250,200,50);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed1(ActionEvent e){
				String pass=new String(p.getPassword());
				if(adi.equals(t1.getText())&& sifre.equals(pass)) {
				}else
					System.out.println("Giriş basarısız");
					
				}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
	
	   f.add(t1);
	   f.add(l1);
	   f.setSize(400,400);
	   f.setLayout(null);
	   f.setVisible(true);
	   
	}
	

}
