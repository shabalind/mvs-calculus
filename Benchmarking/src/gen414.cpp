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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    s5(s1 v0): p0(v0) { }
  };
  s0 f32(const s0 &v0, const s1 &v1) {
    const std::vector<std::vector<s0>> v4 = v1.p1;
    std::vector<std::vector<s0>> v5 = v4;
    const std::vector<s0> v7 = v5[2];
    const std::vector<s0> v6 = v5[1];
    v5[1] = v7;
    const s0 v10 = v1.p0;
    std::vector<s0> v24 = v6;
    v24[0] = v10;
    const s0 v59 = v24[0];
    v24[0] = v10;
    return v59;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<s5> &v1, const s1 &v2, const s2 &v3, const double &v4) {
    s1 v8 = v2;
    const s0 v10 = v3.p0;
    const s0 v13 = f32(v10, v8);
    const s0 v16 = f32(v13, v8);
    const std::vector<std::vector<double>> v34 = v16.p0;
    std::vector<std::vector<double>> v98 = v34;
    const std::vector<double> v124 = v98[0];
    std::vector<double> v82 = v124;
    const double v78 = v82[0];
    return v78;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    std::vector<s5> v1({ { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } } });
    s1 v2({ { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { { { 27.0 }, { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } } });
    s2 v3({ { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } });
    double v4(42.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
