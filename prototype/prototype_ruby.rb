class Client
  attr_accessor :prototype

  def an_operation
    product = prototype.new
    puts product
  end
end

class Foo; end
class Bar; end

client = Client.new
client.prototype = Bar
10.times { client.an_operation }

client.prototype = Foo
10.times { client.an_operation }
