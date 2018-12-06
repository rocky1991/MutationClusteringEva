#!/bin/bash
export CLASSPATH=$CLASSPATH:$PWD/lib/mujava.jar:$PWD/lib/openjava.jar/:$PWD/lib/junit-4.12.jar:$PWD/lib/hamcrest-core-1.3.jar:$PWD/lib/tools.jar:$PWD/lib/jgrapht-core-1.3.0.jar

MuCLASS=$PWD/MuJava/classes
MuTEST=$PWD/MuJava/testset
RESULTS=$PWD/MuJava/result
SRC=$PWD/ProgramToTest

rm -rf $MuCLASS
rm -rf $MuTEST
rm -rf $RESULTS
mkdir $MuCLASS
mkdir $MuTEST
mkdir $RESULTS

#$PWD/jdk1.8.0_191/bin/javac -d $MuCLASS $SRC/DepthFirstIterator.java $MuTEST/DFSIteratorTest.java 

$PWD/jdk1.8.0_191/bin/javac -d $MuCLASS $SRC/DFS/DFSGraph.java -d $MuTEST $SRC/DFS/DFSTest.java
$PWD/jdk1.8.0_191/bin/javac -d $MuCLASS $SRC/BFS/BFSGraph.java -d $MuTEST $SRC/BFS/BFSTest.java 
$PWD/jdk1.8.0_191/bin/javac -d $MuCLASS $SRC/MSTK/MSTKGraph.java -d $MuTEST $SRC/MSTK/MSTKTest.java 
$PWD/jdk1.8.0_191/bin/javac -d $MuCLASS $SRC/MSTP/MST.java -d $MuTEST $SRC/MSTP/MSTTest.java 
$PWD/jdk1.8.0_191/bin/javac  InsertionSort.java InSortTest1.java 


$PWD/jdk1.8.0_191/bin/java mujava.gui.GenMutantsMain
$PWD/jdk1.8.0_191/bin/java mujava.gui.RunTestMain >output.txt
