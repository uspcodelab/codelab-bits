from hypothesis import given, example, assume, event
from math import isnan
import hypothesis.strategies as st

#####################################
## Exemplos extras da documentação ##
#####################################

@given(st.integers().filter(lambda x: x % 2 == 0))
def test_even_integers(i):
        pass

@given(st.integers().filter(lambda x: x % 2 == 0))
def test_even_integers(i):
        event("i mod 3 = %d" % (i % 3,))

@given(st.floats())
def test_negation_is_self_inverse_for_non_nan(x):
        assume(False)
        assert x == -(-x)
