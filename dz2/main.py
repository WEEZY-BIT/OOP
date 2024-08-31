from market import Market

def main():
    market = Market()

    # Добавляем людей в магазин
    market.add_person("Person1")
    market.add_person("Person2")

    # Обновляем состояние магазина
    market.update()

    # Удаляем людей из магазина
    print(market.remove_person())  # Вывод: Person1
    print(market.remove_person())  # Вывод: Person2

    # Проверяем, пуста ли очередь
    print(market.is_empty())  # Вывод: True

if __name__ == "__main__":
    main()
