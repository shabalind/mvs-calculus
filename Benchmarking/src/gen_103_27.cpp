  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    s1 p1;
    s2(std::vector<std::vector<s1>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s2 p0;
    s0 p1;
    s6(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s0> p0;
    std::vector<s6> p1;
    s8(std::vector<s0> v0, std::vector<s6> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s8>> &v0, const double &v1) {
    const std::vector<s8> v5 = v0[0];
    std::vector<std::vector<s8>> v2 = v0;
    const std::vector<s8> v7 = v2[0];
    const s8 v6 = v7[0];
    const std::vector<s6> v8 = v6.p1;
    const s6 v34 = v8[1];
    const s2 v15 = v34.p0;
    const s1 v36 = v15.p1;
    v2[0] = v7;
    v2[0] = v5;
    const double v61 = v1 + v1;
    const s0 v67 = v36.p1;
    const std::vector<std::vector<double>> v89 = v67.p0;
    const std::vector<double> v64 = v89[2];
    const double v108 = v64[0];
    const double v79 = v61 + v108;
    return v79;
  }
  int main() {
    std::vector<std::vector<s8>> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } } } } });
    double v1(44.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
