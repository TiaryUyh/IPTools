import javax.swing.*;
import java.awt.*;


public class Display extends JFrame{
	JButton IP_dis = new JButton("IP���㹤��");
	JButton IP2_dis = new JButton("���绮�ֹ���");
	JLabel logo = new JLabel("Developer : Tiary");
	JLabel title1 = new JLabel("������Tiary���˿�������ͬѧ��ѧϰʹ��!");
	JLabel title2 = new JLabel("�緢��������ڴ���,���������κν���!");
	JLabel title3 = new JLabel("���Է����ʼ���dengxiandong19@dnui.edu.cn������");
	public Display(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(760, 600);
		setVisible(true);
		setResizable(false);

		Container cp = getContentPane();
		cp.setLayout(null);
		IP ip = new IP();
		ip.p.setVisible(false);
		cp.add(ip.p);
		IP2 ip2 = new IP2();
		ip2.p.setVisible(false);
		cp.add(ip2.p);

		cp.add(IP_dis);
		IP_dis.setBounds(20,130,150,100);
		IP_dis.setVisible(true);
		IP_dis.addActionListener((e)->{
			ip.p.setVisible(true);
			ip2.p.setVisible(false);
		});

		cp.add(IP2_dis);
		IP2_dis.setBounds(20,240,150,100);
		IP2_dis.setVisible(true);
		IP2_dis.addActionListener((e)->{
			ip.p.setVisible(false);
			ip2.p.setVisible(true);
		});


		cp.add(logo);
		logo.setBounds(20,400,150,30);
		cp.add(title1);
		cp.add(title2);
		cp.add(title3);

		title1.setBounds(300,200,500,30);
		title2.setBounds(310,230,500,30);
		title3.setBounds(270,260,500,30);
//����***********************************************************

//*************************************************
		
		

	}
}
