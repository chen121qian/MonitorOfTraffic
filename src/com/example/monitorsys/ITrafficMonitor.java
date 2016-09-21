package com.example.monitorsys;

public interface ITrafficMonitor {
	/**
	 * 异步运行，不要运行在UI线程中
	 * @return
	 */
	public long getTrafficTotalRxSpeed();
	public long getTrafficTotalTxSpeed();
	public boolean isWifi();
}
