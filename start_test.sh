#!/bin/sh
echo "--------start exhibition registration------->>"
cpid=`jps -v| grep exhibition-register-server `
if [ -n "$cpid" ]; then
  echo $cpid | cut -d " " -f1 | xargs kill -9
fi
nohup java -Did=exhibition-register-server -jar target/exhibition-registration-0.0.1-SNAPSHOT-fat.jar -conf src/config/local_test.json > log.file 2>&1 &