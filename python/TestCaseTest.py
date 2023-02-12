from TestCase import *
from WasRun import *


class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")

    def testRunning(self):
        test = WasRun("testMethod")
        test.run()
        assert (test.wasRun)

    def testSetUp(self):
        test = WasRun("testMethod")
        test.run()
        assert (test.wasSetUp)


TestCaseTest("testRunning").run()
