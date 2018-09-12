package com.github.wxiaoqi.security.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.admin.biz.CoursesBiz;
import com.github.wxiaoqi.security.admin.entity.Courses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("courses")
public class CoursesController extends BaseController<CoursesBiz,Courses> {

}