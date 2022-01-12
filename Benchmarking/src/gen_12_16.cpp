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
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s2 p0;
    std::vector<s2> p1;
    s8(s2 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s9(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s9 &v0, const s8 &v1, const double &v2) {
    const s2 v5 = v1.p0;
    const std::vector<s0> v4 = v0.p1;
    const s0 v7 = v4[0];
    s0 v3 = v7;
    const std::vector<s0> v10 = v0.p1;
    const std::vector<std::vector<double>> v8 = v3.p0;
    const s0 v23 = v10[0];
    v3.p0 = v8;
    const std::vector<double> v12 = v8[1];
    const std::vector<s0> v14 = v5.p0;
    const std::vector<s0> v15 = v0.p1;
    std::vector<s0> v21 = v14;
    v3.p0 = v8;
    v21[0] = v7;
    v21[0] = v3;
    v21[0] = v23;
    v21[0] = v3;
    const std::vector<std::vector<double>> v29 = v7.p0;
    const s0 v68 = v15[0];
    const s0 v44 = v21[0];
    v21[0] = v7;
    const std::vector<std::vector<double>> v57 = v7.p0;
    const std::vector<s0> v37 { v23, v23 };
    v3.p1 = v29;
    const std::vector<std::vector<double>> v116 = v44.p0;
    v21[0] = v68;
    const double v154 = v12[0];
    v3.p1 = v8;
    std::vector<s0> v89 = v37;
    v3.p0 = v116;
    const s0 v135 = v89[0];
    const std::vector<std::vector<double>> v218 = v135.p0;
    v3.p1 = v57;
    v3.p1 = v218;
    return v154;
  }
  int main() {
    s9 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } });
    s8 v1({ { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } } } }, { { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } }, { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } }, { { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } } } } } } });
    double v2(76.0);
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
