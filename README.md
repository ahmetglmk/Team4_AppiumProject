# Team4_AppiumProject
[TEAM 4 GitHub](https://github.com/ahmetglmk/Team4_AppiumProject)

<img src="https://github.com/ahmetglmk/Team4_AppiumProject/blob/main/Team4.png?raw=true" alt="alt text" width="250" height="280">

![img.png](img.png)
# Appium Test Otomasyon Framework'ü

## Giriş

Bu projemiz için Appium test otomasyon framework'ünü içermektedir. Mobil uygulamalar üzerinde otomatik testler çalıştırmak için gerekli yapılandırmaları, kaynakları içerir.

## Kurulum Yapmak İçin
[Appium Kurulum](https://www.youtube.com/watch?v=mcbCp2sLRzw&t=1770s)

## Başlarken

### Gereksinimler

- Node.js ve npm
- Java Geliştirme Kiti (JDK)
- Appium sunucusu
- Android SDK / Xcode (iOS için)
- Emülatör veya gerçek cihaz
- Git

### Kurulum

1. Repository'yi klonlayın:

   ```bash
   git clone 
   https://github.com/kullanıcı-adı/proje-adi.git 
   cd proje-adi
   ```


2. Bağımlılıkları yükleyin:

   ```bash
   npm install
   ```


3. Appium sunucusunu başlatın:

   ```bash
   appium
   ```


## Appium Sunucusu

### Sunucuyu Başlatma

Appium sunucusunu başlatmak için bir terminal açın ve şu komutu çalıştırın:

   ```bash
   appium
   ```


## Emülatör ve Inspector ile Locateleri Alma

### Emülatör Başlatma

1. Android Studio'yu açın.
2. Virtual Device Manager'a gidin.
3. Bir emülatör oluşturun veya mevcut bir emülatörü başlatın.


## Appium Inspector Kullanarak Locateleri Alma
###### ![img_1.png](img_1.png) ![img_2.png](img_2.png)
1. Appium Inspector uygulamasını indirip kurun.
2. Appium Inspector'u başlatın ve Appium sunucusunu çalıştırın.
3. "Start Session" butonuna tıklayın.
4. Desired Capabilities'i yapılandırın (örneğin, platformName, deviceName, app).
5. "Start Session" butonuna tıklayın.
6. Uygulamanız açılacak ve Inspector penceresinde elemanları seçerek locateleri alabilirsiniz.


## GitHub İşlemleri
![img_4.png](img_4.png)

### Değişiklikleri Çekme
Uzaktaki depodan en son değişiklikleri çekmek için:

   ```bash
   git pull origin main
   ```


### Değişiklikleri Gönderme
Yerel değişikliklerinizi uzaktaki depoya göndermek için;

   ```bash
   git add .
   ```


   ```bash
   git commit -m "Commit mesajınız"
   ```

   ```bash
   git push origin main
   ```


### Dikkat Edilmesi Gerekenler
- Commit mesajlarınızın açıklayıcı olmasına dikkat edin.
- Değişiklikleri göndermeden önce tüm testlerin geçtiğinden emin olun.
- Başkalarının üzerinde çalıştığı dosyalarda değişiklik yaparken dikkatli olun ve gerekirse önce tartışın.