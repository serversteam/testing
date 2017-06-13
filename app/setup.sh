#/bin/bash

OPENEMM_ARCHIVE="OpenEMM-2015_R2-bin_x64.tar.gz"
wget -O /tmp/$OPENEMM_ARCHIVE "http://downloads.sourceforge.net/project/openemm/OpenEMM%20software/OpenEMM%202015/OpenEMM-2015_R2-bin_x64.tar.gz?r=https%3A%2F%2Fsourceforge.net%2Fprojects%2Fopenemm%2Ffiles%2FOpenEMM%2520software%2FOpenEMM%25202015%2F&ts=1459755210&use_mirror=jaist"

cd /home
mv /home/openemm /home/openemm-2015
ln -s /home/openemm-2015 /home/openemm
cd /home/openemm
tar -xzvpf /tmp/$OPENEMM_ARCHIVE

OPENEMM_DOC_DIR=/usr/share/doc/OpenEMM-2015
mkdir -p $OPENEMM_DOC_DIR
mv USR_SHARE/* $OPENEMM_DOC_DIR
rm -r USR_SHARE
chown -R openemm:openemm /home/openemm-2015


apt-get install python-dev python-pip -y
pip install MySQL-python
service mysql start  
echo "create database openemm" | mysql -u root -predhat
echo "create database openemm_cms" | mysql -u root -predhat
cd /usr/share/doc/OpenEMM-2015
mysql -u root -predhat openemm < openemm-2015_R2.sql
mysql -u root -predhat openemm_cms < openemm_cms-2015.sql
echo "GRANT ALL ON *.* TO 'agnitas'@'localhost' IDENTIFIED BY 'openemm';" | mysql -u root -predhat
ln -s /usr/local/tomcat /opt/openemm/tomcat

cd /opt/openemm/tomcat

mv conf conf-backup

ln -s /home/openemm/conf conf

# Copy my.cnf to openemm user

cp ~/.my.cnf /home/openemm/.my.cnf
chown openemm:openemm /home/openemm/.my.cnf

# Install Executable Service Manager

ln -s /home/openemm/bin/openemm.sh /usr/local/bin/openemm
