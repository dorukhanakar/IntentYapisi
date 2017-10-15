Intent Yapısı


**Explicit(Açık) Intent

Doğrudan çalışan intenler ile bir aktivite manifest dosyasındaki tanımlı diğer aktiviteleri yada servisleri çalıştırabilir. Doğrudan (Açık) Intent kullandığımız zaman hangi etkileşimi kullanacağımızı direk belirliyoruz. Yani clasta hangi etkileşimi çağıracağını belirliyoruz. Genelde bu tür Intent uygulamanın içinde kullanılıyor.

**Implicit(Kapalı) Intent

Android'in uygulamalara sağladığı önemli özelliklerinden biri de kullanıcıyı gerçekleştirmek istedikleri "eyleme göre" başka bir uygulamaya yönlendirme olanağı sunmasıdır. Örneklemek gerekirse, çeşitli resim işleme eylemleri yaptığınız bir uygulamada fotoğraf çekmek için bir activity yazmanıza gerek yoktur. Bunun yerine fotoğraf çekilmesi için bir Intent oluşturmanız ve çalıştırmanız yeterlidir. Sistem sizi kamera uygulamasına kendiliğinden yönlendirecektir.

Uygulamanızın Activity'leri arasında geçmek için Intent kullanmalısınız. Bunu genellikle adresi belli intent'ler (explicit intent) kullanarak, çalıştırmak istediğiniz bileşenin class ismini kullanarak yaparsınız, fakat başka uygulamada bir eylem gerçekleştirmek istediğinizde, örneğin "haritayı göster" gibi, üstü kapalı intent (implicit intent) kullanmak zorundasınız.

