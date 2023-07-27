#!/bin/bash

echo "Starting java jar"
cd /home/ec2-user/server
sudo nohup java -jar -Dserver.port=80 *SNAPSHOT.jar > output.log &
echo "Done starting java jar"