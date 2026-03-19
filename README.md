# REST-API-CLIENT

*COMAPNY*: CODTECH IT SOLUTIONS

*NAME*: DEEPAN.M

*INTERN ID*: CTIS4395

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 8 WEEKS

*MENTOR*: NEELA SANTHOSH

##TASK 2:REST API CLIENT IN JAVA
This Java program demonstrates how to connect to a web API, send a request, and process the response using the VS Code editor. It is a simple example of building an API client using core Java libraries. The program is organized inside a package named ApiClient, which helps in structuring the code properly and maintaining modularity.

The code begins by importing necessary classes such as BufferedReader, InputStreamReader, HttpURLConnection, and URL. These classes are essential for handling input/output operations and establishing a connection to a web resource. The main method acts as the entry point of the program, where all execution starts.

Inside the try block, a URL object is created with the API endpoint:
https://api.agify.io/?name=deepan. This API predicts the age of a person based on their name. The program then opens a connection to this URL using HttpURLConnection. This object allows the program to send HTTP requests and receive responses from the server. The request method is set to "GET", which means the program is requesting data from the API without sending any additional data.

Next, the program checks the response status code using getResponseCode(). If the status code is 200, it means the request was successful. In that case, the program proceeds to read the response from the API. A BufferedReader is used along with an InputStreamReader to efficiently read the incoming data stream line by line. The response is stored in a string variable named result. A loop continuously reads each line from the input stream and appends it to the result string until no more data is available.

After reading the response, the BufferedReader is closed to release system resources. The program then prints the message "Response from API:" followed by the actual JSON response received from the API. This output typically contains fields like name, age, and count, which represent the predicted age and data statistics.

If the response code is not 200, the program prints "Error in API call", indicating that something went wrong with the request. Additionally, a catch block is used to handle any exceptions that may occur during execution, such as network issues or incorrect URL format. In such cases, it prints "Exception occurred" to notify the user.

This program was developed and executed using Visual Studio Code (VS Code), which is a lightweight and powerful code editor. VS Code provides features like syntax highlighting, error detection, debugging tools, and integrated terminal support, making it easier to write, compile, and run Java programs. The integrated terminal in VS Code is especially useful for compiling (javac) and running (java) the program without leaving the editor.

The main task performed by this program is API communication and data retrieval. It shows how Java applications can interact with external services over the internet. This type of program is widely applicable in real-world scenarios such as weather applications, payment gateways, social media integrations, and data analytics systems. For example, developers can use similar logic to fetch live stock prices, user information, or machine learning predictions from online services.

In conclusion, this code is a basic yet important example of using Java for web-based communication. It teaches fundamental concepts like HTTP requests, stream handling, exception management, and practical use of development tools like VS Code.

