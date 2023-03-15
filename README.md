# İçerik
- 1. Açıklama
- 2. Domain Model

# 1. Açıklama

- Gereksinimlere göre sınıflar unidirectional olacak şekilde ayarlandı, bunun sebebi toString metotlarında recursion hataları almamak için olmuştur. Örneğin bir sale bir playere ulaşabilir ama bir player bir saleye ulaşamaz.
- N-Tier mimarisine giriş amaçlı data katmanında yer alan bazı sınıflar yazılmıştır, bunlar entityler ve generic repositoryler olmuştur. 
- Entityler kalıtım yolu ile bir base sınıfının ID'sini almaktadır, bu ID generic tipinde tanımlandı, böylelikle farklı ID tipleri entegre edildi. 
- Generic repository bir arayüzdür, farklı teknolojilerin kullanılabileceği göz önünde bulundurarak yapıldı. Arayüzü uygulayan bir list generic repository var, alt yapısı listeden oluşur, arayüzün metotları implement etmektedir.
- Ödevin gereksinimlerine göre sadece ihtiyaç duyulan repository sınıfları tanımlandı. Bunlar PlayerRepository, SaleRepository ve CampaignRepository sınıflarıdır. 
- Ödev fazladan ayrıntı istemediği için Business Katmanı yapılmadı.

# 2. Domain Model

Attributeler sonradan eklenilmiştir, domain modelde sadece varlıklara odaklanılmıştır.

![plot](./domainModel1.jpg)
