from TestCase import *
from WasRun import *


class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")

    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown" == test.log)
    def testRunning(self):
        self.test.run()
        assert (self.test.wasRun)

    def testSetUp(self):
        self.test.run()
        assert ("setUp testMethod" == self.test.log)

    def testResult(self):
        test = WasRun("testMethod")
        result = test.run()
        assert("1 run, 0 failed" == result.summary())

    def testFailedResult(self):
        test = WasRun("testBrokenMethod")
        result = test.run()
        assert("1 run, 1 failed" == result.summary())
TestCaseTest("testRunning").run()
