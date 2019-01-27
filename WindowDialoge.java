package collisionDetection;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class WindowDialoge extends JFrame implements WindowListener {
	
	public WindowDialoge() {
		setSize(300,300);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("closed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		int o = JOptionPane.showConfirmDialog(this,"Do you want to exit?" , "Exit!" ,
				JOptionPane.YES_NO_OPTION);
		if(o==JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		return;
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("deactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		JOptionPane.showMessageDialog(null, "starting", "Window Dialoge"
				, JOptionPane.INFORMATION_MESSAGE);
		return;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new WindowDialoge();
				
			}
			
		});

	}

}
