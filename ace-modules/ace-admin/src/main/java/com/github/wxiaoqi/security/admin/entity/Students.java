package com.github.wxiaoqi.security.admin.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

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
 * @date 2018-09-10 17:38:47
 */
@Table(name = "students")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Students implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //姓名

    @Column(name = "name")
    private String name;
	
	    //生日
    @Column(name = "bithday")
    private String bithday;
	
	    //住址
    @Column(name = "address")
    private String address;
	
	    //年龄
    @Column(name = "age")
    private String age;
	
	    //性别
    @Column(name = "sex")
    private String sex;
	
	    //学员类型
    @Column(name = "student_type")
    private String studentType;
	
	    //学员描述
    @Column(name = "student_description")
    private String studentDescription;
	
	    //更新时间
    @Column(name = "upd_time")
    private Date updTime;
	
	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //创建人id
    @Column(name = "crt_user")
    private String crtUser;
	
	    //更新人id
    @Column(name = "upd_user")
    private String updUser;
	
	    //父母电话
    @Column(name = "parent_phone")
    private String parentPhone;
	
	    //父母姓名
    @Column(name = "parent_name")
    private String parentName;
	
	    //剩余课程数量
    @Column(name = "remaining_courses")
    private String remainingCourses;
	
	    //所报课程课程
    @Column(name = "courses")
    private String courses;

    @Column(name = "upd_name")
    private String updName;

    @Column(name = "upd_host")
    private String updHost;

    @Column(name = "crt_name")
    private String crtName;

    @Column(name = "crt_host")
    private String crtHost;

    public String getUpdName() {
        return updName;
    }

    public void setUpdName(String updName) {
        this.updName = updName;
    }

    public String getUpdHost() {
        return updHost;
    }

    public void setUpdHost(String updHost) {
        this.updHost = updHost;
    }

    public String getCrtName() {
        return crtName;
    }

    public void setCrtName(String crtName) {
        this.crtName = crtName;
    }

    public String getCrtHost() {
        return crtHost;
    }

    public void setCrtHost(String crtHost) {
        this.crtHost = crtHost;
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

    /**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：姓名

	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名

	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：生日
	 */
	public void setBithday(String bithday) {
		this.bithday = bithday;
	}
	/**
	 * 获取：生日
	 */
	public String getBithday() {
		return bithday;
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
	 * 设置：年龄
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 获取：年龄
	 */
	public String getAge() {
		return age;
	}
	/**
	 * 设置：性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：学员类型
	 */
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	/**
	 * 获取：学员类型
	 */
	public String getStudentType() {
		return studentType;
	}
	/**
	 * 设置：学员描述
	 */
	public void setStudentDescription(String studentDescription) {
		this.studentDescription = studentDescription;
	}
	/**
	 * 获取：学员描述
	 */
	public String getStudentDescription() {
		return studentDescription;
	}
	/**
	 * 设置：更新时间
	 */

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser;
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
	 * 设置：父母电话
	 */
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}
	/**
	 * 获取：父母电话
	 */
	public String getParentPhone() {
		return parentPhone;
	}
	/**
	 * 设置：父母姓名
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	/**
	 * 获取：父母姓名
	 */
	public String getParentName() {
		return parentName;
	}
	/**
	 * 设置：剩余课程数量
	 */
	public void setRemainingCourses(String remainingCourses) {
		this.remainingCourses = remainingCourses;
	}
	/**
	 * 获取：剩余课程数量
	 */
	public String getRemainingCourses() {
		return remainingCourses;
	}
	/**
	 * 设置：所报课程课程
	 */
	public void setCourses(String courses) {
		this.courses = courses;
	}
	/**
	 * 获取：所报课程课程
	 */
	public String getCourses() {
		return courses;
	}
}
