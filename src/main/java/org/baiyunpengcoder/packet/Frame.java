package org.baiyunpengcoder.packet;

/**
 *
 * QUIC帧数据包由帧填充。具有帧类型字节，其本身具有类型相关的解释，
 * 后跟类型相关的帧头字段。所有帧都包含在单个QUIC数据包中，没有帧可以跨越QUIC数据包边界。
 *
 *  帧类型字节有两种解释，导致两种帧类型：特殊帧类型和常规帧类型。
 *  特殊帧类型将帧类型和相应的标志都编码在帧类型字节中，而常规帧类型仅使用帧类型字节。
 *
 *  当前定义的特殊类型：
 *
 *        +------------------+-----------------------------+
 *       | Type-field value |     Control Frame-type      |
 *       +------------------+-----------------------------+
 *       |     1fdooossB    |  STREAM                     |
 *       |     01ntllmmB    |  ACK                        |
 *       |     001xxxxxB    |  CONGESTION_FEEDBACK        |
 *       +------------------+-----------------------------+
 *
 *  当前定义的常规类型：
 *       +------------------+-----------------------------+
 *       | Type-field value |     Control Frame-type      |
 *       +------------------+-----------------------------+
 *       | 00000000B (0x00) |  PADDING                    |
 *       | 00000001B (0x01) |  RST_STREAM                 |
 *       | 00000010B (0x02) |  CONNECTION_CLOSE           |
 *       | 00000011B (0x03) |  GOAWAY                     |
 *       | 00000100B (0x04) |  WINDOW_UPDATE              |
 *       | 00000101B (0x05) |  BLOCKED                    |
 *       | 00000110B (0x06) |  STOP_WAITING               |
 *       | 00000111B (0x07) |  PING                       |
 *       +------------------+-----------------------------+
 *
 * @author baiyunpeng
 * @date 2022/6/17 15:19
 **/
public interface Frame {
}