package com.example.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
	private final static String RX_FILE = "/sys/class/net/wlan0/statistics/rx_bytes";
	private final static String TX_FILE = "/sys/class/net/wlan0/statistics/tx_bytes";
	

	static public long readFile(String fileName){
	    File file = new File(fileName);
	    BufferedReader br = null;
	    long bytes = 0;
	    try{
	        br = new BufferedReader(new FileReader(file));
	        String line = "";
	        line = br.readLine();
	        bytes = Long.parseLong(line);
	    }  catch (Exception e){
	       
	        
	        return 0;

	    } finally{
	        if (br != null)
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	    }
	    
	    return bytes;
	}

	static public boolean wlan0FileIsNotNull(){
		boolean fileIsNotNull=false;
		if(readFile(RX_FILE)>0||readFile(TX_FILE)>0){
			fileIsNotNull=true;
			 System.out.println("wifi´ò¿ª£¡");
		}
		
		return fileIsNotNull;
		
	}
}
