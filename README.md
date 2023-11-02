# Final Integrative Project - Data Networks I - UDP Mini Chat

## Introduction

In the realm of computer networks, our main quest is to understand the intricacies of data communication systems, which are integral for sharing information and resources over both short and long distances. The ultimate purpose of these networks is to ensure the reliability and availability of information, enhance data transmission speed, and curtail costs.

This Final Integrative Project for Data Networks I aims to delve into the operational dynamics and applications of the User Datagram Protocol (UDP). UDP is crucial in the realm of computer networks for its efficiency in sending and receiving data packets across networked devices.

## Project Goal

Our project revolves around simulating a "Mini Chat" using a client/server model implemented in Java. The emphasis lies on understanding and establishing a communication network via UDP, offering insights into the step-by-step process and reflecting the theoretical knowledge gained in the course into a practical application.

## Implementation Details

### Java UDP Connection

We chose Java for its descriptive syntax and its modular approach, which aligns perfectly with our client/server structure. Here's how we've laid out the implementation:

#### Client

- Implements the `Observer` interface, simulating the role of a chat client.
- Spawns a thread to push new messages to the server, which then gets disseminated to the chat windows.

#### Frm1 and Frm2

- Represents two clients, each with a unique port and host for message reception and transmission.
- Houses the graphical chat window implementations using `JFrames`.

#### Server

- Functions as a multi-threaded server, listening for incoming client messages and routing them accordingly.

### Mini Chat Application

Our Mini Chat is a straightforward real-time communication application that facilitates quick and efficient message exchange akin to contemporary instant messaging services.

#### Core Features

- **Message Sending and Receiving:** Users can type and send messages through a GUI, which the server relays to the recipient.
- **User Interface:** A clean and intuitive GUI where messages can be composed, sent, and received.
- **Client/Server Connection:** Establishing a UDP client/server connection to form a network for message exchange.

### Technical Overview

#### Technologies

- **IDE:** Eclipse
- **Programming Language:** Java
- **Operating System:** Windows
- **Network Protocol:** UDP

#### Java Libraries

- `java.io.*`: For data I/O streaming.
- `java.net.*`: For sockets and network communication.
- `java.util.*`: For observer pattern implementation.
- `javax.swing.*`: For GUI components.
- `java.lang.Thread`: For concurrent thread execution.

### Limitations

It's pivotal to note that UDP, being connectionless, does not guarantee message delivery. Message loss is a possibility with this protocol. For guaranteed delivery, TCP would be a preferred alternative.

## Authors

- Juan Pablo Arano
- Martín Romano
- Sofía Alejandra Prieto

## Conclusion

This project is not only a culmination of our learning journey in Data Networks I but also a practical demonstration of network communication principles. We invite fellow students and enthusiasts to explore the depths of UDP through this interactive and educational chat simulation.
