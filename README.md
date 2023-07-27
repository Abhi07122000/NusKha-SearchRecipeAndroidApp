# NusKha - Recipe Search Android App

NusKha is an Android app that allows users to search for recipes and explore random recipes based on tags. The app fetches recipe data from the Spoonacular API.

## Features

- Search recipes using keywords and tags.
- Explore random recipes based on selected tags.
- View detailed information, ingredients, and instructions for individual recipes.

## Prerequisites

- Android device or emulator running Android API.
- An active internet connection to fetch recipe data from the Spoonacular API.

## Getting Started

1. Clone this repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the app on your Android device or emulator.

## Libraries Used

- Retrofit for API calls
- Gson Converter for JSON data
- Picasso for image loading and caching

## How to Use the App

1. Search for recipes using the search bar or explore random recipes by selecting a tag from the dropdown spinner.
2. Tap on any recipe to view its details, including the meal name, source, summary, image, ingredients, and instructions.

## API Key

This app uses the Spoonacular API to fetch recipe data. Replace the placeholder API key in the `RequestManager` class with your Spoonacular API key.
