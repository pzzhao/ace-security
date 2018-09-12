package com.github.wxiaoqi.security.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.admin.biz.StudentsBiz;
import com.github.wxiaoqi.security.admin.entity.Students;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentsController extends BaseController<StudentsBiz,Students> {

}