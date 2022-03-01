#定義了一個建立物件的interface，由子類別決定實體化的類別為何者。

將NotebookFactory中的switch case 抽象化到介面
由實作此介面的子類別工廠去決定要new 哪一個實體


| 角色                        | 名稱                      | 功能                              |
|-----------------------------|---------------------------|-----------------------------------|
| Factory（抽象工廠）         | NotebookFactory           | 定義抽象方法供ConcreteFactory實作 |
| ConcreteFactory（實體工廠） | MacFactory, WindowFactory | 實作Factory並建立物件             |
| Product（抽象產品）         | ProduceNotebook           | 定義抽象方法供ConcreteProduct實作 |
| ConcreteProduct（實體產品） | ProduceMac, ProduceWindow | 實作產品的商業邏輯                |





