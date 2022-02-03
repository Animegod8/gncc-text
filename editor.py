# new line function for the code editor
def newLine():
  text = input()
  if text == '.exit':
    print('goodbye for now!')
  elif text == '.exe':
    print('Run the shell script with the install(--install) option everytime affter that, use --run')
    print('also copy and paset your code to write it to a file in the compile.class')
  else:
    newLine()


# code to inisialize on startup bla bla bla
print('chose witch mode to boot into(editor(miniTerm comming later)')
print('NOTICE: ITS A PRE RELSESE NOTHING IS FINAL')
bootMode = input()
if bootMode == 'editor':
  print('welcome to the editor!')
  print('just type some lines and your writing some code!')
  newLine()

