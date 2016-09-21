package com.example.dao;

public interface ITrafficData {
	public long getTotalRxFromBoot();
	public long getTotalTxFromBoot();
	public long getUidRxBytesFromBoot(int uid);
	public long getUidTxBytesFromBoot(int uid);
	public boolean iswifi();
}
