package com.jtcaldas.spydroid.api;

import com.jtcaldas.streaming.Session;
import com.jtcaldas.streaming.rtsp.RtspServer;

public class CustomRtspServer extends RtspServer {
	public CustomRtspServer() {
		super();
		// RTSP server disabled by default
		mEnabled = false;
	}
}

