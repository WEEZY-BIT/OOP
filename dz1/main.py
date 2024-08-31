# main.py
from drink import ГорячийНапитокСТемпературой
from vending_machine import ГорячихНапитковАвтомат

def main():
    автомат = ГорячихНапитковАвтомат()
    
    # Создание горячих напитков
    кофе = ГорячийНапитокСТемпературой("Кофе", 250, 80)
    чай = ГорячийНапитокСТемпературой("Чай", 200, 70)
    шоколад = ГорячийНапитокСТемпературой("Шоколад", 300, 75)
    
    # Добавление напитков в автомат
    автомат.addProduct(кофе)
    автомат.addProduct(чай)
    автомат.addProduct(шоколад)
    
    # Демонстрация работы автомата
    print("Запрос на кофе, 250 мл, 80°C:")
    print(автомат.getProduct("Кофе", 250, 80))
    
    print("Запрос на чай, 200 мл, 70°C:")
    print(автомат.getProduct("Чай", 200, 70))
    
    print("Запрос на шоколад, 300 мл, 75°C:")
    print(автомат.getProduct("Шоколад", 300, 75))
    
    print("Запрос на кофе, 250 мл, 90°C (отсутствует):")
    print(автомат.getProduct("Кофе", 250, 90))

if __name__ == "__main__":
    main()