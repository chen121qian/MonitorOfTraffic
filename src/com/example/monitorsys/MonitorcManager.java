package com.example.monitorsys;


public class MonitorcManager implements IMonitorManager{
	private static MonitorcManager manager=null;
	private ITrafficMonitor monitor=null;
	
	private MonitorcManager() {
		
	}

	@Override
	public ITrafficMonitor getTrafficMonitor() {
		if(monitor==null){
			monitor=new TrafficMonitor();
		}
		return monitor;
	}

	public static IMonitorManager getInstance() {
		if(manager==null){
			manager=new MonitorcManager();
		}
		return manager;
	}

}
