# java_designPattern_study
자바 디자인 패턴 공부


출처 : <a href="http://seungdols.tistory.com/486">http://seungdols.tistory.com/486</a>

<h4>디자인 패턴 - 생성 패턴</h>

<h1>- 인스턴스를 만드는 절차를 추상화하는 패턴이다.</h1>
<p> 객체를 생성, 합성하는 방법이나 객체의 표현 방법과 시스템을 분리시켜준다.</p>
<br/>
<p>클래스 생성 패턴이 인스턴스로 만든 클래스를 다양하게 만들기 위한 용도로 상속을 사용하는 방면,</p>
<p>객체 생성 패턴은 인스턴스화 작업을 다른 객체에게 떠넘길수도 있다.</p>


<h1>* 생성 패턴을 따라 다니는 두가지</h1>
<ul>
  <li>생성 패턴은 시스템이 어떤 구체 클래스를 사용하는지에 대한 정보를 캡슐화합니다.</li>
  <br/>
  <li>생성 패턴은 이들 클래스의 인스턴스들이 어떻게 만들고 어떻게 서로 맞붙는지에 대한 부분을 완전히 가려줍니다.</li>
</ul>


<p>결론적으로 생성 패턴을 이용하면, 무엇이 생성되고 누가 생성하는지, 언제 생성하는지, 어떻게 생성 되는지에 대해 결정하는데 유연성을 제공해준다.</p>

<ul>
  <li>
    <a href="https://github.com/korbuno/java_designPattern_study/tree/master/src/creationalPattern/builderPattern">
      빌더 패턴(Builder Pattern)
    </a>
  </li>
  <li>추상 팩토리 패턴(Abstract Factory Pattern)</li>
</ul>


<h1> 빌더 패턴 간단 설명 </h1>
<pre><code>
new Person(27, null, null, null);

</code></pre>
<ul>
  <li>즉 프로퍼티를 설정할 때 필요없는 값들을 설정해줄 시 null처리 등을 하게 되며 불필요한 코드가 늘어나게 된다.</li>
  <li>따라서 PersonBuilder 클래스를 작성하여 객체 생성을 돕게 해준다.</li>
</ul>

<pre><code>
Person person = new PersonBuilder()
			.setAge(27)
			.setGender("남자")
        		.build();
			
</code></pre>

<p>코드가 더 명확해지며 불필요한 프로퍼티 설정을 알아서 처리해준다.</p>
