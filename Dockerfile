#
# Ubuntu Dockerfile
#
# https://github.com/dockerfile/ubuntu
#

# Pull base image.
FROM ubuntu
RUN groupadd openemm
RUN useradd -m -g openemm -G adm -d /home/openemm -s /bin/bash -c "OpenEMM-2015" openemm
RUN mkdir -p /opt/openemm
RUN ln -s /var/log/mail.log /var/log/maillog
RUN apt-get update -y
RUN apt-get install -y python-software-properties -y
RUN apt-get install -y software-properties-common python-software-properties -y
RUN add-apt-repository ppa:git-core/ppa  -y
RUN apt-get update -y
RUN apt-get upgrade -y
RUN add-apt-repository ppa:webupd8team/java -y
RUN apt-get update -y
RUN echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections
RUN echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections
RUN apt-get install oracle-java8-installer -y
RUN update-alternatives --config java > /tmp/java_location.txt
RUN ln -s /usr/lib/jvm/java-8-oracle/jre /opt/openemm/java
RUN echo "export JAVA_HOME=/opt/openemm/java" > ~/.bashrc
RUN . ~/.bashrc
RUN apt-get install wget -y
RUN wget http://redrockdigimark.com/apachemirror/tomcat/tomcat-8/v8.5.15/bin/apache-tomcat-8.5.15.tar.gz
RUN tar -zxf apache-tomcat-8.5.15.tar.gz
RUN mv apache-tomcat-8.5.15 /usr/local/tomcat
RUN ln -s /usr/local/tomcat /opt/openemm/tomcat
RUN apt-get update 
RUN apt-get install -y debconf-utils 
RUN echo mysql-server mysql-server/root_password password redhat | debconf-set-selections  
RUN echo mysql-server mysql-server/root_password_again password redhat | debconf-set-selections 
RUN apt-get install -y mysql-server -o pkg::Options::="--force-confdef" -o pkg::Options::="--force-confold" --fix-missing  
RUN apt-get install -y net-tools --fix-missing  
ENTRYPOINT service mysql start
#RUN rm -rf /var/lib/apt/lists/*\ \ && 
COPY app/ /app/
RUN chmod +x /app/setup.sh
RUN /app/setup.sh

