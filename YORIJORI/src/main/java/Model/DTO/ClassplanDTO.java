package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class ClassplanDTO implements Serializable {
	Integer classNum;
	Integer chefNum;
	Integer memNum;
	String chefName;
	String className;
	String classGoal;
	String classSub;
	Integer classCost;
	String classMate;
	Timestamp classDate;
	String classPlace;
	Integer classPsn;
	
	public Integer getClassNum() {
		return classNum;
	}
	public void setClassNum(Integer classNum) {
		this.classNum = classNum;
	}
	public Integer getChefNum() {
		return chefNum;
	}
	public void setChefNum(Integer chefNum) {
		this.chefNum = chefNum;
	}
	public Integer getMemNum() {
		return memNum;
	}
	public void setMemNum(Integer memNum) {
		this.memNum = memNum;
	}
	public String getChefName() {
		return chefName;
	}
	public void setChefName(String chefName) {
		this.chefName = chefName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassGoal() {
		return classGoal;
	}
	public void setClassGoal(String classGoal) {
		this.classGoal = classGoal;
	}
	public String getClassSub() {
		return classSub;
	}
	public void setClassSub(String classSub) {
		this.classSub = classSub;
	}
	public Integer getClassCost() {
		return classCost;
	}
	public void setClassCost(Integer classCost) {
		this.classCost = classCost;
	}
	public String getClassMate() {
		return classMate;
	}
	public void setClassMate(String classMate) {
		this.classMate = classMate;
	}
	public Timestamp getClassDate() {
		return classDate;
	}
	public void setClassDate(Timestamp classDate) {
		this.classDate = classDate;
	}
	public String getClassPlace() {
		return classPlace;
	}
	public void setClassPlace(String classPlace) {
		this.classPlace = classPlace;
	}
	public Integer getClassPsn() {
		return classPsn;
	}
	public void setClassPsn(Integer classPsn) {
		this.classPsn = classPsn;
	}
	
}
