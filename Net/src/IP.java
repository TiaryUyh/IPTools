import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class IP{
	JPanel p = new JPanel();


	JTextField first = new JTextField(3);
	JTextField sec = new JTextField(3);
	JTextField third = new JTextField(3);
	JTextField forth = new JTextField(3);
	JLabel dian1 = new JLabel(".");
	JLabel dian2 = new JLabel(".");
	JLabel dian3 = new JLabel(".");
	JLabel ip = new JLabel("  IP��ַ(10����):");
	JPanel ippanel = new JPanel();
	
	JLabel sub = new JLabel("����������λ����");
	JTextField subnum= new JTextField(3);
	JButton add1 = new JButton("+1");
	JButton min1 = new JButton("-1");
	
	JLabel submask = new JLabel("��������:");
	JLabel submasknum = new JLabel("0.0.0.0");
	
	JLabel ipuse = new JLabel("��������IP:��");
	JLabel ipbegin = new JLabel("0.0.0.0");
	JLabel ip1 = new JLabel("��:");
	JLabel ipend = new JLabel("0.0.0.0");
	JLabel notice = new JLabel("(������ַ+1)��(�㲥��ַ-1)");
	
	JLabel zhujiip = new JLabel("�� �� �� ַ:");				
	JLabel netsubmask = new JLabel("�� �� �� ��:");
	JLabel zhujiipnum = new JLabel("00000000 00000000 00000000 00000000");
	JLabel netsubmasknum = new JLabel("00000000 00000000 00000000 00000000");
	
	JLabel subip2 = new JLabel("�� �� �� ַ:");
	JLabel subip10 = new JLabel("�� �� �� ַ��");
	JLabel subip2num = new JLabel("00000000 00000000 00000000 00000000");
	JLabel subip10num = new JLabel("0.0.0.0");
	JLabel notice1 = new JLabel("������ַ = ������ַ �� ��������(������)");
	
	JLabel broad2 = new JLabel("�� �� �� ַ:");
	JLabel broad10 = new JLabel("�� �� �� ַ:");
	JLabel broad2num = new JLabel("00000000 00000000 00000000 00000000");
	JLabel broad10num = new JLabel("0.0.0.0");
	JLabel notice3 = new JLabel("�㲥��ַ = ������ַ ��� ��������(�������)");
	public IP()
	{
		p.setLayout(null);
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setBounds(200, 30, 500, 500);
		
		
//��һ��������*******************
		
		ippanel.setLayout(null);
		ippanel.add(ip);
		ippanel.add(first);
		ippanel.add(dian1);
		ippanel.add(sec);
		ippanel.add(dian2);
		ippanel.add(third);
		ippanel.add(dian3);
		ippanel.add(forth);

		ip.setBounds(10,5,100,30);
		first.setBounds(115,5,45,30);
		dian1.setBounds(161,5,3,35);
		sec.setBounds(165,5,45,30);
		dian2.setBounds(211,5,3,35);
		third.setBounds(215,5,45,30);
		dian3.setBounds(261,5,3,35);
		forth.setBounds(265,5,45,30);

		
		
		ippanel.add(sub);
		ippanel.add(subnum);
		ippanel.add(min1);
		ippanel.add(add1);

		sub.setBounds(15,35,120,30);
		subnum.setBounds(115,35,45,30);
		min1.setBounds(170,35,55,30);
		add1.setBounds(230,35,55,30);


		ippanel.setBounds(10, 10, 330, 70);
		p.add(ippanel);
//*****************************
//����������**********************

		
		submasknum.setForeground(Color.blue);  //��������������ɫ��ɫ
		submasknum.setBounds(80, 80,200,30);	//������������λ��
		submask.setBounds(25, 80, 100, 30);		//��������λ��
		
		p.add(submask);
		p.add(submasknum);
//******************************
//IP����************************
		
		
		ipuse.setBounds(25, 120, 100, 30);		//���ÿ�ʼ����λ��
		ipbegin.setBounds(110, 120, 200, 30);	//������ʼIPλ��
		ip1.setBounds(90, 160, 20, 30);			//�����м�����λ��
		ipend.setBounds(110, 160, 200, 30);		//���ý���IPλ��
		notice.setBounds(250, 140, 300, 30);	//������ʾλ��
		
		notice.setForeground(Color.red);		//������ʾ��ɫΪ��ɫ
		ipbegin.setForeground(Color.blue);		//������ʼIPΪ��ɫ
		ipend.setForeground(Color.blue);		//���ý���IPΪ��ɫ
		p.add(notice);
		p.add(ipuse);
		p.add(ipend);
		p.add(ip1);
		p.add(ipbegin);
//****************************************************
//�°벿��**********************************************
		
		
		zhujiip.setBounds(60, 200, 200, 30);		//����������������ַ������λ��
		zhujiipnum.setBounds(140, 200, 300, 30);	//����������ַIPλ��
		netsubmask.setBounds(60,230,200,30);		//���á��������롱����λ��
		netsubmasknum.setBounds(140, 230, 300, 30);	//����������������λ��
		
		zhujiipnum.setForeground(Color.blue);		//����������ַIPΪ��ɫ
		netsubmasknum.setForeground(Color.blue);	//����������������Ϊ��ɫ
		
		p.add(zhujiip);
		p.add(zhujiipnum);
		p.add(netsubmasknum);
		p.add(netsubmask);
		
		
		
		subip2.setBounds(60, 270, 200, 30);			//����������ַ�������ƣ�����λ��
		subip10.setBounds(60, 300, 200, 30);		//����������ַ��ʮ���ƣ�����λ��
		subip2num.setBounds(140, 270, 300, 30);		//����������ַ�������ƣ�����λ��
		subip10num.setBounds(140, 300, 300, 30);	//����������ַ��ʮ���ƣ�����λ��
		notice1.setBounds(110, 330, 300, 30);		//����ע������λ��
		
		subip2num.setForeground(Color.blue);		//����������ַ�������ƣ�����Ϊ��ɫ
		subip10num.setForeground(Color.blue);		//����������ַ��ʮ���ƣ�����Ϊ��ɫ
		notice1.setForeground(Color.red);			//����ע������Ϊ��ɫ
			
		p.add(notice1);
		p.add(subip10num);
		p.add(subip2num);
		p.add(subip10);
		p.add(subip2);
		
	
		
		broad2.setBounds(60,360,200,30);			//���ù㲥��ַ�������ƣ�����λ��
		broad10.setBounds(60, 390, 200, 30);		//���ù㲥��ַ��ʮ���ƣ�����λ��
		broad2num.setBounds(140, 360, 300, 30);		//���ù㲥��ַ�������ƣ�����λ��
		broad10num.setBounds(140, 390, 300, 30);	//���ù㲥��ַ��ʮ���ƣ�����λ��
		notice3.setBounds(110, 420, 300, 30);		//����ע������λ��
		
		broad2num.setForeground(Color.blue);		//���ù㲥��ַ�������ƣ�����Ϊ��ɫ
		broad10num.setForeground(Color.blue);		//���ù㲥��ַ��ʮ���ƣ�����Ϊ��ɫ
		notice3.setForeground(Color.red);			//����ע������Ϊ��ɫ
		
		p.add(broad10);
		p.add(broad2);
		p.add(broad10num);
		p.add(broad2num);
		p.add(notice3);
//****************************************************
//����δ���*********************************************
		JButton jisuan = new JButton("����");
		jisuan.setBounds(350, 25, 60, 40);
		p.add(jisuan);
		
		ActionListener js = e -> {
			// TODO �Զ����ɵķ������
			tre();
		};
		
		jisuan.addActionListener(js);
		add1.addActionListener((e)->{
			int add2 = Integer.parseInt(subnum.getText());
			if((add2+1)>=32)
				add2=31;
			subnum.setText((add2+1)+"");
			tre();
		});
		add1.addActionListener(js);
		min1.addActionListener((e)->{
			int min2 = Integer.parseInt(subnum.getText());
			if((min2-1)<=0)
				min2=1;
			subnum.setText((min2-1)+"");
			tre();
		});
//****************************************************

	}
	public void tre()  //���㷽��
	{
		int a = Integer.parseInt(first.getText());
		int b = Integer.parseInt(sec.getText());
		int c = Integer.parseInt(third.getText());
		int d = Integer.parseInt(forth.getText());
		if(a<0||a>255 || b<0||b>255 || c<0||c>255 || d<0||d>255){
			JOptionPane.showMessageDialog(null, "����","���������д���!",JOptionPane.ERROR_MESSAGE);
		}
		int t = Integer.parseInt(subnum.getText());
//������������****
		StringBuilder A = null;
		for(int i = 0;i<32;i++)
		{
			if(i<t)
				A = (A == null ? new StringBuilder("null") : A).append('1');
			else A = (A == null ? new StringBuilder("null") : A).append('0');
		}
		IP2.submask_fun1(A, submasknum);
		netsubmasknum.setText(A.substring(4,12)+" "+A.substring(12,20)+" "+A.substring(20,28)+" "+A.substring(28,36));
//************
//����������ַ********
		int ipa1 = Integer.parseInt(Integer.toBinaryString(a));
		int ipb1 = Integer.parseInt(Integer.toBinaryString(b));
		int ipc1 = Integer.parseInt(Integer.toBinaryString(c));
		int ipd1 = Integer.parseInt(Integer.toBinaryString(d));
		
		String a11 = String.format("%08d", ipa1);
		String b11 = String.format("%08d", ipb1);
		String c11 = String.format("%08d", ipc1);
		String d11 = String.format("%08d", ipd1);
		
		StringBuilder ipsum = null;
		String iptest1 = a11+""+b11+""+c11+""+d11+"";    //������ַ
		String iptest2 = A.substring(4,12)+A.substring(12,20)+A.substring(20,28)+A.substring(28,36);  //��������
		
		zhujiipnum.setText(a11+" "+b11+" "+c11+" "+d11);
		for(int i = 0;i<32;i++)
		{
			ipsum = (ipsum == null ? new StringBuilder("null") : ipsum).append((iptest1.charAt(i) - '0') & (iptest2.charAt(i) - '0'));
		}
		String ipa2 = ipsum.substring(4,12);
		String ipb2 = ipsum.substring(12,20);
		String ipc2 = ipsum.substring(20,28);
		String ipd2 = ipsum.substring(28,36);
		
		
		subip2num.setText(ipa2+" "+ipb2+" "+ipc2+" "+ipd2);
		subip10num.setText(Integer.parseInt(ipa2,2)+"."+Integer.parseInt(ipb2,2)+"."+Integer.parseInt(ipc2,2)+"."+Integer.parseInt(ipd2,2));	
//*****************
//����㲥��ַ************************
		StringBuilder broadnum = null;
		String subip2num1 = ipa2+ipb2+ipc2+ipd2;
		for(int i = 0;i<32;i++)
		{
			int a3 = ((subip2num1.charAt(i)-'0')^(iptest2.charAt(i)-'0'));
			if( a3 == 1)
				broadnum = (broadnum == null ? new StringBuilder("null") : broadnum).append("0");
			else
				broadnum = (broadnum == null ? new StringBuilder("null") : broadnum).append("1");
		}
		
		String broada1 = broadnum.substring(4,12);
		String broadb1 = broadnum.substring(12,20);
		String broadc1 = broadnum.substring(20,28);
		String broadd1 = broadnum.substring(28,36);
		
		broad2num.setText(broada1+" "+broadb1+" "+broadc1+" "+broadd1);
		broad10num.setText(Integer.parseInt(broada1,2)+"."+Integer.parseInt(broadb1,2)+"."+Integer.parseInt(broadc1,2)+"."+Integer.parseInt(broadd1,2));
		
		ipbegin.setText(Integer.parseInt(ipa2,2)+"."+Integer.parseInt(ipb2,2)+"."+Integer.parseInt(ipc2,2)+"."+(Integer.parseInt(ipd2,2)+1));
		ipend.setText(Integer.parseInt(broada1,2)+"."+Integer.parseInt(broadb1,2)+"."+Integer.parseInt(broadc1,2)+"."+(Integer.parseInt(broadd1,2)-1));
	}
}
