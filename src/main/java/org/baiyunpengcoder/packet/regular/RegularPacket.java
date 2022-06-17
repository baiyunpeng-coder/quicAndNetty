package org.baiyunpengcoder.packet.regular;

import org.baiyunpengcoder.packet.Packet;

/**
 *  常规帧
 *
 *      数据包经过身份验证和加密。公共报头经过身份验证但未加密，
 *      以Private Flags字段开头的数据包的其余部分进行加密。
 *      在公共标头之后的常规数据包包含AEAD（经过身份验证的加密和相关数据）数据。
 *      解密此数据才能解释内容。解密后，明文以私有头开始。
 *
 *
 *            0        1
 *       +--------+--------+
 *       |Private | FEC (8)|
 *       |Flags(8)|  (opt) |
 *       +--------+--------+
 *
 *       private标头中的字段如下所示：
 *       专用标志：
 *          0x01 = FLAG_ENTROPY  -对于数据包，表示 数据包包含1位熵，对于fec数据包，包含受保护数据包熵的异或
 *          0x02 = FLAG_FEC_GROUP -指示FEC字节是否存在。
 *          0x04 = FLAG_FEC 表示此数据包表示FEC小包裹
 *        FEC (FEC Group Number Offset):  FEC组编号是FEC组中第一个数据包的数据包编号。
 *          FEC组编号偏移量是一个8位无符号值，应从当前数据包的数据包编号中减去该值，
 *          以生成该数据包的FEC组编号。仅当专用标志包含 FLAG_FEC_GROUP 时，才会出现此选项。
 *          单个FEC组中的所有数据包必须将数据包编号编码为相同的字节数（即，数据包编号编码在组中不得更改）
 *         （TODO：记录加密和解密的输入，并描述尝试解密。）
 *
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
 * @author baiyunpeng
 * @date 2022/6/17 11:09
 **/
public interface RegularPacket extends Packet {
    @Override
    default byte getType() {
        return 0;
    }
}
