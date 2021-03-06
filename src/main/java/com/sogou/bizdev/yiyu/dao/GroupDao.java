package com.sogou.bizdev.yiyu.dao;

import com.sogou.bizdev.yiyu.bean.GroupChannel;
import com.sogou.bizdev.yiyu.paging.PageInfo;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sogou.bizdev.yiyu.bean.Group;

import java.nio.channels.Channel;
import java.util.List;

@Repository
public interface GroupDao {

    public void insertGroup(Group group);

    public void updateGroup(Group group);

    public void deleteGroup(Integer groupId);

    public void updateChannel(GroupChannel channel);

    public void insertGroupChannel(Group group);

    public List<GroupChannel> getChannels(Integer groupId);

    public List<Group> getAllGroups(PageInfo info);

    public Group getGroupByNameAndChannel(@Param("groupName") String groupName, @Param("channelId") Integer channelId);

    public Integer groupsCount();
}
