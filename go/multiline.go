package main

import (
	"encoding/json"
	"fmt"
	"time"
	"os"
	"runtime/debug"
)

type JsonLog struct {
	TimeStamp  string
	LogMessage string
}

func main() {
	generate()
}

func generate() {
	for {
		generateSimpleLogLine()
		generateJsonLogLine()
		generateMultilineLogLine()
		generateErrorStack()

		time.Sleep(5 * time.Second)
	}
}

func generateSimpleLogLine() {
	fmt.Printf("%v # Generating single line log.\n", time.Now())
}

func generateJsonLogLine() {
	jsonMap := map[string]string{"timeStamp": fmt.Sprintf("%v", time.Now()), "logMessage": "This is a JSON log"}
	json, _ := json.Marshal(jsonMap)
	fmt.Println(string(json))
}

func generateMultilineLogLine() {
	fmt.Printf("%v # Generating multiline log:\nLine2\nLine3\n", time.Now())
}

func generateErrorStack() {
	path := "/path/to/file/to/delete"
	// defer handleRemoveError()
    err := os.Remove(path)
	if err != nil {
        panic(err)
    }

}

func handleRemoveError() {
    if r := recover(); r != nil {
        fmt.Println(time.Now(), "# Error removing a file:", r)
        debug.PrintStack()
    }
}