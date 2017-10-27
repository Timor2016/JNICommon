# CMake的编译脚本配置文件
# 1. 标注需要支持的CMake最小版本
cmake_minimum_required(VERSION 3.4.1)
# 2. add_library 定义需要编译的代码库 名称, 类型, 包含的源码
add_library(
      #设置 library 名称.
      codec-lib
      # 设置这个library 作为一个分享的library.
      SHARED
      #目标
      src/main/cpp/com_wc_commontondk_myjni_Codec.cpp
 )
 # 3. find_library 定义当前代码库需要依赖的系统或者第三方库文件
 # 可以写多个 find_library
 find_library(
     log-lib # 指定要查找的系统库, 给一个名字
     log     # 真正要查找的liblog.so或者liblog.a
 )
 # 4. target_link_libraries设置最终编译的目标代码库
 target_link_libraries(
     codec-lib  # add_library 生成的
     ${log-lib} # find_library 找到的系统库
 )