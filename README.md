# Idempotent Consumer Implementation

Using Micronaut, Apache Camel, ActiveMQ, and an in memory MemoryIdempotentRepository.

The intent is to use an Idempotent consumer to avoid processing multiple messages with the same content.

## Micronaut 3.8.2 Documentation

- [User Guide](https://docs.micronaut.io/3.8.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.8.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.8.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature jms-activemq-artemis documentation

- [Micronaut ActiveMQ Artemis JMS Messaging documentation](https://micronaut-projects.github.io/micronaut-jms/snapshot/guide/index.html)


## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


## Notes

### References

https://micronaut.io/launch/
https://micronaut-projects.github.io/micronaut-jms/latest/guide/
https://camel.apache.org/camel-core/getting-started/
https://www.javadoc.io/doc/org.apache.camel/camel-support/latest/org/apache/camel/support/builder/ExpressionBuilder.html
https://dzone.com/articles/how-to-empty-memoryidempotentrepository-of-a-camel
https://camel.apache.org/components/3.20.x/eips/idempotentConsumer-eip.html#_idempotent_consumer_implementations
https://camel.apache.org/manual/component-dsl.html
https://camel.apache.org/components/3.19.x/activemq-component.html#_producer_example

