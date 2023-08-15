class Inner_class1 {
	private class inner_demo {
		public void print() {
			System.out.println("this is my inner class");
		}
	}

	void Display_inner() {
		inner_demo in_class = new inner_demo();
		in_class.print();
	}

		public static void main(String[] args) {
			Inner_class1 outclass = new Inner_class1();
			outclass.Display_inner();
		}
	}