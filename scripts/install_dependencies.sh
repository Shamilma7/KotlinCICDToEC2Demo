#!/bin/bash

echo "Installing java 17..."
sudo yum install java-17
echo "Finished installing java 17"

echo "Clearing /home/ec2-user/server folder for use..."
sudo rm -rf /home/ec2-user/server
echo "Finished clearing server folder"
