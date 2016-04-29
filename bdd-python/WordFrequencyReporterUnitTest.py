from WordFrequencyReporter import WordFrequencyReporter 
import unittest

class WordFrequencyReportergsUnitTest(unittest.TestCase):

	def test_rank_countries_in_order(self):
		'''calculate should rank the countries in order'''
		reporter = WordFrequencyReporter()
		self.assertEqual(reporter.calculate(), "result")

		if __name__ == '__main__':
			unittest.main()
