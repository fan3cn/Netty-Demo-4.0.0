package com.fan3cn.demo;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class BytesToRequestDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf buff, List<Object> out) throws Exception {
		// TODO Auto-generated method stub
		int idx = buff.readableBytes();
		byte[] bytes = buff.readBytes(idx).array();
		
		System.out.println("msg read:"+new String(bytes));
		
		Request request = new Request();
		request.setRequestId(1);
		request.setCommand("getInfo");
		request.setContent("user_id=1");
		
		out.add(request);
		
	}

}
