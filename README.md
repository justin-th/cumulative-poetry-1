## Usage

``` shell script
java -jar reciter.jar [--recite | --reveal-for-day day_number] [poem_file]
```
## Description
Recites a 'Cumulative Poem' based on user options.

__--recite__: 
Recites the poem for all days starting from the first.

__--reveal_for_day__: 
Reveals the poem for the day specified as the next parameter.

__file_name__: 
To specify a file to read the poem from.

> While one of the two options are compulsory,
> the filename is an optional parameter.
> When not specified, the program loads the
> default internal poem.