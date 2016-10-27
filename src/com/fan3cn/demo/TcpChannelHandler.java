package com.fan3cn.demo;

import java.nio.charset.Charset;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;

public class TcpChannelHandler extends ChannelInboundHandlerAdapter{

	
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		if(msg instanceof Request){
			Request r  = (Request) msg;
			System.out.println(r.toString());
			//do your own business logic
			
			//ByteBuf buf = Unpooled.copiedBuffer("hello world", Charset.forName("UTF-8"));
			
			ctx.write(new String("hello browser"));
		}
		
	}
	
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx){
		ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
	}
}
