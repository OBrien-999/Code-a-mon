# Code-a-mon!

This project will include 3 different decorator patterns based off the Gang of Four.
The recommended decorator patterns will be used to complete this project. 

# Pattern 1 - Decorator 

This pattern is focused around the evolution and stats of a code-a-mon, and allows
for a change in value during an evolution.

Requirements met:

    • The simulation should run on cycles. A cycle is considered to be of 2 parts - 1 daytime and 1 night time.
    • Each cycle should have it’s own weather event.
    • During the night, evolutions of code-a-mons can occur.
    • Code-a-mons should have at minimum: Attack, Defense, Health.

# Pattern 2 - Factory

This pattern is focused around the creation of trainers and codeamons, and allows
use of a factory class to easily create and store trainer/codeamon values. 

Requirements met:

    • A new world must start with a number of trainers, at least 2, each of them starts with at least one code-a-mon
    • The trainer can acquire more code-a-mons (max of 6) throughout their adventure. How they acquire them is up to you.
    • Code-a-mons should have at minimum: Attack, Defense, Health, Attack Type.

# Pattern 3 - Mediator

This pattern is focused around the the battle and shop operations. I used a mediator class with multi threading to simulate
a tick-based world. Only one operation runs at a time.

Requirements met:

    • A new world must start with a number of trainers, at least 2, each of them starts with at least one code-a-mon
    • Code-a-mons will compete 1v1 with another trainers code-a-mons
    • Weather events should benefit certain types of code-a-mon’s stats while being a dis-advantage to others
    • Only one battle can take place at a time. A battle is always between two trainers and each using one code-a-mon
    • Attacks should be performed in a turn-based manner, one code-a-mon attackes while the other defends, then vice-versa until one faints. When a code-a-mon’s health reaches 	     0 or less, they faint, and this particular fight is over. Experience points can be handled in two ways: when a code-a-mon defeats another or when the battle is over, it 	    can be given either to the entire team orto just the code-a-mon that won.


