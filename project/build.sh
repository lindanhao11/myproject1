#!/bin/sh
if [ "$1" = "build" ];then
    mkdir /home/changsheng/project/CS_27151/project
    cp -a /home/changsheng/project/CS_27151/server/. /home/changsheng/project/CS_27151/project/
    cd /home/changsheng/project/CS_27151/project
    rm -rf /home/changsheng/project/CS_27151/server
    echo "执行成功"
fi
