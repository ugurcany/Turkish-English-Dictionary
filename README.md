# Turkish-English Dictionary API for Java [![](https://jitpack.io/v/ugurcany/Turkish-English-Dictionary.svg)](https://jitpack.io/#ugurcany/Turkish-English-Dictionary)

A Java library to translate words/phrases between Turkish and English languages.

Translation result (`TranslationResult`) includes the following properties that you can make use of:
- `translation`: Translation of your input
- `fromLang`:  Language of your input
- `toLang`: Language of translation
- `partOfSpeechEN`: Part of speech in English
- `partOfSpeechTR`: Part of speech in Turkish
- `categoryEN`: Category in English
- `categoryTR`: Category in Turkish

## Example usage

#### Code:
```java
String term = "pay";

TurEngDictionary.getInstance().translateAsync(term, new TranslationCallback() {
    @Override
    public void onSuccess(List<TranslationResult> translationResults) {
        for (TranslationResult translationResult : translationResults) {
            System.out.println(translationResult);
        }
    }

    @Override
    public void onError(String message) {
        System.out.println(message);
    }
});
```

#### Output:
```
fromLang: tr, toLang: en, categoryEN: Common Usage, categoryTR: Yaygın Kullanım, partOfSpeechEN: n., partOfSpeechTR: i., translation: lot
fromLang: tr, toLang: en, categoryEN: Common Usage, categoryTR: Yaygın Kullanım, partOfSpeechEN: n., partOfSpeechTR: i., translation: cut
fromLang: tr, toLang: en, categoryEN: Common Usage, categoryTR: Yaygın Kullanım, partOfSpeechEN: n., partOfSpeechTR: i., translation: share
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: allotment
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: dole
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: moiety
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: margin
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: quantum
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: percentage
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: toll
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: part
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: concern
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: kickback
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: hand
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: snack
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: proportion
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: numerator
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: portion
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: deal
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: quota
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: ration
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: shareout
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: contribution
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: dividend
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: divvy
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: interest
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: whack
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: slice
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: apportionment
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: take
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: desert
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: allocation
fromLang: tr, toLang: en, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: share
fromLang: tr, toLang: en, categoryEN: Idioms, categoryTR: Deyim, partOfSpeechEN: null, partOfSpeechTR: null, translation: bit of the action
fromLang: tr, toLang: en, categoryEN: Idioms, categoryTR: Deyim, partOfSpeechEN: null, partOfSpeechTR: null, translation: piece (of the action)
fromLang: tr, toLang: en, categoryEN: Idioms, categoryTR: Deyim, partOfSpeechEN: null, partOfSpeechTR: null, translation: slice of the action
fromLang: tr, toLang: en, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: percentage
fromLang: tr, toLang: en, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: stake
fromLang: tr, toLang: en, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: lot
fromLang: tr, toLang: en, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: interest
fromLang: en, toLang: tr, categoryEN: Common Usage, categoryTR: Yaygın Kullanım, partOfSpeechEN: v., partOfSpeechTR: f., translation: ödemek
fromLang: en, toLang: tr, categoryEN: Common Usage, categoryTR: Yaygın Kullanım, partOfSpeechEN: n., partOfSpeechTR: i., translation: ödeme
fromLang: en, toLang: tr, categoryEN: Common Usage, categoryTR: Yaygın Kullanım, partOfSpeechEN: n., partOfSpeechTR: i., translation: ücret
fromLang: en, toLang: tr, categoryEN: Irregular Verb, categoryTR: Irregular Verb, partOfSpeechEN: v., partOfSpeechTR: f., translation: paid - paid
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: vermek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: karşılığını vermek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: tediye etmek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: değmek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: eda etmek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: para vermek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: yarar sağlamak
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: yararına olmak
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: para saymak
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: toslamak
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: ödemek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: para ödemek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: cezasını çekmek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: etmek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: maaş dağıtmak
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: v., partOfSpeechTR: f., translation: ücret ödemek
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: maaş
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: ücret
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: tediye
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: ecir
fromLang: en, toLang: tr, categoryEN: General, categoryTR: Genel, partOfSpeechEN: n., partOfSpeechTR: i., translation: ödenek
fromLang: en, toLang: tr, categoryEN: Colloquial, categoryTR: Konuşma Dili, partOfSpeechEN: v., partOfSpeechTR: f., translation: uçlanmak
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: ücret
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: tediye
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: bedel
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: maaş
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: ödeme
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: tediye etmek
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: aylık
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: verme
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: karşılık
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: ödemek
fromLang: en, toLang: tr, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi, partOfSpeechEN: null, partOfSpeechTR: null, translation: ödeme yapmak
fromLang: en, toLang: tr, categoryEN: Law, categoryTR: Hukuk, partOfSpeechEN: null, partOfSpeechTR: null, translation: tediye etmek
fromLang: en, toLang: tr, categoryEN: Technical, categoryTR: Teknik, partOfSpeechEN: null, partOfSpeechTR: null, translation: tediye etme
fromLang: en, toLang: tr, categoryEN: Technical, categoryTR: Teknik, partOfSpeechEN: null, partOfSpeechTR: null, translation: su geçirmez veya empermeabl yapmak için katran veya zift ile kaplamak
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
