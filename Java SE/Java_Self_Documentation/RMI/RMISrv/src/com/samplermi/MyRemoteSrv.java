package com.samplermi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class MyRemoteSrv extends UnicastRemoteObject implements
		MyRemoteSrvInter {

	private static final long serialVersionUID = 1L;

	public MyRemoteSrv() throws RemoteException {
		super();
	}

	public static void main(String[] args) {
		
		try {
			try {
				new MyRemoteSrv().settingProperties();
				// starting rmiregistry
				new MyRemoteSrv().rmiRegistry();				
				System.out.println("Registering and starting the service.");
				MyRemoteSrv myRemote = new MyRemoteSrv();
				Naming.rebind("MyRemoteSrv", myRemote);
				System.out.println("Service startup successful...");
			} catch (RemoteException e) {
				e.printStackTrace();
			} 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	private void rmiRegistry() {
		try {
			System.out.println("Starting RMI Registry.");
			Runtime.getRuntime().exec("cmd /c start rmiregistry");
			System.out.println("RMI Registry started...");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public String hello(String name) throws RemoteException {

		return "Hi "+name+", Good " + new MyRemoteSrv().currentTime() + "!";
	}
	private void settingProperties() {
		Properties props=System.getProperties();			
		if (props.getProperty("java.rmi.server.codebase")!= null) {
			System.out.println("java.rmi.server.codebase: "+props.getProperty("java.rmi.server.codebase"));
		} else {
			props.setProperty("java.rmi.server.codebase","file://localhost/D:/BAOLiteWorkspace/RMISrv/bin/");
		}
	}
	private String currentTime() {
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH");
		int hour = new Integer(dateFormat.format(today));
		if (hour < 12) {
			return "morn";
		} else if (hour >= 12 && hour <= 16) {
			if (hour == 12)
				return "noon";
			else
				return "after noon";
		} else if (hour >= 12 && hour <= 23)
			return "evening";

		return "day";
	}
}
