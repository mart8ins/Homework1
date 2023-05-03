# Practice

## Exercise #1

See [CounterExercise.java](./CounterExercise.java)

Write a thread class that will call the increment() method in Counter class a specified number of times.

Create 100 threads, start them all, and wait for all the threads to terminate.

Print the final value of the counter, and see whether it is correct.

There are at least two different ways on how to solve this, provide both solutions.

## Exercise #2

See [CourseWithFailingStudentsAccess.java](./CourseWithFailingStudentsAccess.java)

1. There is list full with student names, 100000 in total - create and populate it.
2. ~10% of the given students are not doing their assignments and will be thrown out of the course. While working from 10 threads iterate over the list and remove each 10th student from the list.
3. Print out how many students are left in the course.

## Exercise #3

See [DiningPhilosophersProblem.java](./DiningPhilosophersProblem.java)

Solve [Dining philosophers problem](https://en.wikipedia.org/wiki/Dining_philosophers_problem)

## Exercise #4

See [BankTransactions.java](./BankTransactions.java)

There are three people - Alice ($100000), Bill ($0) & Bob ($0).

Bank actions before transferring money from X to Z account:

  - does the account X has amount specified?
  - send specified amount to Z.
  - subtract specified amount from X.

Lets assume that account of Alice was hacked, and bad guys are accessing that account from multiple places in the world at the same time and trying to steal the money.
  1. Create 100 threads which will represent bad guys
  2. Transfer money from the account of Alice to Bill and Bob account. Each of them must receive $50000, each transfer can move randomly chosen values $10 / $50 / $100.
  3. Check that total sum in the bank is still $100000.

## Exercise #5

See [MemoryConsistencyExercise.java](./MemoryConsistencyExercise.java)

## Exercise #6

### Dr. Frankensteel and Dr. Frankensteal

In the creepy land of the eastern-European region known as Transilvania, lies a creepy valley where two mad scientists have been challenging each other for years. Hidden in their spooky mansions, Dr. Frankensteel and Dr. Frankensteal have a new hobby. Tired of handling corpse parts, they both have started creating robots assembling used robot parts they have laying around.

Competitive as they are, and animated by an ancient hate for each other, they've started fighting on who has the largest army of robots. In need of robot parts, every night they send their minion in the dump of the robot factory Droidsky Lte.
 
To assemble a single robot, they need: "Head", "Body", "Left arm", "Right arm", "Left leg", "Right leg", "CPU", "RAM", "Hard drive"

The first night, in the factory there are 20 random robot parts chosen from the above. Every night the factory dumps 1 to 4 random body parts that add to those already in the dump. At the same time, the minions of both the scientists go to the dump and each collect 1 to 4 random body parts from those in the dump. They then go back to their mansion and handle the collected parts to their masters.

Dr. Frankensteel and Dr. Frankensteal, then, try to assemble as many robots as they can with the body parts they have.

To run the simulation, each night occurs after 100 milliseconds. The factory and the two minions operate at the very same time (you got it, this is a problem in concurrently programming and shared resources!). See after 100 nights (10 seconds) which doctor has assembled more robots!