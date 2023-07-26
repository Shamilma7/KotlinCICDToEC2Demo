#!/bin/bash

echo "Killing process on port 8000"
kill -9 $(lsof -t -i:8000)
echo "Done killing the process on port 8000"
