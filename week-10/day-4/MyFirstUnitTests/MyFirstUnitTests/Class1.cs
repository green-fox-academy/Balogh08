using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xunit;

namespace MyFirstUnitTests
{
    public class Class1
    {
        [Fact]
        public void PassingTest()
        {
            Assert.Equal(4, Add(2, 2));
        }

        [Fact]
        public void FailingTest()
        {
            Assert.Equal(4, Add(2, 2));
        }

        [Theory]
        [InlineData(18)]
        [InlineData(22)]
        public void EvenTest(int number)
        {
            Assert.True(number % 2 == 0);
        }

        int Add(int x, int y)
        {
            return x + y;
        }
    }
}
