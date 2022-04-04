public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(Main::load_program);
	}
	
	public static void load_program() {  //加载主程序

		new Display("IP计算工具(ver:1.0 Beta)");
	}
}
