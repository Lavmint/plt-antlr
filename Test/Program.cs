using System;
using System.IO;
using Analyzer;

namespace Test
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            var text = File.ReadAllText("test.art");
            MainModel model = new MainModel();
            model.Update(text);
            try
            {
                var pointers = model.ErrorsToString();
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex);
            }

        }
    }
}
