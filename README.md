# Currency Converter Project
![Badge In Progress](http://img.shields.io/static/v1?label=STATUS&message=IN%20PROGRESS&color=orange&style=for-the-badge)

This project is a challenge I received in my technical high school class, in the mobile development course, taught by **Professor Leonardo Rocha**. It is a currency converter program for Android devices, programmed with Java in Android Studio and using the Exchange Rate API. The Retrofit library was also used to create the interface.

- [Github Leonardo Rocha](https://www.github.com/leonardossrocha)


*The purpose of this program is only educational.*


## Built with

- [Java](https://www.java.com/pt-BR/) - Programming Language
- [Android Studio](https://developer.android.com/studio?hl=pt-br) - IDE
- [Exchange Rate API](https://www.exchangerate-api.com/) - Currency Converter API
- [Retrofit](https://square.github.io/retrofit/) - Library to create interface


## Prerequisites

First, you need to create an account on API Exchange Rate, a currency converter API that allows you to create a free trial account for use, which will provide you with the current market values of currencies.

https://www.exchangerate-api.com/

Then, download the APK and install the application:

https://example.com/
## Using

There is a field for entering the amount to be converted. Below it, there are two other fields, one for selecting the currency to be converted and another for selecting the currency to which it will be converted.

Just click on the **Convert** button, and nice!

#### Created Java Classes:

-  **ExchangeRateService** - Project interface
- **ExchangeRatesResponse** - Class responsible for providing the API JSON (DTO)
- **MainActivity** - Main project class
- **RetrofitClient** - Class responsible for configuring and providing a Retrofit instance

#### Used Retrofit classes:
- [Builder()](https://square.github.io/retrofit/2.x/retrofit/retrofit2/Retrofit.Builder.html)
- [Call()](https://square.github.io/retrofit/2.x/retrofit/retrofit2/Call.html)

#### Used Android classes:
- [ArrayAdapter()](https://developer.android.com/reference/android/widget/ArrayAdapter)

#### MainActivity Imports:
- **android.os.Bundle:** Saves and restores data on a screen.
- **android.view.View:** The base for all visual elements on the screen.
- **android.widget.ArrayAdapter:** Prepares data to be shown in lists.
- **android.widget.Button:** Creates clickable buttons.
- **android.widget.EditText:** Creates fields for the user to type text.
- **android.widget.Spinner:** Creates a dropdown list of options.
- **android.widget.TextView:** Displays static text.
- **android.widget.Toast:** Shows quick pop-up messages.
- **androidx.appcompat.app.AppCompatActivity:** Allows the app to work on older Android versions.
- **java.util.List:** Represents a list of items.
- **java.util.Map:** Represents "key-value" pairs (like a dictionary).
- **retrofit2.Call:** Makes a call to a web API.
- **retrofit2.Callback:** Handles the result (success or failure) of the API call.
- **retrofit2.Response:** Contains the full API response, including status and data.
  
## Author

- Github: [@leonardoguerrini](https://www.github.com/leonardoguerrini)
- LinkedIn: [@leoguerrini](https://www.linkedin.com/in/leoguerrini)

## References

 - [Retrofit documentation](https://square.github.io/retrofit/)
 - [Android Developers documentation](https://developer.android.com/reference/packages)
 - [How to write an awesome README on your GitHub](https://www.alura.com.br/artigos/escrever-bom-readme?)
 - [READ ME or I'll devour you: How to write a good README](https://dev.to/github/leia-me-ou-te-devoro-como-escrever-um-bom-readme-5hl4)
 - [Readme Editor](https://readme.so/pt/)
 - [Markdown Badges](https://github.com/Ileriayo/markdown-badges)
 - [Readme templates](https://github.com/iuricode/readme-template)
