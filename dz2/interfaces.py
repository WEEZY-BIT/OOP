from abc import ABC, abstractmethod

class QueueBehaviour(ABC):
    @abstractmethod
    def enqueue(self, person):
        """Добавляет человека в очередь."""
        pass

    @abstractmethod
    def dequeue(self):
        """Удаляет человека из очереди."""
        pass

    @abstractmethod
    def is_empty(self):
        """Проверяет, пуста ли очередь."""
        pass

class MarketBehaviour(ABC):
    @abstractmethod
    def add_person(self, person):
        """Добавляет человека в магазин."""
        pass

    @abstractmethod
    def remove_person(self):
        """Удаляет человека из магазина."""
        pass

    @abstractmethod
    def update(self):
        """Обновляет состояние магазина."""
        pass
