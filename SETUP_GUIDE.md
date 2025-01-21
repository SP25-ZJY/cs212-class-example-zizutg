<h1>Table of Contents</h1>

<!-- TOC -->
* [`Setup Guide`](#setup-guide)
  * [`Installation`](#installation)
    * [`Step 1 Download and Install Java JDK`](#step-1-download-and-install-java-jdk)
    * [`Step 2 Download and Install Git`](#step-2-download-and-install-git)
    * [`Step 3 Download and Install IntelliJ Community Edition`](#step-3-download-and-install-intellij-community-edition)
  * [`Configuration`](#configuration)
    * [`Step 1 Check to see if Java SDK is installed correctly`](#step-1-check-to-see-if-java-sdk-is-installed-correctly)
    * [`Step 2 Configure IntelliJ with your Github account information`](#step-2-configure-intellij-with-your-github-account-information)
    * [`Step 3 Check to see if your Github account is connected`](#step-3-check-to-see-if-your-github-account-is-connected)
  * [`HelloWorld`](#helloworld)
    * [`Accept`](#accept)
    * [`Repository`](#repository)
    * [`Clone and Trust`](#clone-and-trust)
    * [`Files`](#files)
    * [`Sync Fork: Updating Examples`](#sync-fork-updating-examples)
<!-- TOC -->

# `Setup Guide`
This guide will help you set up your development environment for the course. Follow these steps in order:
1. **Installation**: Required if you are using your personal computer.
2. **Configuration**: Ensure IntelliJ and GitHub are properly set up.
3. **HelloWorld**: Clone, compile, and run your first Java program.

If you are using the lab computers, **installation is already complete**, so you can skip to the **Configuration** section.

---

## `Installation`

### `Step 1 Download and Install Java JDK`
Download the SDK from [https://adoptium.net](https://adoptium.net).

- First, click on the operating system you are using (Linux, MacOS, Windows).
- Download the installer.
- After downloading, run the installer.
- Use all the default settings when installing.

<img src="https://private-user-images.githubusercontent.com/14349892/402437574-7c9b81a2-03e8-4190-902c-658ea2e7d7eb.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzY3NDcxNjIsIm5iZiI6MTczNjc0Njg2MiwicGF0aCI6Ii8xNDM0OTg5Mi80MDI0Mzc1NzQtN2M5YjgxYTItMDNlOC00MTkwLTkwMmMtNjU4ZWEyZTdkN2ViLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTAxMTMlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUwMTEzVDA1NDEwMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWZmOWFmNzZiZjMwOGE0MTg0MjEzMTE2YWRmMmZmZTc0MmQwNTljNjEyN2U4NzkwMTM4NzFhMDVmZDE2ODNlMmYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.4QSTlH4aOEYESmHQqfu7IrLmKfVfz6N6pNh0qsMx6DQ" width="75%" height="auto">

### `Step 2 Download and Install Git`
- You may have done this for CS 151 already.
    - Download Git from [https://git-scm.com/downloads](https://git-scm.com/downloads)

- Click on your operating system in the upper middle of the page to download the correct version for your computer.
- Run the installer after it downloads.
- Use all the default settings when installing.

**If you are on a Mac**:
- Choose "installer" under "binary installer."
- Run the downloaded `.pkg` file.
- If IntelliJ gives you an error when cloning your repository, you may need to update macOS.

<img src="https://github.com/user-attachments/assets/74484681-1860-4d20-b2c5-430efcf98366" width="75%" height="auto">

### `Step 3 Download and Install IntelliJ Community Edition`
Download IntelliJ from [https://www.jetbrains.com/idea/download](https://www.jetbrains.com/idea/download)

- **Make sure to scroll all the way down and select Community Edition.**

<img src="https://github.com/user-attachments/assets/2b665113-f312-4537-8197-aef3d7e31356" width="75%" height="auto">

[<h2>⬆Back To Top⬆</h2>](#setup-guide)

---

## `Configuration`

### `Step 1 Check to see if Java SDK is installed correctly`
1. Open IntelliJ, and go to **Projects.**
2. Click **New Project.**

<img src="https://github.com/user-attachments/assets/c100cee9-5ab5-4a91-a948-1a0982912850" width="75%" height="auto">

<img src="https://github.com/user-attachments/assets/f8994839-ee50-4a51-ba00-88e394418c19" width="75%" height="auto">

- If you see **Oracle OpenJDK version x.x.x** on the JDK tab, the installation is correct.

[<h2>⬆Back To Top⬆</h2>](#setup-guide)

### `Step 2 Configure IntelliJ with your Github account information`
1. Exit the **New Project** screen.
2. Go to **Customize** (below Projects) and select **All settings.**
   - Follow the Steps on the image

<img src="https://github.com/user-attachments/assets/9dd08b32-5c83-42f0-89f5-58ba81c268ea" width="75%" height="auto">

3. Give all permissions `->` Copy the token `->` Use the token

<img src="https://github.com/user-attachments/assets/226ae1bf-70d0-42e0-b6e6-c85de7461204" width="75%" height="auto">


[<h2>⬆Back To Top⬆</h2>](#setup-guide)

### `Step 3 Check to see if your Github account is connected`
1. From the main menu, go to **Projects** and select **Get from VCS.**

<img src="https://github.com/user-attachments/assets/7585f92f-bbf7-4cff-9d15-5f484f8d0b85" width="75%" height="auto">

2. Click on your GitHub account. You should see a list of repositories.

<img src="https://github.com/user-attachments/assets/53e36a93-36b3-428e-b930-dbe62883b72c" width="75%" height="auto">

[<h2>⬆Back To Top⬆</h2>](#setup-guide)

---

## `HelloWorld`

### `Accept`
- Click [**here**](https://classroom.github.com/a/RtRgFxdd) to accept the class example.

<img src="https://github.com/user-attachments/assets/3d424dd8-7e53-47e5-a9f3-098ea42e7d3c" width="75%" height="auto">

### `Repository`
- Click the **HTTPS link** to access the repository.

<img src="https://github.com/user-attachments/assets/d9d556b9-c9f8-41dd-9c7b-ba06ae64b3d3" width="75%" height="auto">

[<h2>⬆Back To Top⬆</h2>](#setup-guide)

### `Clone and Trust`
1. Go to IntelliJ. From the main menu, select **Get from VCS.**
2. Select the repository and hit **Clone.**
3. If prompted, choose **Trust Project.**

<img src="https://github.com/user-attachments/assets/891bf7a3-b946-4b2c-86fd-d7a40e58acf0" width="75%" height="auto">

[<h2>⬆Back To Top⬆</h2>](#setup-guide)

### `Files`
- Open `HelloWorld.java` from your local repository.

<img src="https://github.com/user-attachments/assets/df3ea473-4890-4ed6-b482-ff739857d29e" width="75%" height="auto">

- Click the **Run icon** (play button) to compile and run your program.
- You should see the output at the bottom.

<img src="https://github.com/user-attachments/assets/de0eeac9-fbb9-4746-9e15-17bd5f65f53b" width="75%" height="auto">

**Congratulations! You have compiled and run your first Java program!**

### `Sync Fork: Updating Examples`
- To get updates on the example always press Git:GitHub:Sync Fork

<img src="https://private-user-images.githubusercontent.com/14349892/402439387-cadf1f42-9baa-4f83-825a-a89409dfe736.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MzY3NDc2ODcsIm5iZiI6MTczNjc0NzM4NywicGF0aCI6Ii8xNDM0OTg5Mi80MDI0MzkzODctY2FkZjFmNDItOWJhYS00ZjgzLTgyNWEtYTg5NDA5ZGZlNzM2LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNTAxMTMlMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjUwMTEzVDA1NDk0N1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWRiOTdmODA3MWRjMGYxNjQ1YTBjNWE1YWRlZTE5ZGMzYjVhYjBlYjg5NmVkMDUyNTNjMmI5NDliYWFhOGEzYTUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0In0.qKnyl4g-PIcY2AoCV7yj1IbxbEjzaad7PQL-GCYD9bc" width="75%" height="auto">

[<h2>⬆Back To Top⬆</h2>](#setup-guide)