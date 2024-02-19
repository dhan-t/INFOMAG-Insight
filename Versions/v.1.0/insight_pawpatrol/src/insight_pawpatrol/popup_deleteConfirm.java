package insight_pawpatrol;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dialog;

public class popup_deleteConfirm extends JDialog {
	// REWORK!! Fix this whole system, brinuteforce ko lang to
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel_Red = new JPanel();
	private JFrame parentFrame;
	private static String fullName;
	private static String idNumber;

	public void doThis () {
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
	}

	public popup_deleteConfirm(String fullName, String idNumber, JFrame parentFrame) {
		this.fullName = fullName;
		this.idNumber = idNumber;
		this.parentFrame = parentFrame;
		
		setTitle("User Removal");
		setResizable(false);
		getContentPane().setBackground(new Color(128, 64, 64));
		setBackground(new Color(128, 64, 64));
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 140);
		getContentPane().setLayout(new BorderLayout());
		contentPanel_Red.setBackground(new Color(219, 43, 57));
		contentPanel_Red.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel_Red, BorderLayout.CENTER);
		contentPanel_Red.setLayout(null);
		
		
		JLabel lbl_About2Remove = new JLabel("You are about to remove:");
		lbl_About2Remove.setForeground(new Color(255, 255, 255));
		lbl_About2Remove.setFont(new Font("Arial", Font.BOLD, 17));
		lbl_About2Remove.setBounds(10, 0, 225, 35);
		contentPanel_Red.add(lbl_About2Remove);
		
		JLabel lbl_fullName = new JLabel(fullName);
		lbl_fullName.setForeground(new Color(255, 255, 255));
		lbl_fullName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 19));
		lbl_fullName.setBounds(10, 22, 414, 35);
		contentPanel_Red.add(lbl_fullName);
		
		JLabel lbl_IDNum = new JLabel(idNumber);
		lbl_IDNum.setForeground(Color.WHITE);
		lbl_IDNum.setFont(new Font("Arial", Font.BOLD, 17));
		lbl_IDNum.setBounds(234, 0, 200, 35);
		contentPanel_Red.add(lbl_IDNum);
		{
			JPanel buttonPanel_Black = new JPanel();
			buttonPanel_Black.setBackground(new Color(22, 22, 22));
			buttonPanel_Black.setForeground(new Color(128, 128, 128));
			buttonPanel_Black.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPanel_Black, BorderLayout.SOUTH);
			{
				JButton button_remove = new JButton("Remove");
				button_remove.setFont(new Font("Arial", Font.BOLD, 13));
				button_remove.setForeground(new Color(255, 255, 255));
				button_remove.setBackground(new Color(219, 43, 57));
				button_remove.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_remove.setActionCommand("OK");
				buttonPanel_Black.add(button_remove);
				getRootPane().setDefaultButton(button_remove);
			}
			{
				JButton button_cancel = new JButton("Cancel");
				button_cancel.setFont(new Font("Arial", Font.ITALIC, 13));
				button_cancel.setForeground(new Color(255, 255, 255));
				button_cancel.setBackground(new Color(128, 128, 128));
				button_cancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				button_cancel.setActionCommand("Cancel");
				buttonPanel_Black.add(button_cancel);
			}
		}
	}
}