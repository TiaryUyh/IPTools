import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Optional;

public class IP2 {
	
	JPanel p = new JPanel();
	JButton jisuan = new JButton("计算");
	
	JPanel input = new JPanel();  //ip_input输入网络地址
	JPanel subinput = new JPanel();//子网数量输入
	JLabel ip_notice = new JLabel("请输入要规划的网络地址:");
	JLabel sub_notice = new JLabel("要划分的子网数量:");
	JTextField sub_input = new JTextField(3);
	
	JLabel submask = new JLabel("子网掩码:");
	JLabel submasknum = new JLabel("0.0.0.0");
	JLabel pcnum = new JLabel("每段主机数:");
	JLabel pcnum1 = new JLabel("0");
	
	JTextField first = new JTextField(3);
	JTextField sec = new JTextField(3);
	JTextField third = new JTextField(3);
	JLabel forth = new JLabel("0");
	JLabel dian1 = new JLabel(".");
	JLabel dian2 = new JLabel(".");
	JLabel dian3 = new JLabel(".");
	
	JPanel display_board = new JPanel(); //显示框
	
	JPanel demo1 = new JPanel();
	
	JTextArea textArea = new JTextArea("");
	JScrollPane scrollPane_1 = new JScrollPane();
	
	
	public IP2()
	{
		p.setLayout(null);
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setBounds(200, 30, 500, 500);
		
		ip_input();
		display();
		demo();
		jisuan.setBounds(70, 220, 80, 30);
		jisuan.addActionListener((e)->js());
		p.add(jisuan);
		
		
	}
	
	public void ip_input()
	{
		
		input.setLayout(null);
		input.setBorder(BorderFactory.createLineBorder(Color.black));
		input.setBounds(10, 100, 200, 60);
		
		input.add(ip_notice);
		input.add(first);
		input.add(dian1);
		input.add(sec);
		input.add(dian2);
		input.add(third);
		input.add(dian3);
		input.add(forth);

		ip_notice.setBounds(10,5,200,30);
		first.setBounds(10,35,45,20);
		dian1.setBounds(56,35,3,20);
		sec.setBounds(60,35,45,20);
		dian2.setBounds(106,35,3,20);
		third.setBounds(110,35,45,20);
		dian3.setBounds(156,35,3,20);
		forth.setBounds(160,35,45,20);

		subinput.setLayout(new FlowLayout());
		subinput.setBorder(BorderFactory.createLineBorder(Color.black));
		subinput.setBounds(10, 170, 200, 40);
		subinput.add(sub_notice);
		subinput.add(sub_input);
		
		p.add(input);
		p.add(subinput);
	}
	
	public void display()
	{
		display_board.setLayout(null);
		display_board.setBounds(220, 10, 270, 480);
		display_board.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JLabel a1 = new JLabel("各网段主机IP地址范围");

        
        scrollPane_1.setBounds(10, 30, 250, 430);
        display_board.add(scrollPane_1);
        textArea.setBounds(10, 30, 250, 430);
        textArea.setLineWrap (true);
        textArea.setWrapStyleWord (true);
        scrollPane_1.setViewportView(textArea);


		a1.setBounds(80, 0, 150, 30);
		display_board.add(a1);

		p.add(display_board);
	}
	
	public void demo() {
		demo1.setLayout(null);
		demo1.setBounds(10, 270, 200, 80);
		demo1.setBorder(BorderFactory.createLineBorder(Color.black));

		pcnum1.setForeground(Color.blue);
		submasknum.setForeground(Color.blue);
		
		submask.setBounds(10, 10, 100, 30);
		pcnum.setBounds(10, 40, 100, 30);
		submasknum.setBounds(70,10,150,30);
		pcnum1.setBounds(80,40,100,30);
		
		demo1.add(pcnum);
		demo1.add(submask);
		demo1.add(pcnum1);
		demo1.add(submasknum);
		p.add(demo1);
	}
	public void js()
	{
		
		String a = String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(first.getText()))));
		String b = String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(sec.getText()))));
		String c = String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(third.getText()))));
		
		
		String M = a+b+c+"00000000";

//*****计算网络掩码********
		int a1 = Integer.parseInt(sub_input.getText());
		int p2;
		for(int i = 0;;i++)
		{
			int sum = (int) Math.pow(2, i);
			if(sum>=a1)
			{
				p2 = i;
				break;
			}
		}

		int T = 0;
		int T1 = 0;
		int p = M.lastIndexOf("1");
		StringBuilder A = null;
		for(int i = 0;i<p;i+=8) {
			T+=8;
			A = (A == null ? new StringBuilder("null") : A).append("11111111");
		}
		for(int i = 0;i<p2;i++)
		{
			A = (A == null ? new StringBuilder("null") : A).append('1');
			T++;
		}
		for(int i = T;i<32;i++)
		{
			A = (A == null ? new StringBuilder("null") : A).append('0');
			T1++;
		}
		submask_fun1(A, submasknum);
		int num_buff = (int)Math.pow(2, T1)-2;
		if(num_buff>=0)
			pcnum1.setText(num_buff+"");
		else
			pcnum1.setText("0");



//**********************
		
//设置IP地址***************
		textArea.setText("你输入的IP地址为:"+first.getText()+"."+sec.getText()+"."+third.getText()+".0"+"\r\n");
		textArea.append("分配后结果为：\r\n");
		StringBuilder begin;
		StringBuilder end;
		if(p<0) {
			for (int i = 0; i < Math.pow(2,p2); i++) {
				if(p2!=0) {
					begin = Optional.ofNullable(String.format("%032d", Integer.parseInt(Integer.toBinaryString(i)))).map(StringBuilder::new).orElse(null);
					begin = new StringBuilder(Objects.requireNonNull(begin).substring(begin.length() - p2));
				}
				else
				{
					begin = new StringBuilder();
				}
				end = new StringBuilder(begin.toString());
				for (int j = p2; j < 32; j++) {
					begin.append('0');
					end.append('1');
				}
				begin_end(begin, end);
			}
		}
		else if(p<=8) {
			for (int i = 0; i < Math.pow(2,p2); i++) {
				if(p2!=0) {
					begin = Optional.ofNullable(String.format("%024d", Integer.parseInt(Integer.toBinaryString(i)))).map(StringBuilder::new).orElse(null);
					begin = new StringBuilder(a + Objects.requireNonNull(begin).substring(begin.length() - p2, begin.length()));
					end = new StringBuilder(begin.toString());
				}
				else
				{
					begin = a == null ? null : new StringBuilder(a);
					end = Optional.ofNullable((begin == null ? null : begin.toString())).map(StringBuilder::new).orElse(null);
				}
				for (int j = 8+p2; j < 32; j++) {
					begin = (begin == null ? new StringBuilder("null") : begin).append('0');
					end = (end == null ? new StringBuilder("null") : end).append('1');
				}
				begin_end(begin, end);
			}
		}
		else if(p<=16) {
			for (int i = 0; i < Math.pow(2,p2); i++) {
				if(p2!=0) {
					begin = Optional.ofNullable(String.format("%016d", Integer.parseInt(Integer.toBinaryString(i)))).map(StringBuilder::new).orElse(null);
					begin = new StringBuilder(a + b + Objects.requireNonNull(begin).substring(begin.length() - p2, begin.length()));
				}
				else
				{
					begin = new StringBuilder(a + b);
				}
				end = new StringBuilder(begin.toString());
				for (int j = 16+p2; j < 32; j++) {
					begin.append('0');
					end.append('1');
				}
				begin_end(begin, end);
			}
		}
		else if(p<=24) {
			for (int i = 0; i < Math.pow(2,p2); i++) {
				if(p2!=0) {
					begin = Optional.ofNullable(String.format("%08d", Integer.parseInt(Integer.toBinaryString(i)))).map(StringBuilder::new).orElse(null);
					begin = new StringBuilder(a + b + c + Objects.requireNonNull(begin).substring(begin.length() - p2, begin.length()));
				}
				else
				{
					begin = new StringBuilder(a + b + c);
				}
				end = new StringBuilder(begin.toString());
				for (int j = 24+p2; j < 32; j++) {
					begin.append('0');
					end.append('1');
				}
				begin_end(begin, end);
			}
		}
		textArea.paintImmediately(textArea.getBounds());
//******************
		
	}

	static void submask_fun1(StringBuilder a, JLabel submasknum) {
		String submaska1 = Integer.parseInt(a.substring(4,12),2)+"";
		String submaskb1 = Integer.parseInt(a.substring(12,20),2)+"";
		String submaskc1 = Integer.parseInt(a.substring(20,28),2)+"";
		String submaskd1 = Integer.parseInt(a.substring(28,36),2)+"";

		submasknum.setText(submaska1+"."+submaskb1+"."+submaskc1+"."+submaskd1);
	}

	private void begin_end(StringBuilder begin, StringBuilder end) {
		String ipa1 = Integer.parseInt(begin.substring(0,8),2)+"";
		String ipb1 = Integer.parseInt(begin.substring(8,16),2)+"";
		String ipc1 = Integer.parseInt(begin.substring(16,24),2)+"";
		String ipd1 = Integer.parseInt(begin.substring(24,32),2)+"";

		String ipa2 = Integer.parseInt(end.substring(0,8),2)+"";
		String ipb2 = Integer.parseInt(end.substring(8,16),2)+"";
		String ipc2 = Integer.parseInt(end.substring(16,24),2)+"";
		String ipd2 = Integer.parseInt(end.substring(24,32),2)+"";

		textArea.append(ipa1+"."+ipb1+"."+ipc1+"."+ipd1+"~"+ipa2+"."+ipb2+"."+ipc2+"."+ipd2+"\r\n");
		textArea.paintImmediately(textArea.getBounds());
	}

}
