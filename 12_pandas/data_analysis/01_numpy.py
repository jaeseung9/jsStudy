import numpy as np

 # Numpy :  파이썬에서 숫자 데이터(배열)을 빠르고 편하게 다루기 위한 라이브러리

prices_list = [1000,2000,3000]
#prices_list + 100  # 리스트는 스칼라 값과 연산 불가
new_prices_list = [price + 100 for price in prices_list]

print("New prices (list):", new_prices_list)

# Numpy 배열
prices_array = np.array([1000,2000,3000])
new_prices_list = prices_array + 100  # for문 없이 모든 데이터에 100원을 더함 -> 벡터화
print(f"오른 가격: {new_prices_list}")

data = np.array([[1,2,3],
                 [4,5,6]])

print(data.shape)
print(data.dtype)