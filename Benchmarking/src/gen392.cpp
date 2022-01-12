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
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f110(const s1 &v0, const s1 &v1) {
    s1 v6 = v0;
    s1 v3 = v6;
    s1 v7 = v1;
    const s0 v8 = v3.p1;
    const s0 v11 = v7.p1;
    const std::vector<s1> v4 { v6, v6, v7, v3, v0 };
    s0 v10 = v8;
    v6.p1 = v11;
    std::vector<s1> v18 = v4;
    const s1 v13 = v18[2];
    const std::vector<std::vector<double>> v20 = v8.p1;
    v6.p1 = v8;
    v10.p1 = v20;
    v3.p1 = v11;
    v6.p1 = v10;
    v10.p0 = v20;
    v18[1] = v6;
    return v13;
  }
  s1 f104(const s1 &v0) {
    const s0 v7 = v0.p1;
    s1 v1 = v0;
    const s1 v6 = f110(v1, v0);
    v1.p1 = v7;
    s1 v3 = v6;
    const s1 v11 = f110(v3, v0);
    const s1 v9 = f110(v6, v0);
    const s1 v22 = f110(v1, v9);
    const s1 v20 = f110(v22, v9);
    const s1 v38 = f110(v20, v9);
    s1 v23 = v11;
    const s1 v61 = f110(v23, v38);
    return v61;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s2> &v1, const double &v2) {
    const s1 v7 = v0.p1;
    const s1 v6 = f104(v7);
    const s0 v9 = v6.p0;
    const std::vector<std::vector<double>> v10 = v9.p0;
    std::vector<std::vector<double>> v17 = v10;
    const std::vector<double> v22 = v10[0];
    const std::vector<double> v20 = v17[1];
    v17[0] = v20;
    std::vector<std::vector<double>> v56 = v17;
    v17[1] = v22;
    const double v37 = v20[0];
    std::vector<double> v67 = v22;
    v56[0] = v20;
    v17 = v56;
    v56[0] = v67;
    const double v104 = v37 / v37;
    return v104;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } });
    std::vector<s2> v1({ { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } }, { { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } }, { { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } }, { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } }, { { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } }, { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } } });
    double v2(80.0);
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
