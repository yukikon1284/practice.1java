import java.net.*;
import javax.swing.*;
import java.awt.*;
public class Note extends JFrame{
	public static void main(String[] args) {
		Note no = new Note();
		no.setVisible(true);
	}
	Note(){
		setTBD("asd", new int[] {400,400,300,200});
		JPanel asd = new JPanel();
		JLabel[] jl = {new JLabel("qwe"), new JLabel("asd")};
		int[] gridLay = {2,1};
		add(setJP(setJP(asd, jl), gridLay));
	}
	public static void setTBD(String title, int[] size){
		setTitle(title);
		setBounds(size[0], size[1], size[2], size[3]);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// JButton
	public static JButton setJB(final String jbc){
		JButton jb = new JButton(jbc);
		jb.setActionCommand(jbc);
		return jb;
	}
	public static JButton[] setJB(final String[] jbc){
		JButton[] jb = new JButton[jbc.length];
		for (int i=0; i<jb.length; i++) jb[i] = setJB(jbc[i]);
		return jb;
	}
	// JButton
	public static JPanel setJP(JPanel jp, final JButton[] jb){
		for (int i=0; i<jb.length; i++) setJP(jp, jb[i]);
		return jp;
	}
	public static JPanel setJP(JPanel jp, final JButton jb){
		jp.add(jb);
		return jp;
	}
	// JLabel
	public static JPanel setJP(JPanel jp, final JLabel[] jl){
		for (int i=0; i<jl.length; i++) setJP(jp, jl[i]);
		return jp;
	}
	public static JPanel setJP(JPanel jp, final JLabel jl){
		jp.add(jl);
		return jp;
	}
	// JTextField
	public static JPanel setJP(JPanel jp, final JTextField[] jtf){
		for (int i=0; i<jtf.length; i++) setJP(jp, jtf[i]);
		return jp;
	}
	public static JPanel setJP(JPanel jp, final JTextField jtf){
		jp.add(jtf);
		return jp;
	}
	// GridLayout
	public static JPanel setJP(JPanel jp, final int[] gridLayInt){
		jp.setLayout(new GridLayout(gridLayInt[0], gridLayInt[1]));
		return jp;
	}
}