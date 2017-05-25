package com.sogou.bizdev.yiyu.controller;

import com.sogou.bizdev.yiyu.exception.BizException;
import com.sogou.bizdev.yiyu.paging.PageInfo;
import com.sogou.bizdev.yiyu.paging.PageResult;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sogou.bizdev.yiyu.bean.Group;

import com.sogou.bizdev.yiyu.service.GroupService;
import com.sogou.bizdev.yiyu.controller.Result;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sogou.bizdev.yiyu.controller.ErrorEnum;
import sun.jvm.hotspot.debugger.cdbg.basic.ResolveListener;

import java.util.ArrayList;
import java.util.List;


@Controller
public class GroupController {

    @Autowired
    public GroupService groupService;

    @RequestMapping(value = "/group.do")
    @ResponseBody
    private Result getGroup(String groupName, Integer groupChannel) {
        Result result = new Result();
        if (StringUtils.isBlank(groupName) || groupChannel == null) {
            result.setError(ErrorEnum.PARAM_ERROR);
            return result;
        }

        Group group = groupService.getGroupByNameAndChannel(groupName, groupChannel);
        result.setData(group);

        return result;
    }

    @RequestMapping(value = "/getgroups.do")
    @ResponseBody
    private Result getAllGroups(Integer pageSize, Integer pageNum) {
        Result result = new Result();
        PageInfo info = new PageInfo(pageSize, pageNum);
        try {
            PageResult<Group> groupPageResult = groupService.pagingResult(info);
            result.setData(groupPageResult);
        } catch (BizException e) {
            e.printStackTrace();
        }
        return result;
    }
}
