//
// Created by Administrator on 2017/10/27 0027.
//
#include <jni.h>
#include <string>

extern "C"
#include "com_wc_commontondk_myjni_Codec.h"
JNIEXPORT jstring JNICALL
Java_com_wc_commontondk_myjni_Codec_hexEncode(JNIEnv *env, jclass type, jbyteArray array) {
    
    std::string hello = "我是JNI";

    return env->NewStringUTF(hello.c_str());
}
