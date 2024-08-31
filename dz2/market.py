from collections import deque
from interfaces import QueueBehaviour, MarketBehaviour

class Market(QueueBehaviour, MarketBehaviour):
    def __init__(self):
        # Инициализируем очередь для людей в магазине
        self.queue = deque()
        # Можно также хранить список заказов, если нужно
        self.orders = []

    def enqueue(self, person):
        """Добавляет человека в очередь."""
        self.queue.append(person)

    def dequeue(self):
        """Удаляет человека из очереди, если она не пуста."""
        if not self.is_empty():
            return self.queue.popleft()
        else:
            return None

    def is_empty(self):
        """Проверяет, пуста ли очередь."""
        return len(self.queue) == 0

    def add_person(self, person):
        """Добавляет человека в магазин."""
        self.enqueue(person)

    def remove_person(self):
        """Удаляет человека из магазина."""
        return self.dequeue()

    def update(self):
        """Обновляет состояние магазина."""
        print("Обновление состояния магазина.")
        self.process_orders()

    def process_orders(self):
        """Обрабатывает заказы."""
        while self.orders:
            order = self.orders.pop(0)
            print(f"Обрабатывается заказ: {order}")
