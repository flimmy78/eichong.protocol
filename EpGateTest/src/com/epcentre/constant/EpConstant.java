package com.epcentre.constant;

public class EpConstant {
	
	public static int EP_AC_TYPE = 14;
	public static int EP_DC_TYPE = 5;
	
	public static int EP_TYPE_LD =0; //落地式
	public static int EP_TYPE_BG =1; //壁挂式
	public static int EP_TYPE_LG =2; //拉杆式
	public static int EP_TYPE_BX =3; //便携式
	
	public static int EP_DISCONNECT=0;
	public static int EP_CONNECT=1;
	//
	
	//1：取消预约 2：预约结束(完成) 3：续预约中 4：预约中 5:预约确认中 6：预约失败7:结算完成
	public static int BESPOKE_STATUS_CANCEL=1;
	public static int BESPOKE_STATUS_END=2;
	public static int BESPOKE_STATUS_REDO=3;
	public static int BESPOKE_STATUS_LOCK=4;
	public static int BESPOKE_STATUS_CONFIRM=5;
	public static int BESPOKE_STATUS_FAIL=6;
	//public static int BESPOKE_STATUS_COOLING=7;
	public static int BESPOKE_STATUS_FIN_UNSTAT=7;//完成未结算,用在后付费模式
	

	
	
	
	
	/** 枪状态(目前) */

	public static final int EP_GUN_W_STATUS_OFF_LINE = 0;// 离线
	public static final int EP_GUN_W_STATUS_FAULT = 1;// 故障
	public static final int EP_GUN_W_STATUS_IDLE = 2;// 待机
	public static final int EP_GUN_W_STATUS_WORK = 3;// 工作(充电)停用中
	public static final int EP_GUN_W_STATUS_BESPOKE = 8;//预约
	public static final int EP_GUN_W_STATUS_UPGRADE = 9;// 在线升级
	public static final int EP_GUN_W_STATUS_USER_OPER = 10;// 操作中(待定,防止用户在操作中被预约)
	public static final int EP_GUN_W_STATUS_SETTING = 11;//设置状态
	
	
	public static final int EP_GUN_W_STATUS_SELECT_CHARGE_MODE = 12;//充电模式选择
	
	public static final int EP_GUN_W_INIT = 30;//电桩初始化
	public static final int EP_GUN_W_STATUS_LESS_VOL_FAULT = 31;//欠压故障
	public static final int EP_GUN_W_STATUS_OVER_VOL_FAULT = 32;//过压故障
	public static final int EP_GUN_W_STATUS_OVER_CURRENT_FAULT = 33;//过流故障
	public static final int EP_GUN_W_STATUS_ARRESTER_FAULT = 34;//防雷器故障
	public static final int EP_GUN_W_STATUS_METER_FAULT = 35;//电表故障
	public static final int EP_GUN_W_STATUS_CONTACTOR_FAULT=36;//接触器故障
	public static final int EP_GUN_W_STATUS_INSULATION_FAULT=37;//绝缘检查故障
	public static final int EP_GUN_W_STATUS_URGENT_STOP=38;//急停

	
	
	/** 枪状态(目前) */
	public static final int EP_GUN_STATUS_IDLE = 0;// 空闲;
	public static final int EP_GUN_STATUS_BESPOKE_LOCKED = 3;// 预约中
	public static final int EP_GUN_STATUS_CHARGE = 6;// 充电中
	public static final int EP_GUN_STATUS_STOP_USE = 9;// 停用中
	public static final int EP_GUN_STATUS_EP_OPER = 10;//桩操作中
	public static final int EP_GUN_STATUS_USER_AUTH = 12;// 用户鉴权
	public static final int EP_GUN_STATUS_SETTING = 13;// 设置状态
	public static final int EP_GUN_STATUS_FROZEN_AMT = 14;
	public static final int EP_GUN_STATUS_SELECT_CHARGE_MODE = 15;
	public static final int EP_GUN_STATUS_EP_UPGRADE=16;//在线升级中
	public static final int EP_GUN_STATUS_EP_INIT=256;//电桩初始化，不处理任何业务操作
	public static final int EP_GUN_STATUS_OFF_LINE=257;//离线状态
	
	public static final int USER_ACTION_BESPOKE =1;
	public static final int USER_ACTION_CANCEL_BESPOKE =2;
	public static final int USER_ACTION_START_CHARGE =3;
	public static final int USER_ACTION_STTOP_CHARGE =4;
	
	public static final int EP_STATUS_NORMAL =0;
	public static final int EP_STATUS_IN_UPDATE= 1;
	
	/** 订单状态 */
	public static int ORDER_STATUS_WAIT = 1;// 待支付
	public static int ORDER_STATUS_SUCCESS = 2;// 支付成功
	public static int ORDER_STATUS_DONE = 3;// 操作完成
	public static int ORDER_STATUS_DELETE = 0;// 订单删除
	public static int ORDER_STATUS_EXCEPTION = 4;// 订单数据异常
	
	/** 发起充电方式 */
	public static short CHARGE_TYPE_QRCODE = 1;//二维码充电
	public static short CHARGE_TYPE_ACCOUNT = 2;//账号充电
	public static short CHARGE_TYPE_CARD = 3;//卡充电
	
	public static final short END_BESPOKE_CANCEL =1;
	public static final short END_BESPOKE_EXPIRE_TIME  =2;
	public static final short END_BESPOKE_CHARGE =3;
	

	/** 枪预约冷却时间*/
		
	
	public static final short MIN_BESP_TIME_UINT  = 1800;//单位秒,预约计价基数,不足30分钟按30分钟算
	
	//public static final short MIN_BESP_TIME_UINT  = 300;//单位秒,预约计价基数,不足30分钟按30分钟算
	
	public static final short FREE_BESP_TIME  = 300;//单位秒,预约基数内的免费时间,用该时间忽略客户端的时间差和网络通讯时间差
	
	public static final short BESP_COOLING_TIME =300;//单位分钟，在用户取消预约后，给予用户一定的冷却时间，保证用在到达充电现场，取消预约后不会被其它用户预约和充电

	public static final short SENDING_CHARGE_TIMEOUT = 60;//单位秒，在APP发送了充电命令后，等待桩回复时间 

	public static final short SENDING_BESPOKE_TIMEOUT = 60;//单位秒，在APP发送了预约命令后，等待桩回复时间 
	
	public static final short EP_CONNECT_TIMEOUT = 30; //单位秒
	
	public static final short EP_UPDATE_CONNECT_TIMEOUT = 140; //单位秒
	
	/**通讯连接类型***/
	public static final short COMM_MODE_OF_DISCRETE_POLE = 1;
	
	public static final short COMM_MODE_CENTRATOR = 2;
	
	public static final short U_CHARGEINFO_INTERVAL = 180;//三分钟
	
	public static final short U_PHONE_INTERVAL = 30;//30秒钟
	

	
	public static final String ELECTRICPILE="1";//1：充电桩/充电树     
	public static final String POWERSTATION="2";// 2：电站
	public static final String BYCILEPILE="3";//电动自行车
	
	
	public static final int SENDTOMONITOR_IDLE_TIME = 600; //发送给监控系统的时间 ，秒
	public static final int SENDTOMONITOR_CHARGE_TIME = 180; //发送给监控系统的时间 ，秒
	
	public static final int CARD_NORMAL =10;
	public static final int CARD_ABNORMAL_PRE_PAY =11;
	public static final int CARD_ABNORMAL_FRONZE =12;
	
	public static final int E_CARD_AUTH_ERROR_UNCONNECT =1;
	public static final int E_CARD_AUTH_TIMEOUT =2;
	public static final int E_CARD_NOT_FIND_EP =3;
	public static final int E_CARD_AUTH_FAIL =4;
	public static final int E_CARD_NO_RIGHT =5;
	public static final int E_CARD_INVALID =6;
	public static final int E_CARD_LOSS =7;
	public static final int E_CARD_NOT_BIND_USER =8;
	public static final int E_CARD_AUTH_ERROR_PW =9;
	
	public static final int P_M_POSTPAID =2;//后付费
	public static final int P_M_FIRST =1; //先付费
	
	public static final int IDENTYCODE_INVALID_TIME1 = 8*60; //身份识别码判断失效时间
	
	public static final int IDENTYCODE_INVALID_TIME2 = 16*60; //身份识别码判断失效时间
	
	public static final int MAX_CHARGE_COST = 100000;//500元
	public static final int MAX_CHARGE_AMT = 50000;//500元
	public static final int MAX_CHARGE_SERVICE_AMT = 50000;//500元
	public static final int MAX_CHARGE_METER_NUM = 900000;//900度
	
	public static final int EP_STATUS_ONLINE=15;//上线
	public static final int EP_STATUS_OFFLINE=10;//专属
	
	
}
