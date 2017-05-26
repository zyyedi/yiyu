package com.sogou.bizdev.yiyu.exception;

import com.sogou.bizdev.yiyu.paging.PageInfo;

/**
 * Created by zhangyiyu on 26/05/2017.
 */
public class UnitValidator {
    public static Result validatorForPageInfo(PageInfo info){
        Result result = new Result();
        if (info  ==null) {
            ResultUtil.addEnumError(result, BizErrorEnum.UNIT_PARAMETER_ERROR);
            return result;
        }
        if(info.getPageNo() == null){
            ResultUtil.addEnumError(result, BizErrorEnum.UNIT_QUERY_PAGE_SIZE_EMPTY);
        }
        if(info.getPageSize()==null){
            ResultUtil.addEnumError(result, BizErrorEnum.UNIT_QUERY_PAGE_NO_EMPTY);
        }
        return result;
    }
}
