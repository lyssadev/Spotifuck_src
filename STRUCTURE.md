# Documentation Structure

when documenting reversed code, follow this template:

```
FILE: path/to/file.java or path/to/file.smali
├── LOCATION: exact/path/in/repo
├── TYPE: java class / smali / resource / manifest / etc
├── PURPOSE: brief description of what this file does
│
├── KEY FINDINGS:
│   ├── line X-Y: description of what happens here
│   ├── line Z: specific method or function and what it does
│   └── line N: important variables, constants or references
│
├── METHODS/FUNCTIONS:
│   ├── methodName() (line X): what it does
│   └── anotherMethod() (line Y): what it does
│
├── DEPENDENCIES:
│   ├── references to other files or classes
│   ├── external libraries used
│   └── api calls or network requests
│
└── NOTES:
    ├── any additional observations
    ├── potential modifications or hooks
    └── security concerns or interesting behavior
```