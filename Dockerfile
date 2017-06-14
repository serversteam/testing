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
