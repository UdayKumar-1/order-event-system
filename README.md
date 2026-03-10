# Apache Kafka Setup and Running Guide (Windows)

This guide explains how to:

- Download **Apache Kafka**
- Start **Zookeeper**
- Start the **Kafka Broker**
- Consume messages from a **Kafka Topic**

---

# 1. Download Apache Kafka

1. Go to the official Kafka website:  
   https://kafka.apache.org/downloads

2. Download the **Binary Version** of Kafka.

3. Extract the downloaded `.tgz` or `.zip` file.

4. Open **Command Prompt / Terminal**.

5. Navigate to the **Kafka root directory**.

```bash
cd kafka
```

---

# 2. Start Zookeeper

Kafka uses **Zookeeper** to manage:

- Brokers
- Topics
- Cluster Metadata

Run the following command from the **Kafka root directory**:

```bash
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

This command starts the **Zookeeper Server** using the default configuration.

⚠️ **Important:**  
Keep this terminal running.

---

# 3. Start the Kafka Broker

Open **another terminal** and navigate to the Kafka root directory.

Run the following command:

```bash
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

This will start the **Kafka Broker** on the default port:

```
localhost:9092
```

---

# 4. Read Messages from a Kafka Topic

To verify messages in a topic, use the **Kafka Console Consumer**.

Run the following command:

```bash
bin\windows\kafka-console-consumer.bat --topic order-topic --bootstrap-server localhost:9092 --from-beginning
```

### Explanation

| Option | Description |
|------|-------------|
| `--topic order-topic` | Topic name to consume messages from |
| `--bootstrap-server localhost:9092` | Kafka broker address |
| `--from-beginning` | Reads messages from the beginning of the topic |

If messages exist in the topic, they will appear in the console.

---

# Summary

1. Start **Zookeeper**

```bash
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

2. Start **Kafka Broker**

```bash
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

3. Consume messages

```bash
bin\windows\kafka-console-consumer.bat --topic order-topic --bootstrap-server localhost:9092 --from-beginning
```

---

✅ Now Kafka is ready to **produce and consume messages**.
