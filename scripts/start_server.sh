#!/bin/bash

echo "Starting java jar"
cd /home/ec2-user/server
sudo touch output.log
chmod u+rw output.log
java -jar -Dserver.port=8000 *SNAPSHOT.jar > output.log
echo "Done starting java jar"