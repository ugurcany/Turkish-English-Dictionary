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
translation: lot, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: Common Usage, categoryTR: Yaygın Kullanım
translation: cut, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: Common Usage, categoryTR: Yaygın Kullanım
translation: share, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: Common Usage, categoryTR: Yaygın Kullanım
translation: allotment, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: dole, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: moiety, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: margin, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: quantum, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: percentage, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: toll, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: part, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: concern, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: kickback, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: hand, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: snack, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: proportion, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: numerator, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: portion, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: deal, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: quota, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: ration, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: shareout, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: contribution, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: dividend, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: divvy, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: interest, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: whack, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: slice, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: apportionment, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: take, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: desert, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: allocation, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: share, fromLang: tr, toLang: en, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: bit of the action, fromLang: tr, toLang: en, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Idioms, categoryTR: Deyim
translation: piece (of the action), fromLang: tr, toLang: en, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Idioms, categoryTR: Deyim
translation: slice of the action, fromLang: tr, toLang: en, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Idioms, categoryTR: Deyim
translation: percentage, fromLang: tr, toLang: en, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: stake, fromLang: tr, toLang: en, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: lot, fromLang: tr, toLang: en, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: interest, fromLang: tr, toLang: en, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: ödemek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: Common Usage, categoryTR: Yaygın Kullanım
translation: ödeme, fromLang: en, toLang: tr, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: Common Usage, categoryTR: Yaygın Kullanım
translation: ücret, fromLang: en, toLang: tr, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: Common Usage, categoryTR: Yaygın Kullanım
translation: paid - paid, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: Irregular Verb, categoryTR: Irregular Verb
translation: vermek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: karşılığını vermek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: tediye etmek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: değmek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: eda etmek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: para vermek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: yarar sağlamak, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: yararına olmak, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: para saymak, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: toslamak, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: ödemek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: para ödemek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: cezasını çekmek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: etmek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: maaş dağıtmak, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: ücret ödemek, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: General, categoryTR: Genel
translation: maaş, fromLang: en, toLang: tr, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: ücret, fromLang: en, toLang: tr, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: tediye, fromLang: en, toLang: tr, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: ecir, fromLang: en, toLang: tr, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: ödenek, fromLang: en, toLang: tr, partOfSpeechEN: n., partOfSpeechTR: i., categoryEN: General, categoryTR: Genel
translation: uçlanmak, fromLang: en, toLang: tr, partOfSpeechEN: v., partOfSpeechTR: f., categoryEN: Colloquial, categoryTR: Konuşma Dili
translation: ücret, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: tediye, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: bedel, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: maaş, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: ödeme, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: tediye etmek, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: aylık, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: verme, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: karşılık, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: ödemek, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: ödeme yapmak, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Trade/Economic, categoryTR: Ticaret/Ekonomi
translation: tediye etmek, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Law, categoryTR: Hukuk
translation: tediye etme, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Technical, categoryTR: Teknik
translation: su geçirmez veya empermeabl yapmak için katran veya zift ile kaplamak, fromLang: en, toLang: tr, partOfSpeechEN: null, partOfSpeechTR: null, categoryEN: Technical, categoryTR: Teknik
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
