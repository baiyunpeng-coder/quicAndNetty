package org.baiyunpengcoder.packet.special;

/**
 *
 *
 * 公共重置数据包以8位公共标志和64位 Connection ID 开始。
 * 公共标志必须设置 PUBLIC_FLAG_RESET 并指示64位 Connection ID
 * 对公共重置分组的其余部分进行编码，就像它是标签 PRST 的加密握手消息一样
 *
 *        0        1        2        3        4         8
 *    +--------+--------+--------+--------+--------+--   --+
 *    | Public |    Connection ID (64)                ...  | ->
 *    |Flags(8)|                                           |
 *    +--------+--------+--------+--------+--------+--   --+
 *
 *         9       10       11        12       13      14
 *    +--------+--------+--------+--------+--------+--------+---
 *    |      Quic Tag (32)                |  Tag value map      ... ->
 *    |         (PRST)                    |  (variable length)
 *    +--------+--------+--------+--------+--------+--------+---
 *
 *    标记值映射：标记值映射包含以下标记值：
 *  o RNON（public reset nonce-proof）—一个64位无符号整数。  强制性的
 *  o RSEQ（拒绝的数据包编号）—64位数据包编号。 强制性的
 *  o CADR（客户端地址）—观察到的客户端IP地址和端口 数字这目前仅用于调试目的，因此是可选的。
 * （TODO：公共重置数据包应包括已验证的（目标）服务器IP/端口。）
 *
 *
 *
 * @author baiyunpeng
 * @date 2022/6/17 14:10
 **/
public class PublicResetPacket {
}
