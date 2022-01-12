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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    s2 p1;
    s5(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<double>> f21(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v5 = v0[0];
    std::vector<std::vector<double>> v1 = v0;
    const std::vector<std::vector<std::vector<double>>> v4 { v1, v1, v0, v0 };
    const std::vector<std::vector<double>> v9 = v4[3];
    v1[0] = v5;
    const std::vector<double> v20 = v9[1];
    v1[0] = v20;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v49 { v4, v4, v4, v4, v4, v4, v4 };
    const std::vector<std::vector<std::vector<double>>> v45 = v49[3];
    const std::vector<std::vector<double>> v68 = v45[2];
    return v68;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const double &v1) {
    const s2 v8 = v0.p1;
    const s1 v10 = v8.p0;
    const s0 v18 = v10.p0;
    const std::vector<std::vector<double>> v22 = v18.p0;
    const std::vector<std::vector<double>> v78 = f21(v22);
    const std::vector<double> v37 = v78[0];
    const double v214 = v37[0];
    return v214;
  }
  int main() {
    s5 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } }, { { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } }, { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } });
    double v1(60.0);
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
