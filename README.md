# Cloud-Agnostic Domain-Specific Language

**The `README.md` file is a work in progress!**

* ***Disclaimer:** this project contains work which isn't wholly my own. Please see "My Contributions" below.*

## Introduction
This application was created for a group coursework as part of the module ***CO4217 Agile & Cloud Computing***, where we had to create a Domain-Specific Language (DSL) for any function of our choice. 

Our group decided to develop a DSL to provision cloud infrastructure and compute resources. Cloud technologies often use the same terminology (compute, storage, network), but often implement these differently which requires learning slightly different processes. We also understood that vendor lock-in can be an issue for companies as they expand their infrastructure or business model.

To mitigate these issues, we developed a cloud-agnostic DSL. Our language supports AWS, Google Cloud, and Azure by producing the appropriate cloud configuration files. The produced files can be executed using the respective cloud provider's services to provision the resources specified by the language.

By supporting 3 providers, we demonstrated our DSL can be scaled to support many more to further mitigate these issues.

## My Contributions
The repository contains code to exercises written by other group members, namely Exercise 2 and parts of Exercises 3-5, where each member took on an aspect of each task.

I handled all Google Cloud aspects of the DSL, including coding the DSL to generate the GCP cloud configuration YAML file and verify provisioning. I also created JUnit tests to ensure the DSL produced the appropriate cloud configuration file per cloud provider, validated with each provider's configuration verification tools.

Both the GCP aspect of the DSL and testing required understanding artefacts created by other members, namely the DSL metamodel diagram (Exercise 2) and the AWS and Azure implementations (Exercise 3-5), to ensure my own work was consistent and met the original requirements.

## Features
*(work in progress)*

## Artefacts
*(work in progress)*

## Installation
*(work in progress)*

## Licensing
This repository uses the MIT license.
