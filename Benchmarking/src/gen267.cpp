  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f30(const double &v0) {
    double v7 = v0;
    double v5 = v7;
    double v9 = v0;
    double v2 = v5;
    double v11 = v7;
    const std::vector<double> v15 { v5, v7, v2, v2, v5 };
    const double v21 = v15[3];
    std::vector<double> v18 = v15;
    const double v8 = v18[2];
    v7 = v11;
    v18[0] = v2;
    v18[4] = v21;
    v18[4] = v9;
    v18[3] = v9;
    return v8;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s0 &v1, const s2 &v2, const double &v3) {
    const double v18 = v3 + v3;
    double v17 = v18;
    double v14 = v17;
    const double v19 = v3 / v17;
    v14 = v19;
    const double v47 = f30(v14);
    v17 = v3;
    return v47;
  }
  int main() {
    s1 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } } }, { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } } });
    s0 v1({ { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } });
    s2 v2({ { { { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } } }, { { { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } }, { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } } });
    double v3(44.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
