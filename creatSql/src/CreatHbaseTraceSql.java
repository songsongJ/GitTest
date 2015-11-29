public class CreatHbaseTraceSql {

	public static void main(String[] args) {
		creatSlowListSql();
	}

	private static void creatSlowListSql() {

		int num = 30;
		for (int i = 0; i < num; i++) {
			String sql = "insert into `T_SC_SLOW_LIST` (`FSLOW_ID`, `FSLOW_APPID`, `FSLOW_IP`, `FSLOW_TYPE`, `FSLOW_SVIID`, `FSLOW_MTHID`, `FSLOW_RT`, " +
					"`FSLOW_COUNT`, `FSLOW_DATE`, `FSLOW_CREATE`, `FSLOW_MODIFIED`) values('4','1170','172016082178','3','service"+i+"','method"+i+"'," +
					"'5000','10','2015-10-22 00:00:00','2015-10-22 00:00:00','2015-10-22 00:00:00');";
//			str.append("insert into `T_SC_SLOW_LIST` (`FSLOW_ID`, `FSLOW_APPID`, `FSLOW_IP`, `FSLOW_TYPE`, `FSLOW_SVIID`,"
//					+ " `FSLOW_MTHID`, `FSLOW_RT`, `FSLOW_COUNT`, `FSLOW_DATE`, `FSLOW_CREATE`, `FSLOW_MODIFIED`) "
//					+ "values('1','1170','172016082178','3',");
//			str.append("'service"
//					+ i
//					+ "','method"
//					+ i
//					+ "','5000','10','2015-10-22 00:00:00','2015-10-22 00:00:00','2015-10-22 00:00:00');");
			System.out.println(sql);
			System.out.println();
		}

		// insert into `T_SC_SLOW_LIST` (`FSLOW_ID`, `FSLOW_APPID`, `FSLOW_IP`,
		// `FSLOW_TYPE`, `FSLOW_SVIID`, `FSLOW_MTHID`, `FSLOW_RT`,
		// `FSLOW_COUNT`, `FSLOW_DATE`, `FSLOW_CREATE`, `FSLOW_MODIFIED`)
		// values('1','1170','172016082178','3','service1','method1','5000','10','2015-10-22
		// 00:00:00','2015-10-22 00:00:00','2015-10-22 00:00:00');

	}
	
	private static void creatSlowHbase(){
		String sql = "UPSERT INTO T_SERVICE_TRACE_LOG(ROWKEY,traceid,) VALUES('foo',123);";
	}
}
