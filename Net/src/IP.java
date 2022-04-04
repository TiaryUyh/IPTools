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
	JLabel ip = new JLabel("  IP地址(10进制):");
	JPanel ippanel = new JPanel();
	
	JLabel sub = new JLabel("请输入掩码位数：");
	JTextField subnum= new JTextField(3);
	JButton add1 = new JButton("+1");
	JButton min1 = new JButton("-1");
	
	JLabel submask = new JLabel("网络掩码:");
	JLabel submasknum = new JLabel("0.0.0.0");
	
	JLabel ipuse = new JLabel("子网可用IP:从");
	JLabel ipbegin = new JLabel("0.0.0.0");
	JLabel ip1 = new JLabel("到:");
	JLabel ipend = new JLabel("0.0.0.0");
	JLabel notice = new JLabel("(子网地址+1)到(广播地址-1)");
	
	JLabel zhujiip = new JLabel("主 机 地 址:");				
	JLabel netsubmask = new JLabel("网 络 掩 码:");
	JLabel zhujiipnum = new JLabel("00000000 00000000 00000000 00000000");
	JLabel netsubmasknum = new JLabel("00000000 00000000 00000000 00000000");
	
	JLabel subip2 = new JLabel("子 网 地 址:");
	JLabel subip10 = new JLabel("子 网 地 址：");
	JLabel subip2num = new JLabel("00000000 00000000 00000000 00000000");
	JLabel subip10num = new JLabel("0.0.0.0");
	JLabel notice1 = new JLabel("子网地址 = 主机地址 与 网络掩码(与运算)");
	
	JLabel broad2 = new JLabel("广 播 地 址:");
	JLabel broad10 = new JLabel("广 播 地 址:");
	JLabel broad2num = new JLabel("00000000 00000000 00000000 00000000");
	JLabel broad10num = new JLabel("0.0.0.0");
	JLabel notice3 = new JLabel("广播地址 = 子网地址 异或 网络掩码(异或运算)");
	public IP()
	{
		p.setLayout(null);
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setBounds(200, 30, 500, 500);
		
		
//第一行输入行*******************
		
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
//网络掩码行**********************

		
		submasknum.setForeground(Color.blue);  //设置子网掩码字色蓝色
		submasknum.setBounds(80, 80,200,30);	//设置子网掩码位置
		submask.setBounds(25, 80, 100, 30);		//设置文字位置
		
		p.add(submask);
		p.add(submasknum);
//******************************
//IP数段************************
		
		
		ipuse.setBounds(25, 120, 100, 30);		//设置开始文字位置
		ipbegin.setBounds(110, 120, 200, 30);	//设置起始IP位置
		ip1.setBounds(90, 160, 20, 30);			//设置中间文字位置
		ipend.setBounds(110, 160, 200, 30);		//设置结束IP位置
		notice.setBounds(250, 140, 300, 30);	//设置提示位置
		
		notice.setForeground(Color.red);		//设置提示颜色为红色
		ipbegin.setForeground(Color.blue);		//设置起始IP为蓝色
		ipend.setForeground(Color.blue);		//设置结束IP为蓝色
		p.add(notice);
		p.add(ipuse);
		p.add(ipend);
		p.add(ip1);
		p.add(ipbegin);
//****************************************************
//下半部段**********************************************
		
		
		zhujiip.setBounds(60, 200, 200, 30);		//设置主机“主机地址”文字位置
		zhujiipnum.setBounds(140, 200, 300, 30);	//设置主机地址IP位置
		netsubmask.setBounds(60,230,200,30);		//设置“子网掩码”文字位置
		netsubmasknum.setBounds(140, 230, 300, 30);	//这是子网掩码数字位置
		
		zhujiipnum.setForeground(Color.blue);		//设置主机地址IP为蓝色
		netsubmasknum.setForeground(Color.blue);	//设置子网掩码数字为蓝色
		
		p.add(zhujiip);
		p.add(zhujiipnum);
		p.add(netsubmasknum);
		p.add(netsubmask);
		
		
		
		subip2.setBounds(60, 270, 200, 30);			//设置子网地址（二进制）文字位置
		subip10.setBounds(60, 300, 200, 30);		//设置子网地址（十进制）文字位置
		subip2num.setBounds(140, 270, 300, 30);		//设置子网地址（二进制）数字位置
		subip10num.setBounds(140, 300, 300, 30);	//设置子网地址（十进制）数字位置
		notice1.setBounds(110, 330, 300, 30);		//设置注意文字位置
		
		subip2num.setForeground(Color.blue);		//设置子网地址（二进制）数字为蓝色
		subip10num.setForeground(Color.blue);		//设置子网地址（十进制）数字为蓝色
		notice1.setForeground(Color.red);			//设置注意文字为红色
			
		p.add(notice1);
		p.add(subip10num);
		p.add(subip2num);
		p.add(subip10);
		p.add(subip2);
		
	
		
		broad2.setBounds(60,360,200,30);			//设置广播地址（二进制）文字位置
		broad10.setBounds(60, 390, 200, 30);		//设置广播地址（十进制）文字位置
		broad2num.setBounds(140, 360, 300, 30);		//设置广播地址（二进制）数字位置
		broad10num.setBounds(140, 390, 300, 30);	//设置广播地址（十进制）数字位置
		notice3.setBounds(110, 420, 300, 30);		//设置注意文字位置
		
		broad2num.setForeground(Color.blue);		//设置广播地址（二进制）数字为蓝色
		broad10num.setForeground(Color.blue);		//设置广播地址（十进制）数字为蓝色
		notice3.setForeground(Color.red);			//设置注意文字为红色
		
		p.add(broad10);
		p.add(broad2);
		p.add(broad10num);
		p.add(broad2num);
		p.add(notice3);
//****************************************************
//计算段代码*********************************************
		JButton jisuan = new JButton("计算");
		jisuan.setBounds(350, 25, 60, 40);
		p.add(jisuan);
		
		ActionListener js = e -> {
			// TODO 自动生成的方法存根
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
	public void tre()  //计算方法
	{
		int a = Integer.parseInt(first.getText());
		int b = Integer.parseInt(sec.getText());
		int c = Integer.parseInt(third.getText());
		int d = Integer.parseInt(forth.getText());
		if(a<0||a>255 || b<0||b>255 || c<0||c>255 || d<0||d>255){
			JOptionPane.showMessageDialog(null, "错误","输入数据有错误!",JOptionPane.ERROR_MESSAGE);
		}
		int t = Integer.parseInt(subnum.getText());
//计算网络掩码****
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
//计算子网地址********
		int ipa1 = Integer.parseInt(Integer.toBinaryString(a));
		int ipb1 = Integer.parseInt(Integer.toBinaryString(b));
		int ipc1 = Integer.parseInt(Integer.toBinaryString(c));
		int ipd1 = Integer.parseInt(Integer.toBinaryString(d));
		
		String a11 = String.format("%08d", ipa1);
		String b11 = String.format("%08d", ipb1);
		String c11 = String.format("%08d", ipc1);
		String d11 = String.format("%08d", ipd1);
		
		StringBuilder ipsum = null;
		String iptest1 = a11+""+b11+""+c11+""+d11+"";    //主机地址
		String iptest2 = A.substring(4,12)+A.substring(12,20)+A.substring(20,28)+A.substring(28,36);  //网络掩码
		
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
//计算广播地址************************
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
