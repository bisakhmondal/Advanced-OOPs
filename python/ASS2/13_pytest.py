import pytest

def power(a,b):
    return a**b

@pytest.mark.parametrize('a,b,c',[[2,2,4],[2,3,8],[1,9,1],[0,9,0]])
def test(a,b,c):
    print(type(a))
    assert power(a,b) == c