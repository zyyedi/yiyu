package com.sogou.bizdev.yiyu.exception;

/**
 * Created by zhangyiyu on 25/05/2017.
 */
public enum BizErrorEnum {

    // 1 : account
    // 起跑线
    ACCOUNT_ID_EMPTY(10001, "账号id不能为空！"),

    ACCOUNT_EMAIL_3NO(10002, "最多可绑定3个邮箱！"),

    ACCOUNT_EMAIL_EXIST(10003, "邮箱已存在！"),

    ACCOUNT_EMAIL_NOTEXIST(10004, "邮箱不存在！"),

    ACCOUNT_EMAIL_ERROR(10005, "邮箱格式错误！"),

    ACCOUNT_EMAIL_EMPTY(10006, "邮箱不能为空！"),

    ACCOUNT_NOT_EXIST(10007, "账号不存在！"),
    // 地标

    ADMIN_USERNAME_ERROR(10008, "用户名不符合邮箱格式！"),

    ADMIN_EMAIL_ERROR(10009, "搜狗邮箱格式不正确！"),

    ADMIN_USER_EXIST_ERROR(10010, "用户已存在"),

    ADMIN_USERNAME_LENGTH_ERROR(10011, "账号长度不能超过35字节"),

    ACCOUNT_LIST_ID_EMPTY(10012, "列表{0}账号id不能为空！"),

    // 2 : INQUIRY
    INQUIRY_PARAMETER_ERROR(20000, "参数错误！"),

    INQUIRY_KEYWORDS_EMPTY(20001, "请填写关键词！"),

    INQUIRY_KEYWORDS_SIZE_ERROR(20002, "您提交的关键词个数不能超过10个！"),

    INQUIRY_START_DATE_EMPTY(20003, "请填写投放开始时间！"),

    INQUIRY_START_DATE_FORMAT_ERROR(20004, "投放开始时间格式错误！"),

    INQUIRY_PROMOTE_PERIOD_EMPTY(20005, "请填写投放周期！"),

    INQUIRY_PROMOTE_PERIOD_ERROR(20006, "投放周期错误！"),

    INQUIRY_END_DATE_EMPTY(20007, "投放结束时间不能为空！"),

    INQUIRY_END_DATE_FORMAT_ERROR(20008, "投放结束时间格式错误！"),

    INQUIRY_REGIONS_EMPTY(20009, "请选择投放地域！"),

    INQUIRY_REGIONS_SIZE_ERROR(20010, "最多只能选择6个投放地域！"),

    BID_INQUIRY_BEFORE_BID_START_DATE_ERROR(20011, "投放开始时间仅能选择日期+7~本季度第2个月的最后1天！"),

    BID_INQUIRY_AFTER_BID_START_DATE_ERROR(20012, "投放开始时间仅能选择下季度第1天且日期+7~下季度第2个月的最后1天！"),

    BID_INQUIRY_DATE_ERROR(20013, "当前日期可选择的投放日期不足一个月，请去掉标准词包中的关键词后重新询价！"),

    INQUIRY_START_DATE_ERROR(20014, "投放开始时间仅能选择日期+7~当前日期+30天的范围内！"),

    INQUIRY_END_DATE_ERROR(20015, "投放结束时间应为投放开始时间和投放周期的和减1！"),

    INQUIRY_PRICE_ERROR(20016, "价格错误, 请先询价！"),

    INQUIRY_ID_EMPTY(20017, "询价id不能为空！"),

    INQUIRY_KEYWORD_FORMAT_ERROR(
            20018,
            "您提交的关键词包含无效字符（|｜ ^ $ ￥ ? ？ []［］{ }｛｝ \\ ＼   , ， ; ； @ ＠ : ：  ! ！ '  \" 、   ‘ ’  “ ” 。 = 【】 <> ＜＞ 《》 ~ ～ • © ® × ÷ +）,请去掉无效字符后重新询价！"),

    INQUIRY_QUERY_ACCOUNT_ID_EMPTY(20019, "询价记录查询时账户为空！"),

    INQUIRY_QUERY_PAGE_SIZE_EMPTY(20020, "询价记录查询时每页显示个数为空！"),

    INQUIRY_QUERY_PAGE_NO_EMPTY(20021, "询价记录查询时页数为空！"),

    INQUIRY_ACCOUNT_EMPTY(20022, "询价时账户为空！"),

    INQUIRY_REFUSE_CHECK_STATUS_ERROR(20023, "关键词状态为拒绝或部分通过时才能查看拒绝原因！"),

    INQUIRY_QUREY_PRICE_ERROR(20024, "获取价格失败，请稍后重新询价！"),

    INQUIRY_BEFORE_NOTICE(20025, "请先询价！"),

    INQUIRY_OVERDUE_NOTICE(20026, "询价已过期，请重新询价！"),

    INQUIRY_KEYWORD_LENGTH_ERROR(20027, "您提交的每个关键词长度必须在80字节内！"),

    INQUIRY_NOT_EXIST(20028, "询价不存在！"),

    INQUIRY_REGION_SIZE_ERROR(20029, "地域长度越界！"),

    BID_INQUIRY_CHECK_KEYWORD_ERROR(20030, "查询关键词失败！"),

    INQUIRY_CONNECT_ZEBRA_ERROR(20031, "ZebraClient连接失败！"),

    INQUIRY_INDUSTRY_ERROR(20032, "起跑线暂时不支持您所在的行业投放，无法询价！"),

    INQUIRY_KEYWORDS_DUPLICATE(20033, "{0}"),

    INQUIRY_RENEW_START_DATE_ERROR(20034, "可选择的时间范围为[本推广单元的投放结束日期+1，本推广单元的投放结束日期+30]！"),

    BID_INQUIRY_BEFORE_BID_NED_DATE_ERROR(20035, "投放结束时间只能为本季度末"),

    BID_INQUIRY_AFTER_BID_NED_DATE_ERROR(20036, "投放结束时间只能为下季度末"),

    BID_INQUIRY_KEYWORDS_SIZE_ERROR(20037, "您提交的关键词个数不能超过500个！"),

    BID_INQUIRY_KEYWORD_LENGTH_ERROR(20038, "关键词 {0} 长度限制1~80字节！"),

    BID_INQUIRY_KEYWORD_DUPLICATE_ERROR(20039, "关键词不能重复！"),

    BID_INQUIRY_FIRST_INDUSTRY_ERROR(20040, "您所在的行业不能投放品牌地标！"),

    // 3 : MATERIAL
    MATERIAL_PARAMETER_ERROR(30001, "物料参数错误！"),

    MATERIAL_NOT_EXIST(30002, "物料不存在！"),

    MATERIAL_ID_EMPTY(30003, "物料id为空！"),

    MATERIAL_NAME_EMPTY(30004, "物料名称不能为空 ！"),

    MATERIAL_CHANNEL_EMPTY(30005, "渠道不能为空！"),

    MATERIAL_CHANNEL_ENUM_ERROR(30006, "渠道必须为网页或输入法！"),

    MATERIAL_TEMPLATE_ID_EMPTY(30007, "左右侧模板id不能同时为空！"),

    MATERIAL_LEFT_TEMPLATE_ID_ERROR(30008, "左侧模板id错误！"),

    MATERIAL_RIGHT_TEMPLATE_ID_ERROR(30009, "右侧模板id错误！"),

    MATERIAL_LEFT_OBJECT_NULL(30010, "左侧对象不能为空！"),

    MATERIAL_RIGHT_OBJECT_NULL(30011, "右侧对象不能为空！"),

    MATERIAL_DUPLICATE_FOR_SAME_CHANNEL(30012, "添加物料失败，单元下已存在同样投放渠道的物料！"),

    MATERIAL_ALREADY_HAS_SHADOW(30013, "物料已经存在影子物料！"),

    MATERIAL_CANNOT_UPDATE(30014, "物料当前状态不允许进行更新操作！"),

    MATERIAL_BESUBMITED_CHECKSTATUS_ERROR(30015, "提交审核的物料审核状态异常！"),

    MATERIAL_BESUBMITED_MUST_BELONG_SAME_UNIT(30016, "提交审核的物料必须属于同一个推广单元！"),

    MATERIAL_BESUBMIT_NUMBER_ERROR(30017, "提交的审核未包含该单元下全部的待审核物料！"),

    MATERIAL_NOT_FOUND_ALL(300018, "物料未完全找到！"),

    MATERIAL_CHANNEL_TYPE_NUMBER_ERROR(30019, "只能有1套网页物料，0或1套输入法物料,0或1套无线物料！"),

    MATERIAL_IS_NOT_DIFFERENT_WHEN_UPDATE(30020, "请修改物料后再提交！"),

    MATERIAL_DUPLICATE_NAME_ERROR(30021, "已存在同样名称的物料！"),

    MATERIAL_INPUT_CANNOT_SAVE(30022, "当前状态无法保存输入法物料！"),

    MATERIAL_WIRELESS_CANNOT_SAVE(30023, "当前状态无法保存无线物料！"),

    BID_MATERIAL_RIGHT_NOT_MATCH(30024, "右侧模板和id不匹配！"),

    BID_MATERIAL_RIGHT_TEMPLATE_ID_EMPTY(30025, "右侧模板id为空！"),

    BID_MATERIAL_CANNOT_NEW(30026, "物料当前状态不允许进行新建操作！"),

    BID_MATERIAL_DUPLICATE(30026, "添加物料失败，单元物料已存在！"),

    BID_MATERIAL_TPL_NOT_FOUND(30027, "物料模板文件未找到！"),

    BID_MATERIAL_RENDER_FAIL(30028, "物料渲染失败！"),

    BID_MATERIAL_LEFT_NOT_MATCH(30029, "左侧模板和id不匹配！"),

    PZ_MATERIAL_TYPE_EMPTY(30030, "品专类型为空！"),

    PZ_MATERIAL_PUBLISH_TIME_EMPTY(30031, "发布时间不能为空！"),

    PZ_MATERIAL_SUBMIT_VALID_ERROR(30032, "请先返回上一步验证物料！"),

    PZ_MATERIAL_CHECKING_ERROR(30033, "已有物料在审核中！请勿重复提交！"),

    PZ_MATERIAL_PUBLISH_NOT_EMPTY_ERROR(30034, "发布时间应为空！"),

    PZ_MATERIAL_PUBLISH_BEFORE_NOW_ERROR(30035, "发布时间不能早于当前时间！"),

    PZ_MATERIAL_PUBLISH_BEFORE_START_DATE_ERROR(30036, "发布时间不能早于投放开始时间！"),

    PZ_MATERIAL_PUBLISH_AFTER_END_DATE_ERROR(30037, "发布时间不能晚于投放结束时间！"),

    PZ_MATERIAL_PUBLISH_EMPTY_ERROR(30038, "发布时间不能为空！"),

    MATERIAL_SMALL_LOGO_EMPTY(32001, "小logo信息缺失，请上传后再提交！"),

    MATERIAL_SMALL_LOGO_LINK_EMPTY(32002, "小logo的URL不能为空！"),

    MATERIAL_SMALL_LOGO_LINK_INVALID(32003, "小logo的URL不符合规范！"),

    MATERIAL_SMALL_LOGO_LINK_LENGTH_ERROR(32003, "小logo的URL长度不能超过{0}字节！"),

    MATERIAL_TITLE_TEXT_EMPTY(32004, "标题不能为空！"),

    MATERIAL_TITLE_LENGTH_ERROR(32005, "标题长度为{0}~{1}字节！"),

    MATERIAL_RED_WORD_BRACKET_NOT_MATCH(32006, "标红词格式错误！"),

    MATERIAL_RED_WORD_COUNT_ERROR(32007, "标红词只能有一个！"),

    MATERIAL_RED_WORD_LENGTH_ERROR(32008, "标红词最多{0}字节！"),

    MATERIAL_TITLE_LINK_EMPTY(32009, "标题URL不能为空！"),

    MATERIAL_TITLE_LINK_INVALID(32010, "标题URL不符合规范！"),

    MATERIAL_TITLE_LINK_LENGTH_ERROR(32011, "标题URL长度不能超过{0}字节！"),

    MATERIAL_LOGO_EMPTY(32012, "logo信息缺失，请上传后再提交！"),

    MATERIAL_LOGO_LINK_EMPTY(32013, "logo的URL不能为空！"),

    MATERIAL_LOGO_LINK_INVALID(32014, "logo的URL不符合规范！"),

    MATERIAL_LOGO_LINK_LENGTH_ERROR(32015, "logo的URL长度不能超过{0}字节！"),

    MATERIAL_DESCRIPTION_EMPTY(32016, "简介不能为空！"),

    MATERIAL_DESCRIPTION_LENGTH_ERROR(32017, "简介长度为{0}~{1}字节！"),

    MATERIAL_DETAIL_LINK_EMPTY(32018, "详情URL不能为空！"),

    MATERIAL_DETAIL_LINK_INVALID(32019, "详情URL不符合规范！"),

    MATERIAL_DETAIL_LINK_LENGTH_ERROR(32020, "详情URL长度不能超过{0}字节！"),

    MATERIAL_ADDRESS_EMPTY(32021, "地址不能为空！"),

    MATERIAL_ADDRESS_LENGTH_ERROR(32022, "地址长度为{0}~{1}字节！"),

    MATERIAL_SHOWURL_EMPTY(32023, "显示URL不能为空！"),

    MATERIAL_SHOWURL_INVALID(32024, "显示URL不符合规范！"),

    MATERIAL_SHOWURL_LENGTH_ERROR(32025, "显示URL长度为{0}~{1}字节！"),

    MATERIAL_SHOWURL_LINK_EMPTY(32026, "显示URL跳转不能为空！"),

    MATERIAL_SHOWURL_LINK_INVALID(32027, "显示URL跳转不符合规范！"),

    MATERIAL_SHOWURL_LINK_LENGTH_ERROR(32028, "显示URL跳转长度不能超过{0}字节！"),

    MATERIAL_BUTTON_NULL(32029, "button不能为空！"),

    MATERIAL_BUTTON_LENGTH_ERROR(32030, "button个数为{0}到{1}个！"),

    MATERIAL_BUTTON_TEXT_EMPTY(32031, "button{0}不能为空！"),

    MATERIAL_BUTTON_TEXT_LENGTH_ERROR(32032, "button{0}长度为{1}~{2}个字节！"),

    MATERIAL_BUTTON_LINK_EMPTY(32033, "button{0}的URL不能为空！"),

    MATERIAL_BUTTON_LINK_INVALID(32034, "button{0}的URL不符合规范！"),

    MATERIAL_BUTTON_LINK_LENGTH_ERROR(32035, "button{0}的URL长度不能超过{1}字节！"),

    MATERIAL_BRANDNAME_EMTPY(32036, "品牌全名不能为空！"),

    MATERIAL_BRANDNAME_LENGTH_ERROR(32037, "品牌全名长度为{0}~{1}字节！"),

    MATERIAL_BRANDDESC_EMPYT(32038, "品牌简介不能为空！"),

    MATERIAL_BRANDDESC_LENGTH(32039, "品牌简介长度为{0}~{1}字节！"),

    MATERIAL_TELEPHONE_EMPTY(32040, "电话不能为空！"),

    MATERIAL_TELEPHONE_LENGTH_ERROR(32041, "电话长度为{0}~{1}字节！"),

    MATERIAL_QR_EMPTY(32042, "二维码图片信息缺失，请重新上传后提交！"),

    MATERIAL_QR_INVALID(32043, "二维码图片地址不符合规范！"),

    MATERIAL_CONSULT_BAIKE_WEIXIN_COUNT_ERROR(32044, "在线咨询URL、百科词条URL、微信号3项需选填2项！"),

    MATERIAL_CONSULTLINK_INVALID(32045, "在线咨询URL不符合规范！"),

    MATERIAL_CONSULTLINK_LENGTH_ERROR(32046, "在线咨询URL长度不能超过{0}字节！"),

    MATERIAL_BAIKELINK_INVALID(32047, "百科词条URL不符合规范！"),

    MATERIAL_BAIKELINK_LENGTH_ERROR(32048, "百科词条URL长度不能超过{0}字节！"),

    MATERIAL_WEIXIN_LENGTH_ERROR(32049, "微信号长度为{0}~{1}字节！"),

    MATERIAL_LINKSUBJECT_EMPTY(32050, "短链主题不能为空！"),

    MATERIAL_LINKSUBJECT_LENGTH_ERROR(32051, "短链主题长度为{0}~{1}字节！"),

    MATERIAL_LINK_NULL(32052, "短链不能为空！"),

    MATERIAL_LINK_LENGTH_ERROR(32053, "短链个数为{0}到{1}个"),

    MATERIAL_LINK_TEXT_EMPTY(32054, "短链{0}不能为空！"),

    MATERIAL_LINK_TEXT_LENGTH_ERROR(32055, "短链{0}长度为{1}~{2}字节！"),

    MATERIAL_LINK_LINK_EMTPY(32056, "短链{0}URL不能为空！"),

    MATERIAL_LINK_LINK_INVALID(32057, "短链{0}URL不符合规范！"),

    MATERIAL_LINK_LINK_LENGTH_ERROR(32058, "短链{0}URL长度为不能超过{1}字节！"),

    MATERIAL_CONSULT_BAIKE_COUNT_ERROR(32059, "在线咨询URL、百科词条URL2项选填1项！"),

    MATERIAL_INPUT_TITLE_EMPTY(32060, "标题不能为空！"),

    MATERIAL_INPUT_TITLE_LENGTH_ERROR(32061, "标题长度不能超过{0}字符！"),

    MATERIAL_INPUT_TITLE_LINK_EMPTY(32062, "标题链接不能为空！"),

    MATERIAL_INPUT_TITLE_LINK_INVALID(32063, "标题链接不符合规范！"),

    MATERIAL_INPUT_TITLE_LINK_LENGTH_ERROR(32064, "标题链接长度不能超过{0}字符！"),

    MATERIAL_INPUT_FIELD_TITLE_EMPTY(32065, "栏目标题{0}不能为空！"),

    MATERIAL_INPUT_FIELD_TITLE_LENGTH_ERROR(32066, "栏目标题{0}长度不能超过{1}字符！"),

    MATERIAL_INPUT_FIELD_LINK_EMPTY(32067, "栏目链接{0}不能为空！"),

    MATERIAL_INPUT_FIELD_LINK_INVALID(32068, "栏目链接{0}不符合规范！"),

    MATERIAL_INPUT_FIELD_LINK_LENGTH_ERROR(32069, "栏目链接{0}长度不能超过{1}字符！"),

    MATERIAL_INPUT_BUTTON_TEXT_EMPTY(32070, "小按钮文字{0}不能为空！"),

    MATERIAL_INPUT_BUTTON_TEXT_LENGTH_ERROR(32071, "小按钮文字{0}长度不能超过{1}字符！"),

    MATERIAL_INPUT_BUTTON_LINK_EMPTY(32072, "小按钮链接{0}不能为空！"),

    MATERIAL_INPUT_BUTTON_LINK_INVALID(32073, "小按钮链接{0}不符合规范！"),

    MATERIAL_INPUT_BUTTON_LINK_LENGTH_ERROR(32074, "小按钮链接{0}长度不能超过{1}字符！"),

    MATERIAL_INPUT_LOGO_EMTPY(32075, "左侧logo图片信息缺失，请重新上传后提交！"),

    MATERIAL_INPUT_LOGO_LINK_EMPTY(32076, "左侧logo链接不能为空！"),

    MATERIAL_INPUT_LOGO_LINK_INVALID(32077, "左侧logo链接不符合规范！"),

    MATERIAL_INPUT_LOGO_LINK_LENGTH_ERROR(32078, "左侧logo链接长度不能超过{0}字符！"),

    MATERIAL_INPUT_ICON_EMPTY(32079, "左下角logo图片信息缺失，请重新上传后提交！"),

    MATERIAL_INPUT_SHOWURL_EMPTY(32080, "显示URL不能为空！"),

    MATERIAL_INPUT_SHOWURL_INVALID(32081, "显示URL不符合规范！"),

    MATERIAL_INPUT_SHOWURL_LENGTH_ERROR(32082, "显示URL长度不能超过{0}字符！"),

    MATERIAL_INPUT_SHOWURL_LINK_EMPTY(32083, "显示URL链接不能为空！"),

    MATERIAL_INPUT_SHOWURL_LINK_INVALID(32084, "显示URL链接不符合规范！"),

    MATERIAL_INPUT_SHOWURL_LINK_LENGHT_ERROR(32085, "显示URL链接长度不能超过{0}字符！"),

    MATERIAL_INPUT_OFFICIAL_TEXT_EMPTY(32086, "进入官网文字不能为空！"),

    MATERIAL_INPUT_OFFICIAL_TEXT_LENGTH_ERROR(32087, "进入官网文字长度不能超过{0}字符！"),

    MATERIAL_INPUT_OFFICIAL_LINK_EMTPY(32088, "进入官网链接不能为空！"),

    MATERIAL_INPUT_OFFICIAL_LINK_INVALID(32089, "进入官网链接不符合规范！"),

    MATERIAL_INPUT_OFFICIAL_LINK_LENGTH_ERROR(32090, "进入官网链接长度不能超过{0}字符！"),

    MATERIAL_WIRELESS_FIELD_NULL(32091, "栏目不能为空！"),

    MATERIAL_WIRELESS_FIELD_LOGO_EMPTY(32092, "栏目{0}图标不能为空！"),

    MATERIAL_WIRELESS_FIELD_LOGO_LINK_EMPTY(32093, "栏目{0}图标URL不能为空"),

    MATERIAL_WIRELESS_FIELD_LOGO_LINK_INVALID(32094, "栏目{0}图标URL不符合规范！"),

    MATERIAL_WIRELESS_FIELD_LOGO_LINK_LENGTH_ERROR(32095, "栏目{0}图标URL长度不能超过{1}字节！"),

    MATERIAL_WIRELESS_FIELD_TITLE_EMPTY(32096, "栏目{0}标题不能为空！"),

    MATERIAL_WIRELESS_FIELD_TITLE_LENGTH_ERROR(32097, "栏目{0}标题长度不能超过{1}字节"),

    MATERIAL_WIRELESS_FIELD_TITLE_LINK_EMPTY(32098, "栏目{0}标题URL不能为空！"),

    MATERIAL_WIRELESS_FIELD_TITLE_LINK_INVALID(32099, "栏目{0}标题URL不符合规范！"),

    MATERIAL_WIRELESS_FIELD_TITLE_LINK_LENGTH_ERROR(32100, "栏目{0}标题URL长度不能超过{1}字符"),

    MATERIAL_WIRELESS_FIELD_TAG_NULL(32101, "栏目标签不能为空！"),

    MATERIAL_WIRELESS_FIELD_TAG_NUMBER_ERROR(32102, "栏目{0}标签个数为{1}到{2}个！"),

    MATERIAL_WIRELESS_FIELD_TAG_TEXT_EMPTY(32103, "栏目{0}标签{1}不能为空"),

    MATERIAL_WIRELESS_FIELD_TAG_TEXT_LENGTH_ERROR(32104, "栏目{0}标签{1}长度为{2}到{3}字节！"),

    MATERIAL_WIRELESS_FIELD_TAG_LINK_EMPTY(32105, "栏目{0}标签{1}URL不能为空！"),

    MATERIAL_WIRELESS_FIELD_TAG_LINK_INVALID(32106, "栏目{0}标签{1}URL不符合规范！"),

    MATERIAL_WIRELESS_FIELD_TAG_LINK_LENGTH_ERROR(32107, "栏目{0}标签{1}URL长度不能超过{2}字节！"),

    MATERIAL_FIELD_TEXT_EMPTY(32108, "栏目{0}{1}不能为空！"),

    MATERIAL_FIELD_LENGTH_ERROR(32109, "栏目{0}{1}长度必须是{2}-{3}字节"),

    MATERIAL_FIELD_LINK_EMPTY(32110, "栏目{0}{1}URL不能为空！"),

    MATERIAL_FIELD_LINK_INVALID(32111, "栏目{0}{1}URL不符合规范！"),

    MATERIAL_FIELD_LINK_LENGTH_ERROR(32112, "栏目{0}{1}URL长度不能超过{2}字符"),

    MATERIAL_BRANDNAMELINK_EMTPY(32113, "品牌全名url不能为空！"),

    MATERIAL_BRANDNAMELINK_LENGTH_ERROR(32114, "品牌全名URL长度不能超过{0}字节！"),

    MATERIAL_BRANDNAMELINK_INVALID(32115, "品牌全名URL不符合规范！"),

    MATERIAL_BRANDDESCLINK_EMTPY(32116, "品牌简介url不能为空！"),

    MATERIAL_BRANDDESCLINK_LENGTH_ERROR(32117, "品牌简介URL长度不能超过{0}字节！"),

    MATERIAL_BRANDDESCLINK_INVALID(32118, "品牌简介URL不符合规范！"),

    MATERIAL_BRANDQRLINK_EMTPY(32119, "二维码图片url不能为空！"),

    MATERIAL_BRANDQRLINK_LENGTH_ERROR(32120, "二维码图片URL长度不能超过{0}字节！"),

    MATERIAL_BRANDQRLINK_INVALID(32121, "二维码图片URL不符合规范！"),

    MATERIAL_TABLE_TEXT_EMPTY(32122, "第{0}行第{1}列不能为空！"),

    MATERIAL_TABLE_LENGTH_ERROR(32123, "第{0}行第{1}列长度必须是4-20字节"),

    MATERIAL_TABLE_LINK_EMTPY(32124, "第{0}行第{1}列RUL不能为空！"),

    MATERIAL_TABLE_LINK_LENGTH_ERROR(32125, "第{0}行第{1}列RUL长度不能超过{2}字节！"),

    MATERIAL_TABLE_LINK_INVALID(32126, "第{0}行第{1}列RUL不符合规范！"),

    MATERIAL_HASTAIL_INVALID(32127, "是否填写网页左侧物料-下部参数异常！"),

    MATERIAL_HASTAIL_NOTNULL_INVALID(32128, "选择不填写网页左侧物料-下部，请勿填写下部物料信息！"),

    MATERIAL_HASTAIL_NULL_INVALID(32129, "选择填写网页左侧物料-下部，请填写下部物料信息！"),

    MATERIAL_PARTNO_INVALID(32130, "栏目个数不合法！"),

    MATERIAL_PARTNO_ERROR(32131, "栏目个数与实际填的栏目不匹配！"),

    MATERIAL_LINES_INVALID(32132, "表格行数不合法！"),

    MATERIAL_TABLE_LINES_ERROR(32133, "表格行数与实际填的栏目不匹配！"),

    MATERIAL_AUDIT_ERROR(32134, "物料处于审核中，请勿重复提交审核！"),

    // 4 : UNIT
    UNIT_NOT_EXIST(40001, "推广单元不存在！"),

    UNIT_ID_EMPTY(40002, "推广单元id不能为空！"),

    UNIT_NAME_EMPTY(40003, "推广单元名称不能为空 ！"),

    UNIT_QUERY_ACCOUNT_ID_EMPTY(40004, "推广单元查询时账户为空！"),

    UNIT_QUERY_PAGE_SIZE_EMPTY(40005, "推广单元查询时每页显示个数为空！"),

    UNIT_QUERY_PAGE_NO_EMPTY(40006, "推广单元查询时页数为空！"),

    UNIT_PARAMETER_ERROR(40007, "参数错误！"),

    UNIT_ALREADY_EXIST_ERROR(40008, "询价已经存在对应的推广单元！"),

    UNIT_DUPLICATE_NAME_ERROR(40009, "已经存在同样名称的推广单元！"),

    UNIT_NAME_LENGTH_ERROR(40010, "推广单元名称不能超过50字节！"),

    // 5:stat(统计)
    STAT_CHANNELTYPE_EMPTY(50001, "频道类型不能为空！"),

    STAT_ENDTIME_EMPTY(50002, "结束时间不能为空！"),

    STAT_STARTTIME_EMPTY(50003, "开始时间不能为空！"),

    STAT_PAGENO_EMPTY(50004, "pageno不能为空！"),

    STAT_PAGESIZE_EMPTY(50005, "页面size不能为空！"),

    STAT_PROJECTIONTYPE_EMPTY(50006, "搜索类型不能为空！"),

    STAT_PROJECTIONSTR_NO(50007, "客户id必须为数字！"),

    STAT_ORDERTYPE_EMPTY(50008, "排序类型不能为空"),

    STAT_ORDERTYPE_ERROR(50009, "排序方式错误"),

    STAT_ORDERFIELD_ERROR(50010, "排序字段错误"),

    STAT_QUERY_PARAMETER_ERROR(50011, "查询参数错误"),

    // 6审核接口参数
    AUDIT_KEYWORD_PARAM_ERROR(60001, "审核参数错误！"),

    AUDIT_KEYWORD_SIZE_ERROR(60002, "关键词审核数量不完整！"),

    AUDIT_MATERIAL_PARAM_ERROR(60003, "物料审核参数错误！"),

    AUDIT_REFUSE_REASON_CODE_ERROR(60004, "拒绝原因编号不存在！"),

    AUDIT_REFUSE_REASON_EMPTY(60005, "拒绝原因不能为空！"),

    AUDIT_KEYWORD_EMPTY(60006, "关键词审核数量不能为空！"),

    AUDIT_KEYWORD_NOT_MATCH_ERROR(60007, "审核系统关键词与起跑线系统不一致！"),

    AUDIT_KEYWORD_UPDATE_ERROR(60008, "关键词改判时状态只能由通过变成拒绝！"),

    AUDIT_KEYWORD_NOT_EXIST(60009, "关键词不存在！"),

    AUDIT_MATERIAL_CHECK_ERROR(60010, "物料审核状态参数错误！"),

    AUDIT_MATERIAL_SHADOW_ERROR(60011, "在有影子创意的情况下，审核的是影子创意！"),

    AUDIT_MATERIAL_STYLE_TYPE_ERROR(60012, "审核系统类型错误!"),

    AUDIT_MATERIAL_ID_NOT_MATCH_ERROR(60013, "审核参数中的物料id和当前待审核的物料id不匹配！"),

    // 7订单接口

    ORDER_NOT_EXIST(70001, "订单不存在！"),

    ORDER_ALREADY_PAY(70002, "订单已经支付！"),

    ORDER_ERROR(70003, "订单异常！"),

    ORDER_RELATE_PERFORM_ERROR(70004, "执行单关联异常,订单已过期或已关联！"),

    ORDER_CANCEL_PERFORM_ERROR(70005, "执行单取消关联异常,订单已过期或已取消关联！"),

    // 8地标 物料错误提示

    BID_MATERIAL_EMPTY(80001, "物料为空！"),

    BID_MATERIAL_FIELD_EMPTY(80002, "{0}不能为空！"),

    BID_MATERIAL_UPLOAD_EMPTY(80003, "{0}信息缺失，请上传后再提交！"),

    BID_MATERIAL_LINK_ERROR(80004, "{0}不符合URL规范！"),

    BID_MATERIAL_TEXT_BYTE_ERROR(80005, "{0}长度为{1}~{2}字节！"),

    BID_MATERIAL_RED_WORD_BRACKET_NOT_MATCH(80006, "{0}标红词格式错误！"),

    BID_MATERIAL_RED_WORD_COUNT_ERROR(80007, "{0}标红词只能有一个！"),

    BID_MATERIAL_FIELD_NOT_EMPTY(80008, "{0}应该为空！"),

    // 9地标 词包错误提示
    BID_PACK_PROJECTIONTYPE_EMPTY(90001, "搜索类型不能为空！"),

    BID_PACK_PACKID_ERROR(90002, "packId不能为空或者小于0！"),

    BID_PACK_PACKNAME_EMPTY(90003, "词包名称不能为空！"),

    BID_PACK_KEYWORD_EMPTY(90004, "关键词不能为空！"),

    BID_PACK_KEYWORD_ERROR(90005, "关键词个数不能超过500个！"),

    BID_PACK_BASEPRICE_ERROR(90006, "刊例价格不能为空或者小于0，且必须为100的整数倍！"),

    BID_PACK_STARTDATE_ERROR(90007, "开始日期必须为下个季度第一天！"),

    BID_PACK_ENDDATE_ERROR(90008, "结束日期必须为下个季度最后一天！"),

    BID_PACK_STARTDATE_EMPTR(90009, "开始日期不能为空！"),

    BID_PACK_ENDDATE_EMPTY(90010, "结束日期不能为空！"),

    BID_PACK_BIDPERIOD_ERROY(90011, "历史竞标格式错误！"),

    BID_PACK_BIDPRICE_ERROY(90012, "出价不能为空或者小于0，且必须为100的整数倍！"),

    BID_PACK_BASEBIDPRICE_ERROR(90013, "刊例价格不能高于已出价客户的最低出价！"),

    BID_PACK_PACKNAME_ERROY(90014, "词包名称已存在！"),

    BID_PACK_ERROY(90015, "词包存在已出价用户，不能删除！"),

    BID_PACK_BIDPRICE_LOW_ERROY(90016, "出价不能低于底价！"),

    BID_PACK_PRICE_BIGGER_ERROR(90017, "价格不能大于999999元！"),

    BID_PACK_LIST_PACKID_ERROR(90018, "列表{0}packId不能为空！"),

    BID_PACK_MONTHPRICE_ERROR(90019, "月刊例价格不能为空或者小于0，且必须为100的整数倍！"),

    BID_PACK_MONTHPRICE_SMALL_ERROR(90020, "月刊例价格不能小于2000元！"),

    BID_PACK_BID_TIME_ERROY(90021, "非竞价期不能做此操作！"),

    BID_PACK_NOT_EXIST(90022, "词包不存在！"),

    BID_PACK_PRICE_ERROR(90023, "价格不符合要求！"),

    BID_PACK_EDIT_STATUS_ERROR(90024, "当前投放状态为不可对关键词进行修改！"),

    BID_PACK_EDIT_STARTDATE_ERROR(90025, "投放开始时间可修改范围为[当前时间+1，当前时间+30]，请重新设置！"),

    BID_PACK_EDIT_STARTDATE_BIG_ERROR(90026, "开始时间不能大于结束时间，请重新设置！"),

    BID_PACK_EDIT_ENDDATE_SMALL_ERROR(90027, "结束时间不能小于开始时间，请重新设置！"),

    BID_PACK_EDIT_ENDDATE_ERROR(90028, "投放结束时间可修改范围为[当前时间+1，当前时间+365]，请重新设置！"),

    BID_PACK_EDIT_PERIOD_OVER_YEAR_ERROR(90029, "投放时间不能超过一年！"),

    // 10 百科 词条错误提示
    BAIKE_ENTRY_NAME_EMPRY(100001, "词条名称不能为空！"),

    BAIKE_ENTRY_NAME_LENGTH_LIMITED(100002, "词条名称需小于50个字！"),

    BAIKE_ENTRY_QQ_LENGTH_ERROR(100003, "QQ号必须为[5-30]位！"),

    BAIKE_ENTRY_TYPE_ERROR(100004, "词条类型不支持！"),

    BAIKE_ENTRY_SUBJECT_ERROR(100005, "主体类型不支持！"),

    BAIKE_ENTRY_CASTTIME_ERROR(100006, "投放时间格式不正确！"),

    BAIKE_ENTRY_STARTTIME_LIMIET_ERROR(100007, "投放须时间范围为[当前日期+7，当前日期+30]！"),

    BAIKE_ENTRY_ENDTIME_LIMIET_ERROR(100008, "投放结束时间必须等于投放开始时间+365！"),

    BAIKE_ENTRY_DESC_ERROR(100009, "简介内容需大于100字，小于150字！"),

    BAIKE_ENTRY_PRICE_ERROR(100010, "价格必须为6000元！"),

    BAIKE_ENTRY_ACCOUNTID_EMPTY(100011, "账号id不能为空！"),

    BAIKE_ENTRY_CODE_EMPTY(100012, "词条编号错误！"),

    BAIKE_ENTRY_ENTRYID_EMPTY(100013, "词条id不能为空！"),

    BAIKE_ENTRY_CHECKSTATUS_EMPTY(100014, "审核状态不能为空！"),

    BAIKE_ENTRY_PAYSTATUS_EMPTY(100015, "付款状态不能为空！"),

    BAIKE_ENTRY_PROMOTESTATUS_EMPTY(100016, "投放状态不能为空！"),

    BAIKE_ENTRY_PAYSTARTTIME_EMPTY(100017, "投放开始时间不能为空！"),

    BAIKE_ENTRY_PAYENDTIME_EMPTY(100018, "投放结束时间不能为空！"),

    BAIKE_ENTRY_STARTTIMElIMIT_ERROR(100019, "投放开始时间可选择的时间范围为[当前日期+7，当前日期+30]！"),

    BAIKE_ENTRY_ENDTIME_ERROR(100020, "投放结束时间必须为[投放开始时间+365]！"),

    BAIKE_ENTRY_NAME_OCCUPT(100021, "词条名称被占用！"),

    BAIKE_EMAIL_ERROR(100022, "邮件发送失败"),

    BAIKE_ENTRY_QQ_FORMATE_ERROR(100023, "QQ号格式不合法，必须全为数字！"),

    BAIKE_ENTRY_QQ_TYPE_ERROR(100024, "不能输入企业QQ号，请更换！"),

    BAIKE_ENTRY_SUBJECT_ENTER_ERROR(100025, "企业词条不支持该主体类型！"),

    BAIKE_ENTRY_SUBJECT_BRAND_ERROR(100026, "品牌词条不支持该主体类型！"),

    BAIKE_ENTRY_UNIT_MODIFY_ERROR(100027, "当前状态下推广单元不能修改！"),

    BAIKE_ENTRY_UNIT_DELETE_ERROR(100028, "当前状态下推广单元不能删除！"),

    BAIKE_ENTRY_UNIT_NUMBER_ERROR(100029, "推广单元编号已存在,请重试！"),

    BAIKE_ENTRY_UNIT_RENEW_ERROR(100030, "当前状态下推广单元编号不能续费！"),

    BAIKE_ENTRY_STARTTIME_RENEW_ERROR(100031, "[本推广单元的投放结束日期+1，本推广单元的投放结束日期+30]！"),

    BAIKE_ENTRY_QQ_MODIFY_ERROR(100032, "当前状态下QQ号不能修改！"),

    BAIKE_ENTRY_CRM_ERROR(100033, "CRMOUT-WAY访问出错！"),

    BAIKE_ENTRY_NAME__AMBIGUITY_ERROR(100034, "该词条是多义项词条，请在词条名后以括号形式补充义项描述，进行义项的绑定或新建，如新通路（京东公司产品）！"),

    BAIKE_ENTRY_NAME__EXIST_ERROR(100035, "该词条在百科已存在，如想绑定请继续提交，如想创建同名义项请以括号形式补充义项描述，如新通路（京东公司产品）!"),

    BAIKE_ENTRY_NAME__AMBIGUITY_TIPS_ERROR(100036, "多义项括号内描述建议在10个字以内，不超过20个字!"),

    BAIKE_ENTRY_NAME__READY_BUY_ERROR(100037, "该词条已被购买，请更换词条!"),

    // 百科 审核

    BAIKE_AUDIT_ENTRY_UNIT_EMPTY(110001, "推广单元不存在"),

    BAIKE_AUDIT_PARAM_EMPTY_ERROR(110002, "审核参数为空！"),

    BAIKE_AUDIT_FIRST_AUDITTYPE_ERROR(110003, "初审时审核状态只能是审核中"),

    BAIKE_AUDIT_FINAL_AUDITTYPE_ERROR(110004, "终审时审核状态只能是初审通过"),

    BAIKE_AUDIT_FIRST_CHECKSTATUS_ERROR(110005, "初审时审核状态只能修改为初审通过或初审失败"),

    BAIKE_AUDIT_FINAL_CHECKSTATUS_ERROR(110006, "终审时审核状态只能修改为终审通过或终审失败"),

    BAIKE_AUDIT_PARAM_ACCOUNTID_ERROR(110007, "审核参数账号id为空"),

    BAIKE_AUDIT_PARAM_UNITID_ERROR(110008, "审核参数推广单元id为空"),

    BAIKE_AUDIT_PARAM_CHECKSTATUS_ERROR(110009, "审核参数审核状态为空"),

    BAIKE_AUDIT_PARAM_REFUSEREASON_ERROR(110010, "审核参数审核拒绝原因为空"),

    BAIKE_AUDIT_EXIST_ERROR(110011, "审核记录已存在"),

    BAIKE_AUDIT_TYPE_ERROR(110012, "审核类型不存在"),

    // 品专 询价

    PZ_INQUIRY_KEYWORDS_SIZE_ERROR(120001, "您提交的关键词个数不能超过500个！"),

    PZ_INQUIRY_ORDER_NO_EMPTY(120002, "请填写触发浮层的常规品专或时效品专订单编号"),

    PZ_INQUIRY_ORDER_ID_FORMAT(120003, "订单编号为11位，请输入正确的订单编号"),

    PZ_INQUIRY_PARAMETER_ERROR(120004, "参数错误！"),

    PZ_INQUIRY_ACCOUNT_EMPTY(120005, "询价时账户为空！"),

    PZ_INQUIRY_PZTYPE_EMPTY(120006, "品专类型未选择！"),

    PZ_INQUIRY_URL_EMPTY(120007, "品专主标题调转url为空！"),

    PZ_INQUIRY_URL_FALSE(120008, "您输入的URL不是竞价账户绑定URL，请重新输入！"),

    PZ_INQUIRY_CHANNEL_MANAGER_EMAIL_EMPTY(120009, "渠道经理邮箱为空！"),

    PZ_INQUIRY_CHANNEL_MANAGER_EMAIL_LEN(120010, "邮箱最大长度为100字节！"),

    PZ_INQUIRY_NOTICE_EMAIL_EMPTY(120011, "报价通知接收人邮箱为空！"),

    PZ_INQUIRY_NOTICE_EMAIL_LEN(120012, "报价通知接收人长度大于300字节！"),

    PZ_INQUIRY_KEYWORD_FORMAT_ERROR(
            120013,
            "您提交的关键词包含无效字符（|｜ ^ $ ￥ ? ？ []［］{ }｛｝ \\ ＼   , ， ; ； @ ＠ : ：  ! ！ '  \" 、   ‘ ’  “ ” 。 = 【】 <> ＜＞ 《》 ~ ～ • © ® × ÷ +）,请去掉无效字符后重新询价！"),

    PZ_INQUIRY_KEYWORDS_EMPTY(120014, "请填写关键词！"),

    PZ_INQUIRY_KEYWORDS_ILLEGAL(120015, "您提交的词包中包含违规词已被剔除"),

    PZ_INQUIRY_COVERDAY_EMPTY(120016, "请选择计划投放浮层的天数！"),

    PZ_INQUIRY_SG_EMAIL(120017, "需输入搜狗邮箱！"),

    PZ_INQUIRY_CLIENT_MANAGER_EMAIL_EMPTY(120018, "渠道经理邮箱为空！"),

    PZ_INQUIRY_KEYWORD_LENGTH_ERROR(120019, "关键词 {0} 长度限制1~80字节！"),

    PZ_INQUIRY_KEYWORD_DUPLICATE_ERROR(120020, "关键词不能重复！"),

    PZ_INQUIRY_PZTYPE_PARA_EMPTY(120021, "品专类型参数未传入！"),

    PZ_INQUIRY_PZTYPE_PARA_ERR(120022, "品专类型选择为“PC浮层品专”或“无线浮层品专”时订单编号才能被激活！"),

    PZ_INQUIRY_ORDERID_KWD_EMPTY(120023, "该订单编号下关键词为空！"),

    PZ_INQUIRY_URL_LEN(120024, "品专主标题跳转URL长度大于512字节！"),

    PZ_INQUIRY_ORDERNUMBER_WRONG(120025, "您输入的订单编号有误，请输入正确的订单编号。"),

    PZ_INQUIRY_ORDERID_COVER_WRONG(120026, "订单号对应的是浮层(浮层上不能加浮层)"),

    PZ_INQUIRY_ORDERID_WL_ON_PC_WRONG(120027, "无线浮层不能加在pc订单上"),

    PZ_INQUIRY_ORDERID_PC_ON_WL_WRONG(120028, "pc浮层不能加在无线订单上"),

    PZ_INQUIRY_ORDER_KWD_WRONG(120029, "关联订单的关键词与询价关键词不一致，是否未点击订单编号确定按钮进行关键词回填？"),

    PZ_INQUIRY_ORDERNUMBER_NOT_FLOAT(120030, "只有浮层才需要关联订单编号"),

    PZ_INQUIRY_UNKNOWN_ACCOUNTTYPE(120031, "未知的客户类型"),

    PZ_INQUIRY_INEFFECTIVE(120032, "您所关联的品专未在线投放，尚不能对浮层进行询价"),

    PZ_INQUIRY_GET_EMAIL_ERROR(120033, "无法获取与客户对应的渠道经理和直客经理信息"),

    PZ_INQUIRY_NOTE_LENGTH(120034, "询价备注最长300字节!"),

    // 品专 报价

    PZ_QUOTE_PARAM_ERROR(130001, "参数错误！"),

    PZ_QUOTE_PARAMETER_QUERYTYPE_FAIL(130002, "参数queryType取值不正确"),

    PZ_QUOTE_PARAMETER_QUERYTEXT_EMPTY(130003, "参数queryText不能为空"),

    PZ_QUOTE_PARAMETER_INQID_EMPTY(130004, "参数inquiryId不能为空"),

    PZ_QUOTE_INQUIRY_NOTEXIST(130005, "询价不存在"),

    PZ_QUOTE_INQUIRY_ACCOUNT_NOTGET(130006, "查询不到询价的客户"),

    PZ_QUOTE_INQUIRY_INDUS_NOTGET(130007, "查询不到询价客户的一二级行业"),

    PZ_QUOTE_CPM_NOTFOUND(130008, "查询不到cpm"),

    PZ_QUOTE_PV_COST_EMPTY(130009, "日均pv和月均消耗均不可为空"),

    PZ_QUOTE_PV_COST_ZERO(130010, "日均pv和月均消耗均不可为0"),

    PZ_QUOTE_PARAMETER_MANUAL_REASON_EMPTY(130011, "手工修改原因不能为空"),

    PZ_QUOTE_PARAMETER_DURATION_EMPTY(130012, "请选择可购买时长"),

    PZ_QUOTE_PARAMETER_DURATION_ERROR(130013, "请选择正确的可购买时长"),

    PZ_QUOTE_PARAMETER_MANUAL_PRICE_ZERO(130014, "手工报价不能为0"),

    PZ_QUOTE_QUOTE_EXIST(130015, "出价已存在"),

    PZ_QUOTE_QUOTE_NOT_EXIST(130016, "出价未存在"),

    PZ_QUOTE_CHECK_STATUS_ERROR(130017, "出价状态不对"),

    PZ_QUOTE_PARAMETER_MODIFY_REASON_EMPTY(130018, "参数modifyReason不能为空"),

    PZ_QUOTE_PARAMETER_PICPATH_EMPTY(130019, "参数picType不能为空"),

    PZ_QUOTE_INQUIRY_STATUS_ERROR(130020, "询价状态不对"),

    PZ_QUOTE_PARAMETER_ACCID_INQID_EMPTY(130021, "参数客户id和询价id不能都为空"),

    PZ_QUOTE_TRADE_NOT_SUPPORT(130022, "您所在的行业无法投放品牌专区"),

    PZ_QUOTE_PRICE_COVERDAY_EMPTY(130023, "浮层天数不存在"),

    PZ_QUOTE_QUERY_PARAMETER_ERROR(130024, "报价查询参数不正确"),

    PZ_QUOTE_COMBINE_CHILD_QUOTE_EMPTY_ERROR(130025, "组合报价-子报价不能为空"),

    PZ_QUOTE_DEVICE_TYPE_ERROR(130026, "不存在对应的设备类型"),

    PZ_QUOTE_PZ_TYPE_CACULATE_PRICE_ERROR(130027, "该品专类型不能进行报价计算"),

    PZ_QUOTE_PARAMETER_PRICE_EFFECTIVE_EMPTY(130028, "请选择价格有效期"),

    PZ_QUOTE_PARAMETER_PRICE_EFFECTIVE_ERROR(130029, "请选择正确的价格有效期"),

    PZ_QUOTE_PARAMETER_MANUAL_PRICE_ERROR(130030, "手工报价错误"),

    PZ_QUOTE_PARAMETER_SPECIAL_PRICE_ERROR(130031, "特批报价错误"),

    // 品专 订单

    PZ_ORDER_NUMBER_EMPTY(140001, "该用户没有此订单编号！"),

    PZ_ORDER_NUMBER_MUST_CHILD(140002, "订单编号必须为子订单编号！"),

    PZ_ORDER_PARAM_ERROR(140003, "订单参数错误"),

    PZ_ORDER_NOT_EXIST(140004, "订单不存在"),

    PZ_ORDER_INQUIRY_NOT_EXIST(140005, "询价不存在"),

    PZ_ORDER_QUOTE_NOT_EXIST(140006, "报价不存在"),

    PZ_ORDER_ALREADY_EXIST_ERROR(140007, "该询价已经存在订单"),

    PZ_ORDER_COMMON_NOT_EXIST(140008, "该浮层品专对应的常规品专订单不存在"),

    PZ_ORDER_INQUIRY_CHECKSTATUS_ERROR(140009, "报价未生效不允许预下单"),

    PZ_ORDER_STARTDATE_EMPTY(140010, "订单的投放开始时间不能为空"),

    PZ_ORDER_ENDDATE_EMPTY(140011, "订单的投放结束时间不能为空"),

    PZ_ORDER_COVERDATE_EMPTY(140012, "订单的投放时间不能为空"),

    PZ_ORDER_STARTDATE_RANGE_ERROR(140013, "投放开始时间选择范围为“当前日期+{0}~报价日期+{1}”"),

    PZ_ORDER_STARTDATE_EXCEED_ERROR(140014, "投放开始时间应不大于“报价日期+可购买时长”"),

    PZ_ORDER_ENDDATE_MONTH_RANGE_ERROR(140015, "投放结束时间选择范围为“投放开始时间后{0}个自然月截止时间~投放开始日期后{1}个自然月截止时间”"),

    PZ_ORDER_ENDDATE_EXCEED_ERROR(140016, "投放结束时间应不大于“投放开始时间+可购买时长”"),

    PZ_ORDER_ENDDATE_DAY_RANGE_ERROR(140017, "投放结束时间选择范围为“投放开始日期+{0}~投放开始日期+{1}”"),

    PZ_ORDER_COVERDATE_TOO_MUCH_ERROR(140018, "浮层品专的投放时间不能超过{0}天"),

    PZ_ORDER_COVERDATE_NUMBER_ERROR(140019, "浮层品专的投放日期个数与询价时填写的浮层天数不符"),

    PZ_ORDER_COVERDATE_RANGE_ERROR(140020, "投放时间选择范围为“当前日期+{0}~报价日期+{1}”"),

    PZ_ORDER_COVERDATE_NOT_IN_COMMON_RANGE_ERROR(140021, "浮层品专的投放日期必须在所绑定的常规品专投放时间范围内"),

    PZ_ORDER_COVERDATE_OVERLAP_ERROR(140022, "浮层品专的投放日期互相不能重叠"),

    PZ_ORDER_COVERDATE_OVERLAT_WITH_EXIST_ERROR(140023, "投放日期不能与已创建的浮层品专订单重叠"),

    PZ_ORDER_COVERDATE_DAYS_EXCEED_ERROR(140024, "浮层品专的投放总天数超过了关联的常规品专投放天数"),

    PZ_ORDER_RECEIVER_EMAIL_EMPTY(140025, "预下单邮件接收人邮箱不能为空"),

    PZ_ORDER_RECEIVER_EMAIL_FORMAT_ERROR(140026, "预下单邮件接收人邮箱格式错误"),

    PZ_ORDER_RECEIVER_EMAIL_LENGTH_ERROR(140027, "预下单邮件接收人邮箱长度不能超过{0}个字符"),

    PZ_ORDER_DATE_SEQUENCE_ERROR(140028, "开始时间不能小于结束时间"),

    PZ_ORDER_CM_INFO_EMPTY(140029, "账户未在CM系统中查找到折扣和厂商信息"),

    PZ_ORDER_COVER_TYPE_NOT_MATCH_ERROR(140030, "浮层品专的类型与所关联的常规/时效品专不匹配"),

    PZ_ORDER_COVER_EXPIRE_ERROR(140031, "该浮层所关联的常规品专尚未填写投放信息，不能对浮层预下单"),

    PZ_ORDER_END_DATE_OVER_ERROR(140032, "已经超过预下单结束日期，不能新建推广单元，请重新询价！"),

    PZ_ORDER_ALREADY_HAVE_UNIT_IN_SUPERZONE(140033, "您已经选择线下投放，不能在此系统新建推广单元！"),

    PZ_ORDER_ADD2SUPERZONE_ERROR(140034, "目前只有ka客户有操作线下投放的权限！"),

    PZ_ORDER_ADD2SUPERZONE_ADMIN_ERROR(140035, "目前管理系统只有中小客户有操作线下投放的权限！"),

    // 品专 推广单元
    PZ_UNIT_ORDERNUM_EPMTY(150001, "订单编号不能为空！"),

    PZ_UNIT_NAME_EPMTY(150002, "请填写推广单元名称！"),

    PZ_UNIT_NAME_LENGTH_OVERFLOW(150003, "推广单元名称需少于30字符，请修改！"),

    PZ_UNIT_CONTACK_NUMBER_OVERFLOW(150004, "合同号不能超过最长50字符，请修改！"),

    PZ_UNIT_KEYWORDS_EMPTY(150005, "关键词不能为空，请修改！"),

    PZ_UNIT_STARTDATE_EMPTY(150006, "投放开始时间不能为空，请修改！"),

    PZ_UNIT_ENDDATE_EMPTY(150007, "投放结束时间不能为空，请修改！"),

    PZ_UNIT_PUBLISHPRICE_EMPTY(150008, "刊例价不能为空，请修改！"),

    PZ_UNIT_DISCOUNT_EMPTY(150009, "折扣不能为空，请修改！"),

    PZ_UNIT_CONTACTNUM_EMPTY(150010, "合同金额不能为空，请修改！"),

    PZ_UNIT_CUSTTYPE_EMPTY(150011, "代理商不能为空，请修改！"),

    PZ_UNIT_CUSTTYPE_ERROR(150012, "代理商参数错误，请修改！"),

    PZ_UNIT_DATE_STARTLATEREND_ERROR(150013, "投放开始时间晚于投放结束时间，请修改！"),

    PZ_UNIT_KEYWORD_EDIT_STATUS_ERROR(150014, "当前投放状态为不可对关键词进行修改！"),

    PZ_UNIT_NAME_EXIST(150015, "推广单元名称已存在，请修改！"),

    PZ_UNIT_SALE_ERROR(150016, "销售代表不在名单中，请修改！"),

    PZ_UNIT_COMMNET_LENGHT_OVERFLOW(150017, "备注不能超过30字符，请修改！"),

    PZ_UNIT_COMMNET_EMPTY(150018, "订单编号为浮层品专，请填写该浮层投放时间！"),

    PZ_UNIT_PZORDER_NOT_FOUND(150019, "该账号下不存在该订单编号，请修改！"),

    PZ_UNIT_ORDERNUMBER_EXIST(150020, "订单编号对应的推广单元已经存在，请修改！"),

    PZ_UNIT_MATERIAL_NO_EXIST(150021, "订单编号对应的物料不存在，请修改！"),

    PZ_UNIT_LAYER_TIME_ERROR(150022, "浮层品专需要在对应的常规品专时间范围内，请修改浮层品专投放时间！"),

    PZ_UNIT_LAYER_FOR_NORMAL_NOT_EXIST(150023, "浮层对应的常规品专未生成推广单元！"),

    PZ_UNIT_ORDER_LAYER_TO_COMMON_NOT_EXIST(150024, "浮层订单对应的常规订单不存在！"),

    PZ_UNIT_LAYER_TO_COMMON_NOT_EXIST(150025, "浮层对应的常规品专推广单元不存在，请先创建！"),

    PZ_UNIT_MODIFY_EMTPTY_STARTDATE_ERROR(150026, "投放状态为-，投放开始时间必须大于等于当前时间！"),

    PZ_UNIT_MODIFY_PROMOTING_STARTDATE_ERROR(150027, "投放状态为投放中，投放开始时间不能修改！"),

    PZ_UNIT_MODIFY_END_TDATE_ERROR(150028, "投放状态为投放结束，投放开始时间，投放结束时间都不能修改！"),

    PZ_UNIT_MODIFY_PAUSE_DATE_TDATE_ERROR(150029, "投放状态为手动暂停，投放开始时间，投放结束时间不能修改！"),

    PZ_UNIT_MODIFY_PAUSE_PRICE_ERROR(150030, "投放状态为手动暂停，投放金额都不能修改！"),

    PZ_UNIT_MODIFY_DATE_ERROR(150031, "浮层推广单元对应的常规推广单元投放时间不能为空，请修改！"),

    PZ_UNIT_LAYER_TIME_OVERFLOW(150032, "单个浮层时间不能超过10天！"),

    PZ_UNIT_NORMAL_TIME_OVERFLOW(150033, "常规或时效品专的投放结束时间必须包含对应的浮层品专投放时间（推广单元时间或者订单时间），请重新选择投放结束时间！"),

    PZ_UNIT_INPUT_WITHOUT_NORMAL(150034, "直通车对应的pc常规订单没有推广单元，请修改！"),

    PZ_UNIT_INPUT_DATE_ALONE_MODIFY(150035, "直通车推广单元时间不能单独修改！"),

    PZ_UNIT_INPUT_WITHOUT_NORMAL_ERROR(150036, "直通车不存在对应的常规品专推广单元！"),

    // 品专 物料
    PZ_MATERIAL_PC_LEFT_TOP_EMPTY(160001, "pc左侧头部物料为空！"),

    PZ_MATERIAL_PC_LEFT_CENTER_EMPTY(160002, "pc左侧中部物料为空！"),

    PZ_MATERIAL_PC_LEFT_BOTTOM_EMPTY(160003, "pc左侧底部物料为空！"),

    PZ_MATERIAL_PC_RIGHT_EMPTY(160004, "pc右侧物料为空！"),

    PZ_MATERIAL_WIRELESS_TOP_EMPTY(160005, "无线头部物料为空！"),

    PZ_MATERIAL_WIRELESS_CENTER_EMPTY(160006, "无线中部物料为空！"),

    PZ_MATERIAL_WIRELESS_BOTTOM_EMPTY(160007, "无线底部物料为空！"),

    PZ_MATERIAL_SUGGESTION_EMPTY(160008, "suggestion物料为空！"),

    PZ_MATERIAL_INPUT_EMPTY(160009, "输入法物料为空！"),

    PZ_MATERIAL_PC_COVER_EMPTY(160010, "pc浮层物料为空！"),

    PZ_MATERIAL_MOBILE_COVER_EMPTY(160011, "无线浮层物料为空！"),

    PZ_MATERIAL_KEY_NUM_ERROR(160012, "{0}关键词个数不能超过{1}个！"),

    PZ_MATERIAL_NUMBER_RANGE_ERROR(160013, "{0}的个数为{1}~{2}！"),

    PZ_MATERIAL_NUMBER_ERROR(160014, "{0}的个数只能为{1}！"),

    PZ_MATERIAL_TEXT_CHAR_ERROR(160015, "{0}长度为{1}~{2}字符！"),

    PZ_MATERIAL_EMPTY_ERROR(160016, "{0}物料为空！"),

    PZ_MATERIAL_FORMAT_ERROR(160017, "{0}格式错误！"),

    PZ_MATERIAL_TEXT_NOT_NUMBER_ERROR(160018, "{0}必须为数字!"),

    // 品专 关键词

    PZ_KEYWORDS_STATUS_FAIL(170001, "询价关键词包状态不正确"),

    PZ_KEYWORDS_REFUSE_NOT_FOUND(170002, "找不到该询价的关键词拒绝理由"),

    PZ_KEYWORDS_PARAM_REFUSE_NOT_EMPTY(170003, "拒绝理由参数不能为空"),

    PZ_KEYWORDS_AUDIT_PARAM_LACK(170004, "参数{0}均不能为空"),

    PZ_KEYWORDS_AUDIT_STYLE_TYPE_ONLY(170005, "接口目前仅支持品专类型{0}"),

    PZ_KEYWORDS_NOT_FOUND(170006, "找不到x询价对应的关键词组"),

    PZ_KEYWORDS_PARAM_SECOND_AUDIT_REFUSE_NOT_ENOUGH(170007, "拒绝条目数不足够"),

    PZ_KEYWORDS_PACK_CHECK_STATUS_NOKOWN(170008, "未知词包状态{0}"),

    PZ_KEYWORDS_CHECK_STATUS_NOKOWN(170009, "未知关键词状态"),

    PZ_KEYWORDS_PART_CHECK_STATUS_ERROR(170010, "部分关键词状态不正确"),

    PZ_KEYWORDS_OPTION_RIGHT_ERROR_KA(170011, "您没有KA客户价格审核的权限"),

    PZ_KEYWORDS_OPTION_RIGHT_ERROR_ZX(170012, "您没有中小客户价格审核的权限"),

    // 泛灵犀
    LX_AD_ID_INVALID(180001, "泛灵犀广告ID不合法"),

    LX_AD_PARAM_ERROR(180002, "参数不合法"),

    LX_AD_NAME_ERROR(180003, "广告名称不正确"),

    LX_AD_START_DATE_END_DATE_EMPTY(180004, "投放起止时间为空"),

    LX_AD_START_DATE_END_DATE_ERROR(180005, "投放起止时间错误"),

    LX_AD_KEYWORD_EMPTY(180006, "关键词为空"),

    LX_AD_KEYWORD_MAX_NUMBER_ERROR(180007, "关键词个数超过{0}个"),

    LX_AD_QUERY_PARAM_EMPTY(180008, "查询参数为空!"),

    LX_AD_NOT_EXIST(180009, "广告不存在!"),

    LX_AD_NAME_DUPLICATE_ERROR(180010, "广告名称已存在！"),

    // 关键词({0})在投放日期内已被其他广告占用
    LX_AD_KEYWORD_BUSY_ERROR(180011, "在投放日期内{0}"),

    LX_AD_PROMOTE_STATUS_ERROR(180012, "广告状态不能为空!"),

    LX_MATERIAL_DUPLICATE(180013, "添加物料失败，该广告物料已存在！"),

    LX_MATERIAL_CANNOT_UPDATE(180014, "物料当前状态不允许进行更新操作！"),

    LX_MATERIAL_TPL_NOT_FOUND(180015, "物料模板文件未找到！"),

    LX_MATERIAL_RENDER_FAIL(180016, "物料渲染失败！"),

    LX_MATERIAL_SUBMIT_DUPLICATE(180017, "不可重复提交物料！"),

    LX_MATERIAL_ID_EMPTY(180018, "物料id为空！"),

    LX_MATERIAL_EMPTY(180019, "物料为空！"),

    LX_MATERIAL_ID_ERROR(180020, "物料id错误"),

    LX_MATERIAL_NOT_EXIST(180021, "物料不存在！"),

    LX_TEMPLATE_ID_EMPTY(180022, "模板id为空"),

    LX_TEMPLATE_JSON_EMPTY(180023, "模板数据为空"),

    LX_KEYWORD_MAX_BYTE_LENGTH_ERROR(180024, "关键词最大长度为80字节!"),

    LX_AD_NAME_MAX_BYTE_LENGTH_ERROR(180025, "广告名称最大长度为80字节!"),

    ADMIN_INQUIRY_ACCOUNT_NAME_EMPTY(190001, "客户名不能为空"),
    ADMIN_INQUIRY_ACCOUNT_TRADE_ERROR(190002, "客户所属行业无效"),
    ADMIN_INQUIRY_TRADE_NOT_ALLOW(190003, "所选行业不能进行询价"),
    ADMIN_INQUIRY_ACCOUNT_NAME_ERROR(190004, "所填客户名称和客户ID不属于同一账户"),
    ADMIN_INQUIRY_ACCOUNT_TRADE_UNCONSISTENT(190005, "所填客户行业和客户ID不属于同一行业"),
    ADMIN_INQUIRY_CONTAINS_BLACK_SENSITIVE_WORDS(190006, "您提交的关键词{0}中包含黑词/敏感词，您需要去掉这些黑词，重新询价"),
    ADMIN_INQUIRY_EMAILES_FORMAT_ERROR(190007, "您输入的邮箱为空或格式错误"),
    ADMIN_INQUIRY_SEND_EMAILES_ERROR(190008, "报价通知邮件发送失败"),
    ADMIN_INQUIRY_COMBINED_PRICE_ERROR(190009, "pc报价和无线报价不能为空"),

    // 500 for system error
    SYSTEM_ERROR(500, "系统异常.");

    private int code;
    private String message;

    private BizErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMessage(int code) {
        for (BizErrorEnum em : BizErrorEnum.values()) {
            if (em.getCode() == code) {
                return em.getMessage();
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
