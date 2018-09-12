package com.github.wxiaoqi.security.admin.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author Mr.jjy
 * @email 735310866@qq.com
 * @date 2018-09-10 16:46:10
 */
@Table(name = "finance")
public class Finance implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //更新时间
    @Column(name = "upd_time")
    private Date updTime;
	
	    //更新人
    @Column(name = "upd_user")
    private String updUser;
	
	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //创建人
    @Column(name = "crt_user")
    private String crtUser;
	
	    //收入
    @Column(name = "income")
    private String income;
	
	    //支出
    @Column(name = "expend")
    private String expend;
	
	    //盈亏
    @Column(name = "profit_loss")
    private String profitLoss;
	
	    //学科学科
    @Column(name = "courses_id")
    private String coursesId;
	
	    //学科增减
    @Column(name = "type")
    private String type;
	
	    //学生
    @Column(name = "student_id")
    private String studentId;
	
	    //单价
    @Column(name = "price")
    private String price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
	 * 设置：更新人
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * 获取：更新人
	 */
	public String getUpdUser() {
		return updUser;
	}

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser;
    }



	/**
	 * 设置：学科学科
	 */
	public void setCoursesId(String coursesId) {
		this.coursesId = coursesId;
	}
	/**
	 * 获取：学科学科
	 */
	public String getCoursesId() {
		return coursesId;
	}
	/**
	 * 设置：学科增减
	 */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
	 * 设置：学生
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * 获取：学生
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * 设置：单价
	 */
    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getExpend() {
        return expend;
    }

    public void setExpend(String expend) {
        this.expend = expend;
    }

    public String getProfitLoss() {
        return profitLoss;
    }

    public void setProfitLoss(String profitLoss) {
        this.profitLoss = profitLoss;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
