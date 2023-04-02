Feature: test data input file

Scenario: Read JSON model from file
  * def jsonModel = read('classpath:data/modelFile.json')
  * print jsonModel

