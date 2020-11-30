from hypothesis import given, example, note
import string
import hypothesis.strategies as st
from cipher import encrypt, decrypt

#@given(st.text())
@given(st.text(string.ascii_letters))
@example("hello world")
def test_decrypt_deciphers_encrypt_fixed_key(s):
    cipher = encrypt(s, 20)
    assert decrypt(cipher, 20) == s

@given(st.integers())
def test_key_works(i):
    assert decrypt(encrypt('test', i), i) == 'test'

#@given(s=st.text(), i=st.integers())
@given(s=st.text(string.ascii_letters), i=st.integers())
def test_decrypt_deciphers_encrypt_variable_key(s, i):
    assert decrypt(encrypt(s, i), i) == s

