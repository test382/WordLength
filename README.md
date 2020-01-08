<H1>WordLength</H1>
This repository contains two methods that are implemented in Java and test cases written using the TestNG framework. The first method takes in a string parameter in the form of a sentence and returns the longest word along with its length.
The second takes in a similar string argument and returns the shortest word along with its length.
The unit tests included ensure the methods perform as expected. TestNG was used to write the unit tests which utilize @DataProvider annotations to provide parametrized test inputs to the test methods.
The entire project uses maven for build configuration to make it easy for users to download and build the project.
Per Maven's default configuration all generated files, including compiled classes and test results, will be placed in the target folder.

<H2>Getting Started</H2>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. This guide will primarily focus on setting up the project using Intellij and Eclipse IDEs, but similar steps can be taken to set it up using other IDEs. These two IDEs come packaged with maven plugin out-of-the-box.
<p>1. Checkout or clone this repository</p>
<p>2. Import it into your IDE of choice</p>
<p>5. For Eclipse - right click on the file "pom.xml", click "Run As" and select "Maven Compile" or "Maven Test" depending on whether you want to compile the class or run the test cases </p>
<p>4. For Intellij, right click on the file "pom.xml" and click "Add as a maven Project". </p>
<p>5. For Intellij - execute the command "mvn clean compile" from the console command to compile the class and the command "mvn clean test" to run the test cases."</p>

<H2>Prerequisites</H2>
<p>The two IDEs mentioned above come packaged with a java JDK and a TestNG plugin. For those that want to run the project outside of the IDEs, the prerequisites are listed below.</p>
<ul>
<li>Java JDK 13.0.1 (Recommended version)</li>
<li>TestNG 7.0.0 (Recommended version)</li>
<li>Backward compatibility hasn't been tested but will likely work with recent previous versions. The recommended versions above were used for development</li>
</ul>

<H2>Assumptions Made in Method Implementation</H2>
<p> 1. If two or more words of equal length are the longest or shortest words in the sentence, only the first word is returned</p> 
<p> 2. Empty input arguments will return an empty string</p>
<p> 3. Space will be used as a delimiter to break up the words within the sentence</p>
<ul> As a corollary to this,
<li> All characters within a word will be counted, including apostrophes etc... as part of the word. For example, "I'm" will be treated as a 3 char string.</li>
<li>Commas and Periods will be treated as part of the word next to them. For example, the first word in the string "But, he" will be "But," with length 4. </li>
</ul>
<p> 4. When there are no input arguments to the method, a general exception is thrown with the message indicating that the input argument can not be null. This prevents Null Pointer Exceptions from being thrown </p>

<H2> Tests</H2>
<p> Once the test successfully runs, an html file "index.html" is generated that shows the results and statistics of the test cases. The file will be located at Target -> Surefire-reports</p>

<H2>Authors</H2>
Abe Lemma

<H2>License</H2>
This project is licensed under the BSD License.

