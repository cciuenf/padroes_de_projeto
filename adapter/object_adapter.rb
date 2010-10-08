class Adaptee
  def specific_request
    "I'm a very specific request"
  end
end

class Target
  def request
    "target normal"
  end
end

class Adapter
  def initialize
    @adaptee = Adaptee.new
  end
  def request
    @adaptee.specific_request
  end
end

def run(target)
  puts target.request
end

run Adapter.new
run Target.new

