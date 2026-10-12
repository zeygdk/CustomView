# 🎨 CustomView

An Android project that builds its form UI **dynamically from JSON**. The app reads a list of view definitions from a remote endpoint with **Retrofit**, then renders matching **custom views** on the fly.

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white)
![Retrofit](https://img.shields.io/badge/Retrofit-48B983?style=flat-square&logo=square&logoColor=white)

## ✨ How it works

The server returns a config like this ([`data.json`](data.json)):

```json
[
  { "CustomViewType": "EditTextWithClear", "Properties": { "Text": "'Custom view örnek'" } },
  { "CustomViewType": "TextInput",         "Properties": { "Header": "'Text Input'" } },
  { "CustomViewType": "Combobox",          "Properties": { "Header": "'Combobox'", "Code": "['a','b','c']", "Text": "['ilk','ikinci','üçüncü']" } }
]
```

Each item is mapped to a custom component and rendered in a `RecyclerView`. To add a new field you only change the JSON, not the app.

## 🧩 Custom components

- **EditTextWithClear**: an `EditText` with a built-in clear button
- **SpinnerTextView**: a labeled spinner/combobox with its own adapter
- **TextInput**: a labeled text input

## 🛠️ Tech Stack

Kotlin · Custom Views · RecyclerView · Retrofit + Gson · OkHttp Logging Interceptor
