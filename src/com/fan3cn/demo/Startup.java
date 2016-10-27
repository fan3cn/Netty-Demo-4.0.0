package com.fan3cn.demo;

import java.net.InetSocketAddress;

import javax.xml.bind.Binder;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Startup {

	//端口号
	private final int port;
	
	public Startup(int port){
		this.port = port;
	}
	
	
	public void start(){
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		
		ServerBootstrap sb = new ServerBootstrap();
		sb.group(bossGroup, workerGroup);
		sb.channel(NioServerSocketChannel.class);
		sb.childHandler(new TcpChannelInitializerImpl());
		
		ChannelFuture future = sb.bind(new InetSocketAddress(port));
		future.addListener(new ChannelFutureListener() {
			
			@Override
			public void operationComplete(ChannelFuture future) throws Exception {
				// TODO Auto-generated method stub
				if(future.isSuccess()){
					System.out.println("bind success, listening port "+port);
				}else{
					System.out.println("bind failed");
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Startup startup = new Startup(7777);
		startup.start();
	}

}
