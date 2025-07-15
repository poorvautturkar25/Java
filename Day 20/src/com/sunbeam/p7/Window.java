package com.sunbeam.p7;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Window extends JFrame {
	
	JTable productTable;
	JScrollPane scrollPane;
	
	public Window() {
		super("Table");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null); // do not apply any layout
		
		Object[] columns = {"pid","pName", "price"};
		//Model
		DefaultTableModel defaultTableModel = new DefaultTableModel(columns, 0);
		defaultTableModel.addRow(new Object[] { 1, "Pen" ,15 });
		defaultTableModel.addRow(new Object[] { 2, "Pencil" ,10 });
		defaultTableModel.addRow(new Object[] { 3, "Book" ,50 });
		defaultTableModel.addRow(new Object[] { 4, "Eraser" ,5 });
		defaultTableModel.addRow(new Object[] { 5, "Ruler" ,12 });
		defaultTableModel.addRow(new Object[] { 6, "Bag" ,300 });
		defaultTableModel.addRow(new Object[] { 7, "NoteBook" ,40 });
		
		//view
		productTable = new JTable(defaultTableModel);
		//productTable.setBounds(50, 50, 200, 200);
		//this.add(productTable);
		
		scrollPane = new JScrollPane(productTable);
		scrollPane.setBounds(50, 50, 200, 100);
		this.add(scrollPane);
		
		//Controller
		ListSelectionModel listSelectionModel = productTable.getSelectionModel();
		listSelectionModel.addListSelectionListener(e-> {
			if(e.getValueIsAdjusting()) {
				int row = productTable.getSelectedRow();
				System.out.println("row selected - " + productTable.getValueAt(row, 0));
				System.out.println("Pid - " + productTable.getValueAt(row, 0));
				System.out.println("Pname - " + productTable.getValueAt(row, 1));
				System.out.println("Price - " + productTable.getValueAt(row, 2));
			}
		});
	}

}
