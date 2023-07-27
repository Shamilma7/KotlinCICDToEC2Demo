#!/bin/bash

echo "Starting java jar"
cd /home/ec2-user/server
sudo java -jar -Dserver.port=80 *SNAPSHOT.jar > /dev/null 2> /dev/null < /dev/null &
echo "Done starting java jar"