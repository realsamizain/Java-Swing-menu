import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CL {
public	JFrame frame = new JFrame("");
FileDialog d = new FileDialog(frame, "Open File...", FileDialog.LOAD);

JFrame f = new JFrame( "New");

public static void main(String[] args) {
		CL s = new CL();
	}
	public CL(){
		

JFrame frame = new JFrame("C++");
		JToolBar toolbar = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
		JButton cutbutton = new JButton(new ImageIcon("cut.jpg"));
		toolbar.add(cutbutton);
		JButton copybutton = new JButton(new ImageIcon("copy.jpg"));
		toolbar.add(copybutton);
		JButton pastebutton = new JButton(new ImageIcon("paste.jpg"));
		toolbar.add(pastebutton);
		frame.getContentPane().add(toolbar,BorderLayout.NORTH);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1278,1000);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JTextArea jt = new JTextArea(68,126);
		jt.setForeground(Color.black);
		jt.setBackground(Color.pink);
		 jt.setFont(new Font("Times New Roman",Font.BOLD, 12));
	
   frame.add(panel);

		panel.add(jt);
	 
		
		JMenuBar menubar = new JMenuBar();
		menubar.setBackground(Color.LIGHT_GRAY);

		JMenu filemenu = new JMenu("File");
		
			JMenuItem fileItem1 = new JMenuItem("New...");
		fileItem1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	
f.setSize(100,100);
f.setVisible(true);


}
});	
		JMenuItem fileItem2 = new JMenuItem("Open");

	
fileItem2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {


  d.pack(); d.show();
}
});
	
			JMenuItem fileItem3 = new JMenuItem("Save");
				fileItem3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {


f.setVisible(false);
}
});	
				JMenuItem fileItem4 = new JMenuItem("Save As");
		
		JMenuItem fileItem5 = new JMenuItem("Close");
		JMenuItem fileItem6 = new JMenuItem("Quit");
		fileItem6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	
 System.exit(0);

}
});	
	fileItem6.add(new JSeparator());
						
		filemenu.add(fileItem1);
		filemenu.add(fileItem2);
		filemenu.add(fileItem3);
		filemenu.add(fileItem4);
		filemenu.add(fileItem5);
		filemenu.add(fileItem6);
		menubar.add(filemenu);
		//-----------------------------------------------------------------------------------
		JMenu editmenu = new JMenu("Edit");
		JMenuItem editItem1 = new JMenuItem("Undo");
		JMenuItem editItem2 = new JMenuItem("Redo");
	
		JMenuItem editItem3 = new JMenuItem("Cut");
			editItem3.add(new JSeparator());
		JMenuItem editItem4 = new JMenuItem("Copy");
		JMenuItem editItem5 = new JMenuItem("Paste");
		JMenuItem editItem6 = new JMenuItem("Clear");
			JMenuItem editItem7 = new JMenuItem("Show clip Board");
		editItem7.add(new JSeparator());
		editmenu.add(editItem1);
		editmenu.add(editItem2);
		editmenu.add(editItem3);
		editmenu.add(editItem4);
		editmenu.add(editItem5);
		editmenu.add(editItem6);
		editmenu.add(editItem7);
		menubar.add(editmenu);
	//---------------------------------------------------------------------------------------------	
	JMenu advance = new JMenu("Advance");
	
	
	JMenu fst = new JMenu("Font Style");
	

	JMenuItem fstItem1 = new JMenuItem("Times New Roman");	
	JMenuItem fstItem2 = new JMenuItem("Impact");	
	JMenuItem fstItem3 = new JMenuItem("Arial Black");	
	JMenuItem fstItem4 = new JMenuItem("AmericanUncD");	
	JMenuItem fstItem5 = new JMenuItem("Courier New");	
	JMenuItem fstItem6 = new JMenuItem("AmerType Md BT");	
	JMenuItem fstItem7 = new JMenuItem("Book Antiqua");	
	JMenuItem fstItem8 = new JMenuItem("Comic Sans MS");	
	JMenuItem fstItem9 = new JMenuItem("Cooper BlkIt BT");	
	JMenuItem fstItem10 = new JMenuItem("Cooper BlkOul BT");	
	fst.add(fstItem1);
	fst.add(fstItem2);
	fst.add(fstItem3);
	fst.add(fstItem4);
	fst.add(fstItem5);
	fst.add(fstItem6);
	fst.add(fstItem7);
	fst.add(fstItem8);
	fst.add(fstItem9);
	fst.add(fstItem10);
	advance.add(fst);
	
	JMenu fsz = new JMenu("Font Size");
	JMenuItem fszItem1 = new JMenuItem("10");
	JMenuItem fszItem2 = new JMenuItem("15");
	JMenuItem fszItem3 = new JMenuItem("20");
	JMenuItem fszItem4 = new JMenuItem("25");
	JMenuItem fszItem5 = new JMenuItem("30");
	JMenuItem fszItem6 = new JMenuItem("35");
	JMenuItem fszItem7 = new JMenuItem("40");
	fsz.add(fszItem1);
	fsz.add(fszItem2);
	fsz.add(fszItem3);
	fsz.add(fszItem4);
	fsz.add(fszItem5);
	fsz.add(fszItem6);
	fsz.add(fszItem7);
	advance.add(fsz);
	
		JMenuItem advanceItem3 = new JMenu("Font Color");
		
		
    	advance.add(advanceItem3);
	    menubar.add(advance);
	    //------------------------------------------------------------------------------------------------
	    JMenu search = new JMenu("Search");
		JMenuItem searchItem1 = new JMenuItem("Find...");
		JMenuItem searchItem2 = new JMenuItem("Replace With");
		JMenuItem searchItem3 = new JMenuItem("GoTo Line Number");
		search.add(searchItem1);
		search.add(searchItem2);
		search.add(searchItem3);
	menubar.add(search);
	//---------------------------------------------------------------------------------------------------------
	JMenu compile = new JMenu("Compile");
		JMenuItem compileItem1 = new JMenuItem("Compile");
		JMenuItem compileItem2 = new JMenuItem("Link");
		JMenuItem compileItem3 = new JMenuItem("Run");
		compile.add(compileItem1);
		compile.add(compileItem2);
		compile.add(compileItem3);
		menubar.add(compile);
		//----------------------------------------------------------------------------------------------------
	JMenu manage = new JMenu ("Manage");
	JMenuItem manageItem1 = new JMenuItem("Windows");
	JMenuItem manageItem2 = new JMenuItem("Colors");
	manage.add(manageItem1);
	manage.add(manageItem2);
	menubar.add(manage);
	//-------------------------------------------------------------------------------------------------
		JMenu help = new JMenu ("Help");
	JMenuItem helpItem1 = new JMenuItem("Shortcuts");
	JMenuItem helpItem2 = new JMenuItem("Header Files");
	JMenuItem helpItem3 = new JMenuItem("Commands");
	JMenuItem helpItem4 = new JMenuItem("Functions");
	JMenuItem helpItem5 = new JMenuItem("About");
	help.add(helpItem1);
	help.add(helpItem2);
	help.add(helpItem3);
	help.add(helpItem4);
	help.add(helpItem5);
		menubar.add(help);
		
		frame.setJMenuBar(menubar);
	
		frame.setVisible(true);
}
	
}
