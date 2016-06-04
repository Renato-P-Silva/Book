package modules

import geb.Module


class BookRow extends Module {
	static content = {
		cell { column ->
			$ ('td', column)
		}

		cellText { column ->
			cell (column).text ()
		}

		id {
			cellText (0)
		}

		author {
			cellText (1)
		}

		btitle {
			cellText (2)
		}
	}
}
