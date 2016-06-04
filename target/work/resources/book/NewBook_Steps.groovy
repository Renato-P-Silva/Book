package book

import cucumber.api.PendingException


Given(~/^I open the book tracker$/) { ->
    to ListPage
    at ListPage
    throw new PendingException()
}
When(~/^I add "([^"]*)"$/) { String arg1 ->
    page.toNewPage ()
    at NewPage
	page.add (bookTitle)
    throw new PendingException()
}
Then(~/^I see "([^"]*)"s details$/) { String arg1 ->
    at ShowPage

    page.check (bookTitle)
    throw new PendingException()
}