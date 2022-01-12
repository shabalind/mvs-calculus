  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    std::vector<std::vector<s0>> p2;
    std::vector<std::vector<s0>> p3;
    s1(std::vector<s0> v0, std::vector<s0> v1, std::vector<std::vector<s0>> v2, std::vector<std::vector<s0>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s1 v2 = v0.p0;
    const std::vector<s0> v7 = v2.p0;
    std::vector<s0> v11 = v7;
    std::vector<s0> v4 = v11;
    const s0 v8 = v11[2];
    v4[2] = v8;
    const s0 v9 = v4[1];
    const std::vector<std::vector<double>> v18 = v9.p1;
    v11[1] = v8;
    const std::vector<double> v22 = v18[0];
    const std::vector<std::vector<double>> v35 = v9.p0;
    v4 = v11;
    s0 v16 = v9;
    const double v23 = v22[0];
    const std::vector<double> v19 = v35[1];
    const double v27 = v22[0];
    const double v34 = v19[0];
    v11[0] = v16;
    const std::vector<s0> v29 = v2.p1;
    const s0 v46 = v29[1];
    std::vector<s0> v57 = v4;
    v11[2] = v46;
    const double v117 = v23 - v34;
    v4 = v57;
    v57[1] = v8;
    const double v188 = v117 - v27;
    v16.p0 = v35;
    return v188;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } }, { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } } });
    double v1(50.0);
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
