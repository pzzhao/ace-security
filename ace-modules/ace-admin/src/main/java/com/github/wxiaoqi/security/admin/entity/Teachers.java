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
@Table(name = "teachers")
public class Teachers implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long id;
	
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
	
	    //教师姓名
    @Column(name = "name")
    private String name;
	
	    //教师年龄
    @Column(name = "age")
    private String age;
	
	    //教师等级
    @Column(name = "type")
    private String type;
	
	    //电话
    @Column(name = "phone")
    private String phone;
	
	    //邮箱
    @Column(name = "email")
    private String email;
	
	    //住址
    @Column(name = "address")
    private String address;
	
	    //生日
    @Column(name = "birthday")
    private String birthday;
	
	    //课程
    @Column(name = "courses_id")
    private String coursesId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

	/**
	 * 设置：教师姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：教师年龄
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 获取：教师年龄
	 */
	public String getAge() {
		return age;
	}
	/**
	 * 设置：教师等级
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：教师等级
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：住址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：住址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：生日
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：生日
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 设置：课程
	 */
	public void setCoursesId(String coursesId) {
		this.coursesId = coursesId;
	}
	/**
	 * 获取：课程
	 */
	public String getCoursesId() {
		return coursesId;
	}
}
