# Turkish-English Dictionary API for Java [![](https://jitpack.io/v/ugurcany/Turkish-English-Dictionary.svg)](https://jitpack.io/#ugurcany/Turkish-English-Dictionary)

A Java library to translate words/phrases between Turkish and English languages.


## Example usage

#### Code
```java
String term = "pay";

TurEngDictionary.getInstance().translateAsync(term, new TranslationCallback() {
    @Override
    public void onSuccess(List<Translation> translations) {
        for (Translation translation : translations) {
            System.out.println(translation);
        }
    }

    @Override
    public void onError(String message) {
        System.out.println(message);
    }
});
```

#### Output
```
tr->en: (n., i.) lot
tr->en: (n., i.) cut
tr->en: (n., i.) share
tr->en: (n., i.) allotment
tr->en: (n., i.) dole
tr->en: (n., i.) moiety
tr->en: (n., i.) margin
tr->en: (n., i.) quantum
tr->en: (n., i.) percentage
tr->en: (n., i.) toll
tr->en: (n., i.) part
tr->en: (n., i.) concern
tr->en: (n., i.) kickback
tr->en: (n., i.) hand
tr->en: (n., i.) snack
tr->en: (n., i.) proportion
tr->en: (n., i.) numerator
tr->en: (n., i.) portion
tr->en: (n., i.) deal
tr->en: (n., i.) quota
tr->en: (n., i.) ration
tr->en: (n., i.) shareout
tr->en: (n., i.) contribution
tr->en: (n., i.) dividend
tr->en: (n., i.) divvy
tr->en: (n., i.) interest
tr->en: (n., i.) whack
tr->en: (n., i.) slice
tr->en: (n., i.) apportionment
tr->en: (n., i.) take
tr->en: (n., i.) desert
tr->en: (n., i.) allocation
tr->en: (n., i.) share
tr->en: bit of the action
tr->en: piece (of the action)
tr->en: slice of the action
tr->en: percentage
tr->en: stake
tr->en: lot
tr->en: interest
en->tr: (v., f.) ödemek
en->tr: (n., i.) ödeme
en->tr: (n., i.) ücret
en->tr: (v., f.) paid - paid
en->tr: (v., f.) vermek
en->tr: (v., f.) karşılığını vermek
en->tr: (v., f.) tediye etmek
en->tr: (v., f.) değmek
en->tr: (v., f.) eda etmek
en->tr: (v., f.) para vermek
en->tr: (v., f.) yarar sağlamak
en->tr: (v., f.) yararına olmak
en->tr: (v., f.) para saymak
en->tr: (v., f.) toslamak
en->tr: (v., f.) ödemek
en->tr: (v., f.) para ödemek
en->tr: (v., f.) cezasını çekmek
en->tr: (v., f.) etmek
en->tr: (v., f.) maaş dağıtmak
en->tr: (v., f.) ücret ödemek
en->tr: (n., i.) maaş
en->tr: (n., i.) ücret
en->tr: (n., i.) tediye
en->tr: (n., i.) ecir
en->tr: (n., i.) ödenek
en->tr: (v., f.) uçlanmak
en->tr: ücret
en->tr: tediye
en->tr: bedel
en->tr: maaş
en->tr: ödeme
en->tr: tediye etmek
en->tr: aylık
en->tr: verme
en->tr: karşılık
en->tr: ödemek
en->tr: ödeme yapmak
en->tr: tediye etmek
en->tr: tediye etme
en->tr: su geçirmez veya empermeabl yapmak için katran veya zift ile kaplamak
```


## License
```
The MIT License (MIT)

Copyright (c) 2016 Ugurcan Yildirim

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
