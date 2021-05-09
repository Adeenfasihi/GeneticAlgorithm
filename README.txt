Compilation and running of the code is fairly simple.

Just run the Runner.java which contains the main function and it will work.


DESIGN PATTERN: Abstract Factory

I've used the Abstract factory pattern to create Individuals.
These individuals populate the population.

Individual class is abstract which calls the parent class which creates the parents.
Parents can be of two types in this example, Irish or Pakistani. 

This method is useful as it gives us the flexibility to create whichever parent we want 
by just passing the Selection via the Individual class and encapsulates rest of the code
in order to give us enough abstraction to use as well as manage the code.  


DESIGN PATTERN: Strategy Pattern

The selection between Irish and Pakistani has been implemented using
the strategy pattern where we can set it at runtime. Other than that, 
the strategy pattern can also be found in mutator and reproduction interfaces.

This way of doing it makes it easy for us to add more selections by just adding a class
and makes it easy to manage scalability (e.g adding a SelectionFrench class) and is easily
changeable at runtime.

DESIGN PATTERN: Singleton

GAControl has been made as a singleton as program controllers should not be 
more than one. In this example it might not be necessary as we're creating 
a random population; however as soon as we move on to actual practical-life
there should only be one controller to set strategies and control population
else multiple controller instances can cause the algorithm to fail and not
converge.


NOTE:

Only 1 person in total worked on this project: Adeen Fasihi.

Did not have time to implement every functionality from scratch so used 
randoms.

Did not find a use for generics (also time constraint) so omitted that.



I HAVE USE ROBERT CLEARY'S SCREENCAST VIDEOS (StrategyPattern_GA1 and StrategyPattern_GA2) AS THE BASIS 
FOR THIS PROJECT AND HAVE PROGRESSED AFTERWARDS ON MY OWN.

THIS PROJECT IS SOLELY FOR LEARNING PURPOSES.