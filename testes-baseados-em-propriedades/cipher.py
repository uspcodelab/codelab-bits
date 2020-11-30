def cipher_char(char, key):

# Tratamento de caracteres especiais
    if(not char.isalpha()):
        return char

    if(char.isupper()):
        return chr((ord(char) + key - ord("A")) % 26 + ord("A"))
    else:
        return chr((ord(char) + key - ord("a")) % 26 + ord("a"))

def decipher_char(char, key):

# Tratamento de caracteres especiais

    if(not char.isalpha()):
        return char

    if(char.isupper()):
        return chr((ord(char) - key - ord("A")) % 26 + ord("A"))
    else:
        return chr((ord(char) - key - ord("a")) % 26 + ord("a"))

def encrypt(text, key):
    return ''.join(cipher_char(char, key) for char in text)

def decrypt(text, key):
    return ''.join(decipher_char(char, key) for char in text)
