package com.yonyou.scf.gateway.cfcaTools;

import java.net.InetSocketAddress;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ClientSocketHanlder extends IoHandlerAdapter {

	@Override
	public void messageSent(IoSession session, Object message) {
		try {
			super.messageSent(session, message);
		} catch (Exception e) {
			this.exceptionCaught(session, new Throwable(e.getMessage()));
		}
	}

	@Override
	public void sessionCreated(IoSession session) {
		String ip = ((InetSocketAddress) session.getRemoteAddress()).getAddress().getHostAddress();
		session.setAttribute("clientIP", ip);
		try {
			super.sessionCreated(session);
		} catch (Exception e) {
			this.exceptionCaught(session, new Throwable(e.getMessage()));
		}
	}

	@Override
	public void sessionClosed(IoSession session) {
		try {
			super.sessionCreated(session);
		} catch (Exception e) {
			this.exceptionCaught(session, new Throwable(e.getMessage()));
		}
	}

	public void exceptionCaught(IoSession session, Throwable cause) {
	}
}
