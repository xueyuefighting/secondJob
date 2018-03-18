package com.yonyou.scf.common.constant;

/**
 * 枚举值常量定义类
 *
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-05-27  Create this file
 *
 * </pre>
 *
 */

public class FrontEndProcessConstant {

	/**
	 * 0001 参数校验失败
	 */
	public static final String ERR_0001_CODE = "0001";

	public static final String ERR_0001_MSG = "参数校验失败";

	/**
	 * 0002 平台ID鉴权失败
	 */
	public static final String ERR_0002_CODE = "0002";

	public static final String ERR_0002_MSG = "平台ID鉴权失败";

	/**
	 * 0003 接口ID鉴权失败
	 */
	public static final String ERR_0003_CODE = "0003";

	public static final String ERR_0003_MSG = "接口ID鉴权失败";

	/**
	 * 0004 服务器IP白名单校验失败
	 */
	public static final String ERR_0004_CODE = "0004";

	public static final String ERR_0004_MSG = "服务器IP白名单校验失败";

	/**
	 * 0005 登录信息失效，请重新登录
	 */
	public static final String ERR_0005_CODE = "0005";

	public static final String ERR_0005_MSG = "登录信息失效，请重新登录";

	/**
	 * 0006 权限不足，请重新登录。或与管理员联系
	 */
	public static final String ERR_0006_CODE = "0006";

	public static final String ERR_0006_MSG = "权限不足，请重新登录。或与管理员联系";

	/**
	 * 平台信息缓存Map关键字
	 */
	public static final String MAP_KEY_PlatformInfo = "PlatformInfo";

	/**
	 * 平台交易权限缓存Map关键字
	 */
	public static final String MAP_KEY_PlatformApiRight = "PlatformApiRight";

	/**
	 * 登录URL：login
	 */
	public static final String URL_Login = "login";

	/**
	 * 纯后台URL：api <br>
	 * 业务系统前后端之间，以及，客户平台系统发起的纯后台请求
	 */
	public static final String URL_API = "api";

	/**
	 * 跳页面URL：web <br>
	 * 客户平台系统发起的页面跳转请求
	 */
	public static final String URL_WEB = "web";

	/**
	 * 发送消息URL：Send <br>
	 * 特指内部系统触发的邮件、短信、微信等，发通知和站内信并不在此列
	 */
	public static final String URL_SEND = "Send";

	/**
	 * 接收推送URL：Notice <br>
	 * 特指用于资方等外部系统发起的消息推送
	 */
	public static final String URL_NOTICE = "Notice";

	/**
	 * 文件上传URL：Upload <br>
	 */
	public static final String URL_UPLOAD = "Upload";

	/**
	 * 图片预览URL：Image <br>
	 * 含图形验证码显示、PDF预览等
	 */
	public static final String URL_IMAGE = "Image";

	/**
	 * 文件下载URL：Download <br>
	 * 含PDF下载、Zip下载、Excel、图片下载等
	 */
	public static final String URL_DOWNLOAD = "Download";

	/**
	 * 测试用URL：test <br>
	 * 特指用于测试发通知，需打开DEBUG开关
	 */
	public static final String URL_TEST = "test";

	public static final String BROWSER_TYPE_IE = "ie";
	public static final String BROWSER_TYPE_CHROME = "chrome";
}
