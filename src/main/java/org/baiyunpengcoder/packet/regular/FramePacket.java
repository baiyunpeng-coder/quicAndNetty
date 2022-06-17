package org.baiyunpengcoder.packet.regular;

/**
 *
 *  除了私有报头之外，帧数据包的有效负载是一系列类型前缀的帧。
 *  帧类型的格式在本文档后面定义，但帧数据包的一般格式如下
 *
 *     +--------+---...---+--------+---...---+
 *    | Type   | Payload | Type   | Payload |
 *    +--------+---...---+--------+---...---+
 * @author baiyunpeng
 * @date 2022/6/17 14:21
 **/
public class FramePacket {
}
