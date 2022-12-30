package info.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import info.view.ScoreView;
import info.vo.ScoreDAO;
import info.vo.ScoreVO;

public class ScoreController extends JFrame{
	ScoreDAO dao;
	ArrayList<ScoreVO> ScoreVOList;
	ScoreView view;
	JTable table;
	
	public ScoreController() {
		dao = new ScoreDAO();
		view = new ScoreView();
		ScoreVOList = dao.select();
		view.setBookVOList(ScoreVOList);
		view.initView();
		JButton btnAdd = view.getBtnAdd();
		btnAdd.addActionListener(btnAddL);
		table = view.getTable();
		table.addMouseListener(tablel);
		add(view,"Center");
		setTitle("성적관리시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200,200);
		setSize(600,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScoreController();
	}

	ActionListener btnAddL = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			ScoreVO vo = view.neededInsertData();
			dao.insert(vo);
			view.setBookVOList(ScoreVOList);
			view.putResult();
			view.initInsertData();
		}
	};
	
	MouseAdapter tablel = new MouseAdapter() {
		public void mouseClicked(MouseEvent e ) {
			int state = 1;
			if(e.getClickCount()==2) {
				state = JOptionPane.showConfirmDialog(ScoreController.this, "정말 삭제하시겠습니까?","삭제 여부",JOptionPane.YES_NO_OPTION);
				if(state == JOptionPane.YES_OPTION) {
					dao.delete(table.getSelectedRow());
					ScoreVOList = dao.select();
					view.setBookVOList(ScoreVOList);
					view.putResult();
				}
			}
		}
	};
}
