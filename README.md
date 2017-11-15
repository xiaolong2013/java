# java
java 和 算法

<pre><code>

sublime 下配置 java

1.先安装 jdk

2.配置环境变量  系统环境变量即可

3.在sublime 源码包中找到 package 里面 的 Java.sublime-package 用压缩文件打开 找到 JavaC.sublime-build 并解压 JavaC.sublime-build 到桌面

4.修改 JavaC.sublime-build 

{
    "cmd": ["buildJava.bat", "$file"],
    "file_regex": "^(...*?):([0-9]*):?([0-9]*)",
    "selector": "source.java"
}

5.在java/jdk/bin 目录下面新建 buildJava.bat

@ECHO OFF
cd %~dp1
ECHO Compiling %~nx1...
IF EXIST %~n1.class (
    DEL %~n1.class
)
javac %~nx1
IF EXIST %~n1.class (
    ECHO Running %~n1...
    ECHO -----------------------------------------------
    java %~n1
    ECHO -----------------------------------------------
)

6.关掉 sublime 并重启

7.ctrl + B 编译 
</code></pre>

