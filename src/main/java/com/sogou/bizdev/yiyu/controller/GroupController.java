package com.sogou.bizdev.yiyu.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sogou.bizdev.yiyu.bean.Group;

import com.sogou.bizdev.yiyu.service.GroupService;
import com.sogou.bizdev.yiyu.controller.Result;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sogou.bizdev.yiyu.controller.ErrorEnum;


@Controller
public class GroupController {

    @Autowired
    public GroupService groupService;

    @RequestMapping(value = "/group.do")
    @ResponseBody
    private Result getGroups(String groupName, Integer groupChannel) {
        Result result = new Result();
        if (StringUtils.isBlank(groupName) || groupChannel == null) {
            result.setError(ErrorEnum.PARAM_ERROR);
            return result;
        }

        Group group = groupService.getGroupByNameAndChannel(groupName, groupChannel);
        result.setData(group);

        return result;
    }
}
