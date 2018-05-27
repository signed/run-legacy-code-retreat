1. http://www.jbrains.ca/legacy-code-retreat/ 
1. http://legacycoderetreat.typepad.com/blog/2011/11/how-i-run-legacy-code-retreat.html
1. http://blog.adrianbolboaca.ro/2014/04/legacy-coderetreat/
   * last read/watched http://blog.adrianbolboaca.ro/2015/03/episode-4-add-feature-on-legacy-code/
1. http://geekswithblogs.net/MarkPearl/archive/2012/08/27/legacy-code-retreat-questions.aspx
   Some thoughts on how to run a legacy code retreat

# What is important when working with legacy code
1. Every change needs a Why and a stopping point
1. Focus on on thing at the time
1. Reading Code
   1. Active code reading (rename )
1. Executing Code
1. Get test coverage
1. Refactoring
   1. Mikado method https://mikadomethod.wordpress.com/   
1. Take small steps
1. Run your tests
1. Commit often 
1. Make sure that your test are failing in the way you expect them to
1. Use automated refactorings where possible
   1. Know their limitations/quirks/bugs
1. Get your dependencies under control
   1. Dependency inversion
   1. Dependency injection
   1. Extract and override
   1. Power Mocking tools

Structure changes vs. Functional changes


* characterization tests to understand the system and documenting it with automated tests.
* system tests


git reset HEAD --hard


static dependencies are the problem, meaning we can not exchange them in our tests

adding black box system tests to create a safety net -> characterization tests -> component tests -> unit tests


make the code testable
-> pure functions