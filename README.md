Problem Statement
There is a scenario where thousands of trades are flowing into one store, assume any way of
transmission of trades. We need to create a one trade store, which stores the trade in the following
order

Solution Environment -  Spring boot, Kafka, Spring scheduler, Java 8, H2 Database

H2 Console - http://localhost:9090/h2-console

automatically update the expire flag if in a store the trade crosses the maturity date -> Scheduler ->  src/main/java/com/db/trade/job/TradeJobScheduler.java

Receives all trade request from kafka consumer -> src/main/java/com/db/trade/listener/KafkaConsumer.java
