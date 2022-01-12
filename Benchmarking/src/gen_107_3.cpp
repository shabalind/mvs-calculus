  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    std::vector<s0> p2;
    s0 p3;
    s1 p4;
    s1 p5;
    s0 p6;
    s2(s0 v0, s0 v1, std::vector<s0> v2, s0 v3, s1 v4, s1 v5, s0 v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s0>> &v1, const std::vector<s0> &v2, const std::vector<std::vector<s0>> &v3, const s1 &v4, const double &v5) {
    const s0 v11 = v0.p1;
    const std::vector<s0> v8 = v3[0];
    const s0 v26 = v8[0];
    const double v56 = v11.p1;
    s0 v35 = v26;
    v35.p1 = v56;
    const std::vector<std::vector<double>> v24 = v35.p0;
    v35.p0 = v24;
    v35.p0 = v24;
    const std::vector<double> v27 = v24[0];
    const double v46 = v27[0];
    v35.p0 = v24;
    return v46;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 } }, 2.0 }, { { { 3.0 }, { 4.0 } }, 5.0 }, { { { { 6.0 }, { 7.0 } }, 8.0 } }, { { { 9.0 }, { 10.0 } }, 11.0 }, { { { { 12.0 }, { 13.0 } }, 14.0 }, { { { { { 15.0 }, { 16.0 } }, 17.0 } }, { { { { 18.0 }, { 19.0 } }, 20.0 } }, { { { { 21.0 }, { 22.0 } }, 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, 26.0 }, { { { { { 27.0 }, { 28.0 } }, 29.0 } }, { { { { 30.0 }, { 31.0 } }, 32.0 } }, { { { { 33.0 }, { 34.0 } }, 35.0 } } } }, { { { 36.0 }, { 37.0 } }, 38.0 } });
    std::vector<std::vector<s0>> v1({ { { { { 39.0 }, { 40.0 } }, 41.0 } }, { { { { 42.0 }, { 43.0 } }, 44.0 } } });
    std::vector<s0> v2({ { { { 45.0 }, { 46.0 } }, 47.0 }, { { { 48.0 }, { 49.0 } }, 50.0 }, { { { 51.0 }, { 52.0 } }, 53.0 } });
    std::vector<std::vector<s0>> v3({ { { { { 54.0 }, { 55.0 } }, 56.0 } }, { { { { 57.0 }, { 58.0 } }, 59.0 } }, { { { { 60.0 }, { 61.0 } }, 62.0 } } });
    s1 v4({ { { { 63.0 }, { 64.0 } }, 65.0 }, { { { { { 66.0 }, { 67.0 } }, 68.0 } }, { { { { 69.0 }, { 70.0 } }, 71.0 } }, { { { { 72.0 }, { 73.0 } }, 74.0 } } } });
    double v5(75.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
