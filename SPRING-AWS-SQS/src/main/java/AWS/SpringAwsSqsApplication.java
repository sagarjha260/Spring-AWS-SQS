package AWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAwsSqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSqsApplication.class, args);
	}

}

//first create Queue in AWS Console and copy endpoint URL to add in Springboot application.
/*
SQS is a distributed queuing system, which gives access to a message queue that you can use to store messages while waiting for the end system 
to process it.There are two types of SQS queues

1)Standard queues
Standard queues guarantees message delivery at least once. But if there is a high volume of transactions in a distributed system, 
messages get delivered more than one time, which might cause confusion in the system in order to avoid this issue, you can opt for FIFO queues

2)FIFO queues: As the name suggests the messages will be delivered First in first out manner
It delivers the message only once messages are made available only till the consumer processes it, once the consumer processes the message, it is deleted
this queue mechanism eradicates the duplicate transactions.

 */

/*
after adding  access keys and tokens in application.yml
go to browser and hit uri: localhost:9001/sqs
after that go to the aws console to check message in Queue. go to Queue Action to view and delete message.
*/