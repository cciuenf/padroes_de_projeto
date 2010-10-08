class Client
  attr_accessor :prototype

  def an_operation
    product = prototype.clone
    puts product
  end
end

class FooPrototype
  def initialize(x)
    @x = x
  end
  def clone
    self.class.new(@x)
  end
  def to_s
    "%s %d %s" % [self.class, @x, self.object_id]
  end
end
class BarPrototype
  def clone
    self.class.new
  end
end

client = Client.new
client.prototype = FooPrototype.new(1)
client.an_operation

client.prototype = FooPrototype.new(200)
10.times { client.an_operation }

client.prototype = BarPrototype.new
client.an_operation
