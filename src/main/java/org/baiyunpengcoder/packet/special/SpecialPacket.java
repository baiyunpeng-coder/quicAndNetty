package org.baiyunpengcoder.packet.special;

import org.baiyunpengcoder.packet.Packet;

/**
 *       特殊帧
 *       +------------------+-----------------------------+
 *       | Type-field value |     Control Frame-type      |
 *       +------------------+-----------------------------+
 *       |     1fdooossB    |  STREAM                     |
 *       |     01ntllmmB    |  ACK                        |
 *       |     001xxxxxB    |  CONGESTION_FEEDBACK        |
 *       +------------------+-----------------------------+
 * @author baiyunpeng
 * @date 2022/6/17 11:08
 **/
public interface SpecialPacket extends Packet {

}
