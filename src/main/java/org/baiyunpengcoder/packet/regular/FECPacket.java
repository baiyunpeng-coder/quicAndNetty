package org.baiyunpengcoder.packet.regular;

/**
 *  FEC数据包（设置为 FLAG_FEC 的数据包 ）的有效载荷
 *  仅包含FEC组中每个数据包的空填充有效载荷的XOR .
 *  FEC数据包还必须设置 FLAG_FEC_GROUP 。
 *     +-----...----+
 *    | Redundancy |
 *    +-----...----+
 *
 * @author baiyunpeng
 * @date 2022/6/17 14:22
 **/
public class FECPacket {
}
