# ATM-Simulator
Simulation of waiting times for a theoretical ATM.  Program for Intro. to Algorithmic Design II (Coastal Carolina University CSCI 150)

CSCI 150
PROGRAM 5
DUE: NOVEMBER 11, 2015

During lunch hour, the ATM machine in a large office complex is in heavy demand. Customers complain that the waiting time is much too long. The local bank is considering the addition of a second machine. But first, the bank needs a few statistics to justify the cost.  The statistics will be gathered from a simulation program, Prog5, that you will write.

Simulate a waiting line at the ATM machine for a period of one hour. Make the following assumptions:
With equal probability, a customer spends:
	one minute,
	two minutes, or
	three minutes
	at the ATM machine.

During any minute:
	*no customers arrive  (50% chance),
	*one customer arrives (40% chance),
	*two customers arrive (10% chance).

At the end of an hour, display the following summary statistics:

the number of customers served, that is, the number who accessed the ATM machine.
the average time that a customer waits in line before being served, and
the number of customers that remain in the waiting line at the end of the simulation.

Assume that the ATM is available when the simulation begins and that no customers are waiting.

Requirements:
*Design a class named Customer that models an ATM customer.
*A Customer object will contain his/her arrival time and how much time he/she spends making an ATM transaction.
