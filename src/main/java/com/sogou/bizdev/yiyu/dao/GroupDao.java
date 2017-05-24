package com.sogou.bizdev.yiyu.dao;

import com.sogou.bizdev.yiyu.bean.GroupChannel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sogou.bizdev.yiyu.bean.Group;

import java.util.List;

@Repository
public interface GroupDao {

    public void insertGroup(Group group);

    public void updateGroup(Group group);

    public void insertGroupChannel(Group group);

    public List<GroupChannel> getChannels(Integer groupId);

    public List<Group> getAllGroups();

    public Group getGroupByNameAndChannel(@Param("groupName") String groupName, @Param("channelId") Integer channelId);

}
