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
@Table(name = "courses")
public class Courses implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //更新时间
    @Column(name = "upd_time")
    private Date updTime;
	
	    //更新人id
    @Column(name = "upd_user")
    private String updUser;
	
	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //创建人id
    @Column(name = "crt_user")
    private String createUser;
	
	    //学科名
    @Column(name = "courses_name")
    private String coursesName;
	
	    //单价
    @Column(name = "courses_price")
    private String coursesPrice;
	
	    //学科描述
    @Column(name = "courses_description")
    private String coursesDescription;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
	 * 设置：更新时间
	 */
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

    /**
	 * 设置：更新人id
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * 获取：更新人id
	 */
	public String getUpdUser() {
		return updUser;
	}
	/**
	 * 设置：创建人id
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人id
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：学科名
	 */
	public void setCoursesName(String coursesName) {
		this.coursesName = coursesName;
	}
	/**
	 * 获取：学科名
	 */
	public String getCoursesName() {
		return coursesName;
	}
	/**
	 * 设置：单价
	 */
    public String getCoursesPrice() {
        return coursesPrice;
    }

    public void setCoursesPrice(String coursesPrice) {
        this.coursesPrice = coursesPrice;
    }

    /**
	 * 设置：学科描述
	 */
	public void setCoursesDescription(String coursesDescription) {
		this.coursesDescription = coursesDescription;
	}
	/**
	 * 获取：学科描述
	 */
	public String getCoursesDescription() {
		return coursesDescription;
	}
}
