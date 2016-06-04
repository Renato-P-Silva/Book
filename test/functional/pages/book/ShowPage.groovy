package pages.book

import geb.Page
import data.Data
import books.Book


class ShowPage extends Page {
	static at = {
		title ==~ /Show Book/
	}

	static content = {
		row { val ->
			$ ('td.name', text: val).parent ()              // grails 1.3
			$ ('span.property-label', text: val).parent ()  // grails 2.0
		}

		value { val ->
			row (val).find ('td.value').text ()             // grails 1.3
			row (val).find ('span.property-value').text ()  // grails 2.0
		}

		id {                                                // grails 1.3 only
			value ('Id')
		}

		btitle {
			value ('Title')
		}

		author {
			value ('Author')
		}
	}

		def check (String bookTitle) {
	    Book book = Book.findByTitle (bookTitle)
	
	    assert book.id == id.toLong ()
	    assert book.author == author
	    assert book.title == btitle
	}
}