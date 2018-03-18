package com.yonyou.scf.gateway.cfcaTools;

import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

public class ReceiveEncoder implements ProtocolEncoder {

	@Override
	public void dispose(IoSession session) throws Exception {
//		System.out.println("#################dispose###################3");
	}

	@Override
	public void encode(IoSession session, Object object, ProtocolEncoderOutput out) throws Exception {
//		System.out.println("进行消息编码");
		IoBuffer buff = IoBuffer.allocate(100).setAutoExpand(true);
		buff.putString((String) object, Charset.forName("UTF-8").newEncoder());
		buff.flip();
		out.write(buff);
	}

}
