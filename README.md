# Proyecto Final Integrador - Redes de Datos I
<p style="text-align:center"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong><u><span style="font-size:14.0pt"><span style="font-family:&quot;Agency FB&quot;,sans-serif"><span style="color:#2e74b5">Introducci&oacute;n: Objetivos e ideas preliminares:</span></span></span></u></strong></span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Una red de computadoras, conocida como red de comunicaciones de datos o red inform&aacute;tica, es un conjunto de dispositivos inform&aacute;ticos y software interconectados mediante dispositivos f&iacute;sicos que transmiten y reciben se&ntilde;ales el&eacute;ctricas, ondas electromagn&eacute;ticas u otros medios para transportar datos. Su objetivo principal es compartir informaci&oacute;n, recursos y ofrecer servicios.</span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Al igual que en cualquier proceso de comunicaci&oacute;n, una red de computadoras requiere de un emisor, un mensaje, un medio y un receptor. La creaci&oacute;n de una red de computadoras tiene como finalidad compartir recursos e informaci&oacute;n a larga distancia, garantizar la confiabilidad y disponibilidad de la informaci&oacute;n, aumentar la velocidad de transmisi&oacute;n de datos y reducir costos. Un ejemplo de esto es Internet, que es una extensa red que interconecta millones de computadoras en todo el mundo, principalmente para compartir informaci&oacute;n y recursos.</span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Las redes inform&aacute;ticas actuales est&aacute;n definidas por varios est&aacute;ndares que determinan su estructura y modo de funcionamiento. El modelo TCP/IP, basado en el modelo de referencia OSI, es el m&aacute;s importante y ampliamente utilizado. El modelo OSI divide la red en siete capas con funciones espec&iacute;ficas pero interrelacionadas, mientras que en TCP/IP se reducen a cuatro capas. Cada capa tiene m&uacute;ltiples protocolos que se rigen por sus respectivos est&aacute;ndares.</span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">E</span></span></span><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">l objetivo de este proyecto final es comprender el funcionamiento y aplicaci&oacute;n del Protocolo UDP. El Protocolo de Datagrama de Usuarios (User Datagram Protocol en ingl&eacute;s), es un protocolo de comunicaci&oacute;n utilizado en redes inform&aacute;ticas, especialmente en Internet. Se clasifica como un protocolo de transporte de la capa de red, lo que significa que se encarga de enviar y recibir datos entre diferentes dispositivos conectados en una red.</span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">La idea es; en primera instancia, brindar informaci&oacute;n al lector para que pueda contextualizar el &aacute;rea de trabajo y conceptos que estaremos utilizando, para poder finalmente, realizar la implementaci&oacute;n de una conexi&oacute;n UDP formato cliente/servidor e implementar dentro del lenguaje de programaci&oacute;n Java la l&oacute;gica de este protocolo utilizando una interfaz gr&aacute;fica para simular un &ldquo;Mini Chat&rdquo; el cual, mediante la utilizaci&oacute;n de sockets, proporcione una herramienta con la capacidad de comunicar dos usuarios mediante mensajes de texto.</span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">El objetivo principal de este trabajo es poder plasmar los conocimientos adquiridos en la asignatura Redes de Datos I para poder comprender y establecer una comunicaci&oacute;n en el contexto de una red inform&aacute;tica de datos, analizando el paso a paso de la misma para as&iacute; asimilar y reflejar en una aplicaci&oacute;n los conceptos aprendidos. </span></span></span></p>

<p><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong><u><span style="font-size:12.0pt"><span style="font-family:&quot;Agency FB&quot;,sans-serif"><span style="color:#c45911">Implementaci&oacute;n de una conexi&oacute;n UDP en Java:</span></span></span></u></strong></span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Dentro del marco de nuestra implementaci&oacute;n, hemos seleccionado el lenguaje de programaci&oacute;n Java por mostrar una sintaxis descriptiva y clara y por su diferenciaci&oacute;n de los m&oacute;dulos en clases, lo cual favorece nuestra estructura cliente/servidor. Nuestro servidor estar&aacute; a la escucha constante de las conexiones de los clientes mediante la apertura de un socket y los clientes enviar&aacute;n mensajes al servidor, que luego ser&aacute;n distribuidos a los otros clientes.</span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A continuaci&oacute;n, estaremos explicando la implementaci&oacute;n de nuestro proyecto para poder visualizar su funcionamiento entre dos clientes que interactuaran en sus respectivas ventanas de chat, por medio de una conexi&oacute;n UDP gestionada por nuestro servidor.</span></span></span><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"> </span></span></span></p>

<p style="text-align:center"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong><u><span style="font-size:14.0pt"><span style="font-family:&quot;Agency FB&quot;,sans-serif"><span style="color:#2e74b5">Mini Chat:</span></span></span></u></strong></span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Nuestro Mini Chat es una aplicaci&oacute;n simple de comunicaci&oacute;n en tiempo real dise&ntilde;ada para permitir el intercambio de mensajes entre dos usuarios. El principal objetivo de esta aplicaci&oacute;n es facilitar una comunicaci&oacute;n r&aacute;pida y eficiente entre los usuarios, de forma similar a c&oacute;mo funcionan las aplicaciones de mensajer&iacute;a instant&aacute;nea en tiempo real.</span></span></span></p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Para implementar un mini chat utilizando una conexi&oacute;n UDP cliente/servidor, contaremos con los siguientes componentes:</span></span></span></p>

<p>&nbsp;</p>

<ul style="list-style-type:square">
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong>Cliente:</strong> Esta es la clase a trav&eacute;s de la cual los usuarios del chat interact&uacute;an con la aplicaci&oacute;n dentro implementando Observers y simulando el rol de un cliente de la misma. Cuando hay un cambio (nuevo mensaje) esta clase lanza un hilo que sube el mensaje al Servidor para ser anexado a las ventanas de chat.</span></span></span></li>
</ul>

<p style="margin-left:48px; text-align:justify">&nbsp;</p>

<ul style="list-style-type:square">
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong>Frm1 y Frm2</strong>: Funcionan implementando dos clientes, cada uno consta de un puerto distinto (5000 para `Frm1` y 6000 para `Frm2`), un host &uacute;nico donde recibe mensajes y un puerto de env&iacute;o donde env&iacute;a mensajes al otro cliente. Dentro de estas clases se encuentra la implementaci&oacute;n gr&aacute;fica de las ventanas de chat de cada cliente utilizando Jframes. Con el m&eacute;todo update capturan los mensajes enviados por el cliente y lanzan un servidor con su respectivo puerto y un observer agregado, luego, un m&eacute;todo imprime dentro de la ventana el mensaje que se le envi&oacute; al observer y al mismo tiempo lo agrega como append para que el propio cliente vea su mensaje.</span></span></span></li>
</ul>

<p style="margin-left:48px">&nbsp;</p>

<ul style="list-style-type:square">
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong>Servidor:</strong> Es el componente que maneja las conexiones entrantes de los clientes y coordina la transferencia de mensajes entre ellos. En nuestro caso, la clase `Servidor` es el servidor, que se implementa como un hilo y escucha continuamente los mensajes entrantes a trav&eacute;s de la apertura de un `ServerSocket`.</span></span></span></li>
</ul>

<p style="margin-left:48px">&nbsp;</p>

<ul style="list-style-type:square">
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong>Protocolo UDP:</strong> Este es el protocolo de comunicaci&oacute;n utilizado para el intercambio de mensajes entre el cliente y el servidor.&nbsp;</span></span></span></li>
</ul>

<p style="margin-left:48px">&nbsp;</p>

<ul style="list-style-type:square">
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong>Bibliotecas de Java:</strong> Son necesarias para facilitar la creaci&oacute;n de sockets, la gesti&oacute;n de hilos y la creaci&oacute;n de interfaces de usuario. Estas bibliotecas incluyen `java.net` para la creaci&oacute;n de sockets, `java.io` para la entrada y salida de datos, `java.util` para la gesti&oacute;n de observadores y `javax.swing` para la interfaz gr&aacute;fica de usuario.</span></span></span></li>
</ul>

<p>&nbsp;</p>

<p style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Descripci&oacute;n de las funcionalidades implementadas:</span></span></span></p>

<ul>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Enviar y recibir mensajes: Los usuarios deben ser capaces de escribir mensajes en una interfaz gr&aacute;fica de usuario y enviarlos al hacer clic en un bot&oacute;n. Estos mensajes deben ser recibidos por el servidor, que luego los env&iacute;a al cliente destinatario.</span></span></span></li>
</ul>

<p>&nbsp;</p>

<ul>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Interfaz gr&aacute;fica de usuario: GUI clara y f&aacute;cil de usar, con un grid para escribir, modificar y enviar los mensajes y una vista en donde se visualizan los mensajes del chat ya enviados.</span></span></span></li>
</ul>

<p style="margin-left:48px">&nbsp;</p>

<ul>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Conexi&oacute;n Cliente/Servidor: Mediante la implementaci&oacute;n de nuestras clases modelamos los actores que constituyen una conexi&oacute;n UDP de Cliente/Servidor y las conexiones necesarias para generar una red.</span></span></span></li>
</ul>

<p style="text-align:justify">&nbsp;</p>

<ul>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Es importante aclarar nuevamente que, esta implementaci&oacute;n de chat usa UDP, el cual al ser un protocolo sin conexi&oacute;n no garantiza la entrega de los mensajes. Por lo tanto, es posible que algunos mensajes se pierdan en la red. Si se requiere garantizar la entrega de todos los mensajes, se podr&iacute;a considerar el uso de un protocolo orientado a la conexi&oacute;n como TCP en su lugar.</span></span></span></li>
</ul>

<p><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><strong><u><span style="font-size:12.0pt"><span style="font-family:&quot;Agency FB&quot;,sans-serif"><span style="color:#c45911">Informaci&oacute;n T&eacute;cnica:</span></span></span></u></strong></span></span></span></p>

<p style="margin-left:40px"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><u><span style="font-size:12.0pt"><span style="font-family:&quot;Agency FB&quot;,sans-serif">Tecnolog&iacute;as:</span></span></u></span></span></span></p>

<ul style="margin-left:40px">
	<li><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">IDE: Eclipse</span></span></span></li>
	<li><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Lenguaje de Programaci&oacute;n: Java</span></span></span></li>
	<li><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Sistema Operativo: Windows</span></span></span></li>
	<li><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">Protocolo de Red: UDP</span></span></span></li>
</ul>

<p style="margin-left:40px"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><u><span style="font-size:12.0pt"><span style="font-family:&quot;Agency FB&quot;,sans-serif">Bibliotecas:</span></span></u></span></span></span></p>

<p style="margin-left:40px; text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black">A continuaci&oacute;n, proporcionamos una lista de las bibliotecas y clases utilizadas en el c&oacute;digo de nuestra implementaci&oacute;n, junto con una breve descripci&oacute;n de cada una de ellas:</span></span></span></p>

<ul style="list-style-type:square; margin-left:40px">
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><span style="font-family:Consolas">`java.io.DataInputStream` </span>y <span style="font-family:Consolas">`java.io.DataOutputStream`</span>: Estas clases se utilizan para la lectura y escritura de tipos de datos primitivos de Java en un formato port&aacute;til. En este caso, se utilizan para enviar y recibir mensajes entre el cliente y el servidor.</span></span></span></li>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><span style="font-family:Consolas">`java.io.IOException`</span>: Esta es una clase de excepci&oacute;n que se lanza cuando ocurre una operaci&oacute;n de entrada/salida fallida.</span></span></span></li>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><span style="font-family:Consolas">`java.net.ServerSocket`</span> y <span style="font-family:Consolas">`java.net.Socket`</span>: Estas clases se utilizan para la comunicaci&oacute;n entre el cliente y el servidor. ServerSocket es la clase de servidor que espera las conexiones de los clientes. Socket es la clase cliente que se utiliza para conectar con el servidor.</span></span></span></li>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><span style="font-family:Consolas">`java.util.Observable`</span> y <span style="font-family:Consolas">`java.util.Observer`</span>: Estas clases se utilizan para implementar el patr&oacute;n de dise&ntilde;o observador. En este caso, se utiliza para notificar a los clientes cuando se recibe un nuevo mensaje.</span></span></span></li>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><span style="font-family:Consolas">`java.util.logging.Logger`</span> y <span style="font-family:Consolas">`java.util.logging.Level`</span>: Estas clases se utilizan para registrar los errores y eventos del sistema. En este caso, se utilizan para registrar los errores que ocurren durante la comunicaci&oacute;n entre el cliente y el servidor.</span></span></span></li>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><span style="font-family:Consolas">`javax.swing.*`</span>: Estas clases se utilizan para crear la interfaz gr&aacute;fica de usuario del cliente. Incluyen componentes como marcos (JFrame), botones (JButton), &aacute;reas de texto (JTextArea), etc.</span></span></span></li>
	<li style="text-align:justify"><span style="font-size:11pt"><span style="font-family:Calibri,sans-serif"><span style="color:black"><span style="font-family:Consolas">`java.lang.Thread`</span>: Esta clase se utiliza para la creaci&oacute;n de hilos. En este caso, se crea un nuevo hilo para cada cliente y servidor, permitiendo que se ejecuten en paralelo.</span></span></span></li>
</ul>



# Realizado por: 
<p align="justify">
Arano Juan Pablo, Romano Martín y Prieto Sofía Alejandra
<p/>
