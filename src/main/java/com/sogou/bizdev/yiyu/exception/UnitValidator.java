package com.sogou.bizdev.yiyu.exception;

import com.sogou.bizdev.yiyu.bean.Group;
import com.sogou.bizdev.yiyu.bean.GroupChannel;
import com.sogou.bizdev.yiyu.paging.PageInfo;
import com.sun.org.apache.regexp.internal.RE;

import javax.swing.event.ChangeListener;
import java.nio.channels.Channel;
import java.util.List;

/**
 * Created by zhangyiyu on 26/05/2017.
 */
public class UnitValidator {
    public static Result validatorForPageInfo(PageInfo info) {
        Result result = new Result();
        if (info == null) {
            ResultUtil.addEnumError(result, BizErrorEnum.UNIT_PARAMETER_ERROR);
            return result;
        }
        if (info.getPageNo() == null) {
            ResultUtil.addEnumError(result, BizErrorEnum.UNIT_QUERY_PAGE_SIZE_EMPTY);
        }
        if (info.getPageSize() == null) {
            ResultUtil.addEnumError(result, BizErrorEnum.UNIT_QUERY_PAGE_NO_EMPTY);
        }
        return result;
    }

    public static Result validateGroup(Group group) {
        Result result = new Result();
        Integer groupId = group.getGroupId();
        Integer planId = group.getPlanId();
        Integer budget = group.getBudget();

        if (group == null) {
            ResultUtil.addEnumError(result, ErrorEnum.PARAM_ERROR);
            return result;
        }
        if (groupId == null) {
            ResultUtil.addEnumError(result, ErrorEnum.GROUP_ID_NOT_NULL);
        } else if (groupId <= 0) {
            ResultUtil.addEnumError(result, ErrorEnum.GROUP_ID_ERROR);
        }
        if (group.getGroupName() == null) {
            ResultUtil.addEnumError(result, ErrorEnum.GROUP_NAME_NOT_NULL);
        }
        if (planId == null) {
            ResultUtil.addEnumError(result, ErrorEnum.PLAN_ID_NOT_NULL);
        } else if (planId <= 0) {
            ResultUtil.addEnumError(result, ErrorEnum.PLAN_ID_ERROR);
        }
        if (budget == null) {
            ResultUtil.addEnumError(result, ErrorEnum.PLAN_NAME_NOT_NULL);
        } else if (budget == 0 || budget < -1) {
            ResultUtil.addEnumError(result, ErrorEnum.BUDGET_ERROR);
        }

        return result;
    }

    public static Result validateChannel(List<GroupChannel> channels) {
        Result result = new Result();
        if (channels == null) {
            ResultUtil.addEnumError(result, ErrorEnum.CHANNEL_NOT_NULL);
            return result;
        }
        for (GroupChannel channel : channels) {
            Integer id = channel.getId();
            Integer groupId = channel.getGroupId();
            Integer channelId = channel.getChannelId();
            Integer price = channel.getPrice();

            if (id == null) {
                ResultUtil.addEnumError(result, ErrorEnum.ID_IN_CHANNEL_NOT_NULL);
            } else if (id <= 0) {
                ResultUtil.addEnumError(result, ErrorEnum.ID_IN_CHANNEL_ID_ERROR);
            }
            if (groupId == null) {
                ResultUtil.addEnumError(result, ErrorEnum.CHANNEL_GROUP_ID_NOT_NULL);
            } else if (groupId <= 0) {
                ResultUtil.addEnumError(result, ErrorEnum.CHANNEL_GROUP_ID_ERROR);
            }
            if (channelId == null) {
                ResultUtil.addEnumError(result, ErrorEnum.CHANNEL_ID_NOT_NULL);
            } else if ((channelId < 1 || channelId > 6) && channelId != 100) {
                ResultUtil.addEnumError(result, ErrorEnum.CHANNEL_ID_ERROR);
            }
            if (price==null){
                ResultUtil.addEnumError(result,ErrorEnum.CHANNEL_PRICE_NOT_NULL);
            }else if (price<=0){
                ResultUtil.addEnumError(result,ErrorEnum.CHANNEL_PRICE_ERROR);
            }
        }
        return result;
    }
}
