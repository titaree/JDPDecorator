package decorator.pattern.demo;

public abstract class Component {

		public abstract void doJob();
		}
		class ConcreteComponent extends Component
		{
		@Override
		public void doJob()
		{
		System.out.println(" I am from Concrete Component-I am closed for modification.");
		}

}
