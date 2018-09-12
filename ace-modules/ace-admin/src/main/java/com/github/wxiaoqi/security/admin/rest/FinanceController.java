package com.github.wxiaoqi.security.admin.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.admin.biz.FinanceBiz;
import com.github.wxiaoqi.security.admin.entity.Finance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("finance")
public class FinanceController extends BaseController<FinanceBiz,Finance> {

}