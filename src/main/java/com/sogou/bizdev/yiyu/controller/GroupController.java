package com.sogou.bizdev.yiyu.controller;

import com.sogou.bizdev.yiyu.exception.*;
import com.sogou.bizdev.yiyu.paging.PageInfo;
import com.sogou.bizdev.yiyu.paging.PageResult;
import com.sun.prism.GraphicsPipeline;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sogou.bizdev.yiyu.bean.Group;

import com.sogou.bizdev.yiyu.service.GroupService;
import sun.tools.asm.CatchData;

import javax.annotation.Resource;


@Controller
public class GroupController {

    @Autowired
    public GroupService groupService;

    @RequestMapping(value = "/getGroup.do")
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
            result = UnitValidator.validatorForPageInfo(info);
            if (!result.isSuccess()) {
                return result;
            }
            PageResult<Group> groupPageResult = groupService.pagingResult(info);
            result.setData(groupPageResult);
        } catch (BizException e) {
            e.printStackTrace();
            ResultUtil.addEnumError(result, BizErrorEnum.SYSTEM_ERROR);
        }
        return result;
    }

    @RequestMapping(value = "/createGroup.do")
    @ResponseBody
    private Result createGroups(Group group) {
        Result result = new Result();
        try {
            result = UnitValidator.validateGroup(group);
            groupService.insertGroup(group);
        } catch (BizException e) {
            e.printStackTrace();
            ResultUtil.addEnumError(result, BizErrorEnum.SYSTEM_ERROR);
        }
        return result;
    }

    @RequestMapping(value = "/updateGroup.do")
    @ResponseBody
    private Result updateGroup(Group group) {
        Result result = new Result();
        try {
            result = UnitValidator.validateGroup(group);
            groupService.updateGroup(group);
        } catch (BizException e) {
            e.printStackTrace();
            ResultUtil.addEnumError(result, BizErrorEnum.SYSTEM_ERROR);
        }
        return result;
    }

    @RequestMapping(value = "/deleteGroup.do")
    @ResponseBody
    private Result deleteGroup(Integer groupId) {
        Result result = new Result();
        if (groupId == null) {
            ResultUtil.addEnumError(result, ErrorEnum.PARAM_NULL);
            return result;
        }
        groupService.deleteGroup(groupId);
        return result;
    }
}
