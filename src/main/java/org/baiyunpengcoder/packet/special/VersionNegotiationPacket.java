package org.baiyunpengcoder.packet.special;

import org.baiyunpengcoder.packet.special.SpecialPacket;

/**
 *  版本协商数据包仅由服务器发送。
 *  版本协商数据包以8位公共标志和64位 Connection ID 开始。
 *  公共标志必须设置 PUBLIC_FLAG_VERSION  并指示64位 Connection ID
 *  版本协商数据包的其余部分是服务器
 *
 *        0        1        2        3        4        5        6        7       8
 * +--------+--------+--------+--------+--------+--------+--------+--------+--------+
 * | Public |    Connection ID (64)                                                 | ->
 * |Flags(8)|                                                                       |
 * +--------+--------+--------+--------+--------+--------+--------+--------+--------+
 *
 *      9       10       11        12       13      14       15       16       17
 * +--------+--------+--------+--------+--------+--------+--------+--------+---...--+
 * |      1st QUIC version supported   |     2nd QUIC version supported    |   ...
 * |      by server (32)               |     by server (32)                |
 * +--------+--------+--------+--------+--------+--------+--------+--------+---...--+
 *
 *
 *
 * @author baiyunpeng
 * @date 2022/6/17 14:05
 **/
public class VersionNegotiationPacket implements SpecialPacket {
    @Override
    public byte getType() {
        return 0;
    }
}
