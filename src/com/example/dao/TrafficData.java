package com.example.dao;

import com.example.util.FileUtil;

import android.net.TrafficStats;
/**
 * ×îµ×²ãÊý¾Ý
 * @author 123
 *
 */
public class TrafficData implements ITrafficData{

	
	@Override
	public long getTotalRxFromBoot() {
		
		return TrafficStats.getTotalRxBytes();
	}
	@Override
	public long getTotalTxFromBoot() {
		// TODO Auto-generated method stub
		return TrafficStats.getTotalTxBytes();
	}
	public long getUidRxBytesFromBoot(int uid){
		return TrafficStats.getUidRxBytes(uid);
	}
	public long getUidTxBytesFromBoot(int uid){
		return TrafficStats.getUidTxBytes(uid);
	}
	
	public boolean iswifi(){		
		return FileUtil.wlan0FileIsNotNull();		
	}
}
