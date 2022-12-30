package info.vo;

import java.util.*;

public class ScoreDAO {
	ArrayList<ScoreVO> svoList = new ArrayList<ScoreVO>();
	
	public void insert(ScoreVO svo) {
		svoList.add(svo);
	}
	
	public ArrayList<ScoreVO> select(){
		return svoList;
	}
	
	public void delete(int row) {
		svoList.remove(row);
	}
}