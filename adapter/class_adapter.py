class Target(object):

    def request(self):
        return "Target comum"


class Adaptee(object):

    def specific_request(self):
        return "I'm a very specific request"


class Adapter(Target, Adaptee):

    def request(self):
        return self.specific_request()


class Client(object):
    def __init__(self, target=None):
        self.target = target or Target()
    def foo(self):
        print self.target.request()

client = Client(Adapter())
client.foo()

