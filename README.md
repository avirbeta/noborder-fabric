# No Border — Безрамочный режим для Minecraft 1.16.5 (Fabric)

Убирает заголовок окна с логотипом Minecraft и кнопками свернуть/развернуть/закрыть. Игрок остаётся в полноэкранном окне без рамки.

## Что нового в 1.1.0

- Убран миксин в конструкторе `Window` — вместо него стабильный `ClientLifecycleEvents.CLIENT_STARTED`.
- Добавлены `depends` в `fabric.mod.json` (Fabric Loader, Fabric API, Minecraft).
- Добавлены Fabric API в зависимости сборки, CI и MIT-лицензия.
- Версия поднята до 1.1.0.

## Установка

1. Установи [Fabric Loader](https://fabricmc.net/) для Minecraft 1.16.5
2. Положи `noborder-fabric-1.16.5-1.1.0.jar` в `mods/`
3. Запусти Minecraft

## Как работает

Мод автоматически снимает атрибут `GLFW_DECORATED` при запуске окна. Никаких настроек, горячих клавиш и интерфейса — просто ставь в `mods/` и играй.

### Что делает

- Убирает заголовок окна (название, логотип Java)
- Убирает кнопки свернуть/развернуть/закрыть
- Окно работает как полноэкранное, но в оконном режиме

### Что не делает

- Не переключает в настоящий полноэкранный режим (F11)
- Не скрывает панель задач
- Не влияет на производительность

## Требования

- Minecraft 1.16.5
- Fabric Loader 0.11+
- Java 8+
- Fabric API 0.42.0+1.16

## Сборка из исходников

```bash
git clone https://github.com/YOUR_NAME/noborder-fabric.git
cd noborder-fabric
./gradlew build
# jar будет в build/libs/
```

## Лицензия

MIT — см. [LICENSE](LICENSE).
