<h1> Integer to Roman in Java</h1>
<p></p>
<h1>
  <font style="background-color:#ffffff">Overview</font>
</h1>
<div>
  <font style="background-color:#ffffff">
    A number in <strong>Roman Numerals</strong> is a string of the symbols written
    in descending order (e.g. M is the largest number, followed by D, etc.).
  </font>
</div>
<div>
  <table style="height:156px" width="281">
    <tbody>
      <tr>
        <td style="width:157.27px">
          <strong>Symbol</strong>
        </td>
        <td style="width:116.73px">
          <strong>Value</strong>
        </td>
      </tr>
      <tr>
        <td style="width:157.27px">I</td>
        <td style="width:116.73px">1</td>
      </tr>
      <tr>
        <td style="width:157.27px">V</td>
        <td style="width:116.73px">5</td>
      </tr>
      <tr>
        <td style="width:157.27px">X</td>
        <td style="width:116.73px">10</td>
      </tr>
      <tr>
        <td style="width:157.27px">L</td>
        <td style="width:116.73px">50</td>
      </tr>
      <tr>
        <td style="width:157.27px">C</td>
        <td style="width:116.73px">100</td>
      </tr>
      <tr>
        <td style="width:157.27px">D</td>
        <td style="width:116.73px">500</td>
      </tr>
      <tr>
        <td style="width:157.27px">M</td>
        <td style="width:116.73px">1000</td>
      </tr>
    </tbody>
  </table>
</div>
<div>
  <font style="background-color:#ffffff">
    <br>
    However, in a few specific cases, to avoid four characters being repeated
    in succession (such as IIII or XXXX), the subtractive notation is often used
    as follows:
  </font>
</div>
<ul>
  <li>
    <font style="background-color:#ffffff">
      I placed before V or X indicates one less, so 4 is IV (one less than
      5) and 9 is IX (one less than 10).
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      X placed before L or C indicates ten less, so 40 is XL (10 less than
      50) and 90 is XC (ten less than a hundred).
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      C placed before D or M indicates a hundred less, so 400 is CD (a hundred
      less than five hundred) and 900 is CM (a hundred less than a thousand).
    </font>
  </li>
</ul>
<h1>
  <font style="background-color:#ffffff">Algorithm to convert Integer to Roman Number</font>
</h1>
<div></div>
<ol>
  <li>
    <font style="background-color:#ffffff">
      Create an array of String of characters used in Roman and store the characters
      in descending order. (<strong>Example</strong> - String Symbols[] =&nbsp;
      new String[]{“M”,”CM”,”D”,”CD”,”C”,”XC”,”X”,”XL”,”X”,”IX”,”V”,”IV”,”I”})
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Create an array of integers and store the values of different roman characters
      in descending order.
    </font>
    <font style="background-color:#ffffff">
      (<strong>Example</strong> - int[] val = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
      )
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Initialize a temporary integer variable to 0 (<strong>Example</strong>
      - int i=0);
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">Loop until the input number is greater than 0 (num &gt;0).</font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Divide the number with integer equivalent of roman number pointed to
      by index equal to <strong>“i”</strong> in an array declared in
      <strong>step 2</strong>.
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Get the floor of the quotient obtained in the <strong>step 5</strong>
      and store it in another temporary variable.
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Repeat from 0 to less than the value of the quotient obtained in
      <strong>step 6.</strong>
    </font>
    <ol>
      <li>
        <font style="background-color:#ffffff">
          Concatenate the roman character at Symbols[i]th position to the
          temporary string variable (<strong>Example</strong> – roman_num
          += Symbols[i]).
        </font>
      </li>
      <li>
        <font style="background-color:#ffffff">
          Subtract the integer equivalent of roman number with which you
          divided the input number.
        </font>
      </li>
    </ol>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Increment the value of a temporary variable which is initialized in
      <strong>step 3.</strong> (In this case, increment the value of i).<br>
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Repeat from <strong>step 5 </strong>to<strong> step 8.&nbsp;</strong><br>
    </font>
  </li>
  <li>
    <font style="background-color:#ffffff">
      Return temporary string containing the roman characters (roman_num).
    </font>
  </li>
</ol>
<h1>
  <font style="background-color:#ffffff">Complexity</font>
</h1>
<p>
  <font style="background-color:#ffffff">
    The complexity of this algorithm is of the <strong>order of</strong>
    <strong>(13*3) that means O(13*3) or O(1).</strong>
  </font>
</p>
<h2>
  <font style="background-color:#ffffff">Explanation</font>
</h2>
<div>
  <font style="background-color:#ffffff">
    The input is guaranteed to be within range <strong>1 to 3999.</strong> So
    the maximum quotient that we can possibly get is <strong>3</strong> and a
    total number of roman literals are <strong>13</strong>.
  </font>
</div>
