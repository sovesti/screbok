## Screbok

Screbok is a configurable tool for scrapping, parsing and converting documents. For now, it has a UI (desktop app) and a CLI.

### Usage

To use Screbok, you have to configure it with few models located under Screbok project. It's recommended to use UI editors 
for baking configurations. An exemplar Screbok project with produced artifacts may be found in ```./examples/opennlp/```.

- First thing to do is to define sites to scrap. For now, they are defined with plain URLs.
- Now you can start _recognizing patterns_. Screbok's pattern is a part of the DOM tree which has some nodes
  replaced with _placeholders_. Patterns may represent anything from simple patterns like "text in the ```strong``` element
  should be bold" to more complex. For example, this one encodes some sort of table of contents:

  <img width="627" height="586" alt="image" src="https://github.com/user-attachments/assets/9b984444-f9a4-475d-a12f-1e15e9c2594e" />

  Patterns are fully under user's control and may be shared between projects.
- After configuring first patterns, you may start launching Screbok and look at results. Launching may be configured with another model:

  <img width="610" height="119" alt="image" src="https://github.com/user-attachments/assets/8ed50a0b-714e-4a1b-8369-25a535139321" />

  Screbok saves all the produced data in the project, including Markdown document and intermediate representations
  which can be used for debugging.

### UI and CLI

You can use Screbok with UI, CLI or both. In UI you may want firstly to import or create a project (right click in the Project Explorer. 
If an imported project doesn't appear, try switching Project Presentation in the Project Explorer's menu). 
Then you can create models (right click on project -> new -> other -> ...) and edit them. To run scrapping, open SLM (Screbok Launch Model),
then Launch element -> right click -> Start scrapping.

To use Screbok from CLI, specify which Launch you want to run:

```
screbok -launch <path_to_launch>
```
