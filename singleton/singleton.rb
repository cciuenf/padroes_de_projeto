require 'singleton'

class Foo
  include Singleton
  
  @x = 0
  def self.instance
    @x += 1
  end
end

10.times { puts Foo.instance }

class Bar
  def foo=(x)
    puts 'voce atribuiu %s a foo' % x
  end
end

b = Bar.new
b.foo = 10
