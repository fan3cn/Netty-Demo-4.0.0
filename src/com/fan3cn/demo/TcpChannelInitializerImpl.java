package com.fan3cn.demo;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;

public class TcpChannelInitializerImpl extends ChannelInitializer<Channel> {

	@Override
	protected void initChannel(Channel channel) throws Exception {
		// TODO Auto-generated method stub
		ChannelPipeline pipeline = channel.pipeline();
		
		pipeline.addLast("decoder", new BytesToRequestDecoder());
		pipeline.addLast("encoder", new ResponseToBytesEncoder());
		pipeline.addLast("handler", new TcpChannelHandler());
		
		
	}

}
