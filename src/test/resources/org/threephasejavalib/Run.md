# Running

In the approach used by the library, 
this will cycle through the three-phases (A, B and C) 
until user has paused (or reset) the simulation or 
the defined number of runs had elapsed.

## Acceptance Criteria

1. State changes from "idle" or "paused" or "finished" to
"running".
1. At least one entity is set.
1. B Events and C Activities have been set accordingly.
1. A signal that simulation started is raised.
1. Each time a run starts a signal is raised. 
1. Collections of (B and C) events and resources/entities 
and other variables are initialised/reset.
1. Simulation goes for each phase (A, B and C) until the
simulation time is finished.
1. At each completion of three-phases a signal is raised. 
1. When simulation finishes a signal is raised 
 and state is changed to "finished".
1. When simulation warm-up time starts and when it finishes a
signal is raised.
1. An exception is raised if 
__B Events__ are not updating simulation time .

### Example - State changes from idle to running

When an "[idle](- "?=state")" simulation is [ ](- "run()")run,
its state changes to "[running](- "?=state")".

### Example - State changes from paused to running

When an "[paused](- "?=state")" simulation is [ ](- "run()")run,
its state changes to "[running](- "?=state")".

### Example - State changes from finished to running

When an "[finished](- "?=state")" simulation is [ ](- "run()")run,
its state changes to "[running](- "?=state")".
