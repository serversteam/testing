#!/bin/sh
DEPLOY=../webapps/openemm
CLASSPATH=$DEPLOY/WEB-INF/classes:$DEPLOY/WEB-INF/lib/saaj.jar:$DEPLOY/WEB-INF/lib/axis.jar:$DEPLOY/WEB-INF/lib/jaxrpc.jar:$DEPLOY/WEB-INF/lib/commons-logging-1.1.jar:$DEPLOY/WEB-INF/lib/commons-digester-1.8.jar:$DEPLOY/WEB-INF/lib/commons-discovery.jar:$DEPLOY/WEB-INF/lib/wsdl4j-1.6.1.jar:$DEPLOY/WEB-INF/lib/mail.jar
java -classpath $CLASSPATH org.apache.axis.wsdl.Java2WSDL $args $*

