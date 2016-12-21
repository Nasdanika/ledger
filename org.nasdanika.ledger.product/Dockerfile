FROM centos

RUN yum update -y \
	&& yum install -y \
		java-1.8.0-openjdk-devel \
		graphviz \
	&& yum clean all 
		

COPY x86_64 /opt/ledger

RUN chmod a+x /opt/ledger/eclipse	

ENTRYPOINT ["/opt/ledger/eclipse"]

EXPOSE 8080