/**
 * 这是一个使用netty的demo
 * 需求：服务器接收到客户端的请求，经过层层解析，得到可用的对象
 * 请求格式：总长度+32位的命令+请求id+参数
 * @author fanyy
 *
 */
package com.fan3cn.demo;