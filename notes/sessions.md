- Make the sessions independent form each other
- Find and overarching goal (fix a bug, add a feature) and compare different techniques how they help to achieve this goal.
- Provide a Why/Motivation/Business Goal for each iteration   


= Idea One
1. Goldenmaster
   - focus on the outputs
   - only try to understand as much of the code to be able to run deterministic tests
   - learning: this kind of tests can be setup without deep system / domain knowledge
2. Fix a bug
   - corrent -> correct
   - Reproduce with system level test
   - Isolate the area you want to change and write unit tests
   - Write failing test that forces you to make the fix 
   - Adjust failing tests Golden Master ?
   - learning: Goldenmaster tests are a pain to maintain, you need your Domain Experts help to approve changes in the golden master output
   
3. New Feature: Write game progress to file
   inversion of Control (http://blog.adrianbolboaca.ro/2014/12/dependency-inversion/)
   Introduce Display/Console
   
4. Add a feature
   - Which one

=  Idea Two
1. Start with bug fix
   - Goal: Understand the code
   - Goal: Write first tests to cover the code
   
2. Goldenmaster
      
   
# Bretten
1. Get to know the code
2. Goldenmaster
3. Subclass to test (not that good for trivia)
4. depends on 3, pass overridden methods as dependencies
5. Pure functions
6. ?
## Feedback


# Milan
1. Golden Master
2. Make it easy to add a new category of questions
3. add unit test for the roll function
4. find all the code smells and fix 3
5. remove all duplication
6. make the introduction of different penalty rules a one-line change (an Open/Closed Principle kata)


## Feedback
The final retrospective brought out several goods:
* good format: each iteration is almost independent.
* Clearly defined goals.
* Variety of languages and people.
* Location and food (Talent Garden in Milan and breakfast offered by XPeppers).

And several bads too, to resolve for the next editions:
* no theoretical introduction on how to work with the legacy code.
* Difficulties in using Extract Class, with respect to Extract Method and Extract Field which are local changes.
* Difficulties in introducing unit-level tests.
