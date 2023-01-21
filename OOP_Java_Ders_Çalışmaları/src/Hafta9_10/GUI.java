package Hafta9_10;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
	
	public static void main(String[] args) {
		//JPasswordFieldJCheckBox
		//obj.setBounds(x,y,width,height);
		
		JFrame f=new JFrame("Checkbox  Örneği");
		JLabel lb = new JLabel("Secim yapın ");
		lb.setBounds(150,50,300,50);
		
		
		JCheckBox ch1 = new JCheckBox("C++");
		JCheckBox ch2 = new JCheckBox("Java");
		ch1.setBounds(150,100,250,50);
		ch2.setBounds(150,150,250,50);
		
//buton olmadı bunların sadece tıkladığındaki olayı yakalamaya calışıcaz bunun için gereken sey itemlistener interfacesinden yararlanmak 
		
		ch1.addItemListener(new ItemListener() {

			public void itemStateChanged1(ItemEvent e) {
				lb.setText("C++  Secim kutusu" + (e.getStateChange()==1 ? "seçildi" : "secilmedi"));
				
			}

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}	
		});
		
		ch2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				lb.setText("Java  Secim kutusu" + (e.getStateChange()==1 ? "seçildi" : "secilmedi"));
				
			}	
		});
		
		
	    f.add(lb);
		f.add(ch1);
		f.add(ch2);
		f.setSize(400,400);//frame in boyutunu verdik
		f.setLayout(null);//layouta null dedik
		f.setVisible(true);//framenin görünürlüğünü verdik
		
		
	}
	


}
