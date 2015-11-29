package CreateHbaseSql;

/**
 * 生成sql语句脚本<br>
 * 【Hbase造数据】 连接：172.16.82.9<br>
 * [ ~]$ cd /opt/phoenix/bin<br>
 * [ ~]$ ./sqlline.py 172.16.200.239,172.16.200.233,172.16.200.234:2181<br>
 * 操作数据表 [ ~]$ !tables<br>
 * [ ~]$ !describe T_SERVICE_TRACE_LOG<br>
 * 
 * @author wujiang
 */
public class CreateHabaseTrace {

	public static void main(String[] args) {


		long st = 1445443200000L; // 开始时间 2015-11-13 00:00:00
		long et = st + 24 * 60 * 60 * 1000; //结束时间
		final String ip = "172016082041";
		final String name = "errName13";
		String appId = "1170";
		String appName = "pear";
		String traceId = "ac10031d14411118456185000";
		createTraceData(traceId,appId, appName, ip, name, st,et);

	}

	/**
	 * T_SERVICE_TRACE_LOG
	 * @param traceId
	 * @param appId
	 * @param appName
	 * @param ip
	 * @param name
	 * @param st
	 * @param et
	 */
	private static void createTraceData(String traceId,String appId, String appName,String ip, String name, long st,long et) {
		int mTime = 60 * 1000;
		int num = 5;
		String serviceName = "sviName";
		String detailName = "FSMTH_NAME";
		String type = "1";
		String serverIp = "172016115041";
		String rt = "1000";
		String insize = "10";
		String outsize = "10";
		for (int i = 0; i < num; i++) {
			long time = st + i * mTime;
			String rowkey = traceId+ "-" + "com.meizu.scorpio.client.service.KievTestService-isBoy-0";
//			String sql = "UPSERT INTO T_ERROR_SAMPLE(ROWKEY,TRACEID,KIEVID,APPNAME,SERVICENAME,DETAILNAME,TYPE,SITE,STATE,STARTTIME,ENDTIME,TIME,INSIZE" +
//					",OUTSIZE,CLIENTIP,SERVERIP,SAMPLE,PARAM,ATTACH,ERRNAME,ERRSTACK,EFFECT,RT) values()";
			String sql = "UPSERT INTO T_SERVICE_TRACE_LOG(ROWKEY,TRACEID,SERVICENAME,DETAILNAME,TYPE,STARTTIME,ENDTIME,TIME,INSIZE" +
					",OUTSIZE,SERVERIP,RT) values('"
					+ rowkey
					+ "','"
					+ traceId
					+ "','"
					+ serviceName
					+ "','"
					+ detailName
					+ "','"
					+ type
					+ "','"
					+ st
					+ "','"
					+ et
					+ "','"
					+ time 
					+ "','" 
					+ insize
					+ "','"
					+ outsize 
					+ "','"
					+ serverIp 
					+ "','"
					+ rt 
					+ "');";
			System.out.println(sql);

		}
	}
}
