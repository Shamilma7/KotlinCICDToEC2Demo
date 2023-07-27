#!/bin/bash

echo "Starting java jar"
cd /home/ec2-user/server
java -jar *SNAPSHOT.jar > output.log
echo "Done starting java jar"