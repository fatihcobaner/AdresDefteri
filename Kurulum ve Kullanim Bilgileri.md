##Adres Defteri Kurulum ve Kullanım Anlatımı#

Adres defteri ile kişi bilgileri girilerek veri kaydetme,düzenleme,silme ve veri üzerinde arama işlemleri sağlanmaktadır.

## Kurulumu ##


- İlk olarak "**AdresDefteri**" adında oluşturulan JPA projesi, IDE üzerinde import işlemi sağlanmalıdır. 

- Bu işlemden sonra "**adres**" adındaki veritabanı klasörü "C:\ProgramData\MySQL\MySQL Server 5.1\data" dizinine eklenmelidir. 

- Eclipse IDE üzerinde import edilen proje içerisinde bulunan src klasöründe java sınıfları bulunmaktadır. Web content isimli klasör içerisinde de ilgili projenin .xhtml dosyaları bulunmaktadır.

## Kullanımı ##

Web Content içerisindeki "**index.xhtml**" ile proje çalıştırılır.	

Anasayfa üzerinde kişi, bilgilerini girerek verilerini kaydedebilir.Validatorler yardımı ile veri giriş kontrolü sağlanmıştır.(İlgili alanlara hatalı giriş yapılmaması gerekmektedir.)

- Ad ve Soyad bölümlerine rakam girilmemelidir.

- Adres alanına en az 2 karakterde giriş sağlanmalıdır.

- Telefon alanı için başına 0 yazarak veya 0 yazmadan girebilirsiniz.

- E-Mail yazımına dikkat edilmelidir.

Kişi bilgileri girildikten sonra "**kaydet**" butonu ile veriler kaydedilir.

Liste üzerindeki "**Seç**" butonu ile veriler alanlara otomatik doldurulur ve düzenleme işlemi sağlanabilir.

Liste üzerindeki "**Sil**" butonu ile istenilen kişinin bilgileri silinebilir.

"**Arama**" sayfasındaki alana kişi adının ilk harfi veya direkt olarak adının girilip ardındanda sayfanın herhangi bir yerine tıklanılmasının ardından ilgili kişinin verileri listelenir.

> İndirmiş olduğunuz klasörde projenin halihazırda çalışmakta olan ekran görüntülerini "**ekranGoruntuleri**" klasörü içerisinde görüntüleyebilirsiniz.







