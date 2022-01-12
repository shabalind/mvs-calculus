  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    s3(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v5 = v0[1];
    const s2 v9 = v5.p0;
    const std::vector<s0> v8 = v9.p1;
    const s0 v12 = v8[1];
    const std::vector<std::vector<double>> v7 = v12.p0;
    const double v15 = v1 / v1;
    const std::vector<double> v27 = v7[1];
    const double v18 = v27[0];
    const double v35 = v15 / v18;
    const double v47 = v15 - v35;
    return v47;
  }
  int main() {
    std::vector<s3> v0({ { { { { { 0.0 }, { 1.0 } } }, { { { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 } } } } }, { { { { { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } } } } }, { { { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 } } } } } }, { { { { { 20.0 }, { 21.0 } } }, { { { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } } }, { { { 26.0 }, { 27.0 } } } } }, { { { { { { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 } } } }, { { { { 32.0 }, { 33.0 } } } } }, { { { { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 } } }, { { { 38.0 }, { 39.0 } } } } } } });
    double v1(40.0);
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
