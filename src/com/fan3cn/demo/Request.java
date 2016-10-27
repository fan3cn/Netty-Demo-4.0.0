package com.fan3cn.demo;

/**
 * 一个请求
 * @author fanyy
 *
 */
public class Request {

	private int requestId;
	
	private String command;
	
	private String content;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("requestId:").append(requestId).append(";\n");
		sb.append("command:").append(command).append(";\n");
		sb.append("content:").append(content).append(";\n");
		return sb.toString();
	}
	
}
