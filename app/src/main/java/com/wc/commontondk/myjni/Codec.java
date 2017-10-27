package com.wc.commontondk.myjni;

/**
 * 作者：wc
 * 时间：2017/10/26 0026 14:43
 * 描述：
 */
public class Codec {

    static {
        //一定不要忘记调用!!!!
        System.loadLibrary("codec-lib");
    }

    public static native String hexEncode();

    public static native byte[] hexDecode(String data);

}
