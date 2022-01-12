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
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    std::vector<s0> p1;
    s3(std::vector<std::vector<s1>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s3 f19(const s3 &v0, const s3 &v1, const s3 &v2) {
    const std::vector<std::vector<s1>> v6 = v2.p0;
    s3 v4 = v0;
    v4.p0 = v6;
    v4 = v0;
    return v4;
  }
  s3 f9(const s3 &v0, const std::vector<s3> &v1) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<std::vector<s3>> &v1, const double &v2) {
    const std::vector<s3> v4 = v1[1];
    double v5 = v2;
    const s3 v8 = v4[0];
    double v9 = v5;
    const s3 v10 = f19(v8, v8, v8);
    const s3 v15 = f9(v10, v4);
    const std::vector<s0> v11 = v15.p1;
    const s0 v34 = v11[1];
    const std::vector<std::vector<double>> v40 = v34.p0;
    double v24 = v5;
    const std::vector<double> v22 = v40[1];
    const double v43 = v22[0];
    v9 = v2;
    const double v29 = v24 - v2;
    const double v118 = v43 + v29;
    v5 = v9;
    return v118;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } } } });
    std::vector<std::vector<s3>> v1({ { { { { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } } }, { { { { { { { { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } } } } } }, { { { { { { { { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 } } } } } } }, { { { { 39.0 }, { 40.0 } }, { { 41.0 } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } } } } } });
    double v2(45.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
