# drink.py
class ГорячийНапиток:
    def __init__(self, имя: str, объем: int):
        self.имя = имя
        self.объем = объем

    def __repr__(self):
        return f"{self.имя} ({self.объем} мл)"


class ГорячийНапитокСТемпературой(ГорячийНапиток):
    def __init__(self, имя: str, объем: int, температура: int):
        super().__init__(имя, объем)
        self.температура = температура

    def __repr__(self):
        return f"{self.имя} ({self.объем} мл, {self.температура}°C)"