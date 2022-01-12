  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    std::vector<std::vector<s0>> p2;
    std::vector<s1> p3;
    s1 p4;
    s2(s1 v0, s1 v1, std::vector<std::vector<s0>> v2, std::vector<s1> v3, s1 v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const s2 &v1, const double &v2) {
    const std::vector<double> v7 { v2, v2, v2, v2, v2, v2 };
    const s1 v4 = v0.p0;
    const s0 v8 = v4.p0;
    const double v9 = v7[2];
    const std::vector<double> v12 = v8.p0;
    const double v3 = v12[0];
    const double v11 = v12[0];
    std::vector<double> v15 = v7;
    v15[3] = v3;
    const double v20 = v12[0];
    const double v17 = v12[0];
    v15[1] = v20;
    v15[2] = v9;
    std::vector<double> v21 = v12;
    const double v43 = v21[0];
    v15[5] = v11;
    const double v102 = v15[2];
    const double v82 = v102 - v17;
    v15[3] = v43;
    return v82;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { { 1.0 } } }, { { 2.0 }, { { 3.0 } } } }, { { { 4.0 }, { { 5.0 } } }, { { 6.0 }, { { 7.0 } } } }, { { { { 8.0 }, { { 9.0 } } } }, { { { 10.0 }, { { 11.0 } } } }, { { { 12.0 }, { { 13.0 } } } } }, { { { { 14.0 }, { { 15.0 } } }, { { 16.0 }, { { 17.0 } } } }, { { { 18.0 }, { { 19.0 } } }, { { 20.0 }, { { 21.0 } } } } }, { { { 22.0 }, { { 23.0 } } }, { { 24.0 }, { { 25.0 } } } } });
    s2 v1({ { { { 26.0 }, { { 27.0 } } }, { { 28.0 }, { { 29.0 } } } }, { { { 30.0 }, { { 31.0 } } }, { { 32.0 }, { { 33.0 } } } }, { { { { 34.0 }, { { 35.0 } } } }, { { { 36.0 }, { { 37.0 } } } }, { { { 38.0 }, { { 39.0 } } } } }, { { { { 40.0 }, { { 41.0 } } }, { { 42.0 }, { { 43.0 } } } }, { { { 44.0 }, { { 45.0 } } }, { { 46.0 }, { { 47.0 } } } } }, { { { 48.0 }, { { 49.0 } } }, { { 50.0 }, { { 51.0 } } } } });
    double v2(52.0);
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
