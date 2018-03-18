package com.yonyou.scf.gateway.cfcaTools;

import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class ReceiveDecoder extends CumulativeProtocolDecoder {

	private final static Charset charset = Charset.forName("UTF-8");

	@SuppressWarnings("unused")
	private IoBuffer buff = IoBuffer.allocate(5000).setAutoExpand(true);

	@Override
	protected boolean doDecode(IoSession session, IoBuffer in, ProtocolDecoderOutput out) throws Exception {
		if (in.remaining() > 8) {
			// 前8字节是包头
			// 标记当前position的快照标记mark，以便后继的reset操作能恢复position位置
			in.mark();

			// 获取包体数据长度
			byte[] lc = new byte[8];
			in.get(lc);

			// 包体数据长度
			int len = 0;
			try {
				len = Integer.parseInt(new String(lc, charset));
			} catch (NumberFormatException e) {
				// 断开与客户端的连接
				session.close(true);
				return false;
			}

			if (len > 99999990) {
				// 断开与客户端的连接
				session.close(true);
			}

			// 注意上面的get操作会导致下面的remaining()值发生变化
			if (in.remaining() < len) {
				// 如果消息内容不够，则重置恢复position位置到操作前,进入下一轮, 接收新数据，以拼凑成完整数据
				in.reset();
				return false;
			} else {
				// 消息内容足够
				in.reset();// 重置恢复position位置到操作前
				int sumlen = len + 8;// 总长 = 包头+包体
				byte[] packArr = new byte[sumlen];
				in.get(packArr, 0, sumlen);
				String message = new String(packArr, "utf-8");
				out.write(message);
				if (in.remaining() > 0) {// 如果读取一个完整包内容后还粘了包，就让父类再调用一次，进行下一次解析
					return true;
				}
			}
		} else {
		}
		return false;
	}

}
