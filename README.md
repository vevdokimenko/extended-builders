# Extended builders in abstract extended classes

**Problem**: There are three classes.

| ClassName           | Description                         |
|---------------------|-------------------------------------|
| `BaseClass`         | base, abstract                      |
| `ExtendedBaseClass` | extends BaseClass and also abstract |
| `FinalClass`        | extends ExtendedBaseClass           |

All classes must have builders. All classes must have builders. Also, builders must be inherited from each other in the
same sequence as the classes themselves.

