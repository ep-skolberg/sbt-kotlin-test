# Minimal example for issue https://youtrack.jetbrains.com/issue/SCL-25078

Note! the file `repositories` mus tbe edited to match your own artifactory instance.
Not sure what exactly triggers the issue, but it happens as soon as I add the files

- repositories
- .sbtopts

for my custom artifactory handling with authentication.

It hosts remote repos for all the commonly used repos like e.g. _maven1_ as well as some of my own. 

## Artifactory authentication

The file at `$HOME/.ivy2/.credentials` contains the credentials for artifactory authentication, 
and is used by SBT to authenticate when fetching dependencies from repos defined in the `repositories` file.

**Content**:

```
realm=Artifactory Realm
host=artifactory.example.com
user=your-username
password=your-password
```
