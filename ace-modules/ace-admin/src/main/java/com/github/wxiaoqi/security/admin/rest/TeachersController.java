package com.github.wxiaoqi.security.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.admin.biz.TeachersBiz;
import com.github.wxiaoqi.security.admin.entity.Teachers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teachers")
public class TeachersController extends BaseController<TeachersBiz,Teachers> {

}