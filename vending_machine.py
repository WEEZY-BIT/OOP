# vending_machine.py
from typing import List, Optional
from drink import ГорячийНапитокСТемпературой

class ТорговыйАвтомат:
    def getProduct(self, имя: str, объем: int, температура: Optional[int] = None) -> Optional[ГорячийНапитокСТемпературой]:
        raise NotImplementedError("Метод getProduct должен быть реализован в подклассе")


class ГорячихНапитковАвтомат(ТорговыйАвтомат):
    def __init__(self):
        self.напитки: List[ГорячийНапитокСТемпературой] = []

    def addProduct(self, напиток: ГорячийНапитокСТемпературой):
        self.напитки.append(напиток)

    def getProduct(self, имя: str, объем: int, температура: Optional[int] = None) -> Optional[ГорячийНапитокСТемпературой]:
        for напиток in self.напитки:
            if напиток.имя == имя and напиток.объем == объем:
                if температура is None or напиток.температура == температура:
                    return напиток
        return None