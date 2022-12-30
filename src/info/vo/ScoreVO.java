package info.vo;

public class ScoreVO {

	 String stuId;
	 String name;
	 String grade;
	 String group;
	 int kor;
	 int eng;
	 int math;
	 int science;
	 double avg;
	 int total;
	
	public ScoreVO() {
	}

	public ScoreVO(String stuId, String name, String grade, int kor, int eng, int math, int science) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg= total/ 4;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total  = kor+eng+math+science;
	}

}
