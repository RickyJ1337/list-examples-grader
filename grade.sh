# Create your grading script here

CPATH=".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar"
set -e

rm -rf student-submission
git clone $1 student-submission
if () {
    echo "ListExamples.java was not submitted.";
    exit;
}
cd 
javac -cp $CPATH *.java
java -cp $CPATH org.junit.runner.JUnitCore 
