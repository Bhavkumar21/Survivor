# Survivor
## How To Play
The popular TV show Survivor, like many other competition or "reality" shows, often puts its contestants through challenges consisting of a series of tasks that must be completed to earn a prize or reward. The challenges can take many different forms and require a wide range of skills. This project implements several classes to represent different types of tasks for a simulation of these types of challenges.

## Gameplay
'''
Current task: A set of three hurdles.
Previous actions: []
Possible actions: [jump, run, swim, crawl, climb]
Your action? jump
  Action successful!

Current task: A set of three hurdles.
Previous actions: [jump]
Possible actions: [jump, run, swim, crawl, climb]
Your action? jump
  Action successful!

Current task: A set of three hurdles.
Previous actions: [jump, jump]
Possible actions: [jump, run, swim, crawl, climb]
Your action? swim
  Action not successful.

Current task: A set of three hurdles.
Previous actions: [jump, jump]
Possible actions: [jump, run, swim, crawl, climb]
Your action? jump
  Action successful!
  Task completed!

Current task: A small lake.
Previous actions: []
Possible actions: [jump, run, swim, crawl, climb]
Your action? fly
  **Invalid action: fly**

Current task: A small lake.
Previous actions: []
Possible actions: [jump, run, swim, crawl, climb]
Your action? run
  Action not successful.

Current task: A small lake.
Previous actions: []
Possible actions: [jump, run, swim, crawl, climb]
Your action? swim
  Action successful!
  Task completed!

Current task: A low crawl net, then a wall with a rope, then a dash to the end.
Previous actions: []
Possible actions: [jump, run, swim, crawl, climb]
Your action? crawl
  Action successful!

Current task: A low crawl net, then a wall with a rope, then a dash to the end.
Previous actions: [crawl]
Possible actions: [jump, run, swim, crawl, climb]
Your action? crawl
  Action not successful.

Current task: A low crawl net, then a wall with a rope, then a dash to the end.
Previous actions: [crawl]
Possible actions: [jump, run, swim, crawl, climb]
Your action? climb
  Action successful!

Current task: A low crawl net, then a wall with a rope, then a dash to the end.
Previous actions: [climb, crawl]
Possible actions: [jump, run, swim, crawl, climb]
Your action? run 
  Action successful!
  Task completed!

Current task: What is 2 + 2?
Previous actions: []
Possible actions: [hint, solve <solution>]
Your action? hint
  Action successful!

Current task: What is 2 + 2?
  HINT: It's 4.
Previous actions: [hint]
Possible actions: [hint, solve <solution>]
Your action? solve 22
  Action not successful.

Current task: What is 2 + 2?
  HINT: It's 4.
Previous actions: [hint]
Possible actions: [hint, solve <solution>]
Your action? solve 4
  Action successful!
  Task completed!

Challenge complete. Congratulations!!!
'''
## Final Remarks
This project was part of my CS 126 course I took during Winter 2023. I hope you enjoy playing the game!
