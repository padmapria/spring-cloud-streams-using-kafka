# spring-cloud-streams-using-kafka

Download kafka from https://kafka.apache.org/downloads (choose from binary download) and extract to D:\DEV-SOFTWARES\



1) Go inside the folder    
cd D:\DEV-SOFTWARES\kafka_2.12\bin\windows

2) Run the below to start zookeeper    
zookeeper-server-start.bat D:\DEV-SOFTWARES\kafka_2.12\config\zookeeper.properties

3) Start kafka    
kafka-server-start.bat D:\DEV-SOFTWARES\kafka_2.12\config\server.properties

4) Create Topic:    
kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic message1

5) Produce a message    
kafka-console-producer.bat --broker-list localhost:9092 --topic message1

6) Consume a message     
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic message1
