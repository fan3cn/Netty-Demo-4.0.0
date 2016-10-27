package com.fan3cn.demo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ResponseToBytesEncoder extends MessageToByteEncoder<Object> {

	@Override
	protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
		// TODO Auto-generated method stub
		
		
		if(msg instanceof String){
			String fullMsg = "response:"+(String)msg; 
			out.writeBytes(fullMsg.getBytes());
		}
		
		
		
	}

}
