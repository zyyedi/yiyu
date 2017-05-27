package com.sogou.bizdev.yiyu.service;

import com.sogou.bizdev.yiyu.bean.Group;
import com.sogou.bizdev.yiyu.bean.GroupChannel;
import com.sogou.bizdev.yiyu.exception.BizException;
import com.sogou.bizdev.yiyu.paging.PageInfo;
import com.sogou.bizdev.yiyu.paging.PageResult;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sogou.bizdev.yiyu.bean.Group;

import com.sogou.bizdev.yiyu.dao.GroupDao;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupDao groupDao;

    public void insertGroup(Group group) {
        groupDao.insertGroup(group);
    }

    public void updateGroup(Group group) throws BizException {
        List<GroupChannel> channels = group.getChannels();
        groupDao.updateGroup(group);
        if (channels != null) {
            for (GroupChannel groupChannel : channels) {
                groupDao.updateChannel(groupChannel);
            }
        }
    }

    public void insertGroupChannel(Group group) {
        groupDao.insertGroupChannel(group);
    }


    public Group getGroupByNameAndChannel(String groupName, Integer channelId) {
        return groupDao.getGroupByNameAndChannel(groupName, channelId);
    }

    //    分页查询所有的 Group
    public PageResult<Group> pagingResult(PageInfo info) throws BizException {
        PageResult<Group> result = new PageResult<Group>();

        Integer totalNumber = groupDao.groupsCount();
        result.setNumOfLines(totalNumber);
        result.setPage(info.getPageSize(), totalNumber);
        if (totalNumber > 0 && info.getPageNo() <= totalNumber) {
            result.setList(groupDao.getAllGroups(info));
        }
        return result;
    }

}
