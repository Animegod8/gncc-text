# new line function for the code editor
def newLine():
  text = input()
  if text == '.exit':
    print('goodbye for now!')
  elif text == '.exe':
    print('run the shell file file for the terminal to execute your code(note not added yet)')
  else:
    newLine()

# Extra
"""
def miniTerm():
  def termNL():
    command = input()
    if command == '.test':
      print('hello world!')
      termNL()
    elif command == '.exit':
      print('procces compleate')
    else:
      print('command not found')
      termNL()





  command = input()


  if command == '.exit':
    print('procces compleate')

  elif command == '.test':
    print('hello world!')
    termNL()
  else:
      print('command not found')
      termNL()
"""

# code to inisialize on startup bla bla bla
inText = 0
print('chose witch mode to boot into(editor(miniTerm comming later)')
print('NOTICE: ITS A TERMINAL TECH DEMO')
bootMode = input()
if bootMode == 'editor':
  print('welcome to the editor!')
  print('just type some lines and your writing some code!')
  inText = 1
  newLine()
#elif bootMode == 'term':
 # print('booting into miniTerm')
  #miniTerm()
