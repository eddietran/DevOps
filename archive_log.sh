#!/bin/sh
# Create a shell script to archive app logs and move it to an archive folder.
#
# Can be scheduled as cron job to be executed at specified intervals, i.e.:
# * * * * * /home/ubuntu/shell_script/archive_log.sh

# Make directories if they do not already exist
mkdir /home/ubuntu/shell_script
mkdir /home/ubuntu/shell_script/archive

# Create app.log if it does not already exist
touch /home/ubuntu/shell_script/app.log

# Archive logs
tar -czf /home/ubuntu/shell_script/archive.tar.gz /home/ubuntu/shell_script/app.log

# Move archive to archive folder
mv /home/ubuntu/shell_script/archive.tar.gz /home/ubuntu/shell_script/archive
